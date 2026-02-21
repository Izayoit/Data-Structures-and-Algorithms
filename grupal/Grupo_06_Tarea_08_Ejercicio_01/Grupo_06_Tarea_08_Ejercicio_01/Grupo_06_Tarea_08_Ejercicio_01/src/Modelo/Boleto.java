package Modelo;

import java.util.Date;

public class Boleto {

    private int num_boleto;
    private Date fecha;
    private Date hora;
    private Vuelo objVuelo;
    private Cliente objCliente;
    private int num_asiento;

    public Boleto(int num_boleto, Date fecha, Date hora, Vuelo objVuelo, Cliente objCliente, int num_asiento) {
        this.num_boleto = num_boleto;
        this.fecha = fecha;
        this.hora = hora;
        this.objVuelo = objVuelo;
        this.objCliente = objCliente;
        this.num_asiento = num_asiento;
    }

    public Boleto(Object[] arreglo) {
        num_boleto = (int) arreglo[0];
        fecha = (Date) arreglo[1];
        hora = (Date) arreglo[2];
        objVuelo = (Vuelo) arreglo[3];
        objCliente = (Cliente) arreglo[4];
        num_asiento = (int) arreglo[5];
    }

    public Object[] getRegistro() {
        return new Object[]{num_boleto, fecha, hora, objVuelo, objCliente, num_asiento};
    }

    public String getCadenaFiltrar() {
        return num_boleto + "" + fecha.toString() + hora.toString() + objVuelo.getCadenaFiltrar() + objCliente.getCadenaFiltrar() + num_asiento;
    }

    public int getNum_boleto() {
        return num_boleto;
    }

    public void setNum_boleto(int num_boleto) {
        this.num_boleto = num_boleto;
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

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Vuelo getObjVuelo() {
        return objVuelo;
    }

    public void setObjVuelo(Vuelo objVuelo) {
        this.objVuelo = objVuelo;
    }

    public Cliente getObjCliente() {
        return objCliente;
    }

    public void setObjCliente(Cliente objCliente) {
        this.objCliente = objCliente;
    }

    public int getNum_asiento() {
        return num_asiento;
    }

    public void setNum_asiento(int num_asiento) {
        this.num_asiento = num_asiento;
    }

}
