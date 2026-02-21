package Acceso;

import Control.Lista_Doble;
import Control.Nodo;
import Modelo.Producto;
import Control.Lista_Doble;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Control_Archivos {
    
    private static String nom_archivo = "productos.txt";
    
    public void Guardar_Archivo(Lista_Doble lista){
        
        try {
            FileWriter FW = new FileWriter(nom_archivo);
            PrintWriter PW = new PrintWriter(FW);
            if(lista.getInicio()!=null){
            
             Nodo auxiliar = lista.getInicio();
                do {                    
                    PW.println(auxiliar.getElemento().getCadena_Archivo());
                    auxiliar=auxiliar.getSiguiente();
                } while (auxiliar!=lista.getInicio());
            }
            PW.close();
            FW.close();
          
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "no hay datos guardados");
        }
        
        
        
        
        
        
        
        
        
    }
    
    public void Abrir_Archivo(Lista_Doble lista){
       
        try {
            FileReader FR = new FileReader(nom_archivo);
            BufferedReader BR = new BufferedReader(FR);
            String linea =null;
            while ((linea=BR.readLine())!=null) {                
                
                String[]datos =linea.split("%");
                int codigo = Integer.parseInt(datos[0]);
                String descripcion = datos[1];
                int stock = Integer.parseInt(datos[2]);
                Producto dato1 = new Producto(codigo, descripcion, stock);
                lista.Agregar(dato1);
                
                
            }
            
      
            
        } catch (Exception e) {
        }
  
        
        
        
        
    }
    
    
    
}
