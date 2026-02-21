package Modelo;

public class Vuelos {

    private int NumeroVuelo;
    private String FechaVuelo;
    private String HoraVuelo;
    private String OrigenVuelo;
    private String DestinoVuelo;
    private int PlazasTotales;
    private int PlazasTurista;

    public Vuelos() {
    }

    public Vuelos(int NumeroVuelo, String FechaVuelo, String HoraVuelo, String OrigenVuelo, String DestinoVuelo, int PlazasTotales, int PlazasTurista) {
        this.NumeroVuelo = NumeroVuelo;
        this.FechaVuelo = FechaVuelo;
        this.HoraVuelo = HoraVuelo;
        this.OrigenVuelo = OrigenVuelo;
        this.DestinoVuelo = DestinoVuelo;
        this.PlazasTotales = PlazasTotales;
        this.PlazasTurista = PlazasTurista;
    }

    public Vuelos(Object[] Registro) {
        NumeroVuelo = (int) Registro[0];
        FechaVuelo = Registro[1].toString();
        HoraVuelo = Registro[2].toString();
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

    public String getFechaVuelo() {
        return FechaVuelo;
    }

    public void setFechaVuelo(String FechaVuelo) {
        this.FechaVuelo = FechaVuelo;
    }

    public String getHoraVuelo() {
        return HoraVuelo;
    }

    public void setHoraVuelo(String HoraVuelo) {
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
