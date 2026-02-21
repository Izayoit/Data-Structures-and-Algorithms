
package prueba_modulo_04;

import javax.swing.JOptionPane;


public class Prueba_modulo_04 extends Thread{

 
    public void run() {
       
        for (int i = 0; i < 5; i++) {
            System.out.println("hilo"+i);
        }
        try {
            Thread.sleep(10000000);
            
        } catch (Exception e) {
            System.out.println("hilo error");
        }
        
        
    }

    
    
    public static void main(String[] args) {
        Prueba_modulo_04 mihilo = new Prueba_modulo_04();
        mihilo.start();
    }
    
}
