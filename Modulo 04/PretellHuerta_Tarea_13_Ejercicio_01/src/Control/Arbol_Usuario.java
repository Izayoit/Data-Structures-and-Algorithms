package Control;

import Modelo.usario;
import Modelo.viaje;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Arbol_Usuario {

   private ArrayList <usario> ArregloUsa= new ArrayList<>();
   private ArrayList <viaje> ArregloViaje =new ArrayList<>();

    
    public void Registrar(viaje Elemento){
       
        ArregloViaje.add(Elemento);
      
   
    }
   
    public void listar_viaje(JTable control, HashMap tablaHash3, HashMap TablaHash4,HashMap TablaHash5,HashMap TablaHash6 ){
    DefaultTableModel modtable = new DefaultTableModel(new String[]{"nombre_ciudad", "costo", "puntuacion", "comunidad", "lista_servicios"}, 0);
    control.setModel(modtable);

    for (viaje v : ArregloViaje) {
        
        tablaHash3.put(v.getNombre_ciudad(), v.getCosto_de_vida());
        TablaHash4.put(v.getNombre_ciudad(), v.getLista_Servicios());
        TablaHash5.put(v.getNombre_ciudad(), v.getPuntuacion_conectividad_digital());
        TablaHash6.put(v.getNombre_ciudad(), v.getComunidad());
        modtable.addRow(v.getRegistro());
    }
}

    
    public void Registrar_usa( usario Elemento){
        ArregloUsa.add(Elemento);
    }
    
    public void Listar_usa(JTable control,HashMap TablaHash0,HashMap TablaHash1, HashMap Tablahash2) {
    String[] Cabecera = {"Código","intereses", "Nombre", "Precio", "Idioma"};
    DefaultTableModel modTabla = new DefaultTableModel(Cabecera, 0);
    control.setModel(modTabla);

    for (usario u : ArregloUsa) {
        String codigo = String.valueOf(u.getCodigo());
        TablaHash0.put(codigo, u.getIntereses());
        TablaHash1.put(codigo, u.getPrecio()); // guarda el presupuesto
        Tablahash2.put(codigo, u.getIdioma()); // guarda el idioma
        modTabla.addRow(u.getRegistro()); // muestra en tabla
    }
}

   
    

    
   
}
