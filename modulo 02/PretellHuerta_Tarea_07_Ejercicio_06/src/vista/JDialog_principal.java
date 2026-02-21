package vista;

import arreglo.lista_usuario;
import javax.swing.table.DefaultTableModel;
import modelo.usuario;



public class JDialog_principal extends javax.swing.JDialog {
lista_usuario objlistausuario = new lista_usuario();
private DefaultTableModel modtable1,modtable2,modtable3;

   
    public JDialog_principal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modtable1 = (DefaultTableModel)tbl_caja_1.getModel();
        modtable2 = (DefaultTableModel)tbl_caja_2.getModel();
        modtable3 = (DefaultTableModel)tbl_caja_3.getModel();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_caja_1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_caja_2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_caja_3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btn_pasar_cola_1 = new javax.swing.JButton();
        btn_pasar_cola_2 = new javax.swing.JButton();
        btn_pasar_cola_3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_salir_caja_1 = new javax.swing.JButton();
        btn_salir_caja_2 = new javax.swing.JButton();
        btn_salir_caja_3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_registro = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbo_carrtios = new javax.swing.JComboBox<>();
        txt_ID = new javax.swing.JTextField();
        btn_registro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbl_caja_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Caja 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(tbl_caja_1);

        tbl_caja_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "caja 2", "Title 2"
            }
        ));
        jScrollPane3.setViewportView(tbl_caja_2);

        tbl_caja_3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "caja 3", "carrito"
            }
        ));
        jScrollPane4.setViewportView(tbl_caja_3);

        jLabel3.setText("caja 1");

        btn_pasar_cola_1.setText("pasar a esta cola");
        btn_pasar_cola_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pasar_cola_1ActionPerformed(evt);
            }
        });

        btn_pasar_cola_2.setText("pasar a esta cola");
        btn_pasar_cola_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pasar_cola_2ActionPerformed(evt);
            }
        });

        btn_pasar_cola_3.setText("pasar a esta cola");
        btn_pasar_cola_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pasar_cola_3ActionPerformed(evt);
            }
        });

        jLabel4.setText("caja 2");

        jLabel5.setText("caja 3");

        btn_salir_caja_1.setText("salir de esta cola");
        btn_salir_caja_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir_caja_1ActionPerformed(evt);
            }
        });

        btn_salir_caja_2.setText("salir de esta cola");
        btn_salir_caja_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir_caja_2ActionPerformed(evt);
            }
        });

        btn_salir_caja_3.setText("salir de esta cola");
        btn_salir_caja_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir_caja_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_pasar_cola_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_salir_caja_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(88, 88, 88)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_pasar_cola_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_salir_caja_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(118, 118, 118)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_pasar_cola_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_salir_caja_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pasar_cola_1)
                    .addComponent(btn_pasar_cola_2)
                    .addComponent(btn_pasar_cola_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salir_caja_1)
                    .addComponent(btn_salir_caja_2)
                    .addComponent(btn_salir_caja_3))
                .addGap(9, 9, 9))
        );

        jTabbedPane1.addTab("cajas", panel);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tbl_registro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_registro);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setFocusCycleRoot(true);

        jLabel1.setText("ID:");

        jLabel2.setText("carritos:");

        cbo_carrtios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carrito A", "Carrito B", "Carrito C", "Carrito D", "Carrito E", "Carrito F", "Carrito G", "Carrito H", "Carrito I", "Carrito J", "Carrito K", "Carrito L", "Carrito M", "Carrito N", "Carrito O", "Carrito P", "Carrito Q", "Carrito R", "Carrito S", "Carrito T", "Carrito U", "Carrito V", "Carrito W", "Carrito X", "Carrito Y" }));

        btn_registro.setText("registro");
        btn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_registro)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_ID)
                            .addComponent(cbo_carrtios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbo_carrtios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btn_registro)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(433, 433, 433))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("registro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroActionPerformed
       String carrito = cbo_carrtios.getSelectedItem().toString();
       String ID = txt_ID.getText();
        usuario datos = new usuario(ID, carrito);
        objlistausuario.registrar(datos);
        objlistausuario.listar(tbl_registro);
      
      
    }//GEN-LAST:event_btn_registroActionPerformed

    private void btn_pasar_cola_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pasar_cola_1ActionPerformed
  
        usuario elemento = objlistausuario.obtenerSiguienteDisponible();
        if (elemento!=null) {
            
            objlistausuario.ApilarEnPila1(elemento);
            objlistausuario.recorrerpila(modtable1);
            objlistausuario.listar(tbl_registro);
            
        }
        
    }//GEN-LAST:event_btn_pasar_cola_1ActionPerformed

    private void btn_salir_caja_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir_caja_1ActionPerformed
      
       usuario elemento2= objlistausuario.desapilar1();
        if (elemento2!=null) {
            objlistausuario.eliminarDeArreglo1(elemento2.getCarrito());
            objlistausuario.listar(tbl_registro);
            objlistausuario.recorrerpila(modtable1);
        }
    }//GEN-LAST:event_btn_salir_caja_1ActionPerformed

    private void btn_pasar_cola_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pasar_cola_2ActionPerformed
      usuario elemento = objlistausuario.obtenerSiguienteDisponible();
        if (elemento!=null) {
            
            objlistausuario.ApilarEnPila2(elemento);
            objlistausuario.recorrerpila2(modtable2);
            objlistausuario.listar(tbl_registro);
            
        }
    }//GEN-LAST:event_btn_pasar_cola_2ActionPerformed

    private void btn_pasar_cola_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pasar_cola_3ActionPerformed
   usuario elemento = objlistausuario.obtenerSiguienteDisponible();
        if (elemento!=null) {
            
            objlistausuario.ApilarEnPila3(elemento);
            objlistausuario.recorrerpila3(modtable3);
            objlistausuario.listar(tbl_registro);
            
        }
    }//GEN-LAST:event_btn_pasar_cola_3ActionPerformed

    private void btn_salir_caja_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir_caja_2ActionPerformed
      usuario elemento2= objlistausuario.desapilar2();
        if (elemento2!=null) {
            objlistausuario.eliminarDeArreglo1(elemento2.getCarrito());
            objlistausuario.listar(tbl_registro);
            objlistausuario.recorrerpila2(modtable2);
        }
    }//GEN-LAST:event_btn_salir_caja_2ActionPerformed

    private void btn_salir_caja_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir_caja_3ActionPerformed
   usuario elemento2= objlistausuario.desapilar3();
        if (elemento2!=null) {
            objlistausuario.eliminarDeArreglo1(elemento2.getCarrito());
            objlistausuario.listar(tbl_registro);
            objlistausuario.recorrerpila3(modtable3);
        }
    }//GEN-LAST:event_btn_salir_caja_3ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(JDialog_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_principal dialog = new JDialog_principal(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_pasar_cola_1;
    private javax.swing.JButton btn_pasar_cola_2;
    private javax.swing.JButton btn_pasar_cola_3;
    private javax.swing.JButton btn_registro;
    private javax.swing.JButton btn_salir_caja_1;
    private javax.swing.JButton btn_salir_caja_2;
    private javax.swing.JButton btn_salir_caja_3;
    private javax.swing.JComboBox<String> cbo_carrtios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tbl_caja_1;
    private javax.swing.JTable tbl_caja_2;
    private javax.swing.JTable tbl_caja_3;
    private javax.swing.JTable tbl_registro;
    private javax.swing.JTextField txt_ID;
    // End of variables declaration//GEN-END:variables
}
