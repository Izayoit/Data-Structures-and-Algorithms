
package modelo;


public class temas_investigacion {
     String areaTematica;    
    String idsProfesoresInteresados;

    public temas_investigacion(String areaTematica, String idsProfesoresInteresados) {
        this.areaTematica = areaTematica;
        this.idsProfesoresInteresados = idsProfesoresInteresados;
    }
    public Object[]getRegistro(){
    return new Object[]{areaTematica,idsProfesoresInteresados};
    }

    public String getAreaTematica() {
        return areaTematica;
    }

    public void setAreaTematica(String areaTematica) {
        this.areaTematica = areaTematica;
    }

    public String getIdsProfesoresInteresados() {
        return idsProfesoresInteresados;
    }

    public void setIdsProfesoresInteresados(String idsProfesoresInteresados) {
        this.idsProfesoresInteresados = idsProfesoresInteresados;
    }
    
}
