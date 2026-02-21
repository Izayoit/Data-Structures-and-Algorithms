package Vista;

import AccesoBD.ConectaDB;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class JFrame_principal extends javax.swing.JFrame {

    public JFrame_principal() {
        initComponents();
        Connection cn = ConectaDB.ObtenerConexion();
        if (cn != null) {
            JOptionPane.showMessageDialog(rootPane, "conectado");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        Mantenimiento = new javax.swing.JMenu();
        jmnu_Estancias = new javax.swing.JMenuItem();
        jmu_Hoteles = new javax.swing.JMenuItem();
        jmnu_Sucursales = new javax.swing.JMenuItem();
        jmnu_Turistas = new javax.swing.JMenuItem();
        jmnu_Vuelos = new javax.swing.JMenuItem();
        Operaciones = new javax.swing.JMenu();
        jmnu_ViajesContratados = new javax.swing.JMenuItem();
        jmnu_VuelosTurista = new javax.swing.JMenuItem();
        Consultas = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Mantenimiento.setForeground(new java.awt.Color(0, 0, 0));
        Mantenimiento.setText("Mantenimiento");
        Mantenimiento.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jmnu_Estancias.setText("Estancias");
        jmnu_Estancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnu_EstanciasActionPerformed(evt);
            }
        });
        Mantenimiento.add(jmnu_Estancias);

        jmu_Hoteles.setText("Hoteles");
        jmu_Hoteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmu_HotelesActionPerformed(evt);
            }
        });
        Mantenimiento.add(jmu_Hoteles);

        jmnu_Sucursales.setText("Sucursales");
        jmnu_Sucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnu_SucursalesActionPerformed(evt);
            }
        });
        Mantenimiento.add(jmnu_Sucursales);

        jmnu_Turistas.setText("Turistas");
        jmnu_Turistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnu_TuristasActionPerformed(evt);
            }
        });
        Mantenimiento.add(jmnu_Turistas);

        jmnu_Vuelos.setText("Vuelos");
        jmnu_Vuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnu_VuelosActionPerformed(evt);
            }
        });
        Mantenimiento.add(jmnu_Vuelos);

        jMenuBar1.add(Mantenimiento);

        Operaciones.setForeground(new java.awt.Color(0, 0, 204));
        Operaciones.setText("Operaciones");
        Operaciones.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jmnu_ViajesContratados.setText("Contratar Viajes");
        Operaciones.add(jmnu_ViajesContratados);

        jmnu_VuelosTurista.setText("Vuelo Turista");
        Operaciones.add(jmnu_VuelosTurista);

        jMenuBar1.add(Operaciones);

        Consultas.setForeground(new java.awt.Color(255, 0, 0));
        Consultas.setText("Consultas");
        Consultas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jMenuItem4.setText("Historial de Vuelos por Turista");
        Consultas.add(jMenuItem4);

        jMenuItem1.setText("Mostrar Turistas");
        Consultas.add(jMenuItem1);

        jMenuItem2.setText("Mostrar Viajes");
        Consultas.add(jMenuItem2);

        jMenuItem3.setText("Mostrar Hoteles");
        Consultas.add(jMenuItem3);

        jMenuBar1.add(Consultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmu_HotelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmu_HotelesActionPerformed
        JDialog_hoteles Objventana = new JDialog_hoteles(this, true);
        Objventana.setVisible(true);
    }//GEN-LAST:event_jmu_HotelesActionPerformed

    private void jmnu_EstanciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnu_EstanciasActionPerformed
        JDialog_Estancias objVentana = new JDialog_Estancias(this, true);
        objVentana.setLocationRelativeTo(this);
        objVentana.setVisible(true);
    }//GEN-LAST:event_jmnu_EstanciasActionPerformed

    private void jmnu_SucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnu_SucursalesActionPerformed
       JDialog_Sucursal objventana = new JDialog_Sucursal(this, true);
       objventana.setVisible(true);
    }//GEN-LAST:event_jmnu_SucursalesActionPerformed

    private void jmnu_TuristasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnu_TuristasActionPerformed
       JDialog_Turista objventana = new JDialog_Turista(this, true);
       objventana.setVisible(true);
    }//GEN-LAST:event_jmnu_TuristasActionPerformed

    private void jmnu_VuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnu_VuelosActionPerformed
        JDialog_Vuelo objventana = new JDialog_Vuelo(this, true);
         objventana.setVisible(true);
    }//GEN-LAST:event_jmnu_VuelosActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFrame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Consultas;
    private javax.swing.JMenu Mantenimiento;
    private javax.swing.JMenu Operaciones;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jmnu_Estancias;
    private javax.swing.JMenuItem jmnu_Sucursales;
    private javax.swing.JMenuItem jmnu_Turistas;
    private javax.swing.JMenuItem jmnu_ViajesContratados;
    private javax.swing.JMenuItem jmnu_Vuelos;
    private javax.swing.JMenuItem jmnu_VuelosTurista;
    private javax.swing.JMenuItem jmu_Hoteles;
    // End of variables declaration//GEN-END:variables
}
