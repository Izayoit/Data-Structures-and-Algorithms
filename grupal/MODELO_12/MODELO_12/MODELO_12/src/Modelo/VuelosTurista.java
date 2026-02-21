package Modelo;

public class VuelosTurista {

    private int CodigoVuelo;
    private String Clase;
    private int Vuelos_NumeroVuelo;
    private int ViajesContratados_CodigoViaje;

    public VuelosTurista() {
    }

    public VuelosTurista(int CodigoVuelo, String Clase, int Vuelos_NumeroVuelo, int ViajesContratados_CodigoViaje) {
        this.CodigoVuelo = CodigoVuelo;
        this.Clase = Clase;
        this.Vuelos_NumeroVuelo = Vuelos_NumeroVuelo;
        this.ViajesContratados_CodigoViaje = ViajesContratados_CodigoViaje;
    }

    public VuelosTurista(Object[] Registro) {
        CodigoVuelo = (int) Registro[0];
        Clase = Registro[1].toString();
        Vuelos_NumeroVuelo = (int) Registro[2];
        ViajesContratados_CodigoViaje = (int) Registro[3];
    }

    public int getCodigoVuelo() {
        return CodigoVuelo;
    }

    public void setCodigoVuelo(int CodigoVuelo) {
        this.CodigoVuelo = CodigoVuelo;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    public int getVuelos_NumeroVuelo() {
        return Vuelos_NumeroVuelo;
    }

    public void setVuelos_NumeroVuelo(int Vuelos_NumeroVuelo) {
        this.Vuelos_NumeroVuelo = Vuelos_NumeroVuelo;
    }

    public int getViajesContratados_CodigoViaje() {
        return ViajesContratados_CodigoViaje;
    }

    public void setViajesContratados_CodigoViaje(int ViajesContratados_CodigoViaje) {
        this.ViajesContratados_CodigoViaje = ViajesContratados_CodigoViaje;
    }

}
