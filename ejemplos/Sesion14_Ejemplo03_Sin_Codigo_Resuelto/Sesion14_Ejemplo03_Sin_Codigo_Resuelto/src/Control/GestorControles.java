package Control;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class GestorControles {
    public static void Completar_Tabla(DefaultTableModel modTabla,  ArrayList<String> lista){
        int i = modTabla.getRowCount();
        if(i < lista.size()){
            for (int j = i; j < lista.size(); j++) {
                String dato = lista.get(j);
                modTabla.addRow(new Object[]{dato});
            }
        }
    }
}
