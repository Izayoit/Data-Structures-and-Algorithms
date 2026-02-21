
package control;

import modelo.almacen;
import modelo.producto;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Arreglo_producto {
    private producto[]Arreglo= new producto[8];
    private int i = 0;

    public void lista(JTable control) {
        String[] cabezera = {"nombre", "codigo", "marca","stock","almacen Asignado"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        for (int pos = 0; pos < i; pos++) {

            modtable.addRow(Arreglo[pos].getRegistro());
        }

    }

    public void registrar(producto dato) {
        if (i < Arreglo.length) {
            Arreglo[i] = dato;
            i++;
        } else {
            JOptionPane.showMessageDialog(null, "se paso del limite");
        }
    }

    
    
    public void editar(producto dato, int pos) {
        Arreglo[pos] = dato;

    }
    public void eliminar(int pos){
        for (int j = pos; j < i-1; j++) {
            Arreglo[j]= Arreglo[j+1];
        }
    i--;
    }
    
    
    public producto BusquedaLineal(int indice,String dato){
    
    for (int j = 0; j < i; j++) {
        switch (indice) {
            case 0: // Buscar por marca (dato es texto)
                if (Arreglo[j].getMarca().equalsIgnoreCase(dato)) {
                    return Arreglo[j];
                }
                break;

            case 1: // Buscar por stock (dato es número, pero lo recibimos como String y convertimos)
                int stockBuscado = Integer.parseInt(dato);
                if (Arreglo[j].getStock() == stockBuscado) {
                    return Arreglo[j];
                }
                break;

            default:
                throw new AssertionError();
        }
    }
    return null; // No encontró nada

    
    
    }
    
    
    public void menor(JTable control, int dato) {
        String[] cabezera = {"nombre", "codigo", "marca","stock","almacen Asignado"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        
        for (int pos = 0; pos < i; pos++) {
     if(Arreglo[pos].getStock()<dato){
            modtable.addRow(Arreglo[pos].getRegistro());
}
        }

    }
        public void igual(JTable control, int dato) {
        String[] cabezera = {"nombre", "codigo", "marca","stock","almacen Asignado"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        
        for (int pos = 0; pos < i; pos++) {
     if(Arreglo[pos].getStock()== dato){
            modtable.addRow(Arreglo[pos].getRegistro());
}
        }

    }
            public void mayor(JTable control, int dato) {
        String[] cabezera = {"nombre", "codigo", "marca","stock","almacen Asignado"};
        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);
        
        for (int pos = 0; pos < i; pos++) {
     if(Arreglo[pos].getStock()>dato){
            modtable.addRow(Arreglo[pos].getRegistro());
}
        }

    }
             
}
