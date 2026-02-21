
package vista;

import arreglo.Gestion_Choferes;
import arreglo.Gestion_Paraderos_Transportes;
import arreglo.Nodo_conductores;
import javax.swing.table.DefaultTableModel;
import modelo.Empresa_transportes;
import modelo.chofer_contratado;


public class JDialog_principal extends javax.swing.JDialog {
    DefaultTableModel modtablePrinci,modtable1,modtable2,modtable3;
    DefaultTableModel modtableprincipalVEhiculos,modtable1Vehi,modtable2Vehiculos,modtable3Vehiculos;
    Gestion_Choferes objlistarChoferesprincipal = new Gestion_Choferes();
    Gestion_Choferes pila1 = new Gestion_Choferes();
    Gestion_Choferes pila2= new Gestion_Choferes();
    Gestion_Choferes pila3 = new Gestion_Choferes();
    Gestion_Paraderos_Transportes objlistarParaderosTransportes= new Gestion_Paraderos_Transportes();
    
    Gestion_Paraderos_Transportes pila1Vehiculos= new Gestion_Paraderos_Transportes();
    Gestion_Paraderos_Transportes pila2Vehiculos= new Gestion_Paraderos_Transportes();
    Gestion_Paraderos_Transportes pila3Vehiculos= new Gestion_Paraderos_Transportes();
    Gestion_Paraderos_Transportes pila4Vehiculos= new Gestion_Paraderos_Transportes();
    public JDialog_principal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modtablePrinci=(DefaultTableModel)tbl_registrar_conductores.getModel();
        modtable1=(DefaultTableModel)tbl_conductores_camiones.getModel();
        modtable2=(DefaultTableModel)tbl_conductores_camionetas.getModel();
        modtable3= (DefaultTableModel)tbl_conductores_taxi.getModel();
        modtableprincipalVEhiculos = (DefaultTableModel)tbl_registrar_vehiculos.getModel();
        modtable1Vehi = (DefaultTableModel)tbl_caminoesVehiculos.getModel();
        modtable2Vehiculos=(DefaultTableModel)tbl_camionetasVehiculos.getModel();
        modtable3Vehiculos = (DefaultTableModel)tbl_taxiVehiculos.getModel();
        
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_pasarVehiculoTaxi = new javax.swing.JPanel();
        btn_pasar_VehiculoCamiones = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_pasarVehiculoCamioneta = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_taxiVehiculos = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_camionetasVehiculos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_caminoesVehiculos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_conductores_taxi = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_conductores_camionetas = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_conductores_camiones = new javax.swing.JTable();
        btn_pasar_conductores_camionetas = new javax.swing.JButton();
        btn_pasar_conductores_camiones = new javax.swing.JButton();
        btn_registro_taxi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_registrar_conductores = new javax.swing.JTable();
        btn_registrar_conductor = new javax.swing.JButton();
        btn_editar_conductor = new javax.swing.JButton();
        btn_decapitar_conductor = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        txt_apeliidos = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_puntaje_ontenido = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cbo_vehiculo_conductor = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        btn_registrar_vehiculos = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btn_editar_vehiculos = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_registrar_vehiculos = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_Num_paradero = new javax.swing.JTextField();
        txt_capacidad = new javax.swing.JTextField();
        cbo_conductor = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cbo_Vehiculos_selecciones_vehiculo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_pasarVehiculoTaxi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_pasar_VehiculoCamiones.setText("pasar a camion");
        btn_pasar_VehiculoCamiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pasar_VehiculoCamionesActionPerformed(evt);
            }
        });

        jButton2.setText("pasar a taxi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_pasarVehiculoCamioneta.setText("pasar a camioneta");
        btn_pasarVehiculoCamioneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pasarVehiculoCamionetaActionPerformed(evt);
            }
        });

        tbl_taxiVehiculos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tbl_taxiVehiculos);

        tbl_camionetasVehiculos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tbl_camionetasVehiculos);

        jLabel3.setText("taxi");

        jLabel2.setText("camionetas");

        tbl_caminoesVehiculos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tbl_caminoesVehiculos);

        jLabel1.setText("camiones");

        javax.swing.GroupLayout btn_pasarVehiculoTaxiLayout = new javax.swing.GroupLayout(btn_pasarVehiculoTaxi);
        btn_pasarVehiculoTaxi.setLayout(btn_pasarVehiculoTaxiLayout);
        btn_pasarVehiculoTaxiLayout.setHorizontalGroup(
            btn_pasarVehiculoTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_pasarVehiculoTaxiLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btn_pasar_VehiculoCamiones)
                .addGap(96, 96, 96)
                .addComponent(btn_pasarVehiculoCamioneta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_pasarVehiculoTaxiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_pasarVehiculoTaxiLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addGap(205, 205, 205)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        btn_pasarVehiculoTaxiLayout.setVerticalGroup(
            btn_pasarVehiculoTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_pasarVehiculoTaxiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btn_pasarVehiculoTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(btn_pasarVehiculoTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btn_pasarVehiculoTaxiLayout.createSequentialGroup()
                        .addGroup(btn_pasarVehiculoTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(btn_pasarVehiculoTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_pasarVehiculoCamioneta)
                            .addComponent(jButton2)))
                    .addGroup(btn_pasarVehiculoTaxiLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_pasar_VehiculoCamiones)))
                .addGap(92, 92, 92))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbl_conductores_taxi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_conductores_taxi);

        tbl_conductores_camionetas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_conductores_camionetas);

        tbl_conductores_camiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "dni", "apellidos", "nombres", "tipo Vehiculo", "puntaje"
            }
        ));
        jScrollPane3.setViewportView(tbl_conductores_camiones);

        btn_pasar_conductores_camionetas.setText("pasar a camionetas");
        btn_pasar_conductores_camionetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pasar_conductores_camionetasActionPerformed(evt);
            }
        });

        btn_pasar_conductores_camiones.setText("pasar a camiones");
        btn_pasar_conductores_camiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pasar_conductores_camionesActionPerformed(evt);
            }
        });

        btn_registro_taxi.setText("pasar a taxi");
        btn_registro_taxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registro_taxiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("transportistas ordenados");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("conductores _camiones");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("conductores_camionetas");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("conductores_taxi");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(jLabel4)))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel5)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(97, 97, 97))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btn_pasar_conductores_camiones)
                .addGap(100, 100, 100)
                .addComponent(btn_pasar_conductores_camionetas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_registro_taxi, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pasar_conductores_camiones)
                    .addComponent(btn_pasar_conductores_camionetas)
                    .addComponent(btn_registro_taxi))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbl_registrar_conductores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "dni", "apellidos", "nombres", "tipo_vehiculo", "puntaje"
            }
        ));
        jScrollPane7.setViewportView(tbl_registrar_conductores);

        btn_registrar_conductor.setText("registrar");
        btn_registrar_conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_conductorActionPerformed(evt);
            }
        });

        btn_editar_conductor.setText("editar");
        btn_editar_conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_conductorActionPerformed(evt);
            }
        });

        btn_decapitar_conductor.setText("decapitar");
        btn_decapitar_conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_decapitar_conductorActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Registro_conductores.");

        jLabel9.setText("dni:");

        jLabel10.setText("apellidos:");

        jLabel11.setText("nombres:");

        jLabel12.setText("tipo_vehiculo");

        jLabel18.setText("puntaje");

        cbo_vehiculo_conductor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "camionetas", "camion", "taxi" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_registrar_conductor)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editar_conductor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_decapitar_conductor)
                        .addGap(48, 48, 48))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(txt_apeliidos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbo_vehiculo_conductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_puntaje_ontenido, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_apeliidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cbo_vehiculo_conductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_puntaje_ontenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(49, 49, 49)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar_conductor)
                    .addComponent(btn_editar_conductor)
                    .addComponent(btn_decapitar_conductor))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_registrar_vehiculos.setText("registrar");
        btn_registrar_vehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_vehiculosActionPerformed(evt);
            }
        });

        jLabel13.setText("N°paradero");

        btn_editar_vehiculos.setText("editar");
        btn_editar_vehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_vehiculosActionPerformed(evt);
            }
        });

        btn_eliminar.setText("decapitar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jLabel15.setText("capacidad:");

        tbl_registrar_vehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "paradero", "tipo_Vehiculo", "cantidad", "nombre"
            }
        ));
        jScrollPane8.setViewportView(tbl_registrar_vehiculos);

        jLabel16.setText("tipo_vehiculo");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Registro_conductores.");

        jLabel14.setText("condutor asignado:");

        cbo_Vehiculos_selecciones_vehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "caminoes", "camion", "taxi" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 280, Short.MAX_VALUE)
                .addComponent(btn_registrar_vehiculos)
                .addGap(32, 32, 32)
                .addComponent(btn_editar_vehiculos)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Num_paradero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_conductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(cbo_Vehiculos_selecciones_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Num_paradero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cbo_Vehiculos_selecciones_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(txt_capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_conductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(72, 72, 72)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_editar_vehiculos)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_registrar_vehiculos))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pasarVehiculoTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_pasarVehiculoTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrar_conductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_conductorActionPerformed
       int dni = Integer.parseInt(txt_dni.getText());
       String apellidos = txt_apeliidos.getText();
       String nombres =txt_nombres.getText();
       String tipoVehiculo_conducira =  cbo_vehiculo_conductor.getSelectedItem().toString();
       int puntaje_obtenido = Integer.parseInt(txt_puntaje_ontenido.getText());
       cbo_conductor.addItem("conductor: "+nombres);
       chofer_contratado dato1 = new chofer_contratado(dni, apellidos, nombres, tipoVehiculo_conducira, puntaje_obtenido);
       objlistarChoferesprincipal.apilar(dato1);
       objlistarChoferesprincipal.recorrerpila(modtablePrinci);
    }//GEN-LAST:event_btn_registrar_conductorActionPerformed

    private void btn_pasar_conductores_camionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pasar_conductores_camionesActionPerformed
       chofer_contratado elemento = objlistarChoferesprincipal.desapilar();
        if (elemento!=null) {
            pila1.apilar(elemento);
            pila1.recorrerpila(modtable1);
            objlistarChoferesprincipal.recorrerpila(modtablePrinci);
        }
    }//GEN-LAST:event_btn_pasar_conductores_camionesActionPerformed

    private void btn_pasar_conductores_camionetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pasar_conductores_camionetasActionPerformed
        chofer_contratado elemento = objlistarChoferesprincipal.desapilar();
        if (elemento!=null) {
            pila2.apilar(elemento);
            pila2.recorrerpila(modtable2);
            objlistarChoferesprincipal.recorrerpila(modtablePrinci);
        }
    }//GEN-LAST:event_btn_pasar_conductores_camionetasActionPerformed

    private void btn_registro_taxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registro_taxiActionPerformed
      chofer_contratado elemento = objlistarChoferesprincipal.desapilar();
        if (elemento!=null) {
            pila3.apilar(elemento);
            pila3.recorrerpila(modtable3);
            objlistarChoferesprincipal.recorrerpila(modtablePrinci);
        }
    }//GEN-LAST:event_btn_registro_taxiActionPerformed

    private void btn_decapitar_conductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_decapitar_conductorActionPerformed
       objlistarChoferesprincipal.decapitar();
       objlistarChoferesprincipal.recorrerpila(modtablePrinci);
    }//GEN-LAST:event_btn_decapitar_conductorActionPerformed

    private void btn_editar_vehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_vehiculosActionPerformed
    
    }//GEN-LAST:event_btn_editar_vehiculosActionPerformed

    private void btn_registrar_vehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_vehiculosActionPerformed
        String NumeroParadero = txt_Num_paradero.getText();
        String Tipo_Vehiculo = cbo_Vehiculos_selecciones_vehiculo.getSelectedItem().toString();
        int cantidadParadero = Integer.parseInt(txt_capacidad.getText());
        String conductor = cbo_conductor.getSelectedItem().toString();
        Empresa_transportes obj1= new Empresa_transportes(NumeroParadero, Tipo_Vehiculo, cantidadParadero, conductor);
        objlistarParaderosTransportes.apilar(obj1);
        objlistarParaderosTransportes.recorrerpila(modtableprincipalVEhiculos);
       
    }//GEN-LAST:event_btn_registrar_vehiculosActionPerformed

    private void btn_pasar_VehiculoCamionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pasar_VehiculoCamionesActionPerformed
       Empresa_transportes elemento = objlistarParaderosTransportes.desapilar();
        if (elemento!=null) {
            pila1Vehiculos.apilar(elemento);
            pila1Vehiculos.recorrerpila(modtable1Vehi);
            objlistarParaderosTransportes.recorrerpila(modtableprincipalVEhiculos);
            
        }
    }//GEN-LAST:event_btn_pasar_VehiculoCamionesActionPerformed

    private void btn_pasarVehiculoCamionetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pasarVehiculoCamionetaActionPerformed
        Empresa_transportes elemento = objlistarParaderosTransportes.desapilar();
        if (elemento!=null) {
            pila2Vehiculos.apilar(elemento);
            pila2Vehiculos.recorrerpila(modtable2Vehiculos);
            objlistarParaderosTransportes.recorrerpila(modtableprincipalVEhiculos);
            
        }
    }//GEN-LAST:event_btn_pasarVehiculoCamionetaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Empresa_transportes elemento = objlistarParaderosTransportes.desapilar();
        if (elemento!=null) {
            pila3Vehiculos.apilar(elemento);
            pila3Vehiculos.recorrerpila(modtable3Vehiculos);
            objlistarParaderosTransportes.recorrerpila(modtableprincipalVEhiculos);
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        objlistarParaderosTransportes.decapitar();
       objlistarParaderosTransportes.recorrerpila(modtableprincipalVEhiculos);
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_editar_conductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_conductorActionPerformed
     
             //me falto tiempo para editar 
    }//GEN-LAST:event_btn_editar_conductorActionPerformed

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
            java.util.logging.Logger.getLogger(JDialog_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialog_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialog_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialog_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialog_principal dialog = new JDialog_principal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_decapitar_conductor;
    private javax.swing.JButton btn_editar_conductor;
    private javax.swing.JButton btn_editar_vehiculos;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_pasarVehiculoCamioneta;
    private javax.swing.JPanel btn_pasarVehiculoTaxi;
    private javax.swing.JButton btn_pasar_VehiculoCamiones;
    private javax.swing.JButton btn_pasar_conductores_camiones;
    private javax.swing.JButton btn_pasar_conductores_camionetas;
    private javax.swing.JButton btn_registrar_conductor;
    private javax.swing.JButton btn_registrar_vehiculos;
    private javax.swing.JButton btn_registro_taxi;
    private javax.swing.JComboBox<String> cbo_Vehiculos_selecciones_vehiculo;
    private javax.swing.JComboBox<String> cbo_conductor;
    private javax.swing.JComboBox<String> cbo_vehiculo_conductor;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable tbl_caminoesVehiculos;
    private javax.swing.JTable tbl_camionetasVehiculos;
    private javax.swing.JTable tbl_conductores_camiones;
    private javax.swing.JTable tbl_conductores_camionetas;
    private javax.swing.JTable tbl_conductores_taxi;
    private javax.swing.JTable tbl_registrar_conductores;
    private javax.swing.JTable tbl_registrar_vehiculos;
    private javax.swing.JTable tbl_taxiVehiculos;
    private javax.swing.JTextField txt_Num_paradero;
    private javax.swing.JTextField txt_apeliidos;
    private javax.swing.JTextField txt_capacidad;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_puntaje_ontenido;
    // End of variables declaration//GEN-END:variables
}
