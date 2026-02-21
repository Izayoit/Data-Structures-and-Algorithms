
package modelo;

public class alumno {
    
    int codigo;
    String NombreStudiante;

    public alumno(int codigo, String NombreStudiante) {
        this.codigo = codigo;
        this.NombreStudiante = NombreStudiante;
    }
    
    
    public Object[] getRegistro(){

        Object[] dato ={getCodigo(),getNombreStudiante()};
    
    return dato;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreStudiante() {
        return NombreStudiante;
    }

    public void setNombreStudiante(String NombreStudiante) {
        this.NombreStudiante = NombreStudiante;
    }
    
    
    
}
