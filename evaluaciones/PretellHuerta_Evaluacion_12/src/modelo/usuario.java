package modelo;

public class usuario {

    String nombre; 
    int numero_conexion;
    String tipo_conex;//esto usare
    int monto_facturado;

    public usuario(String nombre, int numero_conexion, String tipo_conex, int monto_facturado) {
        this.nombre = nombre;
        this.numero_conexion = numero_conexion;
        this.tipo_conex = tipo_conex;
        this.monto_facturado = monto_facturado;
    }

    
    public Object[] getRegistro() {

        return new Object[]{nombre,numero_conexion,tipo_conex,monto_facturado};

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_conexion() {
        return numero_conexion;
    }

    public void setNumero_conexion(int numero_conexion) {
        this.numero_conexion = numero_conexion;
    }

    public String getTipo_conex() {
        return tipo_conex;
    }

    public void setTipo_conex(String tipo_conex) {
        this.tipo_conex = tipo_conex;
    }

    public int getMonto_facturado() {
        return monto_facturado;
    }

    public void setMonto_facturado(int monto_facturado) {
        this.monto_facturado = monto_facturado;
    }

   

}
