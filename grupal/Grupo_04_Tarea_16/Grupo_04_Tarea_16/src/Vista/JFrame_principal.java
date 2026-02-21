package Vista;

import AccesoBD.ConectaDB;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class JFrame_principal extends javax.swing.JFrame {

    public JFrame_principal() {
        initComponents();
        setLocationRelativeTo(null);
        Connection cn = ConectaDB.ObtenerConexion();
        if (cn != null) {
            JOptionPane.showMessageDialog(rootPane, "Conección Exitosa");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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
        jmnu_Historial_VuelosTurisa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen3.png"))); // NOI18N

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
        jmnu_ViajesContratados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnu_ViajesContratadosActionPerformed(evt);
            }
        });
        Operaciones.add(jmnu_ViajesContratados);

        jmnu_VuelosTurista.setText("Vuelo Turista");
        jmnu_VuelosTurista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnu_VuelosTuristaActionPerformed(evt);
            }
        });
        Operaciones.add(jmnu_VuelosTurista);

        jMenuBar1.add(Operaciones);

        Consultas.setForeground(new java.awt.Color(255, 0, 0));
        Consultas.setText("Consultas");
        Consultas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jmnu_Historial_VuelosTurisa.setText("Historial de Vuelos por Turista");
        jmnu_Historial_VuelosTurisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnu_Historial_VuelosTurisaActionPerformed(evt);
            }
        });
        Consultas.add(jmnu_Historial_VuelosTurisa);

        jMenuBar1.add(Consultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmu_HotelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmu_HotelesActionPerformed
        JDialog_hoteles objVentana = new JDialog_hoteles(this, true);
        objVentana.setLocationRelativeTo(this);
        objVentana.setVisible(true);
    }//GEN-LAST:event_jmu_HotelesActionPerformed

    private void jmnu_EstanciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnu_EstanciasActionPerformed
        JDialog_Estancias objVentana = new JDialog_Estancias(this, true);
        objVentana.setLocationRelativeTo(this);
        objVentana.setVisible(true);
    }//GEN-LAST:event_jmnu_EstanciasActionPerformed

    private void jmnu_SucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnu_SucursalesActionPerformed
        JDialog_Sucursal objVentana = new JDialog_Sucursal(this, true);
        objVentana.setLocationRelativeTo(this);
        objVentana.setVisible(true);
    }//GEN-LAST:event_jmnu_SucursalesActionPerformed

    private void jmnu_TuristasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnu_TuristasActionPerformed
        JDialog_Turista objVentana = new JDialog_Turista(this, true);
        objVentana.setLocationRelativeTo(this);
        objVentana.setVisible(true);
    }//GEN-LAST:event_jmnu_TuristasActionPerformed

    private void jmnu_VuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnu_VuelosActionPerformed
        JDialog_Vuelo objVentana = new JDialog_Vuelo(this, true);
        objVentana.setLocationRelativeTo(this);
        objVentana.setVisible(true);
    }//GEN-LAST:event_jmnu_VuelosActionPerformed

    private void jmnu_ViajesContratadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnu_ViajesContratadosActionPerformed
        JDialog_ViajesContratados objVentana = new JDialog_ViajesContratados(this, true);
        objVentana.setLocationRelativeTo(this);
        objVentana.setVisible(true);
    }//GEN-LAST:event_jmnu_ViajesContratadosActionPerformed

    private void jmnu_VuelosTuristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnu_VuelosTuristaActionPerformed
       JDialog_VuelosTuristas objventana = new  JDialog_VuelosTuristas(this, true);
       objventana.setLocationRelativeTo(this);
       objventana.setVisible(true);
       
    }//GEN-LAST:event_jmnu_VuelosTuristaActionPerformed

    private void jmnu_Historial_VuelosTurisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnu_Historial_VuelosTurisaActionPerformed
 JDialog_ViajesContratados objventana = new JDialog_ViajesContratados(this, true);
  objventana.setLocationRelativeTo(this);
 objventana.setVisible(true);
    }//GEN-LAST:event_jmnu_Historial_VuelosTurisaActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmnu_Estancias;
    private javax.swing.JMenuItem jmnu_Historial_VuelosTurisa;
    private javax.swing.JMenuItem jmnu_Sucursales;
    private javax.swing.JMenuItem jmnu_Turistas;
    private javax.swing.JMenuItem jmnu_ViajesContratados;
    private javax.swing.JMenuItem jmnu_Vuelos;
    private javax.swing.JMenuItem jmnu_VuelosTurista;
    private javax.swing.JMenuItem jmu_Hoteles;
    // End of variables declaration//GEN-END:variables
}
