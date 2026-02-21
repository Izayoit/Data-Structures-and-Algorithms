
package modelo;


public class Usuario {
    
    private String usernname;
    private String correo;
    private String contraseña;
    private int fecha_nacimeinto;
    private String Pais;

    public Usuario(String usernname, String correo, String contraseña, int fecha_nacimeinto, String Pais) {
        this.usernname = usernname;
        this.correo = correo;
        this.contraseña = contraseña;
        this.fecha_nacimeinto = fecha_nacimeinto;
        this.Pais = Pais;
    }

    
  public  Usuario(Object[] dato){
  usernname = (String)dato[0];
  correo = (String)dato[1];
  contraseña = (String)dato[2];
  fecha_nacimeinto = Integer.parseInt(dato[3].toString());
  Pais = (String)dato[4];
  
  }
    public Object[] getRegistro(){
    
    Object[]dato={getUsernname(),getCorreo(),getContraseña(),getFecha_nacimeinto(),getPais()};
    
    return dato;
    }
    public String getCadena(){
    return usernname+","+ correo+","+contraseña+","+fecha_nacimeinto+","+Pais;
    }

    public String getUsernname() {
        return usernname;
    }

    public void setUsernname(String usernname) {
        this.usernname = usernname;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getFecha_nacimeinto() {
        return fecha_nacimeinto;
    }

    public void setFecha_nacimeinto(int fecha_nacimeinto) {
        this.fecha_nacimeinto = fecha_nacimeinto;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
   
   public  String toString(){
   
   return Pais;
   }
    
            
    
    
    
}
