/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIstas.Administracion;

import AccesoADatos.HabitacionData;
import AccesoADatos.ReservaData;
import VIstas.AdministracionView;
import entidades.Habitacion;
import entidades.TipoHabitacion;
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Rodri
 */
public class PanelAdminHabitaciones extends javax.swing.JPanel {

    private HabitacionData habData;
    private ReservaData resData;
    private List<Habitacion> habitaciones;
    private List<PanelInfoHabitacion> infoHabitaciones;
    private AdministracionView ventana;
    private PanelAdminReservas panelAdminReservas;

    /**
     * Creates new form panelAdminHabitaciones
     */
    public PanelAdminHabitaciones(HabitacionData habData, ReservaData resData, AdministracionView ventana, PanelAdminReservas panelAdminReservas, LocalDate fecha) {
        this.habData = habData;
        this.resData = resData;
        this.ventana = ventana;
        this.panelAdminReservas = panelAdminReservas;
        initComponents();
        this.setVisible(false);
        infoHabitaciones = new ArrayList<>();
        habitaciones = this.habData.listarHabitaciones();
        filtrarHabitaciones();
        cargarComboTipos();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstado = new javax.swing.ButtonGroup();
        buttonGroupHabilitadas = new javax.swing.ButtonGroup();
        panelOpciones = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        panelHabitaciones = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        panelOpcionCondicion = new javax.swing.JPanel();
        radioButtonDeshabilitadas = new javax.swing.JRadioButton();
        radioButtonHabilitadas = new javax.swing.JRadioButton();
        radioButtonCondicionTodas = new javax.swing.JRadioButton();
        labelOpcionCondicion = new javax.swing.JLabel();
        panelOpcionEstado = new javax.swing.JPanel();
        radioButtonOcupadas = new javax.swing.JRadioButton();
        radioButtonLibres = new javax.swing.JRadioButton();
        radioButtonEstadoTodas = new javax.swing.JRadioButton();
        labelOpcionEstado = new javax.swing.JLabel();
        botonBuscar2 = new javax.swing.JButton();
        comboBoxPisos = new javax.swing.JComboBox<>();
        comboBoxTipos = new javax.swing.JComboBox<>();
        botonEditar = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        radioButtonChekInOut = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(27, 118, 134));
        setPreferredSize(new java.awt.Dimension(984, 581));

        panelOpciones.setOpaque(false);

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        scrollPane.setPreferredSize(new java.awt.Dimension(984, 447));

        panelHabitaciones.setBackground(new java.awt.Color(27, 118, 134));
        panelHabitaciones.setDoubleBuffered(false);
        panelHabitaciones.setLayout(new java.awt.GridLayout(50, 4, 10, 15));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelHabitaciones.add(jPanel1);

        scrollPane.setViewportView(panelHabitaciones);

        botonBuscar.setBackground(new java.awt.Color(176, 184, 157));
        botonBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        botonBuscar.setText("BUSCAR");
        botonBuscar.setContentAreaFilled(false);
        botonBuscar.setOpaque(true);
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonLimpiar.setBackground(new java.awt.Color(176, 184, 157));
        botonLimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cleaning_services.png"))); // NOI18N
        botonLimpiar.setText("LIMPIAR");
        botonLimpiar.setContentAreaFilled(false);
        botonLimpiar.setOpaque(true);
        botonLimpiar.setPreferredSize(new java.awt.Dimension(114, 36));
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        panelOpcionCondicion.setBackground(new java.awt.Color(176, 184, 157));
        panelOpcionCondicion.setAlignmentY(0.0F);

        buttonGroupHabilitadas.add(radioButtonDeshabilitadas);
        radioButtonDeshabilitadas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radioButtonDeshabilitadas.setText("DESHABILITADAS");
        radioButtonDeshabilitadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonDeshabilitadasActionPerformed(evt);
            }
        });

        buttonGroupHabilitadas.add(radioButtonHabilitadas);
        radioButtonHabilitadas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radioButtonHabilitadas.setSelected(true);
        radioButtonHabilitadas.setText("HABILITADAS");
        radioButtonHabilitadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonHabilitadasActionPerformed(evt);
            }
        });

        buttonGroupHabilitadas.add(radioButtonCondicionTodas);
        radioButtonCondicionTodas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radioButtonCondicionTodas.setText("TODAS");
        radioButtonCondicionTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonCondicionTodasActionPerformed(evt);
            }
        });

        labelOpcionCondicion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelOpcionCondicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpcionCondicion.setText("CONDICIÓN");

        javax.swing.GroupLayout panelOpcionCondicionLayout = new javax.swing.GroupLayout(panelOpcionCondicion);
        panelOpcionCondicion.setLayout(panelOpcionCondicionLayout);
        panelOpcionCondicionLayout.setHorizontalGroup(
            panelOpcionCondicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionCondicionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelOpcionCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButtonCondicionTodas)
                .addGap(39, 39, 39)
                .addComponent(radioButtonHabilitadas, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButtonDeshabilitadas)
                .addGap(15, 15, 15))
        );
        panelOpcionCondicionLayout.setVerticalGroup(
            panelOpcionCondicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionCondicionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcionCondicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonCondicionTodas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelOpcionCondicionLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(labelOpcionCondicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(radioButtonHabilitadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioButtonDeshabilitadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelOpcionEstado.setBackground(new java.awt.Color(176, 184, 157));

        buttonGroupEstado.add(radioButtonOcupadas);
        radioButtonOcupadas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radioButtonOcupadas.setText("OCUPADAS");
        radioButtonOcupadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonOcupadasActionPerformed(evt);
            }
        });

        buttonGroupEstado.add(radioButtonLibres);
        radioButtonLibres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radioButtonLibres.setText("LIBRES");
        radioButtonLibres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonLibresActionPerformed(evt);
            }
        });

        buttonGroupEstado.add(radioButtonEstadoTodas);
        radioButtonEstadoTodas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        radioButtonEstadoTodas.setSelected(true);
        radioButtonEstadoTodas.setText("TODAS");
        radioButtonEstadoTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonEstadoTodasActionPerformed(evt);
            }
        });

        labelOpcionEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelOpcionEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelOpcionEstado.setText("ESTADO");

        javax.swing.GroupLayout panelOpcionEstadoLayout = new javax.swing.GroupLayout(panelOpcionEstado);
        panelOpcionEstado.setLayout(panelOpcionEstadoLayout);
        panelOpcionEstadoLayout.setHorizontalGroup(
            panelOpcionEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelOpcionEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(radioButtonEstadoTodas)
                .addGap(36, 36, 36)
                .addComponent(radioButtonLibres, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(radioButtonOcupadas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOpcionEstadoLayout.setVerticalGroup(
            panelOpcionEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelOpcionEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelOpcionEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOpcionEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonEstadoTodas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioButtonLibres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioButtonOcupadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        botonBuscar2.setBackground(new java.awt.Color(176, 184, 157));
        botonBuscar2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check_in_out.png"))); // NOI18N
        botonBuscar2.setContentAreaFilled(false);
        botonBuscar2.setOpaque(true);
        botonBuscar2.setPreferredSize(new java.awt.Dimension(52, 40));
        botonBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscar2ActionPerformed(evt);
            }
        });

        comboBoxPisos.setBackground(new java.awt.Color(176, 184, 157));
        comboBoxPisos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS LOS PISOS", "1° PISO", "2° PISO", "3° PISO", "4° PISO", "5° PISO", "6° PISO", "7° PISO", "8° PISO" }));
        comboBoxPisos.setPreferredSize(new java.awt.Dimension(150, 40));
        comboBoxPisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPisosActionPerformed(evt);
            }
        });

        comboBoxTipos.setBackground(new java.awt.Color(176, 184, 157));
        comboBoxTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS LOS TIPOS" }));
        comboBoxTipos.setPreferredSize(new java.awt.Dimension(150, 40));
        comboBoxTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTiposActionPerformed(evt);
            }
        });

        botonEditar.setBackground(new java.awt.Color(176, 184, 157));
        botonEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit.png"))); // NOI18N
        botonEditar.setText("EDITAR");
        botonEditar.setContentAreaFilled(false);
        botonEditar.setOpaque(true);
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonAgregar.setBackground(new java.awt.Color(176, 184, 157));
        botonAgregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        botonAgregar.setText("AGREGAR");
        botonAgregar.setContentAreaFilled(false);
        botonAgregar.setOpaque(true);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(176, 184, 157));

        radioButtonChekInOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonChekInOutActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check_in_out.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioButtonChekInOut)
                    .addContainerGap(56, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(9, Short.MAX_VALUE)
                    .addComponent(radioButtonChekInOut)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelOpcionCondicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelOpcionEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonBuscar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxTipos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxPisos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(panelOpcionEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(panelOpcionCondicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                                    .addComponent(botonBuscar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxPisos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxTipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxPisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPisosActionPerformed
//        if (comboBoxPisos.getSelectedIndex() != 0) {
//            habitaciones = habData.listarHabitacionesPorPiso(comboBoxPisos.getSelectedIndex());
//        } else {
//            habitaciones = habData.listarHabitaciones();
//        }
        filtrarHabitaciones();
    }//GEN-LAST:event_comboBoxPisosActionPerformed

    private void comboBoxTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTiposActionPerformed
//        if (comboBoxTipos.getSelectedIndex() != 0) {
//            habitaciones = habData.listarHabitacionesPorTipo((TipoHabitacion) comboBoxTipos.getSelectedItem());
//        } else {
//            habitaciones = habData.listarHabitaciones();
//        }
//        cargarHabitaciones();
        filtrarHabitaciones();
    }//GEN-LAST:event_comboBoxTiposActionPerformed

    private void radioButtonDeshabilitadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonDeshabilitadasActionPerformed
        filtrarHabitaciones();
    }//GEN-LAST:event_radioButtonDeshabilitadasActionPerformed

    private void radioButtonEstadoTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonEstadoTodasActionPerformed
        filtrarHabitaciones();
    }//GEN-LAST:event_radioButtonEstadoTodasActionPerformed

    private void radioButtonHabilitadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonHabilitadasActionPerformed
        filtrarHabitaciones();
    }//GEN-LAST:event_radioButtonHabilitadasActionPerformed

    private void radioButtonLibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonLibresActionPerformed
        filtrarHabitaciones();
    }//GEN-LAST:event_radioButtonLibresActionPerformed

    private void radioButtonOcupadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonOcupadasActionPerformed
        filtrarHabitaciones();
    }//GEN-LAST:event_radioButtonOcupadasActionPerformed

    private void radioButtonCondicionTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonCondicionTodasActionPerformed
        filtrarHabitaciones();
    }//GEN-LAST:event_radioButtonCondicionTodasActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        radioButtonHabilitadas.setSelected(true);
        radioButtonEstadoTodas.setSelected(true);
        comboBoxPisos.setSelectedIndex(0);
        comboBoxTipos.setSelectedIndex(0);
        limpiarPanelesHabitacion();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        filtrarHabitaciones();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        PanelModificarHabitacion panelModificarHabitacion = new PanelModificarHabitacion(null, ventana, this, habData);
        ventana.mostrarPanelContenido(panelModificarHabitacion, botonBuscar);
        panelModificarHabitacion.setearCamposCrearHabitacion();
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        ventana.mostrarPanelContenido(new PanelModificarHabitacion(null, ventana, this, habData), botonBuscar);
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscar2ActionPerformed
        ventana.mostrarPanelContenido(new PanelCheckInOut(ventana, this, habData, resData), botonBuscar);
    }//GEN-LAST:event_botonBuscar2ActionPerformed

    private void radioButtonChekInOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonChekInOutActionPerformed
        filtrarHabitaciones();
    }//GEN-LAST:event_radioButtonChekInOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonBuscar2;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.ButtonGroup buttonGroupEstado;
    private javax.swing.ButtonGroup buttonGroupHabilitadas;
    private javax.swing.JComboBox<String> comboBoxPisos;
    private javax.swing.JComboBox<Object> comboBoxTipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelOpcionCondicion;
    private javax.swing.JLabel labelOpcionEstado;
    private javax.swing.JPanel panelHabitaciones;
    private javax.swing.JPanel panelOpcionCondicion;
    private javax.swing.JPanel panelOpcionEstado;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JRadioButton radioButtonChekInOut;
    private javax.swing.JRadioButton radioButtonCondicionTodas;
    private javax.swing.JRadioButton radioButtonDeshabilitadas;
    private javax.swing.JRadioButton radioButtonEstadoTodas;
    private javax.swing.JRadioButton radioButtonHabilitadas;
    private javax.swing.JRadioButton radioButtonLibres;
    private javax.swing.JRadioButton radioButtonOcupadas;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
    private void cargarHabitaciones() {
        limpiarPanelesHabitacion();
        System.out.println("cantidad " + habitaciones.size());
        for (Habitacion habitacion : habitaciones) {
            infoHabitaciones.add(new PanelInfoHabitacion(habitacion, habData, resData, ventana, this, panelAdminReservas, AdministracionView.FECHA));
        }

        mostrarHabitaciones();

    }

    private void mostrarHabitaciones() {

        int filas = (int) Math.ceil((double) infoHabitaciones.size() / 4d);
        if (filas < 4) {
            filas = 4;
        }

        System.out.println("filas " + filas);
        panelHabitaciones.setLayout(new java.awt.GridLayout(filas, 4, 10, 15));
        for (PanelInfoHabitacion infoHabitacion : infoHabitaciones) {
            panelHabitaciones.add(infoHabitacion);
        }

        scrollPane.setViewportView(panelHabitaciones);
        if (infoHabitaciones.size() < filas * 4) {
            System.out.println("se agregan " + (200 - infoHabitaciones.size()) + " paneles");
            for (int i = infoHabitaciones.size(); i < filas * 4; i++) {
                JPanel panelVacio = new JPanel();
                panelVacio.setBackground(new Color(27, 118, 134));
                panelHabitaciones.add(panelVacio);
            }
        }
        panelHabitaciones.revalidate();
        panelHabitaciones.repaint();
    }

    private void cargarComboTipos() {
        for (TipoHabitacion tipo : TipoHabitacion.values()) {
            comboBoxTipos.addItem(tipo);
        }
    }

    private void limpiarPanelesHabitacion() {
        panelHabitaciones.removeAll();
        infoHabitaciones.clear();
        panelHabitaciones.repaint();
    }

    public void filtrarHabitaciones() {
        int ocupada;
        int habilitada;
        TipoHabitacion tipo = null;
        if (radioButtonLibres.isSelected()) {
            ocupada = 0;
        } else if (radioButtonOcupadas.isSelected()) {
            ocupada = 1;
        } else {
            ocupada = 2;
        }
        if (radioButtonDeshabilitadas.isSelected()) {
            habilitada = 0;
        } else if (radioButtonHabilitadas.isSelected()) {
            habilitada = 1;
        } else {
            habilitada = 2;
        }
        if (comboBoxTipos.getSelectedIndex() != 0) {
            tipo = (TipoHabitacion) comboBoxTipos.getSelectedItem();
        }
        habitaciones = habData.listarHabitacionesPorFiltros(ocupada, habilitada, comboBoxPisos.getSelectedIndex(), tipo);
        if (radioButtonChekInOut.isSelected()) {
            List<Habitacion> habitacionesReservadas = new ArrayList<>();
            for (Habitacion habitacion : habitaciones) {
                if (habitacion.equals(resData.buscarReservasPorIDHabitacionYfecha(AdministracionView.FECHA, habitacion.getIdHabitacion()).getHabitacion())) {
                    habitacionesReservadas.add(habitacion);
                }
                habitaciones = habitacionesReservadas;
            }
        }
        cargarHabitaciones();
    }
}
