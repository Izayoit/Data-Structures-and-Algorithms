package Vista;

import Control.Cola_Vuelo;
import Control.Lista_Cliente;
import Control.Pila_Boleto;
import Modelo.Boleto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JDialog_Boletos extends javax.swing.JDialog {

    Lista_Cliente objLista_Cliente;
    Cola_Vuelo objCola_Vuelo;
    Pila_Boleto objPila_Boleto;
    DefaultTableModel modtabla;
    Boleto actual;

    public JDialog_Boletos(java.awt.Frame parent, boolean modal, Lista_Cliente objlistaCliente, Cola_Vuelo objlistavuelo, Pila_Boleto objlistaboleto) {
        super(parent, modal);
        initComponents();
        modtabla = (DefaultTableModel) tbl_boletos.getModel();
        objLista_Cliente = objlistaCliente;
        objCola_Vuelo = objlistavuelo;
        objPila_Boleto = objlistaboleto;

        setLocationRelativeTo(this);

        objPila_Boleto.Listar(modtabla);
    }

    private void actualizarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tbl_boletos.getModel();
        modelo.setRowCount(0);
        objPila_Boleto.Listar(modtabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_filtro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_boletos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_agregarBoletos = new javax.swing.JButton();
        btn_editar_Boletos = new javax.swing.JButton();
        btn_eliminar_Boletos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Filtrar:");

        txt_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroKeyReleased(evt);
            }
        });

        tbl_boletos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N° Boleto", "Fecha", "Hora", "Vuelo", "Cliente", "N° Asiento"
            }
        ));
        tbl_boletos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_boletosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_boletos);

        jPanel1.setLayout(new java.awt.GridLayout(3, 0, 0, 10));

        btn_agregarBoletos.setText("Agregar");
        btn_agregarBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarBoletosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregarBoletos);

        btn_editar_Boletos.setText("Editar");
        btn_editar_Boletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_BoletosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_editar_Boletos);

        btn_eliminar_Boletos.setText("Eliminar");
        btn_eliminar_Boletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_BoletosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar_Boletos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_filtro))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarBoletosActionPerformed
        new JDialog_Actualizar_Boleto(null, true, objPila_Boleto, objLista_Cliente, objCola_Vuelo, "Agregar", actual).setVisible(true);
        objPila_Boleto.Listar(modtabla);
    }//GEN-LAST:event_btn_agregarBoletosActionPerformed

    private void btn_eliminar_BoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_BoletosActionPerformed
        int rpta = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el boleto?", "Eliminación", JOptionPane.YES_NO_OPTION);
        if (rpta == JOptionPane.YES_OPTION) {
            objPila_Boleto.Eliminar(actual.getNum_boleto());
            objPila_Boleto.Listar(modtabla);
            actualizarTabla();
        }
    }//GEN-LAST:event_btn_eliminar_BoletosActionPerformed

    private void btn_editar_BoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_BoletosActionPerformed
        new JDialog_Actualizar_Boleto(null, true, objPila_Boleto, objLista_Cliente, objCola_Vuelo, "Editar", actual).setVisible(true);
        objPila_Boleto.Listar(modtabla);
    }//GEN-LAST:event_btn_editar_BoletosActionPerformed

    private void tbl_boletosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_boletosMouseClicked
        int pos = tbl_boletos.getSelectedRow();
        actual = objPila_Boleto.Buscar_Nodo_NumBoleto(Integer.parseInt(tbl_boletos.getValueAt(pos, 0).toString())).getElemento();
    }//GEN-LAST:event_tbl_boletosMouseClicked

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased
        String cadena = txt_filtro.getText();
        if (cadena.isEmpty()) {
            objPila_Boleto.Listar(modtabla);
        } else {
            objPila_Boleto.filtrar(modtabla, cadena);
        }
    }//GEN-LAST:event_txt_filtroKeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarBoletos;
    private javax.swing.JButton btn_editar_Boletos;
    private javax.swing.JButton btn_eliminar_Boletos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_boletos;
    private javax.swing.JTextField txt_filtro;
    // End of variables declaration//GEN-END:variables
}
