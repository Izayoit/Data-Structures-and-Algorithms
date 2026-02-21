package Vista;

import Control.Arbol_Hotel;
import Control.DAO_Hoteles;
import Interface.RelojListener;
import Modelo.Hoteles;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JDialog_hoteles extends javax.swing.JDialog implements RelojListener{

    Arbol_Hotel ObjArbolHotel = new Arbol_Hotel();
    HashMap TablaHash = new HashMap();
    DefaultComboBoxModel comboCodigo = new DefaultComboBoxModel();

    public JDialog_hoteles(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        cbo_codigo.setModel(comboCodigo);
 Control.RelojGlobal.getInstancia().agregarListener(this);
Control.RelojGlobal.getInstancia().iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPlazas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbo_codigo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_hoteles = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btn_insertar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        txt_filtrar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lbl_cronometro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hoteles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));

        txtCiudad.setBackground(new java.awt.Color(255, 255, 255));
        txtCiudad.setForeground(new java.awt.Color(0, 0, 0));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));

        txtPlazas.setBackground(new java.awt.Color(255, 255, 255));
        txtPlazas.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setText("Nombre Hotel:");

        jLabel2.setText("Direccion Hotel:");

        jLabel3.setText("ciudad hotel:");

        jLabel4.setText("Telefono Hotel:");

        jLabel5.setText("Plazas Hotel:");

        jLabel7.setText("Código:");

        cbo_codigo.setBackground(new java.awt.Color(255, 255, 255));
        cbo_codigo.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPlazas, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(txtTelefono)
                            .addComponent(txtCiudad)
                            .addComponent(txtDireccion)
                            .addComponent(txtNombre)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbo_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbo_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tbl_hoteles.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_hoteles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_hotelesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_hoteles);

        btn_insertar.setText("registrar");
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_consultar.setText("consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_editar.setText("editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_insertar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_insertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        txt_filtrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtrarKeyReleased(evt);
            }
        });

        jLabel6.setText("Filtrar:");

        lbl_cronometro.setBackground(new java.awt.Color(255, 255, 255));
        lbl_cronometro.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_cronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 82, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbl_cronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed
        try {

            String nombre = txtNombre.getText();
            String Direccion = txtDireccion.getText();
            String ciudadHotel = txtCiudad.getText();
            String telefono = txtTelefono.getText();
            int plazasHoteles = Integer.parseInt(txtPlazas.getText());

            Hoteles nuevoHotel = new Hoteles(0, nombre, Direccion, ciudadHotel, telefono, plazasHoteles);
            DAO_Hoteles.Insertar(nuevoHotel);

            ObjArbolHotel.setRaiz(ObjArbolHotel.Insertar(ObjArbolHotel.getRaiz(), nuevoHotel));

            txtNombre.setText("");
            txtDireccion.setText("");
            txtCiudad.setText("");
            txtTelefono.setText("");
            txtPlazas.setText("");

            ObjArbolHotel.Listar(tbl_hoteles);

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_insertarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DAO_Hoteles.Consultar_Todos(ObjArbolHotel);
        ObjArbolHotel.Listar(tbl_hoteles);
    }//GEN-LAST:event_formWindowOpened

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int pos = tbl_hoteles.getSelectedRow();

        if (pos != -1) {
            int codigo = Integer.parseInt(tbl_hoteles.getValueAt(pos, 0).toString());

            Hoteles hotel = ObjArbolHotel.Buscar(ObjArbolHotel.getRaiz(), codigo);

            if (hotel != null) {
                int rpta = JOptionPane.showConfirmDialog(this,
                        "¿Desea eliminar el hotel: " + hotel.getNombreHotel() + "?",
                        "Eliminación", JOptionPane.YES_NO_OPTION);

                if (rpta == JOptionPane.YES_OPTION) {
                    DAO_Hoteles.Eliminar(hotel); // Llama a tu método DAO que elimina en MySQL

                    // Ahora lo eliminamos del árbol
                    ObjArbolHotel.setRaiz(
                            ObjArbolHotel.Eliminar(ObjArbolHotel.getRaiz(), codigo)
                    );

                    // Refrescamos la tabla y combo
                    comboCodigo.removeAllElements();
                    TablaHash.clear();
                    ObjArbolHotel.InordenCBO(ObjArbolHotel.getRaiz(), comboCodigo, TablaHash);
                    ObjArbolHotel.Listar(tbl_hoteles);

                    JOptionPane.showMessageDialog(this, "Hotel eliminado correctamente.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Hotel no encontrado en el árbol.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un hotel de la tabla.");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        try {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el código del hotel a consultar:"));
            Hoteles hotel = ObjArbolHotel.Buscar(codigo);
            if (hotel != null) {
                txt_filtrar.setText("Código: " + codigo);
                txtNombre.setText(hotel.getNombreHotel());
                txtDireccion.setText(hotel.getDireccionHotel());
                txtCiudad.setText(hotel.getCiudadHotel());
                txtTelefono.setText(hotel.getTelefonoHotel());
                txtPlazas.setText(String.valueOf(hotel.getPlazasHotel()));
                 String mensaje = "Nombre: " + hotel.getNombreHotel()+ "\n"
                       + "Direccion: " + hotel.getDireccionHotel() + "\n"
                       + "Ciudad: " +hotel.getCiudadHotel() + "\n"
                       + "Teléfono: " + hotel.getTelefonoHotel() + "\n"
                       + "Plazas: " + hotel.getPlazasHotel();
            } else {
                JOptionPane.showMessageDialog(this, "Hotel no encontrado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Código inválido.");
        }

    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        int pos = tbl_hoteles.getSelectedRow();

        if (pos != -1) {
            // Obtenemos el código del hotel seleccionado
            int codigo = Integer.parseInt(tbl_hoteles.getValueAt(pos, 0).toString());

            // Buscamos el hotel en el árbol
            Hoteles hotel = ObjArbolHotel.Buscar(ObjArbolHotel.getRaiz(), codigo);

            if (hotel != null) {
                // Actualizamos sus datos con lo que hay en los txt
                hotel.setNombreHotel(txtNombre.getText());
                hotel.setDireccionHotel(txtDireccion.getText());
                hotel.setCiudadHotel(txtCiudad.getText());
                hotel.setTelefonoHotel(txtTelefono.getText());
                hotel.setPlazasHotel(Integer.parseInt(txtPlazas.getText()));

                // Llamamos al método de actualización en la base de datos
                DAO_Hoteles.Actualizar(hotel);

                // Re-armamos el árbol si quieres garantizar orden actualizado
                // (opcional, solo si los criterios de orden cambian)
                // Aquí solo refrescamos tabla y combo
                comboCodigo.removeAllElements();
                TablaHash.clear();
                ObjArbolHotel.InordenCBO(ObjArbolHotel.getRaiz(), comboCodigo, TablaHash);
                ObjArbolHotel.Listar(tbl_hoteles);

                JOptionPane.showMessageDialog(this, "Hotel actualizado correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el hotel en el árbol.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un hotel de la tabla.");
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void tbl_hotelesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_hotelesMouseClicked
        comboCodigo.removeAllElements();
        ObjArbolHotel.InordenCBO(ObjArbolHotel.getRaiz(), comboCodigo, TablaHash);

        int pos = tbl_hoteles.getSelectedRow();
        if (pos != -1) {

            int codigo = Integer.parseInt(tbl_hoteles.getValueAt(pos, 0).toString());

            // Verificas si el código está en el HashMap
            if (TablaHash.containsKey(codigo)) {
                Hoteles hotel = (Hoteles) TablaHash.get(codigo);

                txtNombre.setText(hotel.getNombreHotel());
                txtDireccion.setText(hotel.getDireccionHotel());
                txtCiudad.setText(hotel.getCiudadHotel());
                txtTelefono.setText(hotel.getTelefonoHotel());
                txtPlazas.setText(String.valueOf(hotel.getPlazasHotel()));
            } else {
                JOptionPane.showMessageDialog(this, "Hotel no encontrado en la tabla hash.");
            }
        }

    }//GEN-LAST:event_tbl_hotelesMouseClicked

    private void txt_filtrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtrarKeyReleased
     try {
            String filtro = txt_filtrar.getText();
            if(filtro.isEmpty()){
              ObjArbolHotel.Listar(tbl_hoteles);
            }else{
            ObjArbolHotel.Filtrar(tbl_hoteles, filtro);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txt_filtrarKeyReleased

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
            java.util.logging.Logger.getLogger(JDialog_hoteles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_hoteles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_hoteles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_hoteles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_hoteles dialog = new JDialog_hoteles(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_insertar;
    private javax.swing.JComboBox<String> cbo_codigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cronometro;
    private javax.swing.JTable tbl_hoteles;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlazas;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txt_filtrar;
    // End of variables declaration//GEN-END:variables

    @Override
 public void actualizarHora(String hora) {
    lbl_cronometro.setText(hora);
}
}
