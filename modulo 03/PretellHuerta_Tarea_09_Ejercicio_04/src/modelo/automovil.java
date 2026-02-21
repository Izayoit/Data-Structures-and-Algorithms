
package modelo;


public class automovil {
    
    private String marca;
    private double valor;
    private int codigo;

    public automovil(String marca, double valor, int codigo) {
        this.marca = marca;
        this.valor = valor;
        this.codigo = codigo;
    }
    public Object[] getRegistro(){
    
    return new  Object[]{marca,valor,codigo};
    }
    public String getCadena(){
    
      return marca+" "+valor+" "+codigo;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    
}
