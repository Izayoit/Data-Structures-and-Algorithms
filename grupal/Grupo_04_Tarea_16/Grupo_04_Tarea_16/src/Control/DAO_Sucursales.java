package Control;

import AccesoBD.ConectaDB;
import Modelo.Sucursales;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;

public class DAO_Sucursales {

    public static void Insertar(Sucursales elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_sucursales_insertar(?,?,?)}");
            cst.setString(1, elemento.getDireccionSucursal());
            cst.setString(2, elemento.getTelefonoSucursal());
            cst.registerOutParameter(3, java.sql.Types.INTEGER); // ID generado

            cst.executeUpdate();

            int idGenerado = cst.getInt(3);
            if (idGenerado > 0) {
                JOptionPane.showMessageDialog(null, "Sucursal registrada con éxito");
                elemento.setCodigoSucursal(idGenerado);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar la sucursal");
            }

            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar sucursal: " + e.getMessage());
        }
    }

    public static void Actualizar(Sucursales elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_sucursales_actualizar(?,?,?)}");
            cst.setString(1, elemento.getDireccionSucursal());
            cst.setString(2, elemento.getTelefonoSucursal());
            cst.setInt(3, elemento.getCodigoSucursal());

            int estado = cst.executeUpdate();
            if (estado > 0) {
                JOptionPane.showMessageDialog(null, "Sucursal actualizada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la sucursal");
            }

            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar sucursal: " + e.getMessage());
        }
    }

    public static void Eliminar(Sucursales elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_sucursales_eliminar(?)}");
            cst.setInt(1, elemento.getCodigoSucursal());

            int estado = cst.executeUpdate();
            if (estado > 0) {
                JOptionPane.showMessageDialog(null, "Sucursal eliminada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la sucursal");
            }

            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar sucursal: " + e.getMessage());
        }
    }

    public static void Consultar_Todos(Arbol_Sucursal arbol) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_sucursales_consultar_todos()}");
            ResultSet rs = cst.executeQuery();

            arbol.setRaiz(null);

            while (rs.next()) {
                int codigo = rs.getInt("CodigoSucursal");
                String direccion = rs.getString("DireccionSucursal");
                String telefono = rs.getString("TelefonoSucursal");

                Sucursales sucursal = new Sucursales(new Object[]{codigo, direccion, telefono});
                arbol.setRaiz(arbol.Insertar(arbol.getRaiz(), sucursal));
            }

            rs.close();
            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar sucursales: " + e.getMessage());
        }
    }

    public static void ConsultarParaCombo(JComboBox combo, Arbol_Sucursal arbol, HashMap tabla) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_sucursales_consultar_todos()}");
            ResultSet rs = cst.executeQuery();

            arbol.setRaiz(null);

            while (rs.next()) {
                int codigo = rs.getInt("CodigoSucursal");
                String direccion = rs.getString("DireccionSucursal");
                String telefono = rs.getString("TelefonoSucursal");

                Sucursales sucursal = new Sucursales(new Object[]{codigo, direccion, telefono});
                arbol.setRaiz(arbol.Insertar(arbol.getRaiz(), sucursal));
            }

            rs.close();
            cst.close();
            ConectaDB.CerrarConexion(cn);

            arbol.ListarCbo(combo, tabla);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar sucursales para combo: " + e.getMessage());
        }
    }
    //utilizar esto para pasar al combo que lo hereda
}
