
package modelo;


public class numeros {
    
    private Double numero;

    public numeros(Double numero) {
        this.numero = numero;
    }
   


    public Object[]getRegistro(){
        
    return new Object[]{numero};
    }

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }
    
    
    
    
    
}
