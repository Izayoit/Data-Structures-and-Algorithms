package vista;

import Arreglo.Grafo;
import Arreglo.Nodo;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.comunidad;
import modelo.enlace;

public class JFrame_principal extends javax.swing.JFrame {

    Grafo objGrafo = new Grafo();
    DefaultComboBoxModel modorigen = new DefaultComboBoxModel();
    DefaultComboBoxModel modDestino = new DefaultComboBoxModel();
    DefaultComboBoxModel modconsulta = new DefaultComboBoxModel();
    DefaultListModel modlista = new DefaultListModel();

    public JFrame_principal() {
        initComponents();
        cbo_destino.setModel(modDestino);
        cbo_origen.setModel(modorigen);
        cbo_consulta.setModel(modconsulta);
        ls_consulta.setModel(modlista);

    }

    public void Listar_combo() {

        modDestino.removeAllElements();
        modconsulta.removeAllElements();
        modorigen.removeAllElements();
        ArrayList<Nodo> lista = objGrafo.getLista();

        for (int i = 0; i < lista.size(); i++) {
            String nombre = lista.get(i).getElemento().getNombre();
            modDestino.addElement(nombre);
            modorigen.addElement(nombre);
            modconsulta.addElement(nombre);
        }

    }

    public void consultar(ArrayList<enlace> objarista) {
        modlista.removeAllElements();
        for (int i = 0; i < objarista.size(); i++) {

            enlace arista = objarista.get(i);
            String nombre = arista.getEnlace().getElemento().getNombre();
            int poblacion_actual = arista.getEnlace().getElemento().getPoblacion_acutal();
            modlista.addElement(nombre + " - " + poblacion_actual);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JTextField();
        txt_limite_poblacion = new javax.swing.JTextField();
        txt_poblacion_actual = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_editar_nodo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cbo_origen = new javax.swing.JComboBox<>();
        cbo_destino = new javax.swing.JComboBox<>();
        btn_eliminar_conexion = new javax.swing.JButton();
        btn_registrar_conexion = new javax.swing.JButton();
        txt_desplazamiento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_editar_conex = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ls_consulta = new javax.swing.JList<>();
        btn_consultar = new javax.swing.JButton();
        cbo_consulta = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        jLabel1.setText("nombre:");

        jLabel2.setText("limite_poblacion:");

        jLabel3.setText("poblacion_actual:");

        btn_editar_nodo.setText("editar");
        btn_editar_nodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_nodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_poblacion_actual, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_limite_poblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_editar_nodo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_limite_poblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_poblacion_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btn_eliminar))
                .addGap(18, 18, 18)
                .addComponent(btn_editar_nodo)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbo_origen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_origenMouseClicked(evt);
            }
        });
        cbo_origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_origenActionPerformed(evt);
            }
        });

        cbo_destino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_destinoMouseClicked(evt);
            }
        });
        cbo_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_destinoActionPerformed(evt);
            }
        });

        btn_eliminar_conexion.setText("eliminar conex");
        btn_eliminar_conexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_conexionActionPerformed(evt);
            }
        });

        btn_registrar_conexion.setText("registrar conex");
        btn_registrar_conexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_conexionActionPerformed(evt);
            }
        });

        jLabel4.setText("origen :");

        jLabel5.setText("destino:");

        jLabel6.setText("desplazamiento:");

        btn_editar_conex.setText("editar");
        btn_editar_conex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_conexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_registrar_conexion)
                .addGap(35, 35, 35)
                .addComponent(btn_eliminar_conexion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_desplazamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbo_origen, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btn_editar_conex, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_desplazamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar_conexion)
                    .addComponent(btn_registrar_conexion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_editar_conex)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ls_consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ls_consultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ls_consulta);

        btn_consultar.setText("consultar");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        cbo_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_consultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btn_consultar)
                        .addGap(18, 18, 18)
                        .addComponent(cbo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_consultar)
                    .addComponent(cbo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_datos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(338, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_consultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_consultaActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed

        String nombre = txt_nombre.getText();
        int limite_pobla = Integer.parseInt(txt_limite_poblacion.getText());
        int poblacion_actual = Integer.parseInt(txt_poblacion_actual.getText());

        comunidad dato = new comunidad(nombre, limite_pobla, poblacion_actual);

        objGrafo.Agregar_Nodo(dato);
        txt_nombre.setText("");
        txt_limite_poblacion.setText("");
        txt_poblacion_actual.setText("");
        txt_nombre.requestFocus();
        Listar_combo();
        objGrafo.listar(tbl_datos);
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        String nombre = txt_nombre.getText();
        objGrafo.eliminar_nodo(nombre);
        txt_nombre.setText("");
        txt_limite_poblacion.setText("");
        txt_poblacion_actual.setText("");
        txt_nombre.requestFocus();
        Listar_combo();
           objGrafo.listar(tbl_datos);
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_registrar_conexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_conexionActionPerformed

        String origen = cbo_origen.getSelectedItem().toString();
        String destino = cbo_destino.getSelectedItem().toString();
        int desplazamiento = Integer.parseInt(txt_desplazamiento.getText());

        // Intenta desplazar primero
        boolean exito = objGrafo.desplazarPoblacion(origen, destino, desplazamiento);

        if (exito) {
            objGrafo.Agregar_Conexion(origen, destino, desplazamiento);
            JOptionPane.showMessageDialog(null, "Conexión registrada y población desplazada.");
        } else {
            JOptionPane.showMessageDialog(null, "No se realizó la conexión porque el desplazamiento no fue posible.");
        }
   objGrafo.listar(tbl_datos);
    }//GEN-LAST:event_btn_registrar_conexionActionPerformed

    private void btn_eliminar_conexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_conexionActionPerformed
        String origen = cbo_origen.getSelectedItem().toString();
        String destino = cbo_destino.getSelectedItem().toString();
        objGrafo.eliminar_conexion(origen, destino);
           objGrafo.listar(tbl_datos);
    }//GEN-LAST:event_btn_eliminar_conexionActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        String nombre = cbo_consulta.getSelectedItem().toString();
        Nodo consultar = objGrafo.buscar_Nodo(nombre);
        if (consultar != null) {
            consultar(consultar.getArista());

        }

    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_editar_nodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_nodoActionPerformed

        String nombreOriginal = txt_nombre.getText();
        int limite = Integer.parseInt(txt_limite_poblacion.getText());
        int poblacion = Integer.parseInt(txt_poblacion_actual.getText());
        comunidad elemento = new comunidad(nombreOriginal, limite, poblacion);

        objGrafo.eliminar_nodo(nombreOriginal);
        objGrafo.Agregar_Nodo(elemento);

   objGrafo.listar(tbl_datos);
    }//GEN-LAST:event_btn_editar_nodoActionPerformed

    private void cbo_origenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_origenActionPerformed


    }//GEN-LAST:event_cbo_origenActionPerformed

    private void cbo_origenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_origenMouseClicked
        String nombre = cbo_origen.getSelectedItem().toString();
        Nodo nodo = objGrafo.buscar_Nodo(nombre);

        if (nodo != null) {
            comunidad com = nodo.getElemento();
            txt_nombre.setText(com.getNombre());
            txt_limite_poblacion.setText(String.valueOf(com.getLimite_poblacacion()));
            txt_poblacion_actual.setText(String.valueOf(com.getPoblacion_acutal()));
        }

    }//GEN-LAST:event_cbo_origenMouseClicked

    private void btn_editar_conexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_conexActionPerformed
        String origen = cbo_origen.getSelectedItem().toString();
        String destino = cbo_destino.getSelectedItem().toString();

        int nuevoDesplazamiento;
        try {
            nuevoDesplazamiento = Integer.parseInt(txt_desplazamiento.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Desplazamiento inválido");
            return;
        }
        objGrafo.eliminar_conexion(origen, destino);

        boolean exito = objGrafo.desplazarPoblacion(origen, destino, nuevoDesplazamiento);
        if (exito) {

            objGrafo.Agregar_Conexion(origen, destino, nuevoDesplazamiento);
            JOptionPane.showMessageDialog(null, "Conexión registrada y población desplazada.");
        } else {
            JOptionPane.showMessageDialog(null, "No se realizó la conexión porque el desplazamiento no fue posible.");
        }

        JOptionPane.showMessageDialog(null, "Conexión actualizada");
           objGrafo.listar(tbl_datos);
    }//GEN-LAST:event_btn_editar_conexActionPerformed

    private void ls_consultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ls_consultaMouseClicked

        String seleccion = (String) ls_consulta.getSelectedValue();
        if (seleccion != null) {
            String[] partes = seleccion.split(" - ");
            String destino = partes[0];
            String desplazamiento = partes[1];

            cbo_destino.setSelectedItem(destino);
            txt_desplazamiento.setText(desplazamiento);
        }

    }//GEN-LAST:event_ls_consultaMouseClicked

    private void cbo_destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_destinoActionPerformed

    }//GEN-LAST:event_cbo_destinoActionPerformed

    private void cbo_destinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_destinoMouseClicked
        String nombre = cbo_destino.getSelectedItem().toString();
        Nodo buscado = objGrafo.buscar_Nodo(nombre);
        if (buscado != null) {
            txt_nombre.setText(buscado.getElemento().getNombre());
            txt_limite_poblacion.setText(buscado.getElemento().getLimite_poblacacion() + "");
            txt_poblacion_actual.setText(buscado.getElemento().getPoblacion_acutal() + "");
        }
    }//GEN-LAST:event_cbo_destinoMouseClicked

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
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_editar_conex;
    private javax.swing.JButton btn_editar_nodo;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_eliminar_conexion;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_registrar_conexion;
    private javax.swing.JComboBox<String> cbo_consulta;
    private javax.swing.JComboBox<String> cbo_destino;
    private javax.swing.JComboBox<String> cbo_origen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> ls_consulta;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_desplazamiento;
    private javax.swing.JTextField txt_limite_poblacion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_poblacion_actual;
    // End of variables declaration//GEN-END:variables
}
