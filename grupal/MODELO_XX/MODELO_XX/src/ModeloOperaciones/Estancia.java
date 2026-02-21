/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloOperaciones;

import java.util.Date;

/**
 *
 * @author User
 */
public class Estancia {
     private int codigoEstancia;
    private String pension;
    private Date fechaEntrada;
    private Date fechaSalida;
    private int codigoHotel;

    public Estancia(int codigoEstancia, String pension, Date fechaEntrada, Date fechaSalida, int codigoHotel) {
        this.codigoEstancia = codigoEstancia;
        this.pension = pension;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.codigoHotel = codigoHotel;
    }
    
    public Estancia(Object[] registro){
    codigoEstancia = (int)registro[0];
   pension = registro[1].toString();
   fechaEntrada = (Date)registro[2];
   fechaSalida = (Date)registro[3];
   codigoHotel = (int)registro[4];
   
    }
    
    public Object[] getRegistro(){
    return new Object[]{codigoEstancia, pension, fechaEntrada, fechaSalida, codigoHotel};
    }

    public int getCodigoEstancia() {
        return codigoEstancia;
    }

    public void setCodigoEstancia(int codigoEstancia) {
        this.codigoEstancia = codigoEstancia;
    }

    public String getPension() {
        return pension;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(int codigoHotel) {
        this.codigoHotel = codigoHotel;
    }
    
    
}
