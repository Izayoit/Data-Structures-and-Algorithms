
package acceso;

import control.Arreglo_EstudiantesUniversitarios;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import modelo.EstudiantesUniversitarios;


public class Gestor_de_archivos {
    
    
    
    
    
     private String Archivo ="Archivo2.txt";
    public void guardar(Arreglo_EstudiantesUniversitarios ObjEstudiantes){
        try {
            FileWriter FW = new FileWriter(Archivo);
            PrintWriter PW = new  PrintWriter(FW);
            EstudiantesUniversitarios[] Arreglo = ObjEstudiantes.getArreglo();
             for (int pos = 0; pos < ObjEstudiantes.getI(); pos++) {
                 PW.println(Arreglo[pos].getCadena());
       
        }
             PW.close();
             FW.close();
        }catch(IOException ex2){
        JOptionPane.showMessageDialog(null, "se guardaron los datos");
        
        }
        

        
    }
    
   
   
      public void Cargar(Arreglo_EstudiantesUniversitarios objArregloEstudiante){
        try {
            FileReader FR = new FileReader(Archivo);
            BufferedReader BR = new  BufferedReader(FR);
            String linea = null;
            while ((linea = BR.readLine())!=null) {  
             String [] Datos = linea.split(",");
             String nombre = Datos[0];
             int codigo = Integer.parseInt(Datos[1]);
             String carrera = Datos[2];
            int dni = Integer.parseInt(Datos[3]);
            int edad = Integer.parseInt(Datos[4]);
             
             objArregloEstudiante.RegistrarPlus2(nombre, codigo, carrera, dni, edad);
                
            }
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(ArrayIndexOutOfBoundsException ex){
        JOptionPane.showMessageDialog(null, "los archivos fueros eliminados");
        
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      }
    
    
}
