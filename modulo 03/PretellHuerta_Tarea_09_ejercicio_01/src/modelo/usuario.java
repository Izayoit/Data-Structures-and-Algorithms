
package modelo;


public class usuario {
    private String nombre;
    private int dni;
    private String region;
   private int edad;
   private int codigo;
   private String red_social;

    public usuario(String nombre, int dni, String region, int edad,int codigo,String red_social) {
        this.nombre = nombre;
        this.dni = dni;
        this.region = region;
        this.edad = edad;
        this.codigo = codigo;
    }

   
    public Object[] getRegistro(){
    
    return new  Object[]{nombre,dni,region,edad,codigo,red_social};
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getRed_social() {
        return red_social;
    }

    public void setRed_social(String red_social) {
        this.red_social = red_social;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    
    
}
