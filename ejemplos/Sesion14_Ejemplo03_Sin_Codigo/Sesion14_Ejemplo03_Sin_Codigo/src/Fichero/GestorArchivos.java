package Fichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GestorArchivos {
    public static void Abrir(String Archivo, ArrayList<String> lista){
        try {
            lista.clear();
            FileReader fr = new FileReader(Archivo);
            BufferedReader br = new BufferedReader(fr);
            if(br != null){
                String linea = null;
                while((linea = br.readLine()) != null){
                    lista.add(linea);
                }
                br.close();
            }            
            fr.close();
        } catch (Exception e) {
        }
    }
    
    public static void Guardar(String Archivo, String dato){
        try {
            FileWriter fw = new FileWriter(Archivo, true);
            PrintWriter pw = new PrintWriter(fw);
            if(pw != null){
                pw.println(dato);
                pw.close();
            }
            fw.close();
        } catch (Exception e) {
        }
    }
}
