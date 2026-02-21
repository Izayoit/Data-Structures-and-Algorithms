package Modelo;

public class ViajesContratados {

    private int CodigoViaje;
    private int Turistas_CodigoTuristas;
    private int Sucursales_CodigoSucursal;
    private int Estancias_CodigoEstancia;

    public ViajesContratados() {
    }

    public ViajesContratados(int CodigoViaje, int Turistas_CodigoTuristas, int Sucursales_CodigoSucursal, int Estancias_CodigoEstancia) {
        this.CodigoViaje = CodigoViaje;
        this.Turistas_CodigoTuristas = Turistas_CodigoTuristas;
        this.Sucursales_CodigoSucursal = Sucursales_CodigoSucursal;
        this.Estancias_CodigoEstancia = Estancias_CodigoEstancia;
    }

    public ViajesContratados(Object[] Registro) {
        CodigoViaje = (int) Registro[0];
        Turistas_CodigoTuristas = (int) Registro[1];
        Sucursales_CodigoSucursal = (int) Registro[2];
        Estancias_CodigoEstancia = (int) Registro[3];
    }

    public int getCodigoViaje() {
        return CodigoViaje;
    }

    public void setCodigoViaje(int CodigoViaje) {
        this.CodigoViaje = CodigoViaje;
    }

    public int getTuristas_CodigoTuristas() {
        return Turistas_CodigoTuristas;
    }

    public void setTuristas_CodigoTuristas(int Turistas_CodigoTuristas) {
        this.Turistas_CodigoTuristas = Turistas_CodigoTuristas;
    }

    public int getSucursales_CodigoSucursal() {
        return Sucursales_CodigoSucursal;
    }

    public void setSucursales_CodigoSucursal(int Sucursales_CodigoSucursal) {
        this.Sucursales_CodigoSucursal = Sucursales_CodigoSucursal;
    }

    public int getEstancias_CodigoEstancia() {
        return Estancias_CodigoEstancia;
    }

    public void setEstancias_CodigoEstancia(int Estancias_CodigoEstancia) {
        this.Estancias_CodigoEstancia = Estancias_CodigoEstancia;
    }

}
