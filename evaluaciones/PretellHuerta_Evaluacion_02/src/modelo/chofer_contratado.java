package modelo;

public class chofer_contratado {

    private int dni;
    private String apellidos;
    private String nombres;
    private String tipo_Vehiculo_Conducira;
    private int puntaje_obtenido; //0 a 20

    public chofer_contratado(int dni, String apellidos, String nombres, String tipo_Vehiculo_Conducira, int puntaje_obtenido) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.tipo_Vehiculo_Conducira = tipo_Vehiculo_Conducira;
        this.puntaje_obtenido = puntaje_obtenido;
    }

    public Object[] getRegistro() {
        return new Object[]{dni, apellidos, nombres, tipo_Vehiculo_Conducira, puntaje_obtenido};
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTipo_Vehiculo_Conducira() {
        return tipo_Vehiculo_Conducira;
    }

    public void setTipo_Vehiculo_Conducira(String tipo_Vehiculo_Conducira) {
        this.tipo_Vehiculo_Conducira = tipo_Vehiculo_Conducira;
    }

    public int getPuntaje_obtenido() {
        return puntaje_obtenido;
    }

    public void setPuntaje_obtenido(int puntaje_obtenido) {
        this.puntaje_obtenido = puntaje_obtenido;
    }

}
