package Modelo;

public class Pais {
    private int Codigo;
    private String Nombre;
    private double Precio;
    
    public Pais(Object[] Registro){
        Codigo = Integer.parseInt(Registro[0].toString());
        Nombre = Registro[1].toString();
        Precio = Double.parseDouble(Registro[2].toString());
    }
    
    public Object[] getRegistro(){
        return new Object[]{Codigo,Nombre,Precio};
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    
}
