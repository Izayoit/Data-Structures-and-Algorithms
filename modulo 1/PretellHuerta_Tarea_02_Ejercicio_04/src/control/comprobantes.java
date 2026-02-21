
package control;


public class comprobantes {
   private String numeroComprobante;
    private clientes codigoCliente;
    private String fecha;
    private double monto;
    private String tipo;

    public comprobantes(String numeroComprobante, clientes codigoCliente, String fecha, double monto, String tipo) {
        this.numeroComprobante = numeroComprobante;
        this.codigoCliente = codigoCliente;
        this.fecha = fecha;
        this.monto = monto;
        this.tipo = tipo;
    }
    
    public Object[] getRegistro(){
    
    Object[] dato ={getNumeroComprobante(),getCodigoCliente(),getFecha(),getMonto(),getTipo()};
        
    return dato;
    }
    

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public clientes getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(clientes codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
   
    
    
}
