package Control;

import java.sql.Connection;
import AccesoBD.ConectaDB;
import Modelo.Estancias;
import javax.swing.*;
import java.sql.*;

public class DAO_Estancias {

    public static void Insertar(Estancias Elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_estancias_insertar(?,?,?,?,?)}");
            cst.setString(1, Elemento.getPension());
            cst.setString(2, Elemento.getFechaEntrada());
            cst.setString(3,Elemento.getFechaSalida());
            cst.setInt(4, Elemento.getHoteles_CodigoHotel());
            cst.registerOutParameter(5, java.sql.Types.INTEGER); // Código generado
            cst.executeUpdate();
            int codigoGenerado = cst.getInt(5);
            if (codigoGenerado > 0) {
                JOptionPane.showMessageDialog(null, "Estancia registrada correctamente.");
                Elemento.setCodigoEstancia(codigoGenerado); // Actualiza el objeto
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar la estancia.");
            }
            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    
    public static void Actualizar(Estancias elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_estancias_actualizar(?,?,?,?,?)}");
            cst.setString(1, elemento.getPension());
            cst.setString(2,elemento.getFechaEntrada());
           cst.setString(3,elemento.getFechaSalida());
            cst.setInt(4, elemento.getHoteles_CodigoHotel());
            cst.setInt(5, elemento.getCodigoEstancia());
            int estado = cst.executeUpdate();
            if (estado > 0) {
                JOptionPane.showMessageDialog(null, "Estancia actualizada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la estancia.");
            }
            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar estancia: " + e.getMessage());
        }
    }

    public static void Eliminar(Estancias elemento) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_estancias_eliminar(?)}");
            cst.setInt(1, elemento.getCodigoEstancia());
            int estado = cst.executeUpdate();
            if (estado > 0) {
                JOptionPane.showMessageDialog(null, "Estancia eliminada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la estancia.");
            }
            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar estancia: " + e.getMessage());
        }
    }

    public static void Consultar_Todos(Arbol_Estancias arbol) {
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_estancias_consultar_todos()}");
            ResultSet rs = cst.executeQuery();
            arbol.setRaiz(null); // limpiar el árbol antes de insertar
            while (rs.next()) {
                int codigo = rs.getInt("CodigoEstancia");
                String pension = rs.getString("Pension");
                
                String entrada = rs.getString("FechaEntrada");
                String salida = rs.getString("FechaSalida");
                int idHotel = rs.getInt("Hoteles_CodigoHotel");
                
                Estancias estancia = new Estancias(new Object[]{codigo, pension, entrada, salida, idHotel});
                arbol.setRaiz(arbol.Insertar(arbol.getRaiz(), estancia));
            }
            rs.close();
            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar estancias: " + e.getMessage());
        }
    }

    public static Estancias Consultar_Uno(int codigoEstancia) {
        Estancias estancia = null;
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_estancias_consultar_uno(?)}");
            cst.setInt(1, codigoEstancia);
            ResultSet rs = cst.executeQuery();
            if (rs.next()) {
                String pension = rs.getString("Pension");
                java.util.Date entrada = rs.getDate("FechaEntrada");
                java.util.Date salida = rs.getDate("FechaSalida");
                int idHotel = rs.getInt("Hoteles_CodigoHotel");

                estancia = new Estancias(new Object[]{codigoEstancia, pension, entrada, salida, idHotel});
            }
            rs.close();
            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al consultar estancia: " + e.getMessage());
        }
        return estancia;
    }
    
    
    
//public static void ConsultarParaCombo(JComboBox control, Arbol_Hotel arbol, HashMap tabla) {
//        try {
//            Connection cn = ConectaDB.ObtenerConexion();
//            CallableStatement cst = cn.prepareCall("{call sp_hotel_consultar_todos()}");
//            ResultSet rs = cst.executeQuery();
//
//            arbol.setRaiz(null); // limpiar árbol
//
//            while (rs.next()) {
//                int codigo = rs.getInt("CodigoHotel");
//                String nombre = rs.getString("NombreHotel");
//                String direccion = rs.getString("DireccionHotel");
//                String ciudad = rs.getString("CiudadHotel");
//                String telefono = rs.getString("TelefonoHotel");
//                int plazas = rs.getInt("PlazasHotel");
//
//                Hoteles hotel = new Hoteles(new Object[]{codigo, nombre, direccion, ciudad, telefono, plazas});
//                arbol.setRaiz(arbol.Insertar(arbol.getRaiz(), hotel));
//            }
//
//            rs.close();
//            cst.close();
//            ConectaDB.CerrarConexion(cn);
//
//            // Llenar el ComboBox usando el árbol
//            arbol.ListarCbo(control, tabla);
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error al cargar hoteles para combo: " + e.getMessage());
//        }
//    }
}
