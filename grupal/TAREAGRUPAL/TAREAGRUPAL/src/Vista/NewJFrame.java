package Vista;

import Control.Grafo;
import Control.Nodo;
import Modelo.Ciudad;
import Modelo.Enlace;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    DefaultComboBoxModel modComboCiudadOrigen = new DefaultComboBoxModel();
    DefaultComboBoxModel modComboCiudadDestino = new DefaultComboBoxModel();
    DefaultComboBoxModel modComboCiudadConsulta = new DefaultComboBoxModel();
    DefaultListModel modListaConexion = new DefaultListModel();
    DefaultListModel modListaConexion2 = new DefaultListModel();
    Grafo objgrafo = new Grafo();

    public NewJFrame() {
        initComponents();
        cbo_ciudadorigen.setModel(modComboCiudadOrigen);
        cbo_ciudaddestino.setModel(modComboCiudadDestino);
        cbo_ciudadconsulta.setModel(modComboCiudadConsulta);
        JList_conexiones.setModel(modListaConexion);
        ls_menosgasto.setModel(modListaConexion2);
    }

    private void Llenar_Combos() {
        modComboCiudadOrigen.removeAllElements();
        modComboCiudadDestino.removeAllElements();
        modComboCiudadConsulta.removeAllElements();
        ArrayList<Nodo> objLista = objgrafo.getLista();
        for (int i = 0; i < objLista.size(); i++) {
            String Ciudad = objLista.get(i).getElemento().getNombre();
            modComboCiudadOrigen.addElement(Ciudad);
            modComboCiudadDestino.addElement(Ciudad);
            modComboCiudadConsulta.addElement(Ciudad);
        }
    }

    private void Llenar_Lista(ArrayList<Enlace> objAristas) {
        modListaConexion.removeAllElements();
        for (int i = 0; i < objAristas.size(); i++) {
            Enlace Arista = objAristas.get(i);
            String Ciudad = Arista.getEnlace().getElemento().getNombre();
            int tiempo = Arista.getTiempo();
            String tipo = Arista.getTipo();
            double costo = Arista.getCosto_Economico();

            modListaConexion.addElement(tiempo + " - " + Ciudad + " - " + tipo + " - " + costo);
        }
    }

   
    
    
    private void cargardatos() {
        int pos = Tbl_datos.getSelectedRow();
        String nombre = Tbl_datos.getValueAt(0, pos).toString();
        Nodo buscado = objgrafo.BuscarCiudad(nombre);
        if (buscado != null) {
            Ciudad ciudad = buscado.getElemento();
            txt_Nombreciudad.setText(ciudad.getNombre());
            txt_Paisciudad.setText(ciudad.getPais());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Nombreciudad = new javax.swing.JTextField();
        txt_Paisciudad = new javax.swing.JTextField();
        btn_agregarnodo = new javax.swing.JButton();
        btn_eliminarnodo = new javax.swing.JButton();
        btn_editarciudad = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbo_ciudadorigen = new javax.swing.JComboBox<>();
        cbo_ciudaddestino = new javax.swing.JComboBox<>();
        cbo_tipo = new javax.swing.JComboBox<>();
        txt_tiempo = new javax.swing.JTextField();
        txt_costo = new javax.swing.JTextField();
        btn_agregarconexion = new javax.swing.JButton();
        btn_eliminarconexion = new javax.swing.JButton();
        btn_editarconexion = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbo_ciudadconsulta = new javax.swing.JComboBox<>();
        btn_Consultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JList_conexiones = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tbl_datos = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ls_menosgasto = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DE LA CIUDAD"));

        jLabel1.setText("Nombre");

        jLabel2.setText("Pais");

        btn_agregarnodo.setText("AGREGAR");
        btn_agregarnodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarnodoActionPerformed(evt);
            }
        });

        btn_eliminarnodo.setText("ELIMINAR");
        btn_eliminarnodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarnodoActionPerformed(evt);
            }
        });

        btn_editarciudad.setText("EDITAR");
        btn_editarciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarciudadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_eliminarnodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Nombreciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Paisciudad)))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_agregarnodo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_editarciudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_Nombreciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Paisciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregarnodo)
                    .addComponent(btn_editarciudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_eliminarnodo))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DE LA CONEXION"));

        jLabel3.setText("Ciudad de origen");

        jLabel4.setText("Ciudad de destino");

        jLabel5.setText("Tiempo");

        jLabel6.setText("Tipo");

        jLabel7.setText("Costo");

        cbo_ciudadorigen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_ciudadorigenMouseClicked(evt);
            }
        });
        cbo_ciudadorigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ciudadorigenActionPerformed(evt);
            }
        });

        cbo_ciudaddestino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_ciudaddestinoMouseClicked(evt);
            }
        });

        cbo_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maritimo", "Aereo", "Terrestre" }));

        btn_agregarconexion.setText("AGREGAR");
        btn_agregarconexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarconexionActionPerformed(evt);
            }
        });

        btn_eliminarconexion.setText("Eliminar conexion");
        btn_eliminarconexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarconexionActionPerformed(evt);
            }
        });

        btn_editarconexion.setText("EDITAR");
        btn_editarconexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarconexionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_eliminarconexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbo_ciudadorigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbo_ciudaddestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbo_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(btn_agregarconexion, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn_editarconexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbo_ciudadorigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cbo_ciudaddestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cbo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregarconexion)
                    .addComponent(btn_editarconexion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_eliminarconexion)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA DE CONEXIONES"));

        jLabel8.setText("Ciudad para consultar");

        cbo_ciudadconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ciudadconsultaActionPerformed(evt);
            }
        });

        btn_Consultar.setText("Consultar");
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });

        JList_conexiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JList_conexionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JList_conexiones);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbo_ciudadconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbo_ciudadconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Consultar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
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
        Tbl_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_datosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tbl_datos);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setText("mas corto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(ls_menosgasto);

        jLabel9.setText("mas pequeño entre conexiones:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarnodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarnodoActionPerformed
        String dato1 = txt_Nombreciudad.getText();
        String dato2 = txt_Paisciudad.getText();
        if (!dato1.isBlank() && !dato2.isEmpty()) {
            String[] registro = {dato1, dato2};
            Ciudad elemento = new Ciudad(registro);
            objgrafo.AgregarNodo(elemento);
            txt_Nombreciudad.setText("");
            txt_Paisciudad.setText("");
            txt_Nombreciudad.requestFocus();
            Llenar_Combos();
        } else {
            JOptionPane.showMessageDialog(this, "rellene los campos de texto");
        }

    }//GEN-LAST:event_btn_agregarnodoActionPerformed

    private void btn_eliminarnodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarnodoActionPerformed
        String nombre = txt_Nombreciudad.getText();
        objgrafo.ELiminar_Nodo(nombre);
        txt_Nombreciudad.setText("");
        txt_Paisciudad.setText("");
        txt_Nombreciudad.requestFocus();
        Llenar_Combos();

    }//GEN-LAST:event_btn_eliminarnodoActionPerformed

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
        String ciudadconsulta = cbo_ciudadconsulta.getSelectedItem().toString();
        Nodo ciudad = objgrafo.BuscarCiudad(ciudadconsulta);
        if (ciudad != null) {
            Llenar_Lista(ciudad.getAristas());
        }
    }//GEN-LAST:event_btn_ConsultarActionPerformed

    private void btn_agregarconexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarconexionActionPerformed
        String ciudadO = cbo_ciudadorigen.getSelectedItem().toString();
        String ciudadD = cbo_ciudaddestino.getSelectedItem().toString();
        int tiempo = Integer.parseInt(txt_tiempo.getText());
        String tipo = cbo_tipo.getSelectedItem().toString();
        double precio = Double.parseDouble(txt_costo.getText());
        
        if (!ciudadO.isEmpty() && !ciudadD.isEmpty() && tiempo != -1 && precio != -1) {
            objgrafo.AgregarENlace(ciudadO, ciudadD, tiempo, tipo, precio);     
            txt_costo.setText("");
            txt_tiempo.setText("");
            objgrafo.Recorrer(Tbl_datos);
        } else {
            JOptionPane.showMessageDialog(this, "llene los campos de texto");
        }
 
        
       
     
        
        
        
    }//GEN-LAST:event_btn_agregarconexionActionPerformed

    private void btn_eliminarconexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarconexionActionPerformed
        String ciudadO = cbo_ciudadorigen.getSelectedItem().toString();
        String ciudadD = cbo_ciudaddestino.getSelectedItem().toString();
        objgrafo.EliminarConexion(ciudadD, ciudadO);
        cbo_ciudadorigen.setSelectedIndex(-1);
        cbo_ciudaddestino.setSelectedIndex(-1);
    }//GEN-LAST:event_btn_eliminarconexionActionPerformed

    private void Tbl_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_datosMouseClicked
        int pos = Tbl_datos.getSelectedRow();
        if (pos != -1) {
            cargardatos();
        }
    }//GEN-LAST:event_Tbl_datosMouseClicked

    private void btn_editarciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarciudadActionPerformed
        String nombre = txt_Nombreciudad.getText();
        String pais = txt_Paisciudad.getText();
        Ciudad elemento = new Ciudad(nombre, pais);
            objgrafo.ELiminar_Nodo(nombre);
           objgrafo.AgregarNodo(elemento);
           
           
            txt_Nombreciudad.setText("");
            txt_Paisciudad.setText("");
            txt_Nombreciudad.requestFocus();
            Llenar_Combos();
            objgrafo.Recorrer(Tbl_datos);
        
    }//GEN-LAST:event_btn_editarciudadActionPerformed

    private void cbo_ciudadconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ciudadconsultaActionPerformed
       
    }//GEN-LAST:event_cbo_ciudadconsultaActionPerformed

    private void JList_conexionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JList_conexionesMouseClicked
        int pos = JList_conexiones.getSelectedIndex();
        if (pos != -1) {
            String linea = JList_conexiones.getModel().getElementAt(pos);
            String[] partes = linea.split(" - ");
                String ciudadDestino = partes[1];
                String nombre = cbo_ciudadconsulta.getSelectedItem().toString();
                Nodo origen = objgrafo.BuscarCiudad(nombre);
                
                 Enlace enlace = origen.Buscar_EnlacePorNombre(ciudadDestino);
                if (enlace!=null) {              
                      txt_tiempo.setText(enlace.getTiempo()+"");
                       txt_costo.setText(enlace.getCosto_Economico()+"");
                }else{JOptionPane.showMessageDialog(this, "falta elementos por agregar");}
            
        }
    }//GEN-LAST:event_JList_conexionesMouseClicked

    private void btn_editarconexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarconexionActionPerformed
         String ciudadO = cbo_ciudadorigen.getSelectedItem().toString();
        String ciudadD = cbo_ciudaddestino.getSelectedItem().toString();
        int tiempo = Integer.parseInt(txt_tiempo.getText());
        String tipo = cbo_tipo.getSelectedItem().toString();
        double precio = Double.parseDouble(txt_costo.getText());
//     objgrafo.EliminarConexion(ciudadO, ciudadD);
//     objgrafo.AgregarENlace(ciudadO, ciudadD, tiempo, tipo, precio);  se puede hacer con esto tambien.
        objgrafo.editarEnlace(ciudadO, ciudadD, tipo, tiempo, precio);
        txt_costo.setText("");
         txt_tiempo.setText("");
         objgrafo.Recorrer(Tbl_datos);
    }//GEN-LAST:event_btn_editarconexionActionPerformed

    private void cbo_ciudadorigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ciudadorigenActionPerformed
     
    }//GEN-LAST:event_cbo_ciudadorigenActionPerformed

    private void cbo_ciudadorigenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_ciudadorigenMouseClicked
     String nombre = cbo_ciudadorigen.getSelectedItem().toString();
     Nodo buscado = objgrafo.BuscarCiudad(nombre);
        if (buscado!=null) {
            txt_Nombreciudad.setText(buscado.getElemento().getNombre());
            txt_Paisciudad.setText(buscado.getElemento().getPais());
            
        }
    }//GEN-LAST:event_cbo_ciudadorigenMouseClicked

    private void cbo_ciudaddestinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_ciudaddestinoMouseClicked
        String nombre = cbo_ciudaddestino.getSelectedItem().toString();
        Nodo buscar = objgrafo.BuscarCiudad(nombre);
        if (buscar!=null) {
             txt_Nombreciudad.setText(buscar.getElemento().getNombre());
            txt_Paisciudad.setText(buscar.getElemento().getPais());
        }
    }//GEN-LAST:event_cbo_ciudaddestinoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             String nombre= cbo_ciudadconsulta.getSelectedItem().toString();
        Nodo buscado = objgrafo.BuscarCiudad(nombre);
       String text=  JOptionPane.showInputDialog(this, "selecciona una opcion\n"+"1 por tiempo\n"+"2 por costo\n"+"3 por tiempo mas costo\n" );
         if (text!=null) {
            
             int numero = Integer.parseInt(text);
             switch (numero) {
                 case 1:
                     if (buscado!=null) {
            Enlace mascorto = buscado.obtenerConexionMasCortaTiempo();
           
            if (mascorto!=null) {
                 modListaConexion2.removeAllElements();
                 String Nombrecorto = mascorto.getEnlace().getElemento().getNombre();
                 
                 int tiempo = mascorto.getTiempo();
                 double costo = mascorto.getCosto_Economico();
                 modListaConexion2.addElement(tiempo+" - "+costo+" - "+Nombrecorto);
                 JOptionPane.showMessageDialog(this, "Tiempo mas corto encontrado");
            }
          
        }
                     
                     
                     
                     break;
                 case 2:
                     
                 if (buscado!=null) {
            Enlace mascorto = buscado.obtenerConexionMasCortaCosto();
           
            if (mascorto!=null) {
                 modListaConexion2.removeAllElements();
                 String Nombrecorto = mascorto.getEnlace().getElemento().getNombre();
                 
                 int tiempo = mascorto.getTiempo();
                 double costo = mascorto.getCosto_Economico();
                 modListaConexion2.addElement(tiempo+" - "+costo+" - "+Nombrecorto);
                 JOptionPane.showMessageDialog(this, "Tiempo mas corto encontrado");
                 
            }
          
        }
                     
                     break;
                 case 3:
                     
                     // agregar orde de conexion por costo y tiempo
                     break;
                 
                     
             }
             
             
        }
    
                
   

        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JList_conexiones;
    private javax.swing.JTable Tbl_datos;
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_agregarconexion;
    private javax.swing.JButton btn_agregarnodo;
    private javax.swing.JButton btn_editarciudad;
    private javax.swing.JButton btn_editarconexion;
    private javax.swing.JButton btn_eliminarconexion;
    private javax.swing.JButton btn_eliminarnodo;
    private javax.swing.JComboBox<String> cbo_ciudadconsulta;
    private javax.swing.JComboBox<String> cbo_ciudaddestino;
    private javax.swing.JComboBox<String> cbo_ciudadorigen;
    private javax.swing.JComboBox<String> cbo_tipo;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> ls_menosgasto;
    private javax.swing.JTextField txt_Nombreciudad;
    private javax.swing.JTextField txt_Paisciudad;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_tiempo;
    // End of variables declaration//GEN-END:variables
}
