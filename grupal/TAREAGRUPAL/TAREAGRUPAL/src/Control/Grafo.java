package Control;

import Modelo.Ciudad;
import Modelo.Enlace;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Grafo {

    private ArrayList<Nodo> Lista = new ArrayList<Nodo>();

    public ArrayList<Nodo> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<Nodo> Lista) {
        this.Lista = Lista;
    }

    public void AgregarNodo(Ciudad elemento) {
        Nodo e = new Nodo(elemento);
        Lista.add(e);
    }

    public Nodo BuscarCiudad(String nombre) {
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getElemento().getNombre().equals(nombre)) {
                return Lista.get(i);
            }
        }
        return null;
    }//esto es dios

    public void editarCiudad(String nombreAntiguo, String nuevoNombre, String nuevoPais) {
        Nodo nodo = BuscarCiudad(nombreAntiguo);
        if (nodo != null) {
            nodo.getElemento().setNombre(nuevoNombre);
            nodo.getElemento().setPais(nuevoPais);
        }
    }

    public void editarEnlace(String origen, String destino, String tipo, int nuevoTiempo, double nuevoCosto) {
        Nodo ciudadOrigen = BuscarCiudad(origen);
        Nodo ciudadDestino = BuscarCiudad(destino);

        for (Enlace enlace : ciudadOrigen.getAristas()) {
            if (enlace.getEnlace().getElemento().getNombre().equals(destino)
                    && enlace.getTipo().equals(tipo)) {
                enlace.setTiempo(nuevoTiempo);
                enlace.setCosto_Economico(nuevoCosto);
            }
        }

        for (Enlace enlace : ciudadDestino.getAristas()) {
            if (enlace.getEnlace().getElemento().getNombre().equals(origen)
                    && enlace.getTipo().equals(tipo)) {
                enlace.setTiempo(nuevoTiempo);
                enlace.setCosto_Economico(nuevoCosto);
            }
        }
    }

    public void ELiminar_Nodo(String nombre) {
        Nodo buscado = BuscarCiudad(nombre);
        Lista.remove(buscado);
        EliminarEnlacers(nombre);

    }

    public void EliminarEnlacers(String nombre) {
        for (int i = 0; i < Lista.size(); i++) {
            ArrayList<Enlace> arista = Lista.get(i).getAristas();
            for (int j = 0; j < arista.size(); j++) {
                if (arista.get(j).getEnlace().getElemento().getNombre().equals(nombre)) {
                    arista.remove(j);
                }
            }
        }
    }

    public void AgregarENlace(String origen, String destino, int tiempo, String tipo, double costo) {
   
        Nodo ciudadorigen = BuscarCiudad(origen);
        Nodo ciudaddestino = BuscarCiudad(destino);
        Enlace arista1 = new Enlace(tiempo, tipo, ciudaddestino, costo);
        ciudadorigen.Agregar_Arista(arista1);
        Enlace arista2 = new Enlace(tiempo, tipo, ciudadorigen, costo);
        ciudaddestino.Agregar_Arista(arista2);
    }

    public void EliminarConexion(String origen, String destino) {
        Nodo ciudadorigen = BuscarCiudad(origen);
        int pos1 = ciudadorigen.Buscar_Aristas(destino);
        if (pos1 != -1) {
            ciudadorigen.Eliminar_Aristas(pos1);
        }

        Nodo ciudaddesrtino = BuscarCiudad(destino);
        int pos2 = ciudaddesrtino.Buscar_Aristas(origen);
        if (pos2 != -1) {
            ciudaddesrtino.Eliminar_Aristas(pos2);
        }
    }

    public void Recorrer(JTable control) {
        String[] cabecera = {"Ciudad", "Pais", ""};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);

        for (int i = 0; i < Lista.size(); i++) {
            Lista.get(i).setVisitado(false);
        }

        Deque<Nodo> Cola = new ArrayDeque<Nodo>();
        Nodo Actual;

        if (Lista.isEmpty() == false) {
            Lista.get(0).setVisitado(true);
            Cola.addLast(Lista.get(0));
            while (Cola.isEmpty() == false) {
                Actual = Cola.removeFirst();
                modTabla.addRow(Actual.getElemento().getRegistro());
                String Enlaces = "";
                for (int i = 0; i < Actual.getAristas().size(); i++) {
                    Enlace Arista = Actual.getAristas().get(i);
                    Nodo Vecino = Arista.getEnlace();
                    if (Vecino.isVisitado() == false) {
                        Cola.addLast(Vecino);
                        Vecino.setVisitado(true);
                    }
                    Enlaces = Enlaces
                            + "["
                            + Vecino.getElemento().getNombre()
                            + "(" + Arista.getTiempo() + ")"
                            + "(" + Arista.getTipo() + ")"
                            + "(" + Arista.getCosto_Economico() + ")"
                            + "]";
                }
                if (modTabla.getColumnCount() > 0) {
                    modTabla.setValueAt(Enlaces,
                            modTabla.getRowCount() - 1, 2);
                }
            }
        }

    }
    
    
   
   
    
     
}
