
package vista;

import arreglo.Nodo;
import arreglo.grafo;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import modelo.Enlace;
import modelo.usuario;


public class JFrame_principal extends javax.swing.JFrame {
    DefaultComboBoxModel ModOrigen = new  DefaultComboBoxModel();
    DefaultComboBoxModel ModDestino = new  DefaultComboBoxModel();
    DefaultComboBoxModel Modconsulta = new  DefaultComboBoxModel();
    DefaultListModel modlista = new DefaultListModel();
    grafo objgrafo = new grafo();

    public JFrame_principal() {
        initComponents();
        btn_editar.setEnabled(false);
        cbo_origien.setModel(ModOrigen);
        cbo_destino.setModel(ModDestino);
         cbo_consulta.setModel(Modconsulta);
         ls_consulta.setModel(modlista);
    }
public void listar_combo(){
    
    ModDestino.removeAllElements();
    ModOrigen.removeAllElements();
    Modconsulta.removeAllElements();
    
    ArrayList<Nodo> Arista = objgrafo.getLista();
    for (int i = 0; i < Arista.size(); i++) {
        
        String nombre = Arista.get(i).getElemento().getTipo_conex();
        ModOrigen.addElement(nombre);
        ModDestino.addElement(nombre);
        Modconsulta.addElement(nombre);
        
        
    }


}
public void consultar(ArrayList<Enlace> getArista){

    for (int i = 0; i < getArista.size(); i++) {
        modlista.removeAllElements();
        Enlace arista = getArista.get(i);
        String enlace = arista.getEnlace().getElemento().getTipo_conex();
        int capacidad = arista.getCapacidad_almacenimiento();
        int litros_diarios = arista.getLitros_diarios();
        int nivel_actual = arista.getNivel_actual();
        modlista.addElement(enlace+" - "+capacidad+" - "+litros_diarios+" - "+nivel_actual);
         
    }



}
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_nombre_usuario = new javax.swing.JTextField();
        txt_numero_conex = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_tipo_conex = new javax.swing.JTextField();
        txt_monto_usuario = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_editar_enlace = new javax.swing.JButton();
        btn_eliminar_enlace = new javax.swing.JButton();
        btn_registrar_enlace = new javax.swing.JButton();
        txt_litro_diario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_capacidad_litros = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_nivel_actual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbo_origien = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbo_destino = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btn_consulta = new javax.swing.JButton();
        cbo_consulta = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ls_consulta = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("nombre:");

        jLabel2.setText("N°comex:");

        jLabel3.setText("tipo_conex:");

        jLabel4.setText("monto:");

        btn_registrar.setText("registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_editar.setText("editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        jButton1.setText("presiona editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("salir editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_tipo_conex, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_numero_conex, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_monto_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_numero_conex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_tipo_conex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_monto_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(9, 9, 9)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_editar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_editar_enlace.setText("editar");
        btn_editar_enlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_enlaceActionPerformed(evt);
            }
        });

        btn_eliminar_enlace.setText("eliminar");
        btn_eliminar_enlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_enlaceActionPerformed(evt);
            }
        });

        btn_registrar_enlace.setText("registrar");
        btn_registrar_enlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_enlaceActionPerformed(evt);
            }
        });

        txt_litro_diario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_litro_diarioActionPerformed(evt);
            }
        });

        jLabel5.setText("Litros_diario:");

        jLabel6.setText("capacidad:");

        jLabel7.setText("nivel_actual:");

        cbo_origien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_origienMouseClicked(evt);
            }
        });
        cbo_origien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_origienActionPerformed(evt);
            }
        });

        jLabel8.setText("orgien:");

        cbo_destino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_destinoMouseClicked(evt);
            }
        });

        jLabel9.setText("destino:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btn_registrar_enlace)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editar_enlace, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar_enlace, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_capacidad_litros, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_litro_diario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nivel_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_origien, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_origien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_litro_diario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_capacidad_litros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nivel_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar_enlace)
                    .addComponent(btn_eliminar_enlace)
                    .addComponent(btn_registrar_enlace))
                .addContainerGap())
        );

        btn_consulta.setText("consulta");
        btn_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(ls_consulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(btn_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(85, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cbo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btn_consulta)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_litro_diarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_litro_diarioActionPerformed
        
    }//GEN-LAST:event_txt_litro_diarioActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
       String nombre = txt_nombre_usuario.getText();
       int numero_conexion = Integer.parseInt(txt_numero_conex.getText());
       String tipo_conexion = txt_tipo_conex.getText();
       int monto = Integer.parseInt(txt_monto_usuario.getText());
       usuario dato= new usuario(nombre, numero_conexion, tipo_conexion, monto);
  
  
   
   objgrafo.agregar_nodo(dato);
   Nodo insertar= objgrafo.insertar(dato, objgrafo.getRaiz());
   objgrafo.setRaiz(insertar);
   objgrafo.listar(jTable1);
   listar_combo();
//puedo registrar pero no se como hacer que al momento de registrar se pueda listar con el metodo de raiz de profundidad que hice
//si coloco el listar me sale un error que no lista.
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
       String nombre = txt_nombre_usuario.getText();
        int numero_conexion = Integer.parseInt(txt_numero_conex.getText());
       String tipo_conexion = txt_tipo_conex.getText();
       int monto = Integer.parseInt(txt_monto_usuario.getText());
       usuario dato= new usuario(nombre, numero_conexion, tipo_conexion, monto);
        objgrafo.eliminar_nodo(tipo_conexion);
        
       
        objgrafo.agregar_nodo(dato);
         listar_combo();
    
       
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
     String nombre = txt_tipo_conex.getText();
    objgrafo.eliminar_nodo(nombre);
    txt_nombre_usuario.setText("");
    txt_numero_conex.setText("");
    txt_tipo_conex.setText("");
    txt_monto_usuario.setText("");
      listar_combo();
      
    
        
       
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_registrar_enlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_enlaceActionPerformed
      String origen = cbo_origien.getSelectedItem().toString();
      String destino = cbo_destino.getSelectedItem().toString();
      int litros_diarios = Integer.parseInt(txt_litro_diario.getText());
      int capacidad = Integer.parseInt(txt_capacidad_litros.getText());
      int nivel_actual = Integer.parseInt(txt_nivel_actual.getText());
      objgrafo.agregar_conexion(origen, destino, litros_diarios, capacidad, nivel_actual);
      
    }//GEN-LAST:event_btn_registrar_enlaceActionPerformed

    private void btn_editar_enlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_enlaceActionPerformed
      String origen = cbo_origien.getSelectedItem().toString();
      String destino = cbo_destino.getSelectedItem().toString();
        int litros_diarios = Integer.parseInt(txt_litro_diario.getText());
      int capacidad = Integer.parseInt(txt_capacidad_litros.getText());
      int nivel_actual = Integer.parseInt(txt_nivel_actual.getText());
        objgrafo.eliminar_conexion(origen, destino);
        objgrafo.agregar_conexion(origen, destino, litros_diarios, capacidad, nivel_actual);
    }//GEN-LAST:event_btn_editar_enlaceActionPerformed

    private void btn_eliminar_enlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_enlaceActionPerformed
       String origen = cbo_origien.getSelectedItem().toString();
      String destino = cbo_destino.getSelectedItem().toString();
      objgrafo.eliminar_conexion(origen, destino);
      txt_capacidad_litros.setText("");
      txt_litro_diario.setText("");
      txt_nivel_actual.setText("");
      listar_combo();
      modlista.removeAllElements();
    }//GEN-LAST:event_btn_eliminar_enlaceActionPerformed

    private void btn_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaActionPerformed
       String consulta = cbo_consulta.getSelectedItem().toString();
       Nodo buscado = objgrafo.buscar_nodo(consulta);
        if (buscado!=null) {
            consultar(buscado.getArista());
        }
    }//GEN-LAST:event_btn_consultaActionPerformed

    private void cbo_origienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_origienActionPerformed
        
    }//GEN-LAST:event_cbo_origienActionPerformed

    private void cbo_origienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_origienMouseClicked
       String origen = cbo_origien.getSelectedItem().toString();
       Nodo buscado = objgrafo.buscar_nodo(origen);
        if (buscado!=null) {
            txt_nombre_usuario.setText(buscado.getElemento().getNombre());
            txt_numero_conex.setText(buscado.getElemento().getNumero_conexion()+"");
            txt_tipo_conex.setText(buscado.getElemento().getTipo_conex());
            txt_monto_usuario.setText(buscado.getElemento().getMonto_facturado()+"");
        }
    }//GEN-LAST:event_cbo_origienMouseClicked

    private void cbo_destinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_destinoMouseClicked
     String origen = cbo_destino.getSelectedItem().toString();
       Nodo buscado = objgrafo.buscar_nodo(origen);
        if (buscado!=null) {
            txt_nombre_usuario.setText(buscado.getElemento().getNombre());
            txt_numero_conex.setText(buscado.getElemento().getNumero_conexion()+"");
            txt_tipo_conex.setText(buscado.getElemento().getTipo_conex());
            txt_monto_usuario.setText(buscado.getElemento().getMonto_facturado()+"");
        }
    }//GEN-LAST:event_cbo_destinoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       txt_tipo_conex.setEnabled(false);
       btn_editar.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           txt_tipo_conex.setEnabled(true);
            btn_editar.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consulta;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_editar_enlace;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_eliminar_enlace;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_registrar_enlace;
    private javax.swing.JComboBox<String> cbo_consulta;
    private javax.swing.JComboBox<String> cbo_destino;
    private javax.swing.JComboBox<String> cbo_origien;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> ls_consulta;
    private javax.swing.JTextField txt_capacidad_litros;
    private javax.swing.JTextField txt_litro_diario;
    private javax.swing.JTextField txt_monto_usuario;
    private javax.swing.JTextField txt_nivel_actual;
    private javax.swing.JTextField txt_nombre_usuario;
    private javax.swing.JTextField txt_numero_conex;
    private javax.swing.JTextField txt_tipo_conex;
    // End of variables declaration//GEN-END:variables
}
