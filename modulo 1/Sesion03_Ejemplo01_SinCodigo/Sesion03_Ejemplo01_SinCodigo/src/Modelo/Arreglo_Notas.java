package Modelo;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Arreglo_Notas {
    private double[] notas;
    private int i = 0;
    
    public Arreglo_Notas(){
        notas = new double[8];
    }
    
    public void Insertar(int pos, double nota){
        notas[pos] = nota;
    }
    public double buscar_linea(double nuevovalor){
        
for (int j = 0; j < i; j++) {
    if (notas[j] == nuevovalor ) {
        return j;
    }
   
}  return -1;
    }
    
    public void Insertar(double nota){
        if(i < notas.length){
            if(buscar_linea(nota) == -1){
                notas[i] = nota;
                i++;
            }else{
                JOptionPane.showMessageDialog(null, "El número " + nota + " ¡Ya está registrado!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Lista Llena");
        }
    }
    
    public int Buscar(double dato){
        for (int pos = 0; pos < i; pos++) {
            if(dato == notas[pos]){
                return pos;
            }
        }
        return -1;
    }
    
    public void Listar(DefaultListModel modLista){
        modLista.removeAllElements();
        for (int pos = 0; pos < i; pos++) {
            modLista.addElement(notas[pos]);
        }
    }
    
    public void ContarDesaprobados(JLabel lblDesaprobados){
        int n = 0;
        for (int pos = 0; pos < i; pos++) {
            if(notas[pos] < 11){
                n++;
            }
        }
        lblDesaprobados.setText(n + "");
    }
    
    public void ordenar_burbuja01(){
         double temp;
        for (int j = 0; j < i-1; j++) {
            for (int x = 0; x < i-1; x++) {
                if(notas[x]>notas[x+1]){
             temp = notas[x];
            notas[x] = notas[x + 1];
            notas[x + 1] = temp;
                }
                
            }
            
        }
    
    
    }
}
