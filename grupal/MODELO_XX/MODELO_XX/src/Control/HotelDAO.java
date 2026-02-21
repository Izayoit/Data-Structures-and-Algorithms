
package Control;

import AccesoBD.ConectaDB;
import ModeloMantenimiento.Hotel;

import javax.swing.JOptionPane;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.JComboBox;
public class HotelDAO {
   public static void Insertar(Hotel elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_hoteles_insertar(?,?,?,?,?,?)}");
            cst.setString(1, elemento.getNombreHotel());
            cst.setString(2, elemento.getDireccionHotel());
            cst.setString(3, elemento.getCiudadHotel());
            cst.setString(4, elemento.getTelefonoHotel());
            cst.setInt(5, elemento.getPlazasHotel());
            cst.registerOutParameter(6, java.sql.Types.INTEGER); // id generado
            cst.executeUpdate();
            
            int idGenerado = cst.getInt(6);
            if (idGenerado > 0) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                elemento.setCodigoHotel(idGenerado);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar");
            }
            
            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Registrar: " + e.getMessage());
        }
    }

    public static void Actualizar(Hotel elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_hoteles_actualizar(?,?,?,?,?,?)}");
            cst.setString(1, elemento.getNombreHotel());
            cst.setString(2, elemento.getDireccionHotel());
            cst.setString(3, elemento.getCiudadHotel());
            cst.setString(4, elemento.getTelefonoHotel());
            cst.setInt(5, elemento.getPlazasHotel());
            cst.setInt(6, elemento.getCodigoHotel());
            
            int estado = cst.executeUpdate();
            if (estado > 0) {
                JOptionPane.showMessageDialog(null, "Actualización exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar");
            }

            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Actualizar: " + e.getMessage());
        }
    }

    public static void Eliminar(Hotel elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_hoteles_eliminar(?)}");
            cst.setInt(1, elemento.getCodigoHotel());
            
            int estado = cst.executeUpdate();
            if (estado > 0) {
                JOptionPane.showMessageDialog(null, "Eliminación exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar");
            }

            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar: " + e.getMessage());
        }
    }

    public static void Consultar_Todos(ArbolH arbol){
    try {
        Connection cn = ConectaDB.ObtenerConexion();
        CallableStatement cst = cn.prepareCall("{call sp_hoteles_consultar_todos()}");
        ResultSet rs = cst.executeQuery();

        // Limpiar el árbol si ya tiene datos
        arbol.setRaiz(null);

        while (rs.next()) {
            int codigo = rs.getInt("CodigoHotel");
            String nombre = rs.getString("NombreHotel");
            String direccion = rs.getString("DireccionHotel");
            String ciudad = rs.getString("CiudadHotel");
            String telefono = rs.getString("TelefonoHotel");
            int plazas = rs.getInt("PlazasHotel");

            Hotel elemento = new Hotel(new Object[]{codigo, nombre, direccion, ciudad, telefono, plazas});
            arbol.setRaiz(arbol.Insertar(arbol.getRaiz(), elemento)); // Insertar en el árbol
        }

        rs.close();
        cst.close();
        ConectaDB.CerrarConexion(cn);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error en la consulta: " + e.getMessage());
    }
}
    public static void ConsultarParaCombo(JComboBox control, ArbolH arbol, HashMap tabla) {
    try {
        Connection cn = ConectaDB.ObtenerConexion();
        CallableStatement cst = cn.prepareCall("{call sp_hoteles_consultar_todos()}");
        ResultSet rs = cst.executeQuery();

        arbol.setRaiz(null); // limpiar árbol

        while (rs.next()) {
            int codigo = rs.getInt("CodigoHotel");
            String nombre = rs.getString("NombreHotel");
            String direccion = rs.getString("DireccionHotel");
            String ciudad = rs.getString("CiudadHotel");
            String telefono = rs.getString("TelefonoHotel");
            int plazas = rs.getInt("PlazasHotel");

            Hotel hotel = new Hotel(new Object[]{codigo, nombre, direccion, ciudad, telefono, plazas});
            arbol.setRaiz(arbol.Insertar(arbol.getRaiz(), hotel));
        }

        rs.close();
        cst.close();
        ConectaDB.CerrarConexion(cn);

        // Llenar el ComboBox usando el árbol
        arbol.ListarCbo(control, tabla);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al cargar hoteles para combo: " + e.getMessage());
    }
}

}
