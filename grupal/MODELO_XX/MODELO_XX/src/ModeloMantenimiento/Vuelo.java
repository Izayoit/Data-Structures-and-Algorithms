/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloMantenimiento;

import java.util.Date;

/**
 *
 * @author User
 */
public class Vuelo {
     private int numeroVuelo;
    private Date fechaVuelo;
    private Date horaVuelo; 
    private String origenVuelo;
    private String destinoVuelo;
    private int plazasTotales;
    private int plazasTurista;

    public Vuelo(int numeroVuelo, Date fechaVuelo, Date horaVuelo, String origenVuelo, String destinoVuelo, int plazasTotales, int plazasTurista) {
        this.numeroVuelo = numeroVuelo;
        this.fechaVuelo = fechaVuelo;
        this.horaVuelo = horaVuelo;
        this.origenVuelo = origenVuelo;
        this.destinoVuelo = destinoVuelo;
        this.plazasTotales = plazasTotales;
        this.plazasTurista = plazasTurista;
    }
    
    public Vuelo(Object[] registro){
    numeroVuelo = (int)registro[0];
    fechaVuelo = (Date)registro[1];
    horaVuelo = (Date)registro[2];
    origenVuelo = registro[3].toString();
    destinoVuelo = registro[4].toString();
    plazasTotales = (int)registro[5];
    plazasTurista = (int)registro[6];
    }
    
    public Object[] getReggistro(){
    return new Object[]{numeroVuelo, fechaVuelo, horaVuelo, origenVuelo, destinoVuelo, plazasTotales, plazasTurista};
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Date getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(Date fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public Date getHoraVuelo() {
        return horaVuelo;
    }

    public void setHoraVuelo(Date horaVuelo) {
        this.horaVuelo = horaVuelo;
    }

    public String getOrigenVuelo() {
        return origenVuelo;
    }

    public void setOrigenVuelo(String origenVuelo) {
        this.origenVuelo = origenVuelo;
    }

    public String getDestinoVuelo() {
        return destinoVuelo;
    }

    public void setDestinoVuelo(String destinoVuelo) {
        this.destinoVuelo = destinoVuelo;
    }

    public int getPlazasTotales() {
        return plazasTotales;
    }

    public void setPlazasTotales(int plazasTotales) {
        this.plazasTotales = plazasTotales;
    }

    public int getPlazasTurista() {
        return plazasTurista;
    }

    public void setPlazasTurista(int plazasTurista) {
        this.plazasTurista = plazasTurista;
    }
    
    
}
