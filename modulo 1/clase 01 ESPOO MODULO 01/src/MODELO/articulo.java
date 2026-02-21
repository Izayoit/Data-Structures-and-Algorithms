
package MODELO;

import java.util.Vector;


public class articulo {
   private int codigo;
   private String nombre;

    public articulo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    } 
    


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vector<?> getRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
