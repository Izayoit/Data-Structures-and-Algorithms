package Modelo;

public class Cliente {
   private String nombre;
   private int edad;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
  
   
   public String getCadena(){
   return nombre + edad;
   }
  public Object[] getRegistro(){
  
  Object[] dato ={getNombre() , getEdad()};
      
  return dato;
  }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
