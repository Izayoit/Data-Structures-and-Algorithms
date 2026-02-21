package Vista;

import Control.Cola_Vuelo;
import Control.Lista_Ciudad;
import Control.Lista_Pais;
import Modelo.Ciudad;
import Modelo.Pais;
import Modelo.Vuelo;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

public class JDialog_Actualizar_Vuelo extends javax.swing.JDialog {

    Lista_Pais objLista_Pais;
    Lista_Ciudad objLista_Ciudad;
    Pais paisactual;
    Ciudad ciuactual;
    String modo;
    Vuelo vueactual;
    Cola_Vuelo cola;

    public JDialog_Actualizar_Vuelo(java.awt.Frame parent, boolean modal, Lista_Pais objlista_Pais, String modo,
            Vuelo actual, Cola_Vuelo cola) {
        super(parent, modal);
        initComponents();
        objLista_Pais = objlista_Pais;
        objlista_Pais.Listar_Combo(cbo_pais);
        this.modo = modo;
        vueactual = actual;
        this.cola = cola;
        if (modo.equals("Editar") && vueactual != null) {
            spn_fecha.setValue(vueactual.getFecha());
            spn_hora.setValue(vueactual.getHora());
            ciuactual = objLista_Ciudad.Buscar_Nodo_Nombre(cbo_ciudad.getSelectedItem().toString()).getElemento();
            paisactual = objLista_Pais.Buscar_Nodo_Nombre(cbo_pais.getSelectedItem().toString()).getElemento();
            objLista_Ciudad = paisactual.getLst_ciudad();
            objLista_Ciudad.Listar_Combo(cbo_ciudad);
            spn_precio.setValue(vueactual.getPrecio());
            spn_cantidad.setValue(vueactual.getCapacidad());
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
        cbo_pais = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbo_ciudad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        spn_precio = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        spn_cantidad = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        btn_Aceptar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Fecha:");

        JSpinner.DateEditor de = new JSpinner.DateEditor(spn_fecha,"dd/MM/yy");
        spn_fecha.setEditor(de);

        jLabel2.setText("Hora:");

        JSpinner.DateEditor de1 = new JSpinner.DateEditor(spn_hora, "HH:mm:ss");
        spn_hora.setEditor(de1);

        jLabel3.setText("País:");

        cbo_pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_paisActionPerformed(evt);
            }
        });

        jLabel4.setText("Ciudad:");

        cbo_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ciudadActionPerformed(evt);
            }
        });

        jLabel5.setText("Precio:");

        spn_precio.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        jLabel6.setText("Capacidad:");

        spn_cantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spn_cantidad)
                            .addComponent(spn_precio)
                            .addComponent(cbo_ciudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbo_pais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spn_hora)
                            .addComponent(spn_fecha))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(cbo_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbo_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spn_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spn_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AceptarActionPerformed
        
        try {
             Date fecha = (Date) spn_fecha.getValue();
        Date hora = (Date) spn_hora.getValue();
        Pais pais = objLista_Pais.Buscar_Nodo_Nombre(cbo_pais.getSelectedItem().toString()).getElemento();
        Ciudad ciudad = objLista_Ciudad.Buscar_Nodo_Nombre(cbo_ciudad.getSelectedItem().toString()).getElemento();
        double precio = Double.parseDouble(spn_precio.getValue().toString());
        int capacidad = (int) spn_cantidad.getValue();
        Object[] arreglo = new Object[]{fecha, hora, pais, ciudad, precio, capacidad};
        switch (modo) {
            case "Agregar":
                Vuelo nuevo = new Vuelo(arreglo);
                cola.Insertar(nuevo);
                break;
            case "Editar":
                vueactual.setFecha(fecha);
                vueactual.setHora(hora);
                vueactual.setObjPais(pais);
                vueactual.setObjCiudad(ciudad);
                vueactual.setPrecio(precio);
                vueactual.setCapacidad(capacidad);
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

    private void cbo_paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_paisActionPerformed
        paisactual = objLista_Pais.Buscar_Nodo_Nombre(cbo_pais.getSelectedItem().toString()).getElemento();
        objLista_Ciudad = paisactual.getLst_ciudad();
        objLista_Ciudad.Listar_Combo(cbo_ciudad);
    }//GEN-LAST:event_cbo_paisActionPerformed

    private void cbo_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ciudadActionPerformed
        ciuactual = objLista_Ciudad.Buscar_Nodo_Nombre(cbo_ciudad.getSelectedItem().toString()).getElemento();
    }//GEN-LAST:event_cbo_ciudadActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Aceptar;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JComboBox<String> cbo_ciudad;
    private javax.swing.JComboBox<String> cbo_pais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spn_cantidad;
    private javax.swing.JSpinner spn_fecha;
    private javax.swing.JSpinner spn_hora;
    private javax.swing.JSpinner spn_precio;
    // End of variables declaration//GEN-END:variables
}
