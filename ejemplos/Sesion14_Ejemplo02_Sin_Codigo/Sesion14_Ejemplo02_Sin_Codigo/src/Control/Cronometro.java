package Control;

import javax.swing.JTextField;

public class Cronometro extends Thread{
    private JTextField txt_hora,txt_minuto,txt_segundo;
    
    private boolean continuar_pausar;

  
    
   

    public Cronometro(JTextField txt_hora, JTextField txt_minuto, JTextField txt_segundo) {
        this.txt_hora = txt_hora;
        this.txt_minuto = txt_minuto;
        this.txt_segundo = txt_segundo;
    } 
    
    public void detener(){
    continuar_pausar=false;
    
    }

}
