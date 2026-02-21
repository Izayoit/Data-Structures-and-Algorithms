package Vista;

import Control.Arbol_Estancias;
import Control.Arbol_Sucursal;
import Control.Arbol_Turista;
import Control.Arbol_ViajeContratado;
import Control.DAO_Estancias;
import Control.DAO_Sucursales;
import Control.DAO_Turistas;
import Control.DAO_ViajesContratados;
import Modelo.ViajesContratados;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JDialog_ViajesContratados extends javax.swing.JDialog {
    private HashMap tablahash1 = new HashMap();
    private HashMap tablahash2 = new HashMap();
    private HashMap tablahash3 = new HashMap();
    private HashMap tablahash4 = new HashMap();
    
    private Arbol_Turista objArbol_Turista = new Arbol_Turista();
    private Arbol_Sucursal objArbol_Sucursal= new Arbol_Sucursal();
    private Arbol_Estancias objArbol_Estancias = new Arbol_Estancias();
    
    private Arbol_ViajeContratado objViajeContratado = new Arbol_ViajeContratado();
    private ViajesContratados viajecontratado ;
    private DefaultComboBoxModel modCombo = new  DefaultComboBoxModel();

    public JDialog_ViajesContratados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        cbo_codigo_contratados.setModel(modCombo);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbo_CodigoTurista = new javax.swing.JComboBox<>();
        cbo_CodigoSucursal = new javax.swing.JComboBox<>();
        cbo_CodigoEstancia = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbo_codigo_contratados = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ViajesContratados = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btn_Registrar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_MostrarRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" "));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Viajes Contratados:"));

        jLabel1.setText("Código Turista:");

        jLabel2.setText("Código Sucursal:");

        jLabel3.setText("Código Estancia:");

        jLabel4.setText("codigo_contratados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_CodigoSucursal, 0, 168, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_CodigoEstancia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbo_CodigoTurista, 0, 137, Short.MAX_VALUE)
                            .addComponent(cbo_codigo_contratados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbo_codigo_contratados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbo_CodigoTurista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbo_CodigoSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbo_CodigoEstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        tbl_ViajesContratados.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_ViajesContratados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ViajesContratadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_ViajesContratados);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones:"));

        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_MostrarRegistro.setText("Mostrar Registro");
        btn_MostrarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MostrarRegistroActionPerformed(evt);
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
                    .addComponent(btn_Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_MostrarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_MostrarRegistro))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
     try {
            
          
            
            int estancia = Integer.parseInt(cbo_CodigoEstancia.getSelectedItem().toString());
            int sucursal = Integer.parseInt(cbo_CodigoSucursal.getSelectedItem().toString());
            int turista = Integer.parseInt(cbo_CodigoTurista.getSelectedItem().toString());
            
            
            ViajesContratados nuevovuelo = new ViajesContratados(0,estancia, sucursal, turista);
            
            DAO_ViajesContratados.Insertar(nuevovuelo);
            
            objViajeContratado.setRaiz(objViajeContratado.Insertar(objViajeContratado.getRaiz(), nuevovuelo));
            
            objViajeContratado.Listar(tbl_ViajesContratados);

          
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        try {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del vuelo a editar"));
            
            int x = Integer.parseInt(cbo_CodigoEstancia.getSelectedItem().toString());
            int y = Integer.parseInt(cbo_CodigoTurista.getSelectedItem().toString());
            int z = Integer.parseInt(cbo_CodigoSucursal.getSelectedItem().toString());
                  
            ViajesContratados actualizado = new ViajesContratados(numero, x, y, z);
            
            DAO_ViajesContratados.Actualizar(actualizado);
            
            objViajeContratado.setRaiz(objViajeContratado.Eliminar(objViajeContratado.getRaiz(), numero));
            objViajeContratado.setRaiz(objViajeContratado.Insertar(objViajeContratado.getRaiz(), actualizado));
            
            objViajeContratado.Listar(tbl_ViajesContratados);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al editar: " + e.getMessage());
        }
        
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
    int fila = tbl_ViajesContratados.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona un vuelo de la tabla.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(null, "¿Eliminar este vuelo?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            int codigo = Integer.parseInt(tbl_ViajesContratados.getValueAt(fila, 0).toString());
            ViajesContratados buscar = objViajeContratado.Buscar(objViajeContratado.getRaiz(), codigo);
            if (buscar == null) {
                JOptionPane.showMessageDialog(null, "No se encontró el vuelo en el árbol.");
                return;
            }

            DAO_ViajesContratados.Eliminar(buscar);
            
            objViajeContratado.setRaiz(objViajeContratado.Eliminar(objViajeContratado.getRaiz(), codigo));
            
            objArbol_Estancias.ListarCbo(cbo_CodigoEstancia, tablahash2);
            objArbol_Sucursal.ListarCbo(cbo_CodigoSucursal, tablahash3);
            objArbol_Turista.ListarCbo(cbo_CodigoTurista, tablahash4);
             objViajeContratado.Listar(tbl_ViajesContratados);
            JOptionPane.showMessageDialog(null, "Vuelo eliminado correctamente.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + ex.getMessage());
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_MostrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostrarRegistroActionPerformed
        try {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del ViajeContratado a consultar"));
            viajecontratado = objViajeContratado.Buscar(objViajeContratado.getRaiz(), codigo);
            if (viajecontratado != null) {
                String mensaje = "CódigoViaje: " + viajecontratado.getCodigoViaje() + "\n"
                        + "CódigoTurista: " + viajecontratado.getTuristas_CodigoTuristas() + "  /  NombresTurista: " + viajecontratado.getElementoTurista().getNombreTurista() + " " + viajecontratado.getElementoTurista().getApellidosTurista() + "\n"
                        + "CódigoSucursal: " + viajecontratado.getSucursales_CodigoSucursal() + "  /  DireccionSucursal: " + viajecontratado.getElementoSucursal().getDireccionSucursal() + "\n"
                        + "CódigoEstancia: " + viajecontratado.getEstancias_CodigoEstancia() + "  /  Fec.Entr: " + viajecontratado.getElementoEstancia().getFechaEntrada() + " / Fec.Sali: " + viajecontratado.getElementoEstancia().getFechaSalida() + "\n";
                JOptionPane.showMessageDialog(this, mensaje);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el turista con ese código.");
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            
        }
        
    }//GEN-LAST:event_btn_MostrarRegistroActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
        DAO_ViajesContratados.Consultar_Todos(objViajeContratado);
        objViajeContratado.ListarCbo(cbo_codigo_contratados, tablahash1);
        objViajeContratado.Listar(tbl_ViajesContratados);
        
        
        DAO_Turistas.ConsultarParaCombo(cbo_CodigoTurista, objArbol_Turista, tablahash2);
        DAO_Sucursales.ConsultarParaCombo(cbo_CodigoSucursal, objArbol_Sucursal, tablahash3);
        DAO_Estancias.ConsultarParaCombo(cbo_CodigoEstancia, objArbol_Estancias, tablahash4);
      
    }//GEN-LAST:event_formWindowOpened

    private void tbl_ViajesContratadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ViajesContratadosMouseClicked
       modCombo.removeAllElements();
        objViajeContratado.InordenCBO(objViajeContratado.getRaiz(), modCombo, tablahash1);
        int pos = tbl_ViajesContratados.getSelectedRow();
        if (pos != -1) {
            
            int codigo = Integer.parseInt(tbl_ViajesContratados.getValueAt(pos, 0).toString());
            
            if (tablahash1.containsKey(codigo)) {
                ViajesContratados contra = (ViajesContratados) tablahash1.get(codigo);
                cbo_CodigoEstancia.setSelectedItem(contra.getEstancias_CodigoEstancia());
                cbo_CodigoSucursal.setSelectedItem(contra.getSucursales_CodigoSucursal());
                cbo_CodigoTurista.setSelectedItem(contra.getTuristas_CodigoTuristas());
                
            } else {
                JOptionPane.showMessageDialog(this, "Turista no encontrado en la tabla hash.");
            }
        }
    }//GEN-LAST:event_tbl_ViajesContratadosMouseClicked

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
            java.util.logging.Logger.getLogger(JDialog_ViajesContratados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_ViajesContratados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_ViajesContratados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_ViajesContratados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_ViajesContratados dialog = new JDialog_ViajesContratados(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_MostrarRegistro;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JComboBox<String> cbo_CodigoEstancia;
    private javax.swing.JComboBox<String> cbo_CodigoSucursal;
    private javax.swing.JComboBox<String> cbo_CodigoTurista;
    private javax.swing.JComboBox<String> cbo_codigo_contratados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_ViajesContratados;
    // End of variables declaration//GEN-END:variables
}
