package Control;

import AccesoBD.ConectaDB;
import Modelo.Vuelos;

import javax.swing.*;
import java.sql.*;
import java.util.HashMap;

public class DAO_Vuelos {

    public static void Insertar(Vuelos vuelo) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_vuelos_insertar(?, ?, ?, ?, ?, ?, ?)}");
            //  cst.setInt(1, vuelo.getNumeroVuelo());
            cst.setString(1, vuelo.getFechaVuelo());
            cst.setString(2, vuelo.getHoraVuelo());
            cst.setString(3, vuelo.getOrigenVuelo());
            cst.setString(4, vuelo.getDestinoVuelo());
            cst.setInt(5, vuelo.getPlazasTotales());
            cst.setInt(6, vuelo.getPlazasTurista());
            cst.registerOutParameter(7, java.sql.Types.INTEGER);

            int estado = cst.executeUpdate();
            int idGenerado = cst.getInt(7);
            if (idGenerado > 0) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                vuelo.setNumeroVuelo(idGenerado);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar");
            }
            if (estado > 0) {
                JOptionPane.showMessageDialog(null, "Vuelo registrado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar el vuelo.");
            }

            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar vuelo: " + e.getMessage());
        }
    }

    public static void Actualizar(Vuelos vuelo) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_vuelos_actualizar(?, ?, ?, ?, ?, ?, ?)}");
            cst.setInt(1, vuelo.getNumeroVuelo());
            cst.setString(2, vuelo.getFechaVuelo());
            cst.setString(3, vuelo.getHoraVuelo());
            cst.setString(4, vuelo.getOrigenVuelo());
            cst.setString(5, vuelo.getDestinoVuelo());
            cst.setInt(6, vuelo.getPlazasTotales());
            cst.setInt(7, vuelo.getPlazasTurista());

            int estado = cst.executeUpdate();
            if (estado > 0) {
                JOptionPane.showMessageDialog(null, "Vuelo actualizado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el vuelo.");
            }

            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar vuelo: " + e.getMessage());
        }
    }

    public static void Eliminar(int numeroVuelo) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_vuelos_eliminar(?)}");
            cst.setInt(1, numeroVuelo);

            int estado = cst.executeUpdate();
            if (estado > 0) {
                JOptionPane.showMessageDialog(null, "Vuelo eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el vuelo.");
            }

            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar vuelo: " + e.getMessage());
        }
    }

    public static void Consultar_Todos(Arbol_Vuelos arbol) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_vuelos_consultar_todos()}");
            ResultSet rs = cst.executeQuery();

            arbol.setRaiz(null);

            while (rs.next()) {
                Vuelos v = new Vuelos(new Object[]{
                    rs.getInt("NumeroVuelos"),
                    rs.getString("FechaVuelo"),
                    rs.getString("HoraVuelo"),
                    rs.getString("OrigenVuelo"),
                    rs.getString("DestinoVuelo"),
                    rs.getInt("PlazasTotales"),
                    rs.getInt("PlazasTurista")
                });
                arbol.setRaiz(arbol.Insertar(arbol.getRaiz(), v));
            }

            rs.close();
            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar vuelos: " + e.getMessage());
        }
    }

    public static void ConsultarParaCombo(JComboBox combo, Arbol_Vuelos arbol, HashMap tabla) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_vuelos_consultar_todos()}");
            ResultSet rs = cst.executeQuery();

            arbol.setRaiz(null);

            while (rs.next()) {
                Vuelos v = new Vuelos(new Object[]{
                    rs.getInt("NumeroVuelo"),
                    rs.getString("FechaVuelo"),
                    rs.getString("HoraVuelo"),
                    rs.getString("OrigenVuelo"),
                    rs.getString("DestinoVuelo"),
                    rs.getInt("PlazasTotales"),
                    rs.getInt("PlazasTurista")
                });
                arbol.setRaiz(arbol.Insertar(arbol.getRaiz(), v));
            }

            rs.close();
            cst.close();
            ConectaDB.CerrarConexion(cn);

            arbol.ListarCbo(combo, tabla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar vuelos para combo: " + e.getMessage());
        }
    }
}
