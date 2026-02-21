package Vista;

import Control.Cola_Vuelo;
import Control.Lista_Pais;
import Modelo.Vuelo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JDialog_Vuelo extends javax.swing.JDialog {

    Lista_Pais objLista_Pais;
    Vuelo actual;
    Cola_Vuelo cola;
    DefaultTableModel modtabla;

    public JDialog_Vuelo(java.awt.Frame parent, boolean modal, Lista_Pais objlista_Pais, Cola_Vuelo cola) {
        super(parent, modal);
        initComponents();
        objLista_Pais = objlista_Pais;
        this.cola = cola;
        modtabla = (DefaultTableModel) tbl_Vuelo.getModel();
        setLocationRelativeTo(this);
    }

    private void actualizarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_Vuelo.getModel();
        modelo.setRowCount(0);
        cola.RecorrerCola(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_Filtro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Vuelo = new javax.swing.JTable();
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

        tbl_Vuelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Hora", "País", "Ciudad", "Precio", "Capacidad"
            }
        ));
        tbl_Vuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_VueloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Vuelo);

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Filtro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        new JDialog_Actualizar_Vuelo(null, true, objLista_Pais, "Agregar", actual, cola).setVisible(true);
        cola.RecorrerCola(modtabla);
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        new JDialog_Actualizar_Vuelo(null, true, objLista_Pais, "Editar", actual, cola).setVisible(true);
        cola.RecorrerCola(modtabla);
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int rpta = JOptionPane.showConfirmDialog(this, "Desea eliminar", "Eliminacion", JOptionPane.YES_NO_OPTION);
        if (rpta == JOptionPane.YES_OPTION) {
            cola.Eliminar(actual.getCapacidad());
            cola.RecorrerCola(modtabla);
            actualizarTabla();
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void txt_FiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FiltroKeyReleased
        String cadena = txt_Filtro.getText();
        if (cadena.isEmpty()) {
            cola.RecorrerCola(modtabla);
        } else {
            cola.filtrar(modtabla, cadena);
        }
    }//GEN-LAST:event_txt_FiltroKeyReleased

    private void tbl_VueloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_VueloMouseClicked
        int pos = tbl_Vuelo.getSelectedRow();
        actual = cola.Buscar_Nodo_Capacidad(Integer.parseInt(tbl_Vuelo.getValueAt(pos, 5).toString())).getElemento();
    }//GEN-LAST:event_tbl_VueloMouseClicked

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
    private javax.swing.JTable tbl_Vuelo;
    private javax.swing.JTextField txt_Filtro;
    // End of variables declaration//GEN-END:variables
}
