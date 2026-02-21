
package acceso;

import arreglo.ArregloUsuario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.crypto.AEADBadTagException;
import javax.swing.JOptionPane;
import modelo.Usuario;


public class Gestor_RegistroUser {
    
    
    String Archivo ="User.txt";
    public void guardar(ArregloUsuario objArregloUsuario){
        try {
            FileWriter FW = new FileWriter(Archivo);
            PrintWriter PW = new PrintWriter(FW);
            Usuario [] Arreglo = objArregloUsuario.getArreglo();
            for (int pos = 0; pos < objArregloUsuario.getI(); pos++) {
                PW.println(Arreglo[pos].getCadena());
            }
            PW.close();
            FW.close();
            
            
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "error");
        }
        
    
    
    }
    
    public void cargar(ArregloUsuario objArregloUsuario){
    
        try {
            FileReader FR = new FileReader(Archivo);
             BufferedReader BR = new BufferedReader(FR);
             String linea= null;
             while ((linea=BR.readLine())!=null) {                
                String[] dato = linea.split(",");
                
                String nombre = dato[0];
                String correo = dato[1];
                String contra = dato[2];
                int fecha = Integer.parseInt(dato[3]);
                String codigo_pais= dato[4];
                
             objArregloUsuario.RegistrarGestor(nombre, correo, contra, fecha, codigo_pais);
                 
                 
            }
            
            
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null, "se paso");
        
        };
        
    }
    
    
    
    
    
    
    
    
    
}
