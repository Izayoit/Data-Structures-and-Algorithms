package Vista;

import Control.Cola_Vuelo;
import Control.Lista_Ciudad;
import Control.Lista_Cliente;
import Control.Lista_Pais;
import Control.Pila_Boleto;

public class JFrame_Principal extends javax.swing.JFrame {

    Lista_Pais objLista_Pais = new Lista_Pais();
    Lista_Ciudad objLista_Ciudad = new Lista_Ciudad();
    Lista_Cliente objLista_Cliente = new Lista_Cliente();
    Cola_Vuelo objCola_Vuelo = new Cola_Vuelo();
    Pila_Boleto objPila_Boleto =new Pila_Boleto();
    
    public JFrame_Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Pais = new javax.swing.JMenuItem();
        Ciudad = new javax.swing.JMenuItem();
        Cliente = new javax.swing.JMenuItem();
        Vuelo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Venta_Boletos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jMenu1.setText("Archivo");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mantenimiento");

        Pais.setText("Mantenimiento - Pais");
        Pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaisActionPerformed(evt);
            }
        });
        jMenu2.add(Pais);

        Ciudad.setText("Mantenimiento - Ciudad");
        Ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiudadActionPerformed(evt);
            }
        });
        jMenu2.add(Ciudad);

        Cliente.setText("Mantenimiento - Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        jMenu2.add(Cliente);

        Vuelo.setText("Mantenimiento - Vuelo");
        Vuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VueloActionPerformed(evt);
            }
        });
        jMenu2.add(Vuelo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Operaciones");

        Venta_Boletos.setText("Operaciones - Venta Boletos");
        Venta_Boletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Venta_BoletosActionPerformed(evt);
            }
        });
        jMenu3.add(Venta_Boletos);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaisActionPerformed
        new JDialog_País(this, true, objLista_Pais).setVisible(true);
    }//GEN-LAST:event_PaisActionPerformed

    private void CiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiudadActionPerformed
        new JDialog_Ciudad(this, true, objLista_Pais, objLista_Ciudad).setVisible(true);
    }//GEN-LAST:event_CiudadActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        new JDialog_Cliente(this, true, objLista_Cliente).setVisible(true);
    }//GEN-LAST:event_ClienteActionPerformed

    private void VueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VueloActionPerformed
        new JDialog_Vuelo(this, true,objLista_Pais,objCola_Vuelo).setVisible(true);
    }//GEN-LAST:event_VueloActionPerformed

    private void Venta_BoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Venta_BoletosActionPerformed
        new JDialog_Boletos(this, true,objLista_Cliente,objCola_Vuelo,objPila_Boleto).setVisible(true);
    }//GEN-LAST:event_Venta_BoletosActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ciudad;
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JMenuItem Pais;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem Venta_Boletos;
    private javax.swing.JMenuItem Vuelo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
