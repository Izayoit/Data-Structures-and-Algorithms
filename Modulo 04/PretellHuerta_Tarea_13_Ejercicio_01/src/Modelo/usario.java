package Modelo;

public class usario {
    private String Codigo;
    private String intereses;
    private String Nombre;
    private double Precio;
    private String idioma;

    public usario(String Codigo, String intereses, String Nombre, double Precio, String idioma) {
        this.Codigo = Codigo;
        this.intereses = intereses;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.idioma = idioma;
    }

   

   
   
    
    
    public usario(Object[] Registro){
        Codigo = Registro[0].toString();
        intereses = Registro[1].toString();
        Nombre = Registro[2].toString();
        Precio = Double.parseDouble(Registro[3].toString());
        idioma= Registro[4].toString();
    }
    
    public Object[] getRegistro(){
        return new Object[]{Codigo,intereses,Nombre,Precio,idioma};
    }
   public String getcadena(){
   return Codigo+intereses+Nombre+Precio+idioma;
   }
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

   
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }
    
    
}
