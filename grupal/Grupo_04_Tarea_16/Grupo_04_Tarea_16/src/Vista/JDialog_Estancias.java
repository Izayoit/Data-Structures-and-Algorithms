package Vista;

import Control.Arbol_Estancias;
import Control.Arbol_Hotel;
import Control.DAO_Estancias;
import Control.DAO_Hoteles;
import Control.Nodo_Estancias;
import Modelo.Estancias;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JDialog_Estancias extends javax.swing.JDialog {

    private HashMap TablaHash = new HashMap<>();
    private Arbol_Hotel objArbolHotel = new Arbol_Hotel();
    private Arbol_Estancias objArbolEstancias = new Arbol_Estancias();
    private DefaultComboBoxModel modComboCodigo = new DefaultComboBoxModel();

    public JDialog_Estancias(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        cbo_CodigoHotel.setModel(modComboCodigo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Registro = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbo_CodigoCONSULTA = new javax.swing.JComboBox<>();
        txt_Pension = new javax.swing.JTextField();
        cbo_CodigoHotel = new javax.swing.JComboBox<>();
        txt_Buscar = new javax.swing.JTextField();
        txt_FechaEntrada = new javax.swing.JTextField();
        txt_FechaSalida = new javax.swing.JTextField();
        Opciones = new javax.swing.JPanel();
        btn_Registrar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Consultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Estancias = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" "));

        Registro.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Estancias:"));

        jLabel6.setText("Código a consultar:");

        jLabel1.setText("Pension:");

        jLabel2.setText("Fecha Entrada:");

        jLabel3.setText("Fecha Salida:");

        jLabel4.setText("Código Hotel:");

        jLabel5.setText("Buscar Estancia:");

        txt_Buscar.setText("Ingrese un Código");
        txt_Buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_BuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_BuscarFocusLost(evt);
            }
        });
        txt_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_BuscarKeyPressed(evt);
            }
        });

        txt_FechaEntrada.setText("dd/mm/yy");
        txt_FechaEntrada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_FechaEntradaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_FechaEntradaFocusLost(evt);
            }
        });

        txt_FechaSalida.setText("dd/mm/yy");
        txt_FechaSalida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_FechaSalidaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_FechaSalidaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro);
        Registro.setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_CodigoCONSULTA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbo_CodigoHotel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Pension))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_FechaEntrada))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_FechaSalida)))
                .addContainerGap())
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbo_CodigoCONSULTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Pension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_FechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_FechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_CodigoHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btn_Consultar.setText("Consultar ");
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });
        Opciones.add(btn_Consultar);

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
                    .addComponent(Registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void LimpiarCampos() {
        txt_Pension.setText("");
        txt_FechaEntrada.setText("");
        txt_FechaSalida.setText("");
        cbo_CodigoHotel.setSelectedIndex(0);
        txt_Buscar.setText("");
    }

    private void Listar() {
        objArbolEstancias.Listar(tbl_Estancias);
    }

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        try {
            String pension = txt_Pension.getText().toUpperCase().trim();
            String fechaEntrada = txt_FechaEntrada.getText().trim();
            String fechaSalida = txt_FechaSalida.getText().trim();
            int codigoHotel = Integer.parseInt(cbo_CodigoHotel.getSelectedItem().toString());
            if (fechaEntrada.equals("dd/mm/yy") || fechaSalida.equals("dd/mm/yy")) {
                if (fechaEntrada.equals("dd/mm/yy")) {
                    JOptionPane.showMessageDialog(this, "Por favor, coloque una fecha de entrada");
                    txt_FechaEntrada.requestFocus();
                    return;
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, coloque una fecha de salida");
                    txt_FechaSalida.requestFocus();
                    return;
                }
            }
            Estancias nueva = new Estancias(new Object[]{0, pension, fechaEntrada, fechaSalida, codigoHotel});
            objArbolEstancias.setRaiz(objArbolEstancias.Insertar(objArbolEstancias.getRaiz(), nueva));
            DAO_Estancias.Insertar(nueva);
            Listar();
            LimpiarCampos();
            txt_FechaEntrada.setText("dd/mm/yy");
            txt_FechaSalida.setText("dd/mm/yy");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al registrar: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        try {
            int codigoEstancia = Integer.parseInt(cbo_CodigoCONSULTA.getSelectedItem().toString());
            Nodo_Estancias objNodoEstancia = objArbolEstancias.Buscar(objArbolEstancias.getRaiz(), codigoEstancia);
            if (objNodoEstancia != null) {
                String pension = txt_Pension.getText();
                String fechaEntrada = txt_FechaEntrada.getText().trim();
                String fechaSalida = txt_FechaSalida.getText().trim();
                objNodoEstancia.getElemento().setFechaEntrada(fechaEntrada);
                objNodoEstancia.getElemento().setFechaSalida(fechaSalida);
                objNodoEstancia.getElemento().setPension(pension);
                objArbolEstancias.Listar(tbl_Estancias);
                DAO_Estancias.Actualizar(objNodoEstancia.getElemento());
                txt_FechaEntrada.setText("dd/mm/yy");
                txt_FechaSalida.setText("dd/mm/yy");
                JOptionPane.showMessageDialog(this, "Estancia actualizada");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró la Estancia");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al editar: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int fila = tbl_Estancias.getSelectedRow();
        if (fila != -1) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar esta estancia?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    int codigoEstancia = Integer.parseInt(tbl_Estancias.getValueAt(fila, 0).toString());
                    Nodo_Estancias objNodoEstancia = objArbolEstancias.Buscar(objArbolEstancias.getRaiz(), codigoEstancia);
                    if (objNodoEstancia != null) {
                        DAO_Estancias.Eliminar(objNodoEstancia.getElemento());
                        objArbolEstancias.setRaiz(objArbolEstancias.Eliminar(objArbolEstancias.getRaiz(), codigoEstancia));
                        objArbolEstancias.ListarCbo(cbo_CodigoCONSULTA, TablaHash); //FATA FIJAR
                        Listar();
                        LimpiarCampos();
                        JOptionPane.showMessageDialog(null, "Estancia eliminada");
                    }
                    JOptionPane.showMessageDialog(null, "No se encontró la estancia con codigo '" + codigoEstancia + "'");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila a eliminar ESTANCIA");
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
        try {
            int codigoEstancia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del hotel a consultar"));
            Nodo_Estancias objNodoEstancia = objArbolEstancias.Buscar(objArbolEstancias.getRaiz(), codigoEstancia);
            if (objNodoEstancia != null) {
                String mensaje = "Pensión: " + objNodoEstancia.getElemento().getPension() + "\n"
                        + "Fech.Entra.: " + objNodoEstancia.getElemento().getFechaEntrada() + "\n"
                        + "Fech.Sali.: " + objNodoEstancia.getElemento().getFechaSalida() + "\n"
                        + "Cod.Hotel: " + objNodoEstancia.getElemento().getHoteles_CodigoHotel();
                JOptionPane.showMessageDialog(this, mensaje);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el hotel con ese el código '" + objNodoEstancia.getElemento().getHoteles_CodigoHotel() + "'");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al consultar: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_ConsultarActionPerformed

    private void tbl_EstanciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_EstanciasMouseClicked
        modComboCodigo.removeAllElements();
        objArbolEstancias.InordenCBO(objArbolEstancias.getRaiz(), modComboCodigo, TablaHash);
        int pos = tbl_Estancias.getSelectedRow();
        if (pos != -1) {
            int codigoEstancia = Integer.parseInt(tbl_Estancias.getValueAt(pos, 0).toString());
            if (TablaHash.containsKey(codigoEstancia)) {
                Estancias objEstancia = (Estancias) TablaHash.get(codigoEstancia);
                txt_Pension.setText(objEstancia.getPension()); //SOLO SE TIENE LA PENSION
            } else {
                JOptionPane.showMessageDialog(this, "Hotel no encontrado en la tabla hash.");
            }
        }
    }//GEN-LAST:event_tbl_EstanciasMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
        DAO_Estancias.Consultar_Todos(objArbolEstancias);
        objArbolEstancias.ListarCbo(cbo_CodigoCONSULTA, TablaHash);
        objArbolEstancias.Listar(tbl_Estancias);
        
        DAO_Hoteles.ConsultarParaCombo(cbo_CodigoHotel, objArbolHotel, TablaHash);
        
        
    }//GEN-LAST:event_formWindowOpened

    private void txt_BuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_BuscarKeyPressed
        txt_Buscar.setText("");
        try {
            String codigoTexto = txt_Buscar.getText().trim();
            int codigoEstancia = Integer.parseInt(codigoTexto);
            DefaultTableModel modelo = (DefaultTableModel) tbl_Estancias.getModel();
            modelo.setRowCount(0);
            Nodo_Estancias objNodoEstancia = objArbolEstancias.Buscar(objArbolEstancias.getRaiz(), codigoEstancia);
            if (objNodoEstancia != null) {
                modelo.addRow(objNodoEstancia.getRegistro());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al Buscar: " + e.getMessage());
        }
    }//GEN-LAST:event_txt_BuscarKeyPressed

    private void txt_BuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_BuscarFocusGained
        if (txt_Buscar.getText().equals("Ingrese un Código")) {
            txt_Buscar.setText("");
        }
    }//GEN-LAST:event_txt_BuscarFocusGained

    private void txt_BuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_BuscarFocusLost
        if (txt_Buscar.getText().trim().isEmpty()) {
            txt_Buscar.setText("Ingrese un Código");
        }
    }//GEN-LAST:event_txt_BuscarFocusLost

    private void txt_FechaEntradaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_FechaEntradaFocusGained
        if (txt_FechaEntrada.getText().equals("dd/mm/yy")) {
            txt_FechaEntrada.setText("");
        }
    }//GEN-LAST:event_txt_FechaEntradaFocusGained

    private void txt_FechaEntradaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_FechaEntradaFocusLost
        if (txt_FechaEntrada.getText().trim().isEmpty()) {
            txt_FechaEntrada.setText("dd/mm/yy");
        }
    }//GEN-LAST:event_txt_FechaEntradaFocusLost

    private void txt_FechaSalidaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_FechaSalidaFocusGained
        if (txt_FechaSalida.getText().equals("dd/mm/yy")) {
            txt_FechaSalida.setText("");
        }
    }//GEN-LAST:event_txt_FechaSalidaFocusGained

    private void txt_FechaSalidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_FechaSalidaFocusLost
        if (txt_FechaSalida.getText().trim().isEmpty()) {
            txt_FechaSalida.setText("dd/mm/yy");
        }
    }//GEN-LAST:event_txt_FechaSalidaFocusLost

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JPanel Registro;
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JComboBox<String> cbo_CodigoCONSULTA;
    private javax.swing.JComboBox<String> cbo_CodigoHotel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Estancias;
    private javax.swing.JTextField txt_Buscar;
    private javax.swing.JTextField txt_FechaEntrada;
    private javax.swing.JTextField txt_FechaSalida;
    private javax.swing.JTextField txt_Pension;
    // End of variables declaration//GEN-END:variables
}
