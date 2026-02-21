package Control;

import AccesoDB.ConectaDB;
import Modelo.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EstudianteDAO {
    public static void Insertar(Estudiante Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
              "insert into estudiante(Nombres,Apellidos,Foto,CodCurso) values(?,?,?,?)");
            ps.setString(1, Elemento.getNombres());
            ps.setString(2, Elemento.getApellidos());
            ps.setString(3, Elemento.getFoto());
            ps.setInt(4, Elemento.getCodCurso());
            int estado = ps.executeUpdate();
            if(estado > 0){
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo Registrar");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void Actualizar(Estudiante Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
              "update estudiante set Nombres = ?, Apellidos = ?, Foto = ?, CodCurso = ? "
            + "where CodEstudiante = ?");
            ps.setString(1, Elemento.getNombres());
            ps.setString(2, Elemento.getApellidos());
            ps.setString(3, Elemento.getFoto());
            ps.setInt(4, Elemento.getCodCurso());
            ps.setInt(5, Elemento.getCodEstudiante());
            int estado = ps.executeUpdate();
            if(estado > 0){
                JOptionPane.showMessageDialog(null, "Actualización Exitosa");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo Actualizar");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void Eliminar(Estudiante Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
                 "delete from estudiante where CodEstudiante = ?");
            ps.setInt(1, Elemento.getCodEstudiante());
            int estado = ps.executeUpdate();
            if(estado > 0){
                JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo Eliminar");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
        }
    }
    
    public static void ConsultarTodos(JTable control, Arreglo_Estudiante arreglo){
        //
        String[] cabecera = {"Código","Nombres","Apellidos","Foto","Curso"};
        DefaultTableModel modTabla = new 
            DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
               "select e.CodEstudiante, e.Nombres, e.Apellidos, e.Foto, c.Nombre, c.CodCurso "
             + "from estudiante e, curso c "
             + "where e.CodCurso = c.CodCurso "
             + "order by e.CodEstudiante asc");
            ResultSet rs = ps.executeQuery();
            arreglo.Reiniciar();
            while(rs.next()){
                Object[] Registro1 = {
                  rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)
                };
                modTabla.addRow(Registro1);
                Object[] Registro2 = {
                  rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(6)
                };
                arreglo.Agregar(new Estudiante(Registro2));
            }
            rs.close();
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
}
