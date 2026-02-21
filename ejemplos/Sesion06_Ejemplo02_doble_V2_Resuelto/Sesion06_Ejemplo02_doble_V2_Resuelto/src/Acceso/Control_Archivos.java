package Acceso;

import Control.Lista_Doble_Circular;
import Control.Nodo;
import Modelo.Producto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Control_Archivos {
    
    private static String nom_archivo = "productos.txt";
    
    public static void Guardar_Archivo(Lista_Doble_Circular lista){
        try {
            FileWriter fw = new FileWriter("lista.txt");
            PrintWriter pw = new PrintWriter(fw);
            Nodo auxiliar = lista.getInicio();
            if(auxiliar != null){
                do{
                    pw.println(auxiliar.getElemento().getCadena_Archivo());
                    auxiliar = auxiliar.getSiguiente();
                }while(auxiliar != lista.getInicio());
            }            
            pw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
    
    public static void Abrir_Archivo(Lista_Doble_Circular lista){
        try {
            FileReader fr = new FileReader("lista.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while( (linea = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(linea, "%");
                int codigo = Integer.parseInt(st.nextToken());
                String descripcion = st.nextToken();
                int stock = Integer.parseInt(st.nextToken());
                Object[] registro = {codigo,descripcion,stock};
                lista.Agregar(new Producto(registro));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
    }
}
