package Vista;

import Control.Lista_Ciudad;
import Control.Lista_Pais;
import Modelo.Ciudad;
import Modelo.Pais;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JDialog_Ciudad extends javax.swing.JDialog {

    Lista_Pais objLista_Pais;
    Lista_Ciudad objLista_Ciudad;
    DefaultTableModel modtabla;
    Ciudad actual;

    public JDialog_Ciudad(java.awt.Frame parent, boolean modal, Lista_Pais objlista_Pais, Lista_Ciudad objlista_Ciudad) {
        super(parent, modal);
        initComponents();
        objLista_Pais = objlista_Pais;
        objLista_Ciudad = objlista_Ciudad;
        modtabla = (DefaultTableModel) tbl_ciudades.getModel();
        objLista_Ciudad.Listar(modtabla);
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_Filtro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_ciudades = new javax.swing.JTable();
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

        tbl_ciudades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Ciudad", "País"
            }
        ));
        tbl_ciudades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ciudadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_ciudades);

        jPanel1.setLayout(new java.awt.GridLayout(3, 0, 0, 10));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(txt_Filtro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_Filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        new JDialog_Actualizar_Ciudad(null, true, objLista_Ciudad, objLista_Pais, "Agregar", actual).setVisible(true);
        objLista_Ciudad.Listar(modtabla);
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        new JDialog_Actualizar_Ciudad(null, true, objLista_Ciudad, objLista_Pais, "Editar", actual).setVisible(true);
        objLista_Ciudad.Listar(modtabla);
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int pos = tbl_ciudades.getSelectedRow();
        int rpta = JOptionPane.showConfirmDialog(this, "Desea eliminar", "Eliminacion", JOptionPane.YES_NO_OPTION);
        if (rpta == JOptionPane.YES_OPTION) {
            Pais aux = objLista_Pais.Buscar_Nodo_Nombre(tbl_ciudades.getValueAt(pos, 2).toString()).getElemento();
            Lista_Ciudad lst = objLista_Pais.Buscar_Nodo_Nombre(aux.getNombre()).getElemento().getLst_ciudad();
            lst.Eliminar(actual.getNombre());
            objLista_Ciudad.Eliminar(actual.getNombre());
            objLista_Ciudad.Listar(modtabla);
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void tbl_ciudadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ciudadesMouseClicked
        int pos = tbl_ciudades.getSelectedRow();
        actual = objLista_Ciudad.Buscar_Nodo_Codigo(tbl_ciudades.getValueAt(pos, 0).toString()).getElemento();
    }//GEN-LAST:event_tbl_ciudadesMouseClicked

    private void txt_FiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FiltroKeyReleased
        String cadena = txt_Filtro.getText();
        if (cadena.isEmpty()) {
            objLista_Ciudad.Listar(modtabla);
        } else {
            objLista_Ciudad.Filtrar(modtabla, cadena);
        }
    }//GEN-LAST:event_txt_FiltroKeyReleased

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
    private javax.swing.JTable tbl_ciudades;
    private javax.swing.JTextField txt_Filtro;
    // End of variables declaration//GEN-END:variables
}
