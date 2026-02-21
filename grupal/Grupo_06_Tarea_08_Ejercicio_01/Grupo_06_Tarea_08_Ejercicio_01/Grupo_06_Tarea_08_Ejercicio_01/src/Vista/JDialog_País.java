package Vista;

import Control.Lista_Pais;
import Modelo.Pais;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JDialog_País extends javax.swing.JDialog {

    Lista_Pais objLista_Pais;
    DefaultTableModel modtabla;
    Pais actual;

    public JDialog_País(java.awt.Frame parent, boolean modal, Lista_Pais objpais) {
        super(parent, modal);
        initComponents();
        objLista_Pais = objpais;
        modtabla = (DefaultTableModel) tbl_Paises.getModel();
        objLista_Pais.Listar(modtabla);
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_Filtro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Paises = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_Agregar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Filtrar:");

        txt_Filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_FiltroKeyReleased(evt);
            }
        });

        tbl_Paises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "País"
            }
        ));
        tbl_Paises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_PaisesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Paises);

        jPanel1.setLayout(new java.awt.GridLayout(3, 0, 5, 10));

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Agregar);

        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Editar);

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Eliminar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        new JDialog_Actualizar_País((java.awt.Frame) this.getParent(), true, objLista_Pais, "Agregar", actual).setVisible(true);
        objLista_Pais.Listar(modtabla);
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void txt_FiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FiltroKeyReleased
        String cadena = txt_Filtro.getText();
        if (cadena.isEmpty()) {
            objLista_Pais.Listar(modtabla);
        } else {
            objLista_Pais.Filtrar(modtabla, cadena);
        }
    }//GEN-LAST:event_txt_FiltroKeyReleased

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        new JDialog_Actualizar_País(null, true, objLista_Pais, "Editar", actual).setVisible(true);
        objLista_Pais.Listar(modtabla);
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void tbl_PaisesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_PaisesMouseClicked
        int pos = tbl_Paises.getSelectedRow();
        if (pos != -1) {
            String codigo = tbl_Paises.getValueAt(pos, 0).toString();
            actual = objLista_Pais.Buscar_Nodo_Codigo(codigo).getElemento();
        }
    }//GEN-LAST:event_tbl_PaisesMouseClicked

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int rpta = JOptionPane.showConfirmDialog(this, "Desea eliminar", "Eliminacion", JOptionPane.YES_NO_OPTION);
        if (rpta == JOptionPane.YES_OPTION) {
            objLista_Pais.Eliminar(actual.getCodigo());
            objLista_Pais.Listar(modtabla);
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Paises;
    private javax.swing.JTextField txt_Filtro;
    // End of variables declaration//GEN-END:variables
}
