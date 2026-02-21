package Control;

import javax.swing.JTextField;

public class Hilo extends Thread {

    private JTextField txt_valor;

    public Hilo(JTextField txt_valor) {

        this.txt_valor = txt_valor;
    }

    public void run() {

        for (int i = 0; i < 90000; i++) {
            txt_valor.setText(i + "");

        }
    }

}
