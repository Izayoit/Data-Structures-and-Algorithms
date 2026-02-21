package Control;

import Modelo.Alumno;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Lista_Doble {
    private Nodo_Doble Inicio;
    private Nodo_Doble Fin;
    
    public Lista_Doble(){
        Inicio = Fin = null;
    }

    public Nodo_Doble getInicio() { return Inicio; }

    public void setInicio(Nodo_Doble Inicio) { this.Inicio = Inicio; }

    public Nodo_Doble getFin() { return Fin; }

    public void setFin(Nodo_Doble Fin) { this.Fin = Fin; }
    
    //Metodos
    public void Agregar_Fin(Alumno dato){
        Nodo_Doble Nuevo = new Nodo_Doble(dato);
        if(Inicio == null){
            Inicio = Fin = Nuevo;
        }else{
            Fin.setSiguiente(Nuevo);
            Nuevo.setAnterior(Fin);
            Fin = Nuevo;
        }
    }
    
    public void Listar(JTable control){
        String[] cabecera = {"Código","dni","Nombres","Apellidos","correo","telefono","Idcarrera"};
        DefaultTableModel modTabla = new DefaultTableModel(cabecera, 0);
        control.setModel(modTabla);
        Nodo_Doble Auxiliar = Inicio;
        while(Auxiliar != null){
            modTabla.addRow(Auxiliar.getElemento().getRegistro());
            Auxiliar = Auxiliar.getSiguiente();
        }
    }
}
