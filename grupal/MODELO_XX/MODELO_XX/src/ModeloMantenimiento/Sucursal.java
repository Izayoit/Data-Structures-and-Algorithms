package ModeloMantenimiento;

public class Sucursal {

    private int codigoSucursal;
    private String direccionSucursal;
    private String telefonoSucursal;

    public Sucursal(int codigoSucursal, String direccionSucursal, String telefonoSucursal) {
        this.codigoSucursal = codigoSucursal;
        this.direccionSucursal = direccionSucursal;
        this.telefonoSucursal = telefonoSucursal;
    }

    public Sucursal(Object[] registro) {
        codigoSucursal = (int) registro[0];
        direccionSucursal = registro[1].toString();
        telefonoSucursal = registro[2].toString();
    }

    public Object[] getRegistro() {
        return new Object[]{codigoSucursal, direccionSucursal, telefonoSucursal};
    }

    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(int codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getDireccionSucursal() {
        return direccionSucursal;
    }

    public void setDireccionSucursal(String direccionSucursal) {
        this.direccionSucursal = direccionSucursal;
    }

    public String getTelefonoSucursal() {
        return telefonoSucursal;
    }

    public void setTelefonoSucursal(String telefonoSucursal) {
        this.telefonoSucursal = telefonoSucursal;
    }

}
