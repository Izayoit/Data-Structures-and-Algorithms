
package Modelo;

public class album {
    
   private String codigo;
   private String nombre;
   private String lista_canciones;

    public album(String codigo, String nombre, String lista_canciones) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.lista_canciones = lista_canciones;
    }


    public Object[] Getregistro(){
    
    Object[] dato ={codigo,nombre,lista_canciones};
        
    return dato;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLista_canciones() {
        return lista_canciones;
    }

    public void setLista_canciones(String lista_canciones) {
        this.lista_canciones = lista_canciones;
    }

  
    
    
    
}
