package Vista;

import Control.Arbol_Estancias;
import Control.Arbol_Hotel;
import Control.DAO_Estancias;
import Control.DAO_Hoteles;
import Modelo.Estancias;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;


public class JDialog_Estancias extends javax.swing.JDialog {

    HashMap TablaHash = new HashMap<>();
    Arbol_Hotel objArbolHotel = new Arbol_Hotel();
    Arbol_Estancias objArbolEstancias = new Arbol_Estancias();
    DefaultComboBoxModel comboCodigo = new DefaultComboBoxModel();

    private boolean editandoEstancia = false;
    private int codigoAnterior = -1;

    public JDialog_Estancias(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        cbo_CodigoHotel.setModel(comboCodigo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Pension = new javax.swing.JTextField();
        cbo_CodigoHotel = new javax.swing.JComboBox<>();
        txt_Buscar = new javax.swing.JTextField();
        Date date = new Date();

        SpinnerDateModel sm = new SpinnerDateModel(date,null,null,Calendar.DAY_OF_YEAR);
        spn_fecha_entrada = new javax.swing.JSpinner(sm);
        Date date1 = new Date();

        SpinnerDateModel sm1 = new SpinnerDateModel(date1,null,null,Calendar.DAY_OF_YEAR);
        spn_fecha_salida = new javax.swing.JSpinner(sm1);
        jLabel6 = new javax.swing.JLabel();
        cbo_codigo = new javax.swing.JComboBox<>();
        Opciones = new javax.swing.JPanel();
        btn_Registrar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Listar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Estancias = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" "));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Estancias:"));

        jLabel1.setText("Pension:");

        jLabel2.setText("Fecha Entrada:");

        jLabel3.setText("Fecha Salida:");

        jLabel4.setText("Código Hotel:");

        jLabel5.setText("Buscar Estancia:");

        txt_Buscar.setText("Ingrese un Código");
        txt_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_BuscarKeyReleased(evt);
            }
        });

        JSpinner.DateEditor de = new JSpinner.DateEditor(spn_fecha_entrada,"dd/MM/yy");
        spn_fecha_entrada.setEditor(de);

        JSpinner.DateEditor de1 = new JSpinner.DateEditor(spn_fecha_salida,"dd/mm/yy");
        spn_fecha_salida.setEditor(de1);

        jLabel6.setText("codigo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Buscar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_CodigoHotel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spn_fecha_entrada)
                            .addComponent(spn_fecha_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Pension)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbo_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbo_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Pension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spn_fecha_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spn_fecha_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbo_CodigoHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Opciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones:"));
        Opciones.setLayout(new java.awt.GridLayout(4, 0, 0, 5));

        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });
        Opciones.add(btn_Registrar);

        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });
        Opciones.add(btn_Editar);

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        Opciones.add(btn_Eliminar);

        btn_Listar.setText("Listar");
        btn_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListarActionPerformed(evt);
            }
        });
        Opciones.add(btn_Listar);

        tbl_Estancias.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_Estancias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_EstanciasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Estancias);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(72, 72, 72))
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
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarCampos() {
        txt_Pension.setText("");

        txt_Buscar.setText("");
        cbo_CodigoHotel.setSelectedIndex(0);
    }

    private void ActualizarTabla() {
        objArbolEstancias.Listar(tbl_Estancias);
    }

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        try {
            String pension = txt_Pension.getText().trim();

            String fechaEntradaStr = spn_fecha_entrada.getValue().toString();
            String fechaSalidaStr = spn_fecha_salida.getValue().toString();

            int codigoHotelStr = Integer.parseInt(cbo_CodigoHotel.getSelectedItem().toString());

            Estancias nueva = new Estancias(new Object[]{0, pension, fechaEntradaStr, fechaSalidaStr, codigoHotelStr});
            DAO_Estancias.Insertar(nueva);
            objArbolEstancias.setRaiz(objArbolEstancias.Insertar(objArbolEstancias.getRaiz(), nueva));
            ActualizarTabla();
            LimpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al registrar: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed

        try {
            int codigoEstancia = Integer.parseInt(cbo_codigo.getSelectedItem().toString());
            Estancias codigo = objArbolEstancias.Buscar(objArbolEstancias.getRaiz(), codigoEstancia);

            if (codigo != null) {

                String pension = txt_Pension.getText();
                String fechaEntrada = spn_fecha_entrada.getValue().toString();
                String fechaSalida = spn_fecha_salida.getValue().toString();

                codigo.setFechaEntrada(fechaEntrada);
                codigo.setFechaSalida(fechaSalida);
                codigo.setPension(pension);

                DAO_Estancias.Actualizar(codigo);

                objArbolEstancias.Listar(tbl_Estancias);

                JOptionPane.showMessageDialog(this, "Estancia actualizado correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el turista con ese código.");
            }

            JOptionPane.showMessageDialog(this, "Estancia actualizada correctamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al editar: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed

        int fila = tbl_Estancias.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una estancia de la tabla.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(null, "¿Eliminar esta estancia?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            // Obtener código de la estancia desde la tabla
            int codigoEstancia = Integer.parseInt(tbl_Estancias.getValueAt(fila, 0).toString());

            // Buscar la estancia real en el árbol para eliminarla completamente
            Estancias estancia = objArbolEstancias.Buscar(objArbolEstancias.getRaiz(), codigoEstancia);
            if (estancia == null) {
                JOptionPane.showMessageDialog(null, "No se encontró la estancia en el árbol.");
                return;
            }

            DAO_Estancias.Eliminar(estancia);

            objArbolEstancias.setRaiz(objArbolEstancias.Eliminar(objArbolEstancias.getRaiz(), codigoEstancia));

            ActualizarTabla();
            LimpiarCampos();
            objArbolEstancias.ListarCbo(cbo_codigo, TablaHash); //fijense si funciona esto al eliminar

            JOptionPane.showMessageDialog(null, "Estancia eliminada correctamente.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
        }

    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListarActionPerformed
        try {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del turista a consultar"));
            Estancias esta = objArbolEstancias.Buscar(objArbolEstancias.getRaiz(), codigo);

            if (esta != null) {
                String mensaje = "Nombre: " + esta.getFechaEntrada() + "\n"
                        + "Apellido: " + esta.getFechaSalida() + "\n"
                        + "Dirección: " + esta.getPension() + "\n"
                        + "Teléfono: " + esta.getHoteles_CodigoHotel();
                JOptionPane.showMessageDialog(this, mensaje);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el turista con ese código.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_ListarActionPerformed

    private void txt_BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarKeyReleased
//        String texto = txt_Buscar.getText().trim();
//        if (texto.isEmpty()) {
//            ActualizarTabla();
//            return;
//        }
//        try {
//            int codigo = Integer.parseInt(texto);
//            DefaultTableModel modelo = (DefaultTableModel) tbl_Estancias.getModel();
//            modelo.setRowCount(0);
//            Estancias encontrada = objArbolEstancias.Buscar(objArbolEstancias.getRaiz(), codigo);
//            if (encontrada != null) {
//                modelo.addRow(encontrada.toArray());
//            }
//        } catch (NumberFormatException ex) {
//            // Si no es número, ignorar o buscar por pensión (opcional)
//        }
    }//GEN-LAST:event_txt_BuscarKeyReleased

    private void tbl_EstanciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_EstanciasMouseClicked
        comboCodigo.removeAllElements();

        objArbolEstancias.InordenCBO(objArbolEstancias.getRaiz(), comboCodigo, TablaHash);

        int pos = tbl_Estancias.getSelectedRow();
        if (pos != -1) {

            int codigo = Integer.parseInt(tbl_Estancias.getValueAt(pos, 0).toString());

            // Verificas si el código está en el HashMap
            if (TablaHash.containsKey(codigo)) {
                Estancias Esta = (Estancias) TablaHash.get(codigo);

                txt_Pension.setText(Esta.getPension());

            } else {
                JOptionPane.showMessageDialog(this, "Hotel no encontrado en la tabla hash.");
            }
        }

    }//GEN-LAST:event_tbl_EstanciasMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        DAO_Estancias.Consultar_Todos(objArbolEstancias);
        objArbolEstancias.ListarCbo(cbo_codigo, TablaHash);
        objArbolEstancias.Listar(tbl_Estancias);
        DAO_Hoteles.ConsultarParaCombo(cbo_CodigoHotel, objArbolHotel, TablaHash);

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(JDialog_Estancias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_Estancias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_Estancias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_Estancias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_Estancias dialog = new JDialog_Estancias(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel Opciones;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Listar;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JComboBox<String> cbo_CodigoHotel;
    private javax.swing.JComboBox<String> cbo_codigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spn_fecha_entrada;
    private javax.swing.JSpinner spn_fecha_salida;
    private javax.swing.JTable tbl_Estancias;
    private javax.swing.JTextField txt_Buscar;
    private javax.swing.JTextField txt_Pension;
    // End of variables declaration//GEN-END:variables
}
