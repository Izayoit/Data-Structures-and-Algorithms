package Vista;

import Control.Cola_Vuelo;
import Control.Lista_Cliente;
import Control.Pila_Boleto;
import Modelo.Boleto;
import Modelo.Cliente;
import Modelo.Vuelo;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

public class JDialog_Actualizar_Boleto extends javax.swing.JDialog {

    Pila_Boleto objLista_Boleto_General, objboletoactual;
    Lista_Cliente objLista_cliente;
    Cola_Vuelo objlista_Vuelo;
    String modo;
    Vuelo vueactual;
    Cliente clienteactual;
    Boleto boletoactual;

    public JDialog_Actualizar_Boleto(java.awt.Frame parent, boolean modal, Pila_Boleto objlista_boleto, Lista_Cliente objlista_Cliente,
            Cola_Vuelo cola, String modo, Boleto actual) {
        super(parent, modal);
        initComponents();
        this.objLista_Boleto_General = objlista_boleto;
        this.objLista_cliente = objlista_Cliente;
        this.objlista_Vuelo = cola;

        this.modo = modo;
        this.boletoactual = actual;

        objLista_cliente.Listar_Combo(cbo_cliente);
        objlista_Vuelo.Listar_Combo(cbo_vuelo);

        if (cbo_cliente.getItemCount() > 0) {
            cbo_cliente.setSelectedIndex(0);
            this.clienteactual = objLista_cliente.Buscar_NombreApellido(
                    cbo_cliente.getSelectedItem().toString()
            ).getElemento();
        }

        if (cbo_vuelo.getItemCount() > 0) {
            cbo_vuelo.setSelectedIndex(0);
            this.vueactual = objlista_Vuelo.Buscar_Nodo_Compuesto(
                    cbo_vuelo.getSelectedItem().toString()
            ).getElemento();
        }

        if (modo.equals("Editar") && boletoactual != null) {
            spn_numBoleto.setValue(boletoactual.getNum_boleto());
            spn_fecha.setValue(boletoactual.getFecha());
            spn_hora.setValue(boletoactual.getHora());
            spn_asiento.setValue(boletoactual.getNum_asiento());
            objboletoactual = objLista_cliente.Buscar_NombreApellido(cbo_cliente.getSelectedItem().toString()).getElemento().getLst_Boleto();
            objboletoactual = objlista_Vuelo.Buscar_Nodo_Compuesto(cbo_vuelo.getSelectedItem().toString()).getElemento().getLst_boletos();

        }

        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Date date = new Date();

        SpinnerDateModel sm = new SpinnerDateModel(date,null,null,Calendar.DAY_OF_YEAR);
        spn_fecha = new javax.swing.JSpinner(sm);
        jLabel2 = new javax.swing.JLabel();
        Date da = new Date();
        SpinnerDateModel dm = new SpinnerDateModel(da,null,null,Calendar.HOUR_OF_DAY);
        spn_hora = new javax.swing.JSpinner(dm);
        jLabel3 = new javax.swing.JLabel();
        cbo_vuelo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbo_cliente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_Aceptar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        spn_numBoleto = new javax.swing.JSpinner();
        spn_asiento = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Fecha:");

        JSpinner.DateEditor de = new JSpinner.DateEditor(spn_fecha,"dd/MM/yy");
        spn_fecha.setEditor(de);

        jLabel2.setText("Hora:");

        JSpinner.DateEditor de1 = new JSpinner.DateEditor(spn_hora, "HH:mm:ss");
        spn_hora.setEditor(de1);

        jLabel3.setText("vuelo");

        cbo_vuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_vueloActionPerformed(evt);
            }
        });

        jLabel4.setText("cliente");

        cbo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_clienteActionPerformed(evt);
            }
        });

        jLabel5.setText("asiento");

        jLabel6.setText("N°boleto");

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btn_Aceptar.setText("Aceptar");
        btn_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AceptarActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbo_cliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbo_vuelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spn_hora)
                                    .addComponent(spn_fecha)
                                    .addComponent(spn_numBoleto)
                                    .addComponent(spn_asiento)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spn_numBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spn_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spn_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbo_vuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spn_asiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Aceptar)
                    .addComponent(btn_Cancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AceptarActionPerformed
        try {
            int numBoleto = Integer.parseInt(spn_numBoleto.getValue().toString());
            Date fecha = (Date) spn_fecha.getValue();
            Date hora = (Date) spn_hora.getValue();
            Vuelo vuelo = (Vuelo) cbo_vuelo.getSelectedItem();
            Cliente cliente = (Cliente) cbo_cliente.getSelectedItem();
            int asiento = Integer.parseInt(spn_asiento.getValue().toString());

            switch (modo) {
                case "Agregar":
                    Boleto nuevo = new Boleto(numBoleto, fecha, hora, vuelo, cliente, asiento);
                    objLista_Boleto_General.Agregar(nuevo);
                    // Agregar también al vuelo actual y cliente actual
                    vuelo.getLst_boletos().Agregar(nuevo);
                    cliente.getLst_Boleto().Agregar(nuevo);
                    break;

                case "Editar":
                    boletoactual.setNum_boleto(numBoleto);
                    boletoactual.setFecha(fecha);
                    boletoactual.setHora(hora);
                    boletoactual.setObjVuelo(vuelo);
                    boletoactual.setObjCliente(cliente);
                    boletoactual.setNum_asiento(asiento);
                    break;
            }

            dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al procesar el boleto: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_AceptarActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void cbo_vueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_vueloActionPerformed
        objboletoactual = objlista_Vuelo.Buscar_Nodo_Compuesto(cbo_vuelo.getSelectedItem().toString()).getElemento().getLst_boletos();
    }//GEN-LAST:event_cbo_vueloActionPerformed

    private void cbo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_clienteActionPerformed

        objboletoactual = objLista_cliente.Buscar_NombreApellido(cbo_cliente.getSelectedItem().toString()).getElemento().getLst_Boleto();
    }//GEN-LAST:event_cbo_clienteActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Aceptar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JComboBox<Cliente> cbo_cliente;
    private javax.swing.JComboBox<Vuelo> cbo_vuelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spn_asiento;
    private javax.swing.JSpinner spn_fecha;
    private javax.swing.JSpinner spn_hora;
    private javax.swing.JSpinner spn_numBoleto;
    // End of variables declaration//GEN-END:variables
}
