package Control;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Cronometro extends Thread{
    private JTextField txt_Hora, txt_Minuto, txt_Segundo;
    private boolean ejecucion = true;
    private boolean continuar_pausar = true;
    
    public Cronometro(JTextField txt_Hora, JTextField txt_Minuto, JTextField txt_Segundo) {
        this.txt_Hora = txt_Hora;
        this.txt_Minuto = txt_Minuto;
        this.txt_Segundo = txt_Segundo;
    }
    
    public void Detener(){
        ejecucion = false;
    }
    
    public void Pausar(){
        continuar_pausar = false;
    }
    
    public void Continuar(){
        continuar_pausar = true;
    }

    @Override
    public void run() {
        
        long seg = 0, min = 00, hor = 00;
        
        txt_Segundo.setText(seg + "");
        txt_Minuto.setText(min + "");
        txt_Hora.setText(hor+"");
        
        while(ejecucion){
            if(continuar_pausar == true){
                seg++;
                txt_Segundo.setText(seg + "");
                
                //JOptionPane.showMessageDialog(null, "Consulta segundos");
                if(seg == 60){
                    min++;
                    txt_Minuto.setText(min + "");
                    seg = 0;
                    txt_Segundo.setText(seg + "");    
                    //JOptionPane.showMessageDialog(null, "Consulta minutos");
                    if(min == 60){
                        hor++;
                        txt_Hora.setText(hor + "");
                        min = 0;
                        txt_Minuto.setText(min + "");
                    }
                }                                        
            }
            try {
                sleep(1);
            } catch (Exception e) {
            }
        }
    }
    
    
}
