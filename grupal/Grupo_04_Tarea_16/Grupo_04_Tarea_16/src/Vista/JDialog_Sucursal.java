package Vista;

import Control.Arbol_Sucursal;
import Control.DAO_Sucursales;
import Interface.RelojListener;
import Modelo.Sucursales;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JDialog_Sucursal extends javax.swing.JDialog implements RelojListener {

    private HashMap TablaHash = new HashMap();
    private DefaultComboBoxModel comboCodigo = new DefaultComboBoxModel();
    private Arbol_Sucursal Objarbol = new Arbol_Sucursal();

    public JDialog_Sucursal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        cbo_CodigoSucursal.setModel(comboCodigo);
        Control.RelojGlobal.getInstancia().agregarListener(this);
        Control.RelojGlobal.getInstancia().iniciar();
    }

    private void Limpieza() {
        cbo_CodigoSucursal.setSelectedIndex(0);
        txt_Direccion.setText("");
        txt_Telefono.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbo_CodigoSucursal = new javax.swing.JComboBox<>();
        txt_Direccion = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        txt_Filtrar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Sucursales = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btn_Registrar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Consultar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        lbl_Cronometro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" "));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Sucursales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel1.setText("Codigo:");

        jLabel2.setText("Direccion:");

        jLabel3.setText("Telefono:");

        jLabel6.setText("Filtrar:");

        cbo_CodigoSucursal.setBackground(new java.awt.Color(255, 255, 255));
        cbo_CodigoSucursal.setForeground(new java.awt.Color(0, 0, 0));

        txt_Direccion.setBackground(new java.awt.Color(255, 255, 255));
        txt_Direccion.setForeground(new java.awt.Color(0, 0, 0));

        txt_Telefono.setBackground(new java.awt.Color(255, 255, 255));
        txt_Telefono.setForeground(new java.awt.Color(0, 0, 0));

        txt_Filtrar.setText("Ingrese el código de Sucursal");
        txt_Filtrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_FiltrarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_FiltrarFocusLost(evt);
            }
        });
        txt_Filtrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_FiltrarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_CodigoSucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Direccion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Telefono))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Filtrar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbo_CodigoSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_Sucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_Sucursales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SucursalesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Sucursales);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(" "));

        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Consultar.setText("Consultar");
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });

        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btn_Registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Editar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_Cronometro, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_Cronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        try {
            String direccion = txt_Direccion.getText().trim();
            String telefono = txt_Telefono.getText().trim();
            Sucursales objSucursal = new Sucursales(0, direccion, telefono);
            DAO_Sucursales.Insertar(objSucursal);
            Objarbol.setRaiz(Objarbol.Insertar(Objarbol.getRaiz(), objSucursal));
            Objarbol.ListarCbo(cbo_CodigoSucursal, TablaHash);
            Objarbol.Listar(tbl_Sucursales);
            txt_Direccion.setText("");
            txt_Telefono.setText("");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DAO_Sucursales.Consultar_Todos(Objarbol);
        Objarbol.Listar(tbl_Sucursales);
    }//GEN-LAST:event_formWindowOpened

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int pos = tbl_Sucursales.getSelectedRow();
        if (pos != -1) {
            int codigo = Integer.parseInt(tbl_Sucursales.getValueAt(pos, 0).toString());
            Sucursales sucursales = Objarbol.Buscar(Objarbol.getRaiz(), codigo);
            if (sucursales != null) {
                int rpta = JOptionPane.showConfirmDialog(this,
                        "¿Desea eliminar el hotel: " + sucursales.getDireccionSucursal() + "?",
                        "Eliminación", JOptionPane.YES_NO_OPTION);
                if (rpta == JOptionPane.YES_OPTION) {
                    DAO_Sucursales.Eliminar(sucursales);
                    Objarbol.setRaiz(Objarbol.eliminar(Objarbol.getRaiz(), codigo));
                    comboCodigo.removeAllElements();
                    TablaHash.clear();
                    Objarbol.InordenCBO(Objarbol.getRaiz(), comboCodigo, TablaHash);
                    Objarbol.Listar(tbl_Sucursales);
                    JOptionPane.showMessageDialog(this, "Hotel eliminado correctamente.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Hotel no encontrado en el árbol.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un hotel de la tabla.");
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
        try {
            int codigoCONSULTA = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el código del hotel a consultar:"));
            Sucursales objSucursal = Objarbol.Buscar(codigoCONSULTA);
            if (objSucursal != null) {
                String mensaje
                        = "Código: " + objSucursal.getCodigoSucursal() + "\n"
                        + "Direccion: " + objSucursal.getDireccionSucursal() + "\n"
                        + "telefono: " + objSucursal.getTelefonoSucursal();
                JOptionPane.showMessageDialog(this, mensaje);
            } else {
                JOptionPane.showMessageDialog(this, "Hotel no encontrado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Código inválido.");
        }

    }//GEN-LAST:event_btn_ConsultarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        int pos = tbl_Sucursales.getSelectedRow();
        if (pos != -1) {
            int codigo = Integer.parseInt(tbl_Sucursales.getValueAt(pos, 0).toString());
            Sucursales sucursal = Objarbol.Buscar(Objarbol.getRaiz(), codigo);
            if (sucursal != null) {
                sucursal.setDireccionSucursal(txt_Direccion.getText());
                sucursal.setTelefonoSucursal(txt_Telefono.getText());
                DAO_Sucursales.Actualizar(sucursal);
                comboCodigo.removeAllElements();
                TablaHash.clear();
                Objarbol.InordenCBO(Objarbol.getRaiz(), comboCodigo, TablaHash);
                Objarbol.Listar(tbl_Sucursales);
                JOptionPane.showMessageDialog(this, "Hotel actualizado");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el hotel");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un hotel de la tabla");
        }
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void tbl_SucursalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SucursalesMouseClicked
        comboCodigo.removeAllElements();
        Objarbol.InordenCBO(Objarbol.getRaiz(), comboCodigo, TablaHash);
        int pos = tbl_Sucursales.getSelectedRow();
        if (pos != -1) {
            int codigo = Integer.parseInt(tbl_Sucursales.getValueAt(pos, 0).toString());
            if (TablaHash.containsKey(codigo)) {
                Sucursales Sucursal = (Sucursales) TablaHash.get(codigo);
                txt_Direccion.setText(Sucursal.getDireccionSucursal());
                txt_Telefono.setText(Sucursal.getTelefonoSucursal());
            } else {
                JOptionPane.showMessageDialog(this, "Hotel no encontrado en la tabla hash.");
            }
        }

    }//GEN-LAST:event_tbl_SucursalesMouseClicked

    private void txt_FiltrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FiltrarKeyReleased
        try {
            String filtro = txt_Filtrar.getText();
            if (filtro.isEmpty()) {
                Objarbol.Listar(tbl_Sucursales);
            } else {
                Objarbol.Filtrar(tbl_Sucursales, filtro);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al Filtrar: " + e.getMessage());
        }
    }//GEN-LAST:event_txt_FiltrarKeyReleased

    private void txt_FiltrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_FiltrarFocusGained
        if (txt_Filtrar.getText().equals("Ingrese el código de Sucursal")) {
            txt_Filtrar.setText("");
        }
    }//GEN-LAST:event_txt_FiltrarFocusGained

    private void txt_FiltrarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_FiltrarFocusLost
        if (txt_Filtrar.getText().trim().isEmpty()) {
            txt_Filtrar.setText("Ingrese el código de Sucursal");
        }
    }//GEN-LAST:event_txt_FiltrarFocusLost

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
            java.util.logging.Logger.getLogger(JDialog_Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Sucursal dialog = new JDialog_Sucursal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JComboBox<String> cbo_CodigoSucursal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Cronometro;
    private javax.swing.JTable tbl_Sucursales;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Filtrar;
    private javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizarHora(String hora) {
        lbl_Cronometro.setText(hora);
    }
}
