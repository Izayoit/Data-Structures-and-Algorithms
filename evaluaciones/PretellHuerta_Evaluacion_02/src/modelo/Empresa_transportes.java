
package modelo;


public class Empresa_transportes {
     private String  N_paradero;
    private String Tipo_Vehiculo;
    private int capacidad_paradero;
   private String conductor;

    public Empresa_transportes(String N_paradero, String Tipo_Vehiculo, int capacidad_paradero, String conductor) {
        this.N_paradero = N_paradero;
        this.Tipo_Vehiculo = Tipo_Vehiculo;
        this.capacidad_paradero = capacidad_paradero;
        this.conductor = conductor;
    }
    public Object[]getRegistro(){
    return new Object[]{N_paradero,Tipo_Vehiculo,capacidad_paradero,conductor};
    }
    public String getN_paradero() {
        return N_paradero;
    }

    public void setN_paradero(String N_paradero) {
        this.N_paradero = N_paradero;
    }

    public String getTipo_Vehiculo() {
        return Tipo_Vehiculo;
    }

    public void setTipo_Vehiculo(String Tipo_Vehiculo) {
        this.Tipo_Vehiculo = Tipo_Vehiculo;
    }

    public int getCapacidad_paradero() {
        return capacidad_paradero;
    }

    public void setCapacidad_paradero(int capacidad_paradero) {
        this.capacidad_paradero = capacidad_paradero;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }
   
}
