
package modelo;


public class numero {
    
    private int numero;

    public numero(int numero) {
        this.numero = numero;
    }

    public Object[] getRegistro(){
    return new Object[]{numero};
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

   
    
    
}
