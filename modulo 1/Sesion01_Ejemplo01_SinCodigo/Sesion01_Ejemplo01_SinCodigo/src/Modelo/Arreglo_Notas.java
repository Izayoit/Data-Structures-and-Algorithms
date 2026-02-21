package Modelo;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Arreglo_Notas {
    private int[] arreglo = new int[15];
    private int i =0;
public void listar(JList control){
DefaultListModel modlista = new DefaultListModel();
control.setModel(modlista);
    for (int pos = 0; pos < i; pos++) {
        modlista.addElement(arreglo[pos]);
    }
} 
   
public void insertar(int dato){
if(i<arreglo.length){
 if(dato>=0 && dato <=20) {  
arreglo[i]=dato;
i++;}else {JOptionPane.showMessageDialog(null, "error");}


}else{JOptionPane.showMessageDialog(null, "se paso del limite");}
}

public int contar_desaprovados(){
int c=0;
    for (int pos = 0; pos < i; pos++) {
        if(arreglo[pos]<11){
        c++;
        }
    }
return c;
}
}
