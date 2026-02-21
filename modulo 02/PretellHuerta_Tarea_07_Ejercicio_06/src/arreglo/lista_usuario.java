package arreglo;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.usuario;

public class lista_usuario {

    private usuario[] Arreglo = new usuario[25];
    private int i = 0;
    private Nodo_usuario cima1 , cima2, cima3;

    public void registrar(usuario elemento) {
        if (buscar(elemento.getCarrito()) == -1) {

            Arreglo[i] = elemento;
            i++;
        } else {
            JOptionPane.showMessageDialog(null, "el carrito esta en uso");
        }
    }

    public void listar(JTable control) {

        String[] cabezera = {"ID", "carrito"};

        DefaultTableModel modtable = new DefaultTableModel(cabezera, 0);
        control.setModel(modtable);

        for (int j = 0; j < i; j++) {
            modtable.addRow(Arreglo[j].getRegistro());
        }
    }

    public int buscar(String carrito) {
        for (int j = 0; j < i; j++) {

            if (Arreglo[j].getCarrito().equals(carrito)) {

                return j;
            }
        }
        return -1;
    }

    public usuario obtenerSiguienteDisponible() {

        for (int j = 0; j < i; j++) {
            String carrito = Arreglo[j].getCarrito();
            if (!buscarEnPila(carrito)) {
                return Arreglo[j];

            }
        }
        return null;
    }

    public void eliminarDeArreglo1(String carrito) {
        for (int j = 0; j < i; j++) {
            if (Arreglo[j].getCarrito().equals(carrito)) {
                // Mover los elementos hacia la izquierda para llenar el hueco
                for (int k = j; k < i - 1; k++) {
                    Arreglo[k] = Arreglo[k + 1];
                }
                Arreglo[i - 1] = null;
                i--;
                break;
            }
        }
    }
    

    public boolean buscarEnPila(String carrito) {
        Nodo_usuario aux = cima1;
        while (aux != null) {
            if (aux.getElemento().getCarrito().equals(carrito)) {
                return true;
            }
            aux = aux.getSiguiente();
        }

        aux = cima2;
        while (aux != null) {
            if (aux.getElemento().getCarrito().equals(carrito)) {
                return true;
            }
            aux = aux.getSiguiente();
        }

        aux = cima3;
        while (aux != null) {
            if (aux.getElemento().getCarrito().equals(carrito)) {
                return true;
            }
            aux = aux.getSiguiente();
        }

        return false;
    }
    

   //apilar
    public void ApilarEnPila1(usuario elemento) {
        Nodo_usuario nuevo = new Nodo_usuario(elemento);
        nuevo.setSiguiente(cima1);
        cima1 = nuevo;
    }

    public void ApilarEnPila2(usuario elemento) {
        Nodo_usuario nuevo = new Nodo_usuario(elemento);
        nuevo.setSiguiente(cima2);
        cima2 = nuevo;
    }

    public void ApilarEnPila3(usuario elemento) {
        Nodo_usuario nuevo = new Nodo_usuario(elemento);
        nuevo.setSiguiente(cima3);
        cima3 = nuevo;
    }
    
    //apilar 
    
    
   //recorrerpila
    public void recorrerpila(DefaultTableModel modtable) {

        Nodo_usuario auxiliar = cima1;
        modtable.setRowCount(0);
        while (auxiliar != null) {

            modtable.addRow(auxiliar.getElemento().getRegistro());
            auxiliar = auxiliar.getSiguiente();
        }

    }

    public void recorrerpila2(DefaultTableModel modtable) {

        Nodo_usuario auxiliar = cima2;
        modtable.setRowCount(0);
        while (auxiliar != null) {

            modtable.addRow(auxiliar.getElemento().getRegistro());
            auxiliar = auxiliar.getSiguiente();
        }

    }

    public void recorrerpila3(DefaultTableModel modtable) {

        Nodo_usuario auxiliar = cima3;
        modtable.setRowCount(0);
        while (auxiliar != null) {

            modtable.addRow(auxiliar.getElemento().getRegistro());
            auxiliar = auxiliar.getSiguiente();
        }

    }
     //recorrerpila
    
    

    public usuario PasarLista() {

        if (!Vacio1()) {

            //G 
            i--;
            return Arreglo[i];

        }

        return null;
    }

    //desapilar
    public usuario desapilar1() {

        if (!Vacio1()) {

            usuario temp = cima1.getElemento();
            cima1 = cima1.getSiguiente();

            return temp;

        }

        return null;
    }

    public usuario desapilar2() {

        if (!Vacio2()) {

            usuario temp = cima2.getElemento();
            cima2 = cima2.getSiguiente();

            return temp;

        }

        return null;
    }

    public usuario desapilar3() {

        if (!Vacio3()) {

            usuario temp = cima3.getElemento();
            cima3 = cima3.getSiguiente();

            return temp;

        }

        return null;
    }
//desapilar

   
    
//vacios
    public boolean Vacio1() {
        return cima1 == null;
    }

    public boolean Vacio2() {
        return cima2 == null;
    }

    public boolean Vacio3() {
        return cima3 == null;
    }

    public boolean VacioLista() {
        return i == 0;
    }
    //vacios

}
