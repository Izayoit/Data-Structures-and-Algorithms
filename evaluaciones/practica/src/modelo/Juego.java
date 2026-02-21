
package modelo;

public class Juego {
    
    private String nombre;
    private String codigoAsigando;
    private String empresa;

    public Juego(String nombre, String codigoAsigando, String empresa) {
        this.nombre = nombre;
        this.codigoAsigando = codigoAsigando;
        this.empresa = empresa;
    }

    

    public Juego(Object[] dato2) {
       nombre = (String)dato2[0];
       codigoAsigando = (String)dato2[1];
       empresa = (String)dato2[2];
        
    }

    public String getCadenaGestor(){
    
    return nombre+","+codigoAsigando+","+empresa;
    }

    public Object[] getRegistro(){
    
        Object[] dato ={getNombre(),getCodigoAsigando(),getEmpresa() };
        
        return dato;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoAsigando() {
        return codigoAsigando;
    }

    public void setCodigoAsigando(String codigoAsigando) {
        this.codigoAsigando = codigoAsigando;
    }

 

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
   
    
}
