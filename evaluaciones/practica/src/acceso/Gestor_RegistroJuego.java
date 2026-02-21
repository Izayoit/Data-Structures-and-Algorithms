package acceso;

import arreglo.ArregloJuego;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import modelo.Juego;
import modelo.Usuario;

public class Gestor_RegistroJuego {

    private String Archivo = "Juego.txt";

    public void Guardar(ArregloJuego ObjArregloJuego) {
        try {
            FileWriter fw = new FileWriter(Archivo);
            PrintWriter PW = new PrintWriter(fw);
            Juego[] Arreglo = ObjArregloJuego.getArreglo();
            for (int pos = 0; pos < ObjArregloJuego.getI(); pos++) {
                PW.println(Arreglo[pos].getCadenaGestor());
            }
            PW.close();
            fw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }

    }

    public void cargar(ArregloJuego ObjArreglojuego) {
        try {
            FileReader FR = new FileReader(Archivo);
            BufferedReader BR = new BufferedReader(FR);
            String linea = null;
            while ((linea = BR.readLine()) != null) {
                String[] datos = linea.split(",");
                String nombre = datos[0];
                String codigo = datos[1];
                String empresa = datos[2];

                ObjArreglojuego.RegistroGestor(nombre, codigo, empresa);

            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "los archivos fueros eliminados");

        }

    }

}
