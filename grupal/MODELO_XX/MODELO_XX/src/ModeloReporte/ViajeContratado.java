
package ModeloMantenimiento;


public class ViajeContratado {
    private int codigoViaje;
    private int codigoTurista;    
    private int codigoSucursal;  
    private int codigoEstancia;   

    public ViajeContratado(int codigoViaje, int codigoTurista, int codigoSucursal, int codigoEstancia) {
        this.codigoViaje = codigoViaje;
        this.codigoTurista = codigoTurista;
        this.codigoSucursal = codigoSucursal;
        this.codigoEstancia = codigoEstancia;
    }
    
    public ViajeContratado(Object[] registro){
    codigoViaje = (int)registro[0];
    codigoTurista   = (int)registro[1];
    codigoSucursal = (int)registro[2];
    codigoEstancia = (int)registro[3];
    }
    public Object[] getRegistro(){
    return new Object[]{codigoViaje, codigoTurista, codigoSucursal, codigoEstancia};
    }

    public int getCodigoViaje() {
        return codigoViaje;
    }

    public void setCodigoViaje(int codigoViaje) {
        this.codigoViaje = codigoViaje;
    }

    public int getCodigoTurista() {
        return codigoTurista;
    }

    public void setCodigoTurista(int codigoTurista) {
        this.codigoTurista = codigoTurista;
    }

    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(int codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public int getCodigoEstancia() {
        return codigoEstancia;
    }

    public void setCodigoEstancia(int codigoEstancia) {
        this.codigoEstancia = codigoEstancia;
    }
    
    
}
