
package Modelo;

public class viaje {
   
    private String nombre_ciudad;
    private double costo_de_vida;
    private double puntuacion_conectividad_digital;
    private String comunidad;
    private String lista_Servicios;

    public viaje(String nombre_ciudad, double costo_de_vida, double puntuacion_conectividad_digital, String comunidad, String lista_Servicios) {
        this.nombre_ciudad = nombre_ciudad;
        this.costo_de_vida = costo_de_vida;
        this.puntuacion_conectividad_digital = puntuacion_conectividad_digital;
        this.comunidad = comunidad;
        this.lista_Servicios = lista_Servicios;
    }

    

   

    public viaje(Object[] Registro) {
        nombre_ciudad= Registro[0].toString();
        costo_de_vida= Double.parseDouble(Registro[1].toString());
        puntuacion_conectividad_digital = Double.parseDouble(Registro[2].toString());
        comunidad=Registro[3].toString();
        lista_Servicios = Registro[4].toString();
    }
    public Object[] getRegistro(){
    return new Object[]{nombre_ciudad,costo_de_vida,puntuacion_conectividad_digital,comunidad,lista_Servicios};
    }
    
    public String getNombre_ciudad() {
        return nombre_ciudad;
    }

    public String getLista_Servicios() {
        return lista_Servicios;
    }

    public void setLista_Servicios(String lista_Servicios) {
        this.lista_Servicios = lista_Servicios;
    }
    

    public void setNombre_ciudad(String nombre_ciudad) {
        this.nombre_ciudad = nombre_ciudad;
    }

    public double getCosto_de_vida() {
        return costo_de_vida;
    }

    public void setCosto_de_vida(double costo_de_vida) {
        this.costo_de_vida = costo_de_vida;
    }

    public double getPuntuacion_conectividad_digital() {
        return puntuacion_conectividad_digital;
    }

    public void setPuntuacion_conectividad_digital(double puntuacion_conectividad_digital) {
        this.puntuacion_conectividad_digital = puntuacion_conectividad_digital;
    }

    

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }
    
    
    
    
    
    
    
}
