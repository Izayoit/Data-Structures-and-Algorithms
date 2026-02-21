
package modelo;


public class animal {
    
    private String especie,genero;
    private int edad,codigo;

    public animal(String especie, String genero, int edad, int codigo) {
        this.especie = especie;
        this.genero = genero;
        this.edad = edad;
        this.codigo = codigo;
    }

    
    
    public Object[] getRegistro(){

    return new  Object[]{especie,genero,edad,codigo};
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    
}
