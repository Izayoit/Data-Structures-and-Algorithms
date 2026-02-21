
package ModeloMantenimiento;


public class Hotel {
    private int codigoHotel;
    private String nombreHotel;
    private String direccionHotel;
    private String ciudadHotel;
    private String telefonoHotel;
    private int plazasHotel;

    public Hotel(int codigoHotel, String nombreHotel, String direccionHotel, String ciudadHotel, String telefonoHotel, int plazasHotel) {
        this.codigoHotel = codigoHotel;
        this.nombreHotel = nombreHotel;
        this.direccionHotel = direccionHotel;
        this.ciudadHotel = ciudadHotel;
        this.telefonoHotel = telefonoHotel;
        this.plazasHotel = plazasHotel;
    }
    
    public Hotel(Object[] registro){
    codigoHotel = (int)registro[0];
    nombreHotel = registro[1].toString();
    direccionHotel = registro[2].toString();
    ciudadHotel = registro[3].toString();
    telefonoHotel = registro[4].toString();
    plazasHotel = (int)registro[5];
    }
    
    public Object[] getRegistro(){
    return new Object[]{codigoHotel, nombreHotel, direccionHotel, ciudadHotel, telefonoHotel, plazasHotel};
    }

    public int getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(int codigoHotel) {
        this.codigoHotel = codigoHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getDireccionHotel() {
        return direccionHotel;
    }

    public void setDireccionHotel(String direccionHotel) {
        this.direccionHotel = direccionHotel;
    }

    public String getCiudadHotel() {
        return ciudadHotel;
    }

    public void setCiudadHotel(String ciudadHotel) {
        this.ciudadHotel = ciudadHotel;
    }

    public String getTelefonoHotel() {
        return telefonoHotel;
    }

    public void setTelefonoHotel(String telefonoHotel) {
        this.telefonoHotel = telefonoHotel;
    }

    public int getPlazasHotel() {
        return plazasHotel;
    }

    public void setPlazasHotel(int plazasHotel) {
        this.plazasHotel = plazasHotel;
    }
    
    
}
