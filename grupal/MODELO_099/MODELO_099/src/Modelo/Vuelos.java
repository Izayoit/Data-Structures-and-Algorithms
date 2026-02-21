package Modelo;

import java.util.Date;

public class Vuelos {

    private int NumeroVuelo;
    private Date FechaVuelo;
    private Date HoraVuelo;
    private String OrigenVuelo;
    private String DestinoVuelo;
    private int PlazasTotales;
    private int PlazasTurista;

    public Vuelos(Object[] Registro) {
        NumeroVuelo = (int) Registro[0];
        FechaVuelo = (Date) Registro[1];
        HoraVuelo = (Date) Registro[2];
        OrigenVuelo = Registro[3].toString();
        DestinoVuelo = Registro[4].toString();
        PlazasTotales = (int) Registro[5];
        PlazasTurista = (int) Registro[6];
    }

    public int getNumeroVuelo() {
        return NumeroVuelo;
    }

    public void setNumeroVuelo(int NumeroVuelo) {
        this.NumeroVuelo = NumeroVuelo;
    }

    public Date getFechaVuelo() {
        return FechaVuelo;
    }

    public void setFechaVuelo(Date FechaVuelo) {
        this.FechaVuelo = FechaVuelo;
    }

    public Date getHoraVuelo() {
        return HoraVuelo;
    }

    public void setHoraVuelo(Date HoraVuelo) {
        this.HoraVuelo = HoraVuelo;
    }

    public String getOrigenVuelo() {
        return OrigenVuelo;
    }

    public void setOrigenVuelo(String OrigenVuelo) {
        this.OrigenVuelo = OrigenVuelo;
    }

    public String getDestinoVuelo() {
        return DestinoVuelo;
    }

    public void setDestinoVuelo(String DestinoVuelo) {
        this.DestinoVuelo = DestinoVuelo;
    }

    public int getPlazasTotales() {
        return PlazasTotales;
    }

    public void setPlazasTotales(int PlazasTotales) {
        this.PlazasTotales = PlazasTotales;
    }

    public int getPlazasTurista() {
        return PlazasTurista;
    }

    public void setPlazasTurista(int PlazasTurista) {
        this.PlazasTurista = PlazasTurista;
    }

}
