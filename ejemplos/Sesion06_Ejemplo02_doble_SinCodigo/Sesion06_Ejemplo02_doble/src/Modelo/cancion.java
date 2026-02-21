
package Modelo;



public class cancion {
    private String codigo;
   private String titulo;
    private String genero;
    private String nombreAlbum;

    public cancion(String codigo, String titulo, String genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
    }
 public Object[] Getregistro(){
    
    Object[] dato ={codigo,titulo,genero,nombreAlbum};
        
    return dato;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNomnbreAlbum() {
        return nombreAlbum;
    }

    public void setNomnbreAlbum(String nomnbreAlbum) {
        this.nombreAlbum = nomnbreAlbum;
    }
    
    
    
    
}
