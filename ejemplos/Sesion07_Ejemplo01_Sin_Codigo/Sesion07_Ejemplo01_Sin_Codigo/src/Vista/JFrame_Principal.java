package Vista;

import Control.Lista_Paquete;
import Modelo.Paquete;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrame_Principal extends javax.swing.JFrame 
{
    private Lista_Paquete objPila1  = new Lista_Paquete();
    private Lista_Paquete objPila2  = new Lista_Paquete();
    private DefaultTableModel modTabla1,modTabla2;
   private int i=0;
    public JFrame_Principal() 
    {
        initComponents();
        modTabla1 = (DefaultTableModel) tbl_Pila1.getModel();
        modTabla2= (DefaultTableModel) tbl_Pila2.getModel();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Descripcion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        spn_Peso = new javax.swing.JSpinner();
        btn_Agregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Pila1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txt_Acumulado1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_Desapilar = new javax.swing.JButton();
        btn_Decapitar = new javax.swing.JButton();
        btn_Cima = new javax.swing.JButton();
        btn_EliminarPila = new javax.swing.JButton();
        btn_Extraer = new javax.swing.JButton();
        txt_extraer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Maximo1 = new javax.swing.JTextField();
        btn_Transferir_1_a_2 = new javax.swing.JButton();
        btn_Transferir_2_a_1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_Maximo2 = new javax.swing.JTextField();
        txt_Acumulado2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_Pila2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Descripción:");

        txt_Descripcion.setColumns(20);
        txt_Descripcion.setRows(5);
        jScrollPane1.setViewportView(txt_Descripcion);

        jLabel2.setText("Peso:");

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spn_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Agregar))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spn_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Agregar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tbl_Pila1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Peso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_Pila1);
        if (tbl_Pila1.getColumnModel().getColumnCount() > 0) {
            tbl_Pila1.getColumnModel().getColumn(0).setResizable(false);
            tbl_Pila1.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_Pila1.getColumnModel().getColumn(1).setResizable(false);
            tbl_Pila1.getColumnModel().getColumn(1).setPreferredWidth(400);
            tbl_Pila1.getColumnModel().getColumn(2).setResizable(false);
            tbl_Pila1.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jLabel3.setText("Peso Acumulado:");

        txt_Acumulado1.setEditable(false);
        txt_Acumulado1.setBackground(new java.awt.Color(204, 204, 204));
        txt_Acumulado1.setText("0");

        jPanel2.setLayout(new java.awt.GridLayout(3, 2, 5, 5));

        btn_Desapilar.setText("Desapilar");
        btn_Desapilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DesapilarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Desapilar);

        btn_Decapitar.setText("Decapitar");
        btn_Decapitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DecapitarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Decapitar);

        btn_Cima.setText("Cima");
        btn_Cima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CimaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Cima);

        btn_EliminarPila.setText("Eliminar Pila");
        btn_EliminarPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarPilaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_EliminarPila);

        btn_Extraer.setText("Extraer");
        btn_Extraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExtraerActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Extraer);
        jPanel2.add(txt_extraer);

        jLabel4.setText("Peso Máximo:");

        txt_Maximo1.setEditable(false);
        txt_Maximo1.setBackground(new java.awt.Color(204, 204, 204));
        txt_Maximo1.setText("200");

        btn_Transferir_1_a_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-chevron-abajo-en-círculo-35.png"))); // NOI18N
        btn_Transferir_1_a_2.setText("Transferir de 1 a 2");
        btn_Transferir_1_a_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Transferir_1_a_2ActionPerformed(evt);
            }
        });

        btn_Transferir_2_a_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-flecha-arriba-35.png"))); // NOI18N
        btn_Transferir_2_a_1.setText("Transferir de 2 a 1");
        btn_Transferir_2_a_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Transferir_2_a_1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Peso Acumulado:");

        txt_Maximo2.setEditable(false);
        txt_Maximo2.setBackground(new java.awt.Color(204, 204, 204));
        txt_Maximo2.setText("200");

        txt_Acumulado2.setEditable(false);
        txt_Acumulado2.setBackground(new java.awt.Color(204, 204, 204));
        txt_Acumulado2.setText("0");

        tbl_Pila2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Peso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbl_Pila2);
        if (tbl_Pila2.getColumnModel().getColumnCount() > 0) {
            tbl_Pila2.getColumnModel().getColumn(0).setResizable(false);
            tbl_Pila2.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_Pila2.getColumnModel().getColumn(1).setResizable(false);
            tbl_Pila2.getColumnModel().getColumn(1).setPreferredWidth(400);
            tbl_Pila2.getColumnModel().getColumn(2).setResizable(false);
            tbl_Pila2.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jLabel6.setText("Peso Máximo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_Transferir_1_a_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Transferir_2_a_1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_Acumulado1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_Maximo1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_Acumulado2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_Maximo2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Maximo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Acumulado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Transferir_1_a_2)
                    .addComponent(btn_Transferir_2_a_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Maximo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Acumulado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
      int codigo=i+1; 
        i++;
     //   int codigo = objPila1.CantidadElementos()+1;
        String descripcion = txt_Descripcion.getText();
     double peso = Double.parseDouble(spn_Peso.getValue().toString());
     Paquete elemento = new Paquete(codigo, descripcion, peso);
     objPila1.apilar(elemento);
      objPila1.RecorrerFila(modTabla1);
      txt_Descripcion.setText("");
      spn_Peso.setValue(0);
      
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_DesapilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DesapilarActionPerformed
      
     Paquete elemento = objPila1.desapilar();
    if(elemento!=null){
    
       txt_Descripcion.setText(elemento.getDescripcion());
       spn_Peso.setValue(elemento.getCodigo());     
    }
    objPila1.RecorrerFila(modTabla1);
    
    }//GEN-LAST:event_btn_DesapilarActionPerformed

    private void btn_DecapitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DecapitarActionPerformed
        objPila1.decapitar();
        objPila1.RecorrerFila(modTabla1);
    }//GEN-LAST:event_btn_DecapitarActionPerformed

    private void btn_CimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CimaActionPerformed
Paquete elemento = objPila1.desapilar();
    if(elemento!=null){
    
     String mensaje = "Descripcion:"+elemento.getDescripcion()+ 
             "\n"+"\n"+
             "Peso:"+    elemento.getPeso();     
        JOptionPane.showMessageDialog(this, mensaje);
    }
    
    
    }//GEN-LAST:event_btn_CimaActionPerformed

    private void btn_EliminarPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarPilaActionPerformed
  objPila1.EliminarPila();
    }//GEN-LAST:event_btn_EliminarPilaActionPerformed

    private void btn_ExtraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExtraerActionPerformed
   
    }//GEN-LAST:event_btn_ExtraerActionPerformed

    private void btn_Transferir_1_a_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Transferir_1_a_2ActionPerformed
 Paquete elemento1 = objPila1.desapilar();
 if(elemento1!=null){
 
 objPila2.apilar(elemento1);
 objPila1.RecorrerFila(modTabla1);
 objPila1.CantidadElementos();
 objPila2.RecorrerFila(modTabla2);
     
 }
 
         
    }//GEN-LAST:event_btn_Transferir_1_a_2ActionPerformed

    private void btn_Transferir_2_a_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Transferir_2_a_1ActionPerformed
     Paquete elemento2 = objPila2.desapilar();
 if(elemento2!=null){
 
 objPila1.apilar(elemento2);
 objPila1.RecorrerFila(modTabla1);
 objPila2.RecorrerFila(modTabla2);
     
 }
 
    }//GEN-LAST:event_btn_Transferir_2_a_1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Cima;
    private javax.swing.JButton btn_Decapitar;
    private javax.swing.JButton btn_Desapilar;
    private javax.swing.JButton btn_EliminarPila;
    private javax.swing.JButton btn_Extraer;
    private javax.swing.JButton btn_Transferir_1_a_2;
    private javax.swing.JButton btn_Transferir_2_a_1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner spn_Peso;
    private javax.swing.JTable tbl_Pila1;
    private javax.swing.JTable tbl_Pila2;
    private javax.swing.JTextField txt_Acumulado1;
    private javax.swing.JTextField txt_Acumulado2;
    private javax.swing.JTextArea txt_Descripcion;
    private javax.swing.JTextField txt_Maximo1;
    private javax.swing.JTextField txt_Maximo2;
    private javax.swing.JTextField txt_extraer;
    // End of variables declaration//GEN-END:variables
}
