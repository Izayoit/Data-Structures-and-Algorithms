package Control;

import AccesoBD.ConectaDB;
import Modelo.ViajesContratados;

import javax.swing.*;
import java.sql.*;
import java.util.HashMap;

public class DAO_ViajesContratados {

    public static void Insertar(ViajesContratados viaje) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_viajescontratados_insertar(?, ?, ?, ?)}");
            cst.setInt(1, viaje.getTuristas_CodigoTuristas());
            cst.setInt(2, viaje.getSucursales_CodigoSucursal());
            cst.setInt(3, viaje.getEstancias_CodigoEstancia());
            cst.registerOutParameter(4, Types.INTEGER); // ID generado

            cst.execute(); // No uses executeUpdate()

            int idGenerado = cst.getInt(4);

            if (idGenerado > 0) {
                viaje.setCodigoViaje(idGenerado);
                JOptionPane.showMessageDialog(null, "Viaje contratado registrado con éxito. Código: " + idGenerado);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar el viaje. Revise las claves foráneas.");
            }

            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar viaje contratado: " + e.getMessage());
        }
    }

    public static void Actualizar(ViajesContratados viaje) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_viajescontratados_actualizar(?, ?, ?, ?)}");
            cst.setInt(1, viaje.getCodigoViaje());
            cst.setInt(2, viaje.getTuristas_CodigoTuristas());
            cst.setInt(3, viaje.getSucursales_CodigoSucursal());
            cst.setInt(4, viaje.getEstancias_CodigoEstancia());
            int estado = cst.executeUpdate();
            if (estado > 0) {
                JOptionPane.showMessageDialog(null, "Viaje contratado actualizado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el viaje contratado.");
            }
            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar viaje contratado: " + e.getMessage());
        }
    }

    public static void Eliminar(ViajesContratados codigoViaje) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_viajescontratados_eliminar(?)}");
            cst.setInt(1, codigoViaje.getCodigoViaje());
            int estado = cst.executeUpdate();
            if (estado > 0) {
                JOptionPane.showMessageDialog(null, "Viaje contratado eliminado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el viaje.");
            }
            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar viaje contratado: " + e.getMessage());
        }
    }

    public static void Consultar_Todos(Arbol_ViajeContratado arbol) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_viajescontratados_consultar_todos()}");
            ResultSet rs = cst.executeQuery();

            arbol.setRaiz(null); // limpiar el árbol antes de insertar

            while (rs.next()) {
                int codigoViaje = rs.getInt("CodigoViaje");
                int codigoTurista = rs.getInt("Turistas_CodigoTuristas");
                int codigoSucursal = rs.getInt("Sucursales_CodigoSucursal");
                int codigoEstancia = rs.getInt("Estancias_CodigoEstancia");

                // Mostrar datos para depurar
                // Crear el objeto con los datos obtenidos
                ViajesContratados viaje = new ViajesContratados(new Object[]{
                    codigoViaje, codigoTurista, codigoSucursal, codigoEstancia
                });

                // Insertar en el árbol
                arbol.setRaiz(arbol.Insertar(arbol.getRaiz(), viaje));
            }

            rs.close();
            cst.close();
            ConectaDB.CerrarConexion(cn);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar viajes contratados: " + e.getMessage());
            e.printStackTrace(); // Mostrar error completo en consola
        }
    }

    public static void ConsultarParaCombo(JComboBox combo, Arbol_ViajeContratado arbol, HashMap tabla) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_viajescontratados_consultar_todos()}");
            ResultSet rs = cst.executeQuery();
            arbol.setRaiz(null);
            while (rs.next()) {
                ViajesContratados v = new ViajesContratados(new Object[]{
                    rs.getInt("CodigoViaje"),
                    rs.getInt("Turistas_CodigoTuristas"),
                    rs.getInt("Estancias_CodigoEstancia"),
                    rs.getInt("Sucursales_CodigoSucursal")
                });
                arbol.setRaiz(arbol.Insertar(arbol.getRaiz(), v));
            }

            rs.close();
            cst.close();
            ConectaDB.CerrarConexion(cn);

            arbol.ListarCbo(combo, tabla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar viajes contratados para combo: " + e.getMessage());
        }
    }
}
