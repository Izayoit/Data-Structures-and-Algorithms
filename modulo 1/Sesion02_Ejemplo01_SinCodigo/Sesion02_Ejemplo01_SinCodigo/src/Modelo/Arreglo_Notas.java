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
    
    public void Insertar(double nota){
        if(i < notas.length){
            notas[i] = nota;
            i++;
        }else{
            JOptionPane.showMessageDialog(null, "Lista Llena");
        }
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
}
