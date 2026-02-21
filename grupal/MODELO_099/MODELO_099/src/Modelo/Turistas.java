package Modelo;

public class Turistas {

    private int CodigoTurista;
    private String NombreTurista;
    private String ApellidosTurista;
    private String DireccionTurista;
    private String TelefonoTurista;

    public Turistas(Object[] Registro) {
        CodigoTurista = (int) Registro[0];
        NombreTurista = Registro[1].toString();
        ApellidosTurista = Registro[2].toString();
        DireccionTurista = Registro[3].toString();
        TelefonoTurista = Registro[4].toString();
    }

    public int getCodigoTurista() {
        return CodigoTurista;
    }

    public void setCodigoTurista(int CodigoTurista) {
        this.CodigoTurista = CodigoTurista;
    }

    public String getNombreTurista() {
        return NombreTurista;
    }

    public void setNombreTurista(String NombreTurista) {
        this.NombreTurista = NombreTurista;
    }

    public String getApellidosTurista() {
        return ApellidosTurista;
    }

    public void setApellidosTurista(String ApellidosTurista) {
        this.ApellidosTurista = ApellidosTurista;
    }

    public String getDireccionTurista() {
        return DireccionTurista;
    }

    public void setDireccionTurista(String DireccionTurista) {
        this.DireccionTurista = DireccionTurista;
    }

    public String getTelefonoTurista() {
        return TelefonoTurista;
    }

    public void setTelefonoTurista(String TelefonoTurista) {
        this.TelefonoTurista = TelefonoTurista;
    }

}
