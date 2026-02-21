package Modelo;

import Control.Pila_Boleto;
import java.util.Date;

public class Vuelo {

    private String num_boletoCompuesto;
    private Date fecha;
    private Date hora;
    private Pais objPais;
    private Ciudad objCiudad;
    private double precio;
    private int capacidad;
    private Pila_Boleto lst_boletos;
    private int i = 1;

    public Vuelo(Object[] arreglo) {
        fecha = (Date) arreglo[0];
        hora = (Date) arreglo[1];
        objPais = (Pais) arreglo[2];
        objCiudad = (Ciudad) arreglo[3];
        precio = (double) arreglo[4];
        capacidad = (int) arreglo[5];
        lst_boletos = new Pila_Boleto();
        this.num_boletoCompuesto = generarCodigoBoleto();
    }

    private String generarCodigoBoleto() {
        return i++ + "-" + objPais.getNombre() + "-" + objCiudad.getNombre() + "-" + fecha + "-" + hora;
    }

    public String getNum_boletoCompuesto() {
        return num_boletoCompuesto;
    }

    public void setNum_boletoCompuesto(String codigo) {
        this.num_boletoCompuesto = codigo;
    }

    public Object[] getRegistro() {
        return new Object[]{fecha, hora, objPais.getNombre(), objCiudad.getNombre(), precio, capacidad};
    }

    public String getCadenaFiltrar() {
        return fecha + " " + " " + hora + " " + objPais.getNombre() + " " + objCiudad.getNombre() + " " + precio + " " + capacidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public int getI() {
        return i++;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Pais getObjPais() {
        return objPais;
    }

    public void setObjPais(Pais objPais) {
        this.objPais = objPais;
    }

    public Ciudad getObjCiudad() {
        return objCiudad;
    }

    public void setObjCiudad(Ciudad objCiudad) {
        this.objCiudad = objCiudad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Pila_Boleto getLst_boletos() {
        return lst_boletos;
    }

    public void setLst_boletos(Pila_Boleto lst_boletos) {
        this.lst_boletos = lst_boletos;
    }

    public String toString() {
        return num_boletoCompuesto ;
    }
}
