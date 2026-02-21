package Vista;

import AccesoDB.ConectaDB;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class JFrame_Principal extends javax.swing.JFrame {

    public JFrame_Principal() {
        initComponents();
        setLocationRelativeTo(null);
        Connection cn = ConectaDB.ObtenerConexion();
        if (cn!=null) {
            JOptionPane.showMessageDialog(rootPane, "conectado");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnu_Archivo = new javax.swing.JMenu();
        mnu_item_salir = new javax.swing.JMenuItem();
        mnu_Mantenimiento = new javax.swing.JMenu();
        mnu_item_alumnos = new javax.swing.JMenuItem();
        mnu_Control_Estudiantes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnu_Archivo.setText("Archivo");

        mnu_item_salir.setText("Salir");
        mnu_Archivo.add(mnu_item_salir);

        jMenuBar1.add(mnu_Archivo);

        mnu_Mantenimiento.setText("Mantenimiento");

        mnu_item_alumnos.setText("Alumnos");
        mnu_item_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu_item_alumnosActionPerformed(evt);
            }
        });
        mnu_Mantenimiento.add(mnu_item_alumnos);

        jMenuBar1.add(mnu_Mantenimiento);

        mnu_Control_Estudiantes.setText("Control de Estudiantes");
        jMenuBar1.add(mnu_Control_Estudiantes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnu_item_alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu_item_alumnosActionPerformed
        new JDialog_Alumnos(this, true).setVisible(true);
    }//GEN-LAST:event_mnu_item_alumnosActionPerformed

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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnu_Archivo;
    private javax.swing.JMenu mnu_Control_Estudiantes;
    private javax.swing.JMenu mnu_Mantenimiento;
    private javax.swing.JMenuItem mnu_item_alumnos;
    private javax.swing.JMenuItem mnu_item_salir;
    // End of variables declaration//GEN-END:variables
}
