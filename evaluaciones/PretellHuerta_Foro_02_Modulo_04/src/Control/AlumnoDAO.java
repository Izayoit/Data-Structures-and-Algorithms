package Control;

import AccesoDB.ConectaDB;
import Modelo.Alumno;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AlumnoDAO {
    public static void Insertar(Alumno Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_estudiantes_insertar(?,?,?,?,?,?,?)}");
            cst.setString(1, Elemento.getDni());
            cst.setString(2, Elemento.getNombres());
            cst.setString(3, Elemento.getApellidos());
            cst.setString(4, Elemento.getCorreo());
            cst.setInt(5, Elemento.getTelefono());
            cst.setInt(6, Elemento.getIdcarrera());
            cst.registerOutParameter(7, java.sql.Types.INTEGER);
            cst.executeUpdate();
            int idAlumno = cst.getInt(7);
            if(idAlumno > 0){
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                Elemento.setIdAlumno(cst.getInt(7));
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo registrar");
            }
           cst.close();
           ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Registrar: " + e.getMessage());
        }
            
    }
    //listo
    public static void Actualizar(Alumno Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_estudiantes_actualizar(?,?,?,?,?,?,?)}");
            cst.setString(1, Elemento.getDni());
            cst.setString(2, Elemento.getNombres());
            cst.setString(3, Elemento.getApellidos());
            cst.setString(4, Elemento.getCorreo());
            cst.setInt(5, Elemento.getTelefono());
            cst.setInt(6, Elemento.getIdcarrera());
            cst.setInt(7, Elemento.getIdAlumno());
            int estado = cst.executeUpdate();
            if(estado > 0){
                JOptionPane.showMessageDialog(null, "Actualización Exitosa");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo actualizar");
            }
           cst.close();
           ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Actualizar: " + e.getMessage());
        }
            
    }
    
    public static void Eliminar(Alumno Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_estudiantes_eliminar(?)}");
            cst.setInt(1, Elemento.getIdAlumno());
            int estado = cst.executeUpdate();
            if(estado > 0){
                JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo eliminar");
            }
           cst.close();
           ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar: " + e.getMessage());
        }
            
    }
    
    
    public static void Consultar_Todos(Lista_Doble lista){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            CallableStatement cst = cn.prepareCall("{call sp_estudiantes_consultar_todos()}");
            ResultSet rs = cst.executeQuery();
            lista.setInicio(null);
            lista.setFin(null);
            while(rs.next()){
                int idAlumno = rs.getInt(1);
    
     String dni = rs.getString(2);
    String Nombres = rs.getString(3);
    String Apellidos = rs.getString(4);
     String correo = rs.getString(5);
     int telefono = rs.getInt(6);
    int Idcarrera = rs.getInt(7);
                
             
                Alumno Elemento = new Alumno(new Object[]{idAlumno,dni, Nombres, Apellidos,correo,telefono,Idcarrera});
                lista.Agregar_Fin(Elemento);
            }
            rs.close();
            cst.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Consulta: " + e.getMessage());
        }
    }
}
