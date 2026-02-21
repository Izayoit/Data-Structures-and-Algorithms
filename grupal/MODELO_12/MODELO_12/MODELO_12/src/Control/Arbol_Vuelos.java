package Control;

import Modelo.Vuelos;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arbol_Vuelos {

    private Nodo_Vuelos raiz;

    public Arbol_Vuelos() {
        raiz = null;
    }

    public Nodo_Vuelos getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo_Vuelos raiz) {
        this.raiz = raiz;
    }

    public Nodo_Vuelos Insertar(Nodo_Vuelos raiz, Vuelos elemento) {
        if (raiz == null) {
            Nodo_Vuelos nuevo = new Nodo_Vuelos(elemento);
            return nuevo;
        } else if (elemento.getNumeroVuelo() < raiz.getElemento().getNumeroVuelo()) {
            raiz.setIzq(Insertar(raiz.getIzq(), elemento));
        } else if (elemento.getNumeroVuelo() > raiz.getElemento().getNumeroVuelo()) {
            raiz.setDer(Insertar(raiz.getDer(), elemento));
        } else {
            JOptionPane.showMessageDialog(null, "el número de vuelo " + elemento.getNumeroVuelo() + " ya a sido usado");

        }
        return raiz;
    }

    public void Inorden(Nodo_Vuelos Raiz, DefaultTableModel modelo) {
        if (Raiz != null) {
            Inorden(Raiz.getIzq(), modelo);
            modelo.addRow(Raiz.getRegistro());
            Inorden(Raiz.getDer(), modelo);
        }
    }

    public void InordenCBO(Nodo_Vuelos raiz, DefaultComboBoxModel modelo, HashMap tabla1) {
        if (raiz != null) {
            InordenCBO(raiz.getIzq(), modelo, tabla1);
            modelo.addElement(raiz.getElemento().getNumeroVuelo());
            tabla1.put(raiz.getElemento().getNumeroVuelo(), raiz.getElemento());
            InordenCBO(raiz.getDer(), modelo, tabla1);
        }
    }
     private void InordenFiltrado(Nodo_Vuelos nodo, DefaultTableModel modelo, String filtro) {
        if (nodo != null) {
            InordenFiltrado(nodo.getIzq(), modelo, filtro);

            String textoNodo = nodo.getCadena().toLowerCase();
            if (textoNodo.contains(filtro)) {
                modelo.addRow(nodo.getRegistro());
            }

            InordenFiltrado(nodo.getDer(), modelo, filtro);
        }
    }
   public void Filtrar(JTable tabla, String filtro) {
        String[] cabecera = {"numero", "fehca", "hora", "origen", "destino", "plazas totales", "plazas turistas"};
        DefaultTableModel modelo = new DefaultTableModel(cabecera, 0);
        tabla.setModel(modelo);

       InordenFiltrado(raiz, modelo, filtro);
    }

    public void Listar(JTable tabla) {
        String[] cabecera = {"numero", "fehca", "hora", "origen", "destino", "plazas totales", "plazas turistas"};
        DefaultTableModel modelo = new DefaultTableModel(cabecera, 0);
        tabla.setModel(modelo);
        Inorden(raiz, modelo);
    }

    public void ListarCbo(JComboBox cbo, HashMap tabla) {
        DefaultComboBoxModel modelos = new DefaultComboBoxModel();
        cbo.setModel(modelos);
        InordenCBO(raiz, modelos, tabla);
    }

    public Vuelos Buscar(Nodo_Vuelos raiz, int numeroVuelo) {
        if (raiz == null) {
            return null;
        } else if (numeroVuelo == raiz.getElemento().getNumeroVuelo()) {
            return raiz.getElemento();
        } else if (numeroVuelo < raiz.getElemento().getNumeroVuelo()) {
            return Buscar(raiz.getIzq(), numeroVuelo);
        } else {
            return Buscar(raiz.getDer(), numeroVuelo);
        }
    }

    public boolean Editar(int numeroVuelo, Vuelos nuevosDatos) {
        Vuelos v = Buscar(raiz, numeroVuelo);
        if (v != null) {
            v.setFechaVuelo(nuevosDatos.getFechaVuelo());
            v.setHoraVuelo(nuevosDatos.getHoraVuelo());
            v.setOrigenVuelo(nuevosDatos.getOrigenVuelo());
            v.setDestinoVuelo(nuevosDatos.getDestinoVuelo());
            v.setPlazasTotales(nuevosDatos.getPlazasTotales());
            v.setPlazasTurista(nuevosDatos.getPlazasTurista());
            return true;
        } else {
            return false;
        }
    }

    public Nodo_Vuelos Eliminar(Nodo_Vuelos raiz, int numeroVuelo) {
        if (raiz == null) {
            return null;
        }

        if (numeroVuelo < raiz.getElemento().getNumeroVuelo()) {
            raiz.setIzq(Eliminar(raiz.getIzq(), numeroVuelo));
        } else if (numeroVuelo > raiz.getElemento().getNumeroVuelo()) {
            raiz.setDer(Eliminar(raiz.getDer(), numeroVuelo));
        } else {

            if (raiz.getIzq() == null && raiz.getDer() == null) {
                return null;
            }

            if (raiz.getIzq() == null) {
                return raiz.getDer();
            }
            if (raiz.getDer() == null) {
                return raiz.getIzq();
            }

            Nodo_Vuelos sucesor = EncontrarMinimo(raiz.getDer());
            raiz.setElemento(sucesor.getElemento());
            raiz.setDer(Eliminar(raiz.getDer(), sucesor.getElemento().getNumeroVuelo()));
        }
        return raiz;
    }

    private Nodo_Vuelos EncontrarMinimo(Nodo_Vuelos nodo) {
        while (nodo.getIzq() != null) {
            nodo = nodo.getIzq();
        }
        return nodo;
    }
}
