
package modelo;


public class Mascotas {
    
    private String nombre;
    private String especie;    
    private int edad;           
    private String color;

    public Mascotas(String nombre, String especie, int edad, String color) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.color = color;
    }
    
   public String getcadena(){
   
   return nombre+" "+especie+ " " +color+" ";
   
  
   }
    public Object[] getRegistro(){
    
    Object[] dato ={ getNombre(),getEspecie(),getEdad(),getColor()};
        
        return dato;
    }
            
            
            
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
    
    
}
