package Modelo;

public class usuario {
    private int codigo;
    private String dni;
    private String nombre;
    private int edad;
    private String region;
    private String proveedor;
    private String tipoConexion;
    private double consumoPromedio;
    
    public usuario(Object[] Registro){
        codigo = Integer.parseInt(Registro[0].toString());
        dni = Registro[1].toString();
        nombre = Registro[2].toString();
        edad = Integer.parseInt(Registro[3].toString());
        region = Registro[4].toString();
        proveedor = Registro[5].toString();
        tipoConexion = Registro[6].toString();
        consumoPromedio= Double.parseDouble(Registro[7].toString());
    }
    
    public Object[] getRegistro(){
        return new Object[]{codigo,dni,nombre,edad,region,proveedor,tipoConexion,consumoPromedio};
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

   
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }

    public double getConsumoPromedio() {
        return consumoPromedio;
    }

    public void setConsumoPromedio(double consumoPromedio) {
        this.consumoPromedio = consumoPromedio;
    }

    
    
    
}
