package Control;

import AccesoBD.ConectaDB;
import Modelo.VuelosTurista;
import java.sql.*;
import javax.swing.*;

public class DAO_VuelosTuristas {

    public static void Insertar(VuelosTurista vuelo) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_vuelosturistas_insertar(?,?,?,?)}");
            cst.setString(1, vuelo.getClase());
            cst.setInt(2, vuelo.getViajesContratados_CodigoViaje());
            cst.setInt(3, vuelo.getVuelos_NumeroVuelo());
            cst.registerOutParameter(4, java.sql.Types.INTEGER); // Código generado
            cst.executeUpdate();
            int codigoGenerado = cst.getInt(4);

            if (codigoGenerado > 0) {
                JOptionPane.showMessageDialog(null, "Vuelo-Turista registrado correctamente.");
                vuelo.setVuelos_NumeroVuelo(codigoGenerado);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar el vuelo.");
            }

            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
        }
    }

    public static void Actualizar(VuelosTurista vuelo) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_vuelosturistas_actualizar(?,?,?,?)}");
            cst.setString(1, vuelo.getClase());
            cst.setInt(2, vuelo.getViajesContratados_CodigoViaje());
            cst.setInt(3, vuelo.getVuelos_NumeroVuelo());
            cst.setInt(4, vuelo.getCodigoVuelo());

            int estado = cst.executeUpdate();

            if (estado > 0) {
                JOptionPane.showMessageDialog(null, "Vuelo-Turista actualizado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el vuelo.");
            }

            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar vuelo: " + e.getMessage());
        }
    }

    public static void Eliminar(VuelosTurista vuelo) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_vuelosturistas_eliminar(?)}");
            cst.setInt(1, vuelo.getCodigoVuelo());

            int estado = cst.executeUpdate();

            if (estado > 0) {
                JOptionPane.showMessageDialog(null, "Vuelo-Turista eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el vuelo.");
            }

            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar vuelo: " + e.getMessage());
        }
    }

    public static void Consultar_Todos(Arbol_VueloTurista arbol) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_vuelosturistas_consultar_todos()}");
            ResultSet rs = cst.executeQuery();

            arbol.setRaiz(null); // Limpia el árbol

            while (rs.next()) {
                int codigo = rs.getInt("CodigoVueloTurista");
                String clase = rs.getString("Clase");
                int codViaje = rs.getInt("CodViaje");
                int numVuelo = rs.getInt("NumVuelo");

                VuelosTurista vuelo = new VuelosTurista(new Object[]{codigo, clase, codViaje, numVuelo});
                arbol.setRaiz(arbol.Insertar(arbol.getRaiz(), vuelo));
            }

            rs.close();
            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar vuelos: " + e.getMessage());
        }
    }

    public static VuelosTurista Consultar_Uno(int codigoVuelo) {
        VuelosTurista vuelo = null;
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_vuelosturistas_consultar_uno(?)}");
            cst.setInt(1, codigoVuelo);
            ResultSet rs = cst.executeQuery();

            if (rs.next()) {
                String clase = rs.getString("Clase");
                int codViaje = rs.getInt("CodViaje");
                int numVuelo = rs.getInt("NumVuelo");

                vuelo = new VuelosTurista(new Object[]{codigoVuelo, clase, codViaje, numVuelo});
            }

            rs.close();
            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar vuelo: " + e.getMessage());
        }
        return vuelo;
    }
}
