package Gestor;

import Control.Grafo;
import Control.Nodo;
import Modelo.Ciudad;
import Modelo.Enlace;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Gestor_Archivos {
    private static String ArchivoCiudades = "Lista_Ciudades.txt";
    private static String ArchivoEnlaces = "Lista_Enlaces.txt";

    public static void Guardar_Ciudades(Grafo objGrafo) {
        try {
            FileWriter fw = new FileWriter(ArchivoCiudades);
            PrintWriter pw = new PrintWriter(fw);

            if (pw != null) {
                ArrayList<Nodo> Lista = objGrafo.getLista();
                for (Nodo objNodo : Lista) {
                    pw.println(objNodo.getElemento().getCadena());
                }                                
            }
            pw.close();
            fw.close();
            Guardar_Enlaces(objGrafo);
        } catch (Exception e) {
        }
    }
    
    private static void Guardar_Enlaces(Grafo objGrafo) {
        try {
            FileWriter fw = new FileWriter(ArchivoEnlaces);
            PrintWriter pw = new PrintWriter(fw);

            if (pw != null) {
                String[][] Matriz = Generar_Matriz_Adyacencia(objGrafo);
                String[] Lista_Enlaces = Generar_Cadena_Enlaces(Matriz);
                for (String Enlaces : Lista_Enlaces) {
                    pw.println(Enlaces);
                }                                
            }
            pw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public static void Abrir_Ciudades(Grafo objGrafo) {
        try {
            FileReader fr = new FileReader(ArchivoCiudades);
            BufferedReader br = new BufferedReader(fr);

            if (br != null) {
                String l;

                while ((l = br.readLine()) != null) {
                    StringTokenizer str = new StringTokenizer(l, "&");

                    String Nombre = str.nextToken();
                    String Poblacion = str.nextToken();

                    objGrafo.Agregar(new Ciudad(new String[]{Nombre,Poblacion}));
                }
            }
            br.close();
            fr.close();
            Abrir_Enlaces(objGrafo);
        } catch (Exception e) {
        }
    }
    
    private static void Abrir_Enlaces(Grafo objGrafo) {
        try {
            FileReader fr = new FileReader(ArchivoEnlaces);
            BufferedReader br = new BufferedReader(fr);

            if (br != null) {
                String l;
                int fil = 0;
                while ((l = br.readLine()) != null) {
                    Nodo CiudadOrigen = objGrafo.getLista().get(fil);
                    StringTokenizer str = new StringTokenizer(l, "&");
                    int ct = str.countTokens();
                    for(int col=0; col<ct; col++){
                        String enlace = str.nextToken();
                        if(!enlace.equals("0") && !enlace.equals("-1")){
                            Nodo CiudadDestino = objGrafo.getLista().get(col);
                            int Peso = Integer.parseInt(enlace);
                            CiudadOrigen.Agregar_Arista(new Enlace(Peso, CiudadDestino));
                        }
                    }
                    fil++;
                }
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
    }
    
    private static String[][] Generar_Matriz_Adyacencia(Grafo objArbol){
        ArrayList<Nodo> Lista = objArbol.getLista();
        String[][] Matriz = new String[Lista.size()][Lista.size()];
        for (int fil = 0; fil < Lista.size(); fil++) {            
            for (int col = 0; col < Lista.size(); col++) {
                String Nombre = Lista.get(col).getElemento().getNombre();
                if(fil == col){
                    Matriz[fil][col] = "0";
                }else {
                    int Pos = Lista.get(fil).Buscar_Arista(Nombre);
                    if(Pos != -1){
                        Matriz[fil][col] = Lista.get(fil).getAristas().get(Pos).getPeso()+"";
                    }else{
                        Matriz[fil][col] = "-1";
                    }
                }
                System.out.print("("+Matriz[fil][col] + ")");
            }
            System.out.print("\n");
        }
        return Matriz;
    }
    
    public static String[] Generar_Cadena_Enlaces(String[][] Matriz){
        String[] Lista_Enlaces = new String[Matriz.length];
        for (int fil = 0; fil < Matriz.length; fil++) {            
            String Enlaces = "";
            for (int col = 0; col < Matriz.length; col++) {
                Enlaces = Enlaces + Matriz[fil][col] + "&";
            }
            Lista_Enlaces[fil] = Enlaces.substring(0, Enlaces.length()-1);
        }
        return Lista_Enlaces;
    }
}