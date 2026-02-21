package Modelo;

public class Cliente {
    private int Codigo;
    private String Nombre;
    private double Prestamo;
    
    public Cliente(Object[] Registro){
        Codigo = Integer.parseInt(Registro[0].toString());
        Nombre = Registro[1].toString();
        Prestamo = Double.parseDouble(Registro[2].toString());
    }

    public Cliente(int Codigo, String Nombre, double Prestamo) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Prestamo = Prestamo;
    }
    
    
    public Object[] getRegistro(){
        return new Object[]{Codigo,Nombre,Prestamo};
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

    public double getPrestamo() {
        return Prestamo;
    }
   

    public void setPrestamo(double Prestamo) {
        this.Prestamo = Prestamo;
    }
    
    
}
