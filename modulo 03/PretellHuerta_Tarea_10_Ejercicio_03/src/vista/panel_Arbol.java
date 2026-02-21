
package vista;

import arreglo.Nodo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;


public class panel_Arbol extends JPanel{

  
     private Nodo raiz;

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (raiz != null) {
            dibujarNodo(g, raiz, getWidth() / 2, 30, getWidth() / 4);
        }
    }

    private void dibujarNodo(Graphics g, Nodo nodo, int x, int y, int espacio) {
        g.setColor(Color.BLUE);
        g.fillOval(x - 15, y - 15, 30, 30);
        g.setColor(Color.BLACK);
        g.drawString(String.valueOf(nodo.getElemento().getClave()), x - 6, y + 4);

        g.setColor(Color.BLACK);
        if (nodo.getIzq() != null) {
            g.drawLine(x, y, x - espacio, y + 50);
            dibujarNodo(g, nodo.getIzq(), x - espacio, y + 50, espacio / 2);
        }
        if (nodo.getDer() != null) {
            g.drawLine(x, y, x + espacio, y + 50);
            dibujarNodo(g, nodo.getDer(), x + espacio, y + 50, espacio / 2);
        }
    }
}
