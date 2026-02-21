package Control;

import Modelo.Cliente;

public class Nodo {
    private Cliente Elemento;
    private Nodo Izq, Der;
    
    public Nodo(Cliente Elemento){
        this.Elemento = Elemento;
        Izq = Der = null;
    }
    
    public Object[] getRegistro(){
        return new Object[]{
            Elemento.getCodigo(),
            Elemento.getNombre(),
            Elemento.getPrestamo(),
             getAltura(),
             getFactor_e()
        };
    }          
    
    public int getAltura(){
    
        int hIzq = 0;
        int HDer =0;
        
        
        if(getIzq()!=null){
        hIzq=getIzq().getAltura();
        }
        if(getDer()!=null){
        HDer = getDer().getAltura();
        }
        return Math.max(hIzq,HDer)+ 1;
    }
    
    public int getFactor_e(){
    int hIzq = 0;
        int HDer =0;
        
        
        if(getIzq()!=null){
        hIzq=getIzq().getAltura();
        }
        if(getDer()!=null){
        HDer = getDer().getAltura();
        }
        return (HDer-hIzq);
    }

    public Cliente getElemento() {
        return Elemento;
    }

    public void setElemento(Cliente Elemento) {
        this.Elemento = Elemento;
    }

    public Nodo getIzq() {
        return Izq;
    }

    public void setIzq(Nodo Izq) {
        this.Izq = Izq;
    }

    public Nodo getDer() {
        return Der;
    }

    public void setDer(Nodo Der) {
        this.Der = Der;
    }
    
    
}
