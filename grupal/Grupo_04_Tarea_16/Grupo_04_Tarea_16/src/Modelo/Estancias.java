package Modelo;

public class Estancias {

    private int CodigoEstancia;
    private String Pension;
    private String FechaEntrada;
    private String FechaSalida;
    private int Hoteles_CodigoHotel;

    public Estancias() {
    }

    public Estancias(int CodigoEstancia, String Pension, String FechaEntrada, String FechaSalida, int Hoteles_CodigoHotel) {
        this.CodigoEstancia = CodigoEstancia;
        this.Pension = Pension;
        this.FechaEntrada = FechaEntrada;
        this.FechaSalida = FechaSalida;
        this.Hoteles_CodigoHotel = Hoteles_CodigoHotel;
    }

    public Estancias(Object[] Registro) {
        CodigoEstancia = (int) Registro[0];
        Pension = Registro[1].toString();
        FechaEntrada = Registro[2].toString();
        FechaSalida = Registro[3].toString();
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

    public String getFechaEntrada() {
        return FechaEntrada;
    }

    public void setFechaEntrada(String FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public int getHoteles_CodigoHotel() {
        return Hoteles_CodigoHotel;
    }

    public void setHoteles_CodigoHotel(int Hoteles_CodigoHotel) {
        this.Hoteles_CodigoHotel = Hoteles_CodigoHotel;
    }

}
