package Modelo;

public class Hoteles {

    private int CodigoHotel;
    private String NombreHotel;
    private String DireccionHotel;
    private String CiudadHotel;
    private String TelefonoHotel;
    private int PlazasHotel;

    public Hoteles(int CodigoHotel, String NombreHotel, String DireccionHotel, String CiudadHotel, String TelefonoHotel, int PlazasHotel) {
        this.CodigoHotel = CodigoHotel;
        this.NombreHotel = NombreHotel;
        this.DireccionHotel = DireccionHotel;
        this.CiudadHotel = CiudadHotel;
        this.TelefonoHotel = TelefonoHotel;
        this.PlazasHotel = PlazasHotel;
    }

    public Hoteles(Object[] Registro) {
        CodigoHotel = (int) Registro[0];
        NombreHotel = Registro[1].toString();
        DireccionHotel = Registro[2].toString();
        CiudadHotel = Registro[3].toString();
        TelefonoHotel = Registro[4].toString();
        PlazasHotel = (int) Registro[5];
    }
    public Object[] getRegistro(){
    return new Object[]{CodigoHotel,NombreHotel,DireccionHotel,CiudadHotel,TelefonoHotel,PlazasHotel};
    }
    public int getCodigoHotel() {
        return CodigoHotel;
    }

    public void setCodigoHotel(int CodigoHotel) {
        this.CodigoHotel = CodigoHotel;
    }

    public String getNombreHotel() {
        return NombreHotel;
    }

    public void setNombreHotel(String NombreHotel) {
        this.NombreHotel = NombreHotel;
    }

    public String getDireccionHotel() {
        return DireccionHotel;
    }

    public void setDireccionHotel(String DireccionHotel) {
        this.DireccionHotel = DireccionHotel;
    }

    public String getCiudadHotel() {
        return CiudadHotel;
    }

    public void setCiudadHotel(String CiudadHotel) {
        this.CiudadHotel = CiudadHotel;
    }

    public String getTelefonoHotel() {
        return TelefonoHotel;
    }

    public void setTelefonoHotel(String TelefonoHotel) {
        this.TelefonoHotel = TelefonoHotel;
    }

    public int getPlazasHotel() {
        return PlazasHotel;
    }

    public void setPlazasHotel(int PlazasHotel) {
        this.PlazasHotel = PlazasHotel;
    }

}
