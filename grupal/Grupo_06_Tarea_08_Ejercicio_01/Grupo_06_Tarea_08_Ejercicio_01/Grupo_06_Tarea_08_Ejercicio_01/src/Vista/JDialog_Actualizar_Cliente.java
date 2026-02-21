package Vista;

import Control.Lista_Cliente;
import Modelo.Cliente;
import javax.swing.JOptionPane;

public class JDialog_Actualizar_Cliente extends javax.swing.JDialog {

    Lista_Cliente objLista_Cliente;
    String modo;
    Cliente actual;

    public JDialog_Actualizar_Cliente(java.awt.Frame parent, boolean modal, Lista_Cliente objlista_Cliente, String modo, Cliente actual) {
        super(parent, modal);
        initComponents();
        objLista_Cliente = objlista_Cliente;
        this.modo = modo;
        this.actual = actual;
        if (modo.equals("Editar") && actual != null) {
            txt_Codigo.setText(actual.getCodigo());
            txt_Apellidos.setText(actual.getApellidos());
            txt_Nombres.setText(actual.getNombres());
            txt_Direccion.setText(actual.getDireccion());
            txt_Telefono.setText(actual.getTelefono());
            txt_Dni.setText(actual.getDni());
        }
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_Codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Apellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Nombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Direccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_Aceptar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_Dni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Código:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Nombres:");

        jLabel4.setText("Dirección:");

        jLabel5.setText("Teléfono:");

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

        jLabel6.setText("Dni:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Dni)
                            .addComponent(txt_Codigo)
                            .addComponent(txt_Apellidos)
                            .addComponent(txt_Nombres)
                            .addComponent(txt_Direccion)
                            .addComponent(txt_Telefono))))
                .addContainerGap())
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
                    .addComponent(txt_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AceptarActionPerformed
        try {
            String codigo = txt_Codigo.getText();
            String apellidos = txt_Apellidos.getText();
            String nombres = txt_Nombres.getText();
            String direccion = txt_Direccion.getText();
            String telefono = txt_Telefono.getText();
            String dni = txt_Dni.getText();
            Object[] arreglo = new Object[]{codigo, apellidos, nombres, direccion, telefono, dni};
            switch (modo) {
                case "Agregar":
                    Cliente elemento = new Cliente(arreglo);
                    objLista_Cliente.Agregar(elemento);
                    break;
                case "Editar":
                    actual.setCodigo(codigo);
                    actual.setApellidos(apellidos);
                    actual.setNombres(nombres);
                    actual.setDireccion(direccion);
                    actual.setTelefono(telefono);
                    actual.setDni(dni);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Aceptar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Apellidos;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Dni;
    private javax.swing.JTextField txt_Nombres;
    private javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables
}
