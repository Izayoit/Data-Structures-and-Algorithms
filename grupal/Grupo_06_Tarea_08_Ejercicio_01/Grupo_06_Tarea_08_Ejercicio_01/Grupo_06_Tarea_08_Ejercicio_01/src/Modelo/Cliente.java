package Modelo;

import Control.Pila_Boleto;

public class Cliente {

    private String codigo;
    private String apellidos;
    private String nombres;
    private String direccion;
    private String telefono;
    private String dni;
    private Pila_Boleto lst_Boleto;

    public Cliente(Object[] arreglo) {
        codigo = arreglo[0].toString();
        apellidos = arreglo[1].toString();
        nombres = arreglo[2].toString();
        direccion = arreglo[3].toString();
        telefono = arreglo[4].toString();
        dni = arreglo[5].toString();
        lst_Boleto = new Pila_Boleto();
    }

    public Object[] getRegistro() {
        return new Object[]{codigo, apellidos, nombres, direccion, telefono, dni};
    }

    public String getCadenaFiltrar() {
        return codigo + apellidos + nombres + direccion + telefono + dni;
    }

    public Pila_Boleto getLst_Boleto() {
        return lst_Boleto;
    }

    public void setLst_Boleto(Pila_Boleto lst_Boleto) {
        this.lst_Boleto = lst_Boleto;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombreApellidos() {
        return nombres + " " + apellidos;
    }

    public void setNombreApellidos(String Almacen) {
        Almacen = apellidos + " " + nombres;

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String toString() {
        return getNombreApellidos(); // esto mostrará "nombres-apellidos" en el JComboBox
    }
}
