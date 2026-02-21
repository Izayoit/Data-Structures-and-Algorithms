package Vista;

import Control.Lista_Ciudad;
import Control.Lista_Pais;
import Modelo.Ciudad;
import Modelo.Pais;
import javax.swing.JOptionPane;

public class JDialog_Actualizar_Ciudad extends javax.swing.JDialog {

    Lista_Ciudad objLista_Ciudad_general, objCiudadactual;
    Lista_Pais objLista_Pais;

    String modo;

    Pais paisactual;

    Ciudad actual;

    public JDialog_Actualizar_Ciudad(java.awt.Frame parent, boolean modal, Lista_Ciudad objlista_Ciudad,
            Lista_Pais objlista_Pais, String modo, Ciudad actual) {
        super(parent, modal);
        initComponents();
        objLista_Ciudad_general = objlista_Ciudad;

        //
        objLista_Pais = objlista_Pais;
        objLista_Pais.Listar_Combo(cbo_Pais);
        paisactual = objLista_Pais.Buscar_Nodo_Nombre(cbo_Pais.getSelectedItem().toString()).getElemento();

        objCiudadactual = paisactual.getLst_ciudad();
        //
        this.modo = modo;
        this.actual = actual;
        if (modo.equals("Editar") && actual != null) {
            txt_Codigo.setText(actual.getCodigo());
            txt_Ciudad.setText(actual.getNombre());
            objCiudadactual = objLista_Pais.Buscar_Nodo_Nombre(cbo_Pais.getSelectedItem().toString()).getElemento().getLst_ciudad();
        }
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_Codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Ciudad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbo_Pais = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btn_Aceptar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Código:");

        jLabel2.setText("Ciudad:");

        jLabel3.setText("País:");

        cbo_Pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_PaisActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btn_Aceptar.setText("Aceptar");
        btn_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Aceptar);

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cancelar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_Ciudad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbo_Pais, javax.swing.GroupLayout.Alignment.LEADING, 0, 132, Short.MAX_VALUE)
                            .addComponent(txt_Codigo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbo_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AceptarActionPerformed
        try {
            String codigo = txt_Codigo.getText();
            String ciudad = txt_Ciudad.getText();
            String pais = cbo_Pais.getSelectedItem().toString();
            Object[] arreglo = new Object[]{codigo, ciudad, pais};
            switch (modo) {
                case "Agregar":
                    Ciudad elemento = new Ciudad(arreglo);
                    objLista_Ciudad_general.Agregar(elemento);
                    objCiudadactual.Agregar(elemento);
                    break;
                case "Editar":

                    Pais aux = objLista_Pais.Buscar_Nodo_Nombre(paisactual.getNombre()).getElemento();
                    actual.setCodigo(codigo);
                    actual.setNombre(ciudad);
                    aux.setnombre(pais);
                    break;
            }
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ingrese Correctamente los datos: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_AceptarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void cbo_PaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_PaisActionPerformed
        objCiudadactual = objLista_Pais.Buscar_Nodo_Nombre(cbo_Pais.getSelectedItem().toString()).getElemento().getLst_ciudad();
    }//GEN-LAST:event_cbo_PaisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Aceptar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JComboBox<String> cbo_Pais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Ciudad;
    private javax.swing.JTextField txt_Codigo;
    // End of variables declaration//GEN-END:variables
}
