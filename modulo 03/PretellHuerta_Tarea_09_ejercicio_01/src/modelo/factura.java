
package modelo;


public class factura {
    private String cliente;
    private int codigo;
    private double pago;

    public factura(String cliente, int codigo, double pago) {
        this.cliente = cliente;
        this.codigo = codigo;
        this.pago = pago;
    }
    public Object[] getRegistro(){
    
    return new  Object[]{cliente,codigo,pago};
    }
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
    
    
}
