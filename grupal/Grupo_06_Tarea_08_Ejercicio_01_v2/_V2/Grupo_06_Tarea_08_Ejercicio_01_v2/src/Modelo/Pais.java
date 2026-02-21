package Modelo;

import Control.Lista_Ciudad;

public class Pais {

    private String codigo;
    private String nombre;
    private Lista_Ciudad lst_ciudad;

    public Pais(Object[] arreglo) {
        codigo = arreglo[0].toString();
        nombre = arreglo[1].toString();
        lst_ciudad = new Lista_Ciudad();
    }

    public Object[] getRegistro() {
        return new Object[]{codigo, nombre};
    }

    public String getCadenaFiltrar() {
        return codigo + nombre;
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

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public Lista_Ciudad getLst_ciudad() {
        return lst_ciudad;
    }

    public void setLst_ciudad(Lista_Ciudad lst_ciudad) {
        this.lst_ciudad = lst_ciudad;
    }

}
