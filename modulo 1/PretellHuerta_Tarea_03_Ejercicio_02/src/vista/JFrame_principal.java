
package vista;

import control.almacen;
import control.producto;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import modelo.Arreglo_almacen;
import modelo.Arreglo_producto;


public class JFrame_principal extends javax.swing.JFrame {
Arreglo_almacen objArregloAlmacen = new Arreglo_almacen();
Arreglo_producto objArregloProducto = new Arreglo_producto();
    
    public JFrame_principal() {
        initComponents();
        objArregloAlmacen.lista(tbl_almacen);
        objArregloProducto.lista(tbl_productos);
           rbt_menor.setEnabled(false);
        rbt_igual.setEnabled(false);
        rbt_mayor.setEnabled(false);
        rbt_ninguno.setEnabled(false);
        
        
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_productos = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        btn_eliminarProd = new javax.swing.JButton();
        btn_editarProd = new javax.swing.JButton();
        cbo_productos = new javax.swing.JComboBox<>();
        txt_stockelegir = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbt_menor = new javax.swing.JRadioButton();
        rbt_igual = new javax.swing.JRadioButton();
        rbt_mayor = new javax.swing.JRadioButton();
        rbt_ninguno = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cbo_AlmacenAsign = new javax.swing.JComboBox<>();
        txt_NomProduct = new javax.swing.JTextField();
        txt_codigoProd = new javax.swing.JTextField();
        txt_marcaProd = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spn_stockProd = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_NomAlma = new javax.swing.JTextField();
        txt_DirecAlma = new javax.swing.JTextField();
        txt_CantAlma = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_registrarProduc = new javax.swing.JButton();
        btn_registrarAlma = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_almacen = new javax.swing.JTable();
        btn_eliminarAlma = new javax.swing.JButton();
        btn_editarAlma = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_productos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_productos);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("productos");

        btn_eliminarProd.setText("eliminar");
        btn_eliminarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarProdActionPerformed(evt);
            }
        });

        btn_editarProd.setText("editar");
        btn_editarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarProdActionPerformed(evt);
            }
        });

        cbo_productos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "marca", "stock" }));
        cbo_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_productosActionPerformed(evt);
            }
        });

        jLabel2.setText("stock:");

        buttonGroup1.add(rbt_menor);
        rbt_menor.setText("menor ");
        rbt_menor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_menorActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbt_igual);
        rbt_igual.setText("igual ");
        rbt_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_igualActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbt_mayor);
        rbt_mayor.setText("mayor");
        rbt_mayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_mayorActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbt_ninguno);
        rbt_ninguno.setText("ninguno");
        rbt_ninguno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_ningunoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("nota: colocar los nuevos datos en el principal y luego click en editar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel24))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btn_eliminarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_editarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_stockelegir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbo_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbt_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbt_menor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbt_mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbt_ninguno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(cbo_productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_stockelegir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbt_menor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbt_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(rbt_mayor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbt_ninguno)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_eliminarProd)
                    .addComponent(btn_editarProd))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(61, 61, 61))
        );

        jTabbedPane1.addTab("productos", jPanel5);

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setText("nombre:");

        jLabel20.setText("codigo");

        jLabel21.setText("marca:");

        cbo_AlmacenAsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_AlmacenAsignjComboBox1ActionPerformed(evt);
            }
        });

        jLabel22.setText("almacen:");

        jLabel1.setText("stock:");

        spn_stockProd.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spn_stockProd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spn_stockProd.setFocusCycleRoot(true);
        spn_stockProd.setInheritsPopupMenu(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel20)
                        .addComponent(jLabel19)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_marcaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_NomProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbo_AlmacenAsign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spn_stockProd, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txt_NomProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt_codigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txt_marcaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spn_stockProd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_AlmacenAsign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(16, 16, 16))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("nombre:");

        jLabel4.setText("direccion:");

        jLabel5.setText("Cantidad:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_NomAlma, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DirecAlma, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_CantAlma, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_NomAlma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_DirecAlma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_CantAlma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("almacen");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("productos");

        btn_registrarProduc.setText("registrar productos");
        btn_registrarProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarProducActionPerformed(evt);
            }
        });

        btn_registrarAlma.setText("registrar alamacen");
        btn_registrarAlma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarAlmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel8))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_registrarAlma, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(btn_registrarProduc, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrarProduc)
                    .addComponent(btn_registrarAlma))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("principal", jPanel9);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("almacen");

        tbl_almacen.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_almacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_almacenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_almacen);

        btn_eliminarAlma.setText("eliminar");
        btn_eliminarAlma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarAlmaActionPerformed(evt);
            }
        });

        btn_editarAlma.setText("editar");
        btn_editarAlma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarAlmaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("nota: colocar los nuevos datos en el principal y luego click en editar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_eliminarAlma, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editarAlma, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel7)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminarAlma)
                    .addComponent(btn_editarAlma))
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("almacen", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbo_AlmacenAsignjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_AlmacenAsignjComboBox1ActionPerformed

    }//GEN-LAST:event_cbo_AlmacenAsignjComboBox1ActionPerformed

    private void btn_registrarProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarProducActionPerformed
        String nombre = txt_NomProduct.getText();
        String codigoProducto= txt_codigoProd.getText();
        String marca = txt_marcaProd.getText();
        int stock = Integer.parseInt(spn_stockProd.getValue().toString());

        almacen seleccionar = (almacen)cbo_AlmacenAsign.getSelectedItem();
           producto dato1 = new producto(nombre, codigoProducto, marca, stock, seleccionar);
        objArregloProducto.registrar(dato1);
        String stock2 = txt_stockelegir.getText();
        objArregloProducto.BusquedaLineal(cbo_productos.getSelectedIndex(),stock2);
        
        objArregloProducto.lista(tbl_productos);

    }//GEN-LAST:event_btn_registrarProducActionPerformed

    private void btn_registrarAlmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarAlmaActionPerformed
        String nombre = txt_NomAlma.getText();
        String direccion = txt_DirecAlma.getText();
        int cantidad =Integer.parseInt(txt_CantAlma.getText());
        almacen dato = new almacen(nombre, direccion, cantidad);
        objArregloAlmacen.registrar(dato);
        objArregloAlmacen.lista(tbl_almacen);

        if(cbo_AlmacenAsign.getItemCount()<4){

            cbo_AlmacenAsign.addItem(dato);
        }

    }//GEN-LAST:event_btn_registrarAlmaActionPerformed

    private void btn_eliminarAlmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarAlmaActionPerformed
        int pos = tbl_almacen.getSelectedRow();
        objArregloAlmacen.eliminar(pos);
        
        objArregloAlmacen.lista(tbl_almacen);
      
       objArregloAlmacen.actualizarCombo(cbo_AlmacenAsign);  
    }//GEN-LAST:event_btn_eliminarAlmaActionPerformed

    private void btn_editarAlmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarAlmaActionPerformed
     
        
        int pos = tbl_almacen.getSelectedRow();
      String nombre = txt_NomAlma.getText();
        String direccion = txt_DirecAlma.getText();
        int cantidad =Integer.parseInt(txt_CantAlma.getText());
    
      almacen dato = new almacen(nombre, direccion, cantidad);
      
      objArregloAlmacen.editar(dato, pos);
      
      objArregloAlmacen.lista(tbl_almacen);
      
       objArregloAlmacen.actualizarCombo(cbo_AlmacenAsign);

        
    }//GEN-LAST:event_btn_editarAlmaActionPerformed

    private void tbl_almacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_almacenMouseClicked
   
    }//GEN-LAST:event_tbl_almacenMouseClicked

    private void btn_editarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarProdActionPerformed
        int pos = tbl_productos.getSelectedRow();
        String nombre = txt_NomProduct.getText();
        String codigoProducto= txt_codigoProd.getText();
        String marca = txt_marcaProd.getText();
        int stock = Integer.parseInt(spn_stockProd.getValue().toString());
        almacen seleccionar = (almacen)cbo_AlmacenAsign.getSelectedItem();
        producto dato1 = new producto(nombre, codigoProducto, marca, stock, seleccionar);
        objArregloProducto.editar(dato1, pos);
        objArregloProducto.lista(tbl_productos);
        

    }//GEN-LAST:event_btn_editarProdActionPerformed

    private void btn_eliminarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarProdActionPerformed
        int pos = tbl_productos.getSelectedRow();
        objArregloProducto.eliminar(pos);
        objArregloProducto.lista(tbl_productos);
    }//GEN-LAST:event_btn_eliminarProdActionPerformed

    private void rbt_ningunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_ningunoActionPerformed
        objArregloProducto.lista(tbl_productos);
    }//GEN-LAST:event_rbt_ningunoActionPerformed

    private void rbt_mayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_mayorActionPerformed
        int dato = Integer.parseInt(txt_stockelegir.getText());

        objArregloProducto.mayor(tbl_productos,dato );
    }//GEN-LAST:event_rbt_mayorActionPerformed

    private void rbt_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_igualActionPerformed
        int dato = Integer.parseInt(txt_stockelegir.getText());

        objArregloProducto.igual(tbl_productos,dato );

    }//GEN-LAST:event_rbt_igualActionPerformed

    private void rbt_menorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_menorActionPerformed
        int dato = Integer.parseInt(txt_stockelegir.getText());

        objArregloProducto.menor(tbl_productos,dato );
    }//GEN-LAST:event_rbt_menorActionPerformed

    private void cbo_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_productosActionPerformed

     String stock2 = txt_stockelegir.getText();
        objArregloProducto.BusquedaLineal(cbo_productos.getSelectedIndex(),stock2);
        objArregloProducto.lista(tbl_productos);
        int seleccion = cbo_productos.getSelectedIndex();
        
        if(seleccion==0){
            rbt_menor.setEnabled(false);
            rbt_igual.setEnabled(false);
            rbt_mayor.setEnabled(false);
            rbt_ninguno.setEnabled(false);

        }else{
            rbt_menor.setEnabled(true);
            rbt_igual.setEnabled(true);
            rbt_mayor.setEnabled(true);
            rbt_ninguno.setEnabled(true);
            JOptionPane.showMessageDialog(this, "escriba un numero");

        }

    }//GEN-LAST:event_cbo_productosActionPerformed

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
    private javax.swing.JButton btn_editarAlma;
    private javax.swing.JButton btn_editarProd;
    private javax.swing.JButton btn_eliminarAlma;
    private javax.swing.JButton btn_eliminarProd;
    private javax.swing.JButton btn_registrarAlma;
    private javax.swing.JButton btn_registrarProduc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<almacen> cbo_AlmacenAsign;
    private javax.swing.JComboBox<String> cbo_productos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbt_igual;
    private javax.swing.JRadioButton rbt_mayor;
    private javax.swing.JRadioButton rbt_menor;
    private javax.swing.JRadioButton rbt_ninguno;
    private javax.swing.JSpinner spn_stockProd;
    private javax.swing.JTable tbl_almacen;
    private javax.swing.JTable tbl_productos;
    private javax.swing.JTextField txt_CantAlma;
    private javax.swing.JTextField txt_DirecAlma;
    private javax.swing.JTextField txt_NomAlma;
    private javax.swing.JTextField txt_NomProduct;
    private javax.swing.JTextField txt_codigoProd;
    private javax.swing.JTextField txt_marcaProd;
    private javax.swing.JTextField txt_stockelegir;
    // End of variables declaration//GEN-END:variables
}
