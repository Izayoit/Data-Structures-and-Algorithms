package Control;

import AccesoDB.ConectaDB;
import Modelo.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CursoDAO {
    
    public static void Insertar(Curso Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
                    "insert into curso(Nombre) value(?)");
            ps.setString(1, Elemento.getNombre());
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
    
    public static void Actualizar(Curso Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
                 "update curso set Nombre = ? where CodCurso = ? ");
            ps.setString(1, Elemento.getNombre());
            ps.setInt(2, Elemento.getCodCurso());
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
    
    public static void Eliminar(Curso Elemento){
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps = cn.prepareStatement(
                 "delete from curso where CodCurso = ?");
            ps.setInt(1, Elemento.getCodCurso());
            int estado = ps.executeUpdate();
            if(estado > 0){
                JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo Eliminar");
            }
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void ConsultarTodos(JTable control){
        //
        String[] cabecera = {"Código","Nombre"};
        DefaultTableModel modTabla = new 
            DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from curso");
            while(rs.next()){
                Object[] Registro = {
                    rs.getInt(1),
                    rs.getString(2)
                };
                //Curso objCurso = new Curso(Registro);
                modTabla.addRow(Registro);
            }
            rs.close();
            st.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
    
    public static int ContarRegistros(){
        int count = 0;
        try {
            Connection cn = ConectaDB.ObtenerConexion();
            PreparedStatement ps_count = cn.prepareStatement(
                "select count(*) from curso");
            ResultSet rs_count = ps_count.executeQuery();
            rs_count.next();
            count = rs_count.getInt(1);
            rs_count.close();
            ps_count.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return count;
    }
    
    public static void ConsultarTodos(JComboBox control, Arreglo_Curso arreglo){        
        DefaultComboBoxModel modCombo = new DefaultComboBoxModel();
        control.setModel(modCombo);
        try {
            Connection cn = ConectaDB.ObtenerConexion();            
            PreparedStatement ps = cn.prepareStatement(
                "select * from curso order by nombre asc");                    
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Object[] Registro = {
                    rs.getInt(1),
                    rs.getString(2)
                };
                Curso objCurso = new Curso(Registro);
                arreglo.Agregar(objCurso);
                modCombo.addElement(rs.getString(2));
            }
            rs.close();
            ps.close();
            ConectaDB.CerrarConexion(cn);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }
}
