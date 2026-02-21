package Modelo;

public class Paquete {

    private int codigo;
    private String descripcion;
    private double peso;

    public Paquete() {
    }

    public Paquete(int codigo, String Descripcion, double Peso) {
        this.codigo = codigo;
        this.descripcion = Descripcion;
        this.peso = Peso;
    }

    public Paquete(String descripcion, double peso) {
        this.descripcion = descripcion;
        this.peso = peso;
    }

    public Object[] getRegistro() {
      
    Object[] dato ={codigo, descripcion, peso};
        
        return dato ;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double Peso) {
        this.peso = Peso;
    }
}
