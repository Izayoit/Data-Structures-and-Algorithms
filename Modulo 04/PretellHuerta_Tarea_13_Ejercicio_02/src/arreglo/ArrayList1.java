package arreglo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.profesor;
import modelo.salones;
import modelo.temas_investigacion;

public class ArrayList1 {

    ArrayList<profesor> ArregloProfesor = new ArrayList<>();

    ArrayList<salones> ArregloSalon = new ArrayList<>();

    ArrayList<temas_investigacion> ArregloTemasIn = new ArrayList<>();

    public void registrar_profe(profesor elemento) {
        for ( profesor P : ArregloProfesor ) {
            if (P.getId().equals(elemento.getId())) {
                return;
            }
        }
        
        ArregloProfesor.add(elemento);

    }

    public void registrar_salon(salones elemento) {
for ( salones S : ArregloSalon ) {
            if (S.getId().equals(elemento.getId())) {
                return;
            }
        }
        ArregloSalon.add(elemento);

    }

    public void registrar_temas(temas_investigacion elemento) {
for ( temas_investigacion T : ArregloTemasIn ) {
            if (T.getAreaTematica().equals(elemento.getAreaTematica())) {
                return;
            }
        }
        ArregloTemasIn.add(elemento);

    }

    public void listar_profesor(JTable Control, HashMap TablaHash01, HashMap TablaHash02, HashMap TablaHash03) {
        DefaultTableModel modtable = new DefaultTableModel(new String[]{"id", "especialidad", "horarios Disponibles", "departamento"}, 0);
        Control.setModel(modtable);

        for (profesor P : ArregloProfesor) {
            modtable.addRow(P.getRegistro());
            TablaHash01.put(P.getId(), P.getEspecialidad());
            TablaHash02.put(P.getId(), P.getHorariosDisponibles());
            TablaHash03.put(P.getId(), P.getDepartamento());
        }

    }

    public void listar_salon(JTable Control, HashMap TablaHash04, HashMap TablaHash05, HashMap TablaHash06) {
        DefaultTableModel modtable = new DefaultTableModel(new String[]{"id","capacidad","recursos tecnicos","horarios"}, 0);
        Control.setModel(modtable);
        for (salones S : ArregloSalon) {
            modtable.addRow(S.getRegistro());
            TablaHash04.put(S.getId(), S.getCapacidad());
            TablaHash05.put(S.getId(), S.getRecursosTecnicos());
            TablaHash06.put(S.getId(), S.getHorariosDisponibles());
        }
        
    }
    public void listar_temas_inves(JTable Control, HashMap TablaHash07){
    
    DefaultTableModel modtable = new DefaultTableModel(new String[]{"area tematica","idProfesores"}, 0);
    Control.setModel(modtable);
        for (temas_investigacion T:ArregloTemasIn) {
            modtable.addRow(T.getRegistro());
            TablaHash07.put(T.getAreaTematica(), T.getIdsProfesoresInteresados());
        
        }
    
    

    
    }

    
    
    
    
    
    
    
}
