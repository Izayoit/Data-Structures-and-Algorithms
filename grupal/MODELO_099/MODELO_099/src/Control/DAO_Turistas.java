package Control;

import AccesoBD.ConectaDB;
import Modelo.Turistas;

import javax.swing.*;
import java.sql.*;
import java.util.HashMap;

public class DAO_Turistas {

    public static void Insertar(Turistas turista) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_turistas_insertar(?, ?, ?, ?, ?, ?)}");
            cst.setString(1, turista.getNombreTurista());
            cst.setString(2, turista.getApellidosTurista());
            cst.setString(3, turista.getDireccionTurista());
            cst.setString(4, turista.getTelefonoTurista());
            cst.registerOutParameter(5, Types.INTEGER); // Código generado

            cst.executeUpdate();

            int codigoGenerado = cst.getInt(5);
            if (codigoGenerado > 0) {
                JOptionPane.showMessageDialog(null, "Turista registrado con éxito.");
                turista.setCodigoTurista(codigoGenerado);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar el turista.");
            }

            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar turista: " + e.getMessage());
        }
    }

    public static void Actualizar(Turistas turista) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_turistas_actualizar(?, ?, ?, ?, ?)}");
            cst.setString(1, turista.getNombreTurista());
            cst.setString(2, turista.getApellidosTurista());
            cst.setString(3, turista.getDireccionTurista());
            cst.setString(4, turista.getTelefonoTurista());
            cst.setInt(5, turista.getCodigoTurista());

            int estado = cst.executeUpdate();
            if (estado > 0) {
                JOptionPane.showMessageDialog(null, "Turista actualizado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el turista.");
            }

            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar turista: " + e.getMessage());
        }
    }

    public static void Eliminar(Turistas turista) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_turistas_eliminar(?)}");
            cst.setInt(1, turista.getCodigoTurista());

            int estado = cst.executeUpdate();
            if (estado > 0) {
                JOptionPane.showMessageDialog(null, "Turista eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el turista.");
            }

            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar turista: " + e.getMessage());
        }
    }

    public static void Consultar_Todos(Arbol_Turista arbol) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_turistas_consultar_todos()}");
            ResultSet rs = cst.executeQuery();

            arbol.setRaiz(null);

            while (rs.next()) {
                Turistas t = new Turistas(new Object[]{
                        rs.getInt("CodigoTurista"),
                        rs.getString("NombreTurista"),
                        rs.getString("ApellidosTurista"),
                        rs.getString("DireccionTurista"),
                        rs.getString("TelefonoTurista")
                });
                arbol.setRaiz(arbol.Insertar(arbol.getRaiz(), t));
            }

            rs.close();
            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar turistas: " + e.getMessage());
        }
    }

    public static void ConsultarParaCombo(JComboBox combo, Arbol_Turista arbol, HashMap tabla) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_turistas_consultar_todos()}");
            ResultSet rs = cst.executeQuery();

            arbol.setRaiz(null);

            while (rs.next()) {
                Turistas t = new Turistas(new Object[]{
                        rs.getInt("CodigoTurista"),
                        rs.getString("NombreTurista"),
                        rs.getString("ApellidosTurista"),
                        rs.getString("DireccionTurista"),
                        rs.getString("TelefonoTurista")
                });
                arbol.setRaiz(arbol.Insertar(arbol.getRaiz(), t));
            }

            rs.close();
            cst.close();
            ConectaDB.CerrarConexion(cn);

            arbol.ListarCbo(combo, tabla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar turistas para combo: " + e.getMessage());
        }
    }
}
