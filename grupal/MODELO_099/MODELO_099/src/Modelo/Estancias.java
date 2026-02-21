package Modelo;

import java.util.Date;

public class Estancias {

    private int CodigoEstancia;
    private String Pension;
    private Date FechaEntrada;
    private Date FechaSalida;
    private int Hoteles_CodigoHotel;

    public Estancias(Object[] Registro) {
        CodigoEstancia = (int) Registro[0];
        Pension = Registro[1].toString();
        FechaEntrada = (Date) Registro[2];
        FechaSalida = (Date) Registro[3];
        Hoteles_CodigoHotel = (int) Registro[4];
    }

    public int getCodigoEstancia() {
        return CodigoEstancia;
    }

    public void setCodigoEstancia(int CodigoEstancia) {
        this.CodigoEstancia = CodigoEstancia;
    }

    public String getPension() {
        return Pension;
    }

    public void setPension(String Pension) {
        this.Pension = Pension;
    }

    public Date getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(Date FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Date FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public int getHoteles_CodigoHotel() {
        return Hoteles_CodigoHotel;
    }

    public void setHoteles_CodigoHotel(int Hoteles_CodigoHotel) {
        this.Hoteles_CodigoHotel = Hoteles_CodigoHotel;
    }

}
