package Modelo;

public class Ciudad {

    private String codigo;
    private String nombre;
    private String pais;

    public Ciudad(Object[] arreglo) {
        codigo = arreglo[0].toString();
        nombre = arreglo[1].toString();
        pais = arreglo[2].toString();
    }

    public Object[] getRegistro() {
        return new Object[]{codigo, nombre,pais};
    }

    public String getCadenaFiltrar() {
        return codigo + nombre+pais;
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

}
