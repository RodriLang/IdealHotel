/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIstas.Administracion;

import AccesoADatos.HabitacionData;
import VIstas.AdministracionView;
import entidades.Habitacion;
import entidades.TipoHabitacion;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodri
 */
public class PanelInfoHabitacion extends javax.swing.JPanel {

    private int idHabitacion;
    private TipoHabitacion tipoHabitacion;
    private int piso;
    private int precio;
    private boolean ocupada;
    private boolean habilitada;
    private Habitacion habitacion;
    private HabitacionData habData;
    private AdministracionView ventana;
    private PanelAdminHabitaciones panelAdmin;
    private PanelAdminReservas panelAdminReservas;
    private ImageIcon imgLibre;
    private ImageIcon imgOcupada;
    private ImageIcon imgDeshabilitada;

    /**
     * Creates new form panelInfoHabitacion
     */
    public PanelInfoHabitacion(Habitacion habitacion, HabitacionData habData,
            AdministracionView ventana, PanelAdminHabitaciones panelAdmin, PanelAdminReservas panelReservas) {
        this.habitacion = habitacion;
        this.idHabitacion = habitacion.getIdHabitacion();
        this.tipoHabitacion = habitacion.getTipoHabitacion();
        this.ventana = ventana;
        this.panelAdmin = panelAdmin;
        this.panelAdminReservas = panelReservas;
        this.piso = habitacion.getPiso();
        this.precio = habitacion.getPrecio();
        this.ocupada = habitacion.isOcupada();
        this.habilitada = habitacion.isHabilitada();
        this.habData = habData;
        this.setSize(300, 150);
        this.setVisible(true);

        imgLibre = new ImageIcon(getClass().getResource("/imagenes/check_circle.png"));
        imgOcupada = new ImageIcon(getClass().getResource("/imagenes/do_not_disturb.png"));
        imgDeshabilitada = new ImageIcon(getClass().getResource("/imagenes/cancel.png"));

        initComponents();
        cargarDatosHabitacion();

    }

    public PanelInfoHabitacion(int idHabitacion, TipoHabitacion tipoHabitacion, int piso, int precio, boolean ocupada, boolean habilitada) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.piso = piso;
        this.precio = precio;
        this.ocupada = ocupada;
        this.habilitada = habilitada;
        this.setVisible(true);
        this.setSize(300, 150);
        initComponents();
        cargarDatosHabitacion();
    }

    public PanelInfoHabitacion() {
        initComponents();
        cargarDatosHabitacion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNorte = new javax.swing.JPanel();
        panelNumero = new javax.swing.JPanel();
        labelN = new javax.swing.JLabel();
        labelNumHab = new javax.swing.JLabel();
        panelEstado = new javax.swing.JPanel();
        labelEstado = new javax.swing.JLabel();
        botonEstado = new javax.swing.JButton();
        panelSur = new javax.swing.JPanel();
        labelTipoHab = new javax.swing.JLabel();
        panelCentro = new javax.swing.JPanel();
        panelEdit = new javax.swing.JPanel();
        botonEditar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        panelPiso = new javax.swing.JPanel();
        labelNPiso = new javax.swing.JLabel();
        labelPiso = new javax.swing.JLabel();
        panelReservas = new javax.swing.JPanel();
        botonReservas = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(200, 100));
        setLayout(new java.awt.BorderLayout());

        panelNorte.setOpaque(false);
        panelNorte.setPreferredSize(new java.awt.Dimension(984, 25));
        panelNorte.setLayout(new java.awt.BorderLayout());

        panelNumero.setMaximumSize(new java.awt.Dimension(50, 44));
        panelNumero.setOpaque(false);
        panelNumero.setPreferredSize(new java.awt.Dimension(74, 44));
        panelNumero.setLayout(new java.awt.BorderLayout());

        labelN.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        labelN.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelN.setText("N°");
        labelN.setPreferredSize(new java.awt.Dimension(30, 21));
        panelNumero.add(labelN, java.awt.BorderLayout.WEST);

        labelNumHab.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        labelNumHab.setText("000");
        labelNumHab.setPreferredSize(new java.awt.Dimension(30, 21));
        panelNumero.add(labelNumHab, java.awt.BorderLayout.CENTER);

        panelNorte.add(panelNumero, java.awt.BorderLayout.WEST);

        panelEstado.setOpaque(false);
        panelEstado.setPreferredSize(new java.awt.Dimension(115, 38));
        panelEstado.setLayout(new java.awt.BorderLayout());

        labelEstado.setBackground(new java.awt.Color(51, 255, 51));
        labelEstado.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        labelEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEstado.setText("LIBRE");
        labelEstado.setOpaque(true);
        labelEstado.setPreferredSize(new java.awt.Dimension(45, 26));
        panelEstado.add(labelEstado, java.awt.BorderLayout.CENTER);

        botonEstado.setBackground(new java.awt.Color(0, 255, 51));
        botonEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check_circle.png"))); // NOI18N
        botonEstado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEstado.setPreferredSize(new java.awt.Dimension(35, 35));
        botonEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstadoActionPerformed(evt);
            }
        });
        panelEstado.add(botonEstado, java.awt.BorderLayout.EAST);

        panelNorte.add(panelEstado, java.awt.BorderLayout.CENTER);

        add(panelNorte, java.awt.BorderLayout.NORTH);

        panelSur.setOpaque(false);
        panelSur.setPreferredSize(new java.awt.Dimension(651, 25));
        panelSur.setLayout(new java.awt.BorderLayout());

        labelTipoHab.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        labelTipoHab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTipoHab.setText("ESTANDAR_ DOBLE_TWIN");
        labelTipoHab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelTipoHab.setPreferredSize(new java.awt.Dimension(100, 30));
        panelSur.add(labelTipoHab, java.awt.BorderLayout.CENTER);

        add(panelSur, java.awt.BorderLayout.SOUTH);

        panelCentro.setOpaque(false);
        panelCentro.setPreferredSize(new java.awt.Dimension(358, 30));
        panelCentro.setLayout(new java.awt.BorderLayout());

        panelEdit.setOpaque(false);
        panelEdit.setPreferredSize(new java.awt.Dimension(35, 78));
        panelEdit.setLayout(new java.awt.GridLayout(2, 0));

        botonEditar.setBackground(new java.awt.Color(42, 179, 203));
        botonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit.png"))); // NOI18N
        botonEditar.setPreferredSize(new java.awt.Dimension(35, 35));
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        panelEdit.add(botonEditar);

        botonEliminar.setBackground(new java.awt.Color(255, 0, 0));
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        botonEliminar.setPreferredSize(new java.awt.Dimension(35, 35));
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        panelEdit.add(botonEliminar);

        panelCentro.add(panelEdit, java.awt.BorderLayout.EAST);

        panelPiso.setOpaque(false);
        panelPiso.setPreferredSize(new java.awt.Dimension(70, 39));
        panelPiso.setLayout(new java.awt.BorderLayout());

        labelNPiso.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        labelNPiso.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelNPiso.setText("1°");
        labelNPiso.setPreferredSize(new java.awt.Dimension(20, 14));
        panelPiso.add(labelNPiso, java.awt.BorderLayout.WEST);

        labelPiso.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        labelPiso.setText("  PISO");
        panelPiso.add(labelPiso, java.awt.BorderLayout.CENTER);

        panelCentro.add(panelPiso, java.awt.BorderLayout.WEST);

        panelReservas.setMinimumSize(new java.awt.Dimension(80, 36));
        panelReservas.setOpaque(false);
        panelReservas.setPreferredSize(new java.awt.Dimension(70, 35));
        panelReservas.setLayout(new java.awt.GridLayout(1, 0));

        botonReservas.setBackground(new java.awt.Color(42, 179, 203));
        botonReservas.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botonReservas.setText("RESERVAS");
        botonReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReservasActionPerformed(evt);
            }
        });
        panelReservas.add(botonReservas);

        panelCentro.add(panelReservas, java.awt.BorderLayout.CENTER);

        add(panelCentro, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void botonReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservasActionPerformed
        ventana.mostrarPanelContenido(new PanelAdminReservas(habitacion), ventana.getBotonReservas());
    }//GEN-LAST:event_botonReservasActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "¿Está seguro que desea deshabilitar la habitación?",
                "Borrar habitación", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE) == 0) {
            habData.dehabilitarHabitacion(idHabitacion);
            botonEditar.setEnabled(false);
            botonEliminar.setEnabled(false);
            botonReservas.setEnabled(false);
            botonEstado.setBackground(Color.YELLOW);
            botonEstado.setIcon(imgDeshabilitada);
            this.setBackground(Color.gray);
            labelEstado.setText("DESHABILITADA");
            this.revalidate();
            this.repaint();
        }
        panelAdmin.filtrarHabitaciones();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        ventana.mostrarPanelContenido(new PanelModificarHabitacion(habitacion, ventana, panelAdmin, habData), null);
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstadoActionPerformed

        switch (labelEstado.getText()) {
            case "LIBRE":
                if (JOptionPane.showConfirmDialog(this, "Se marcará la Habitación como \n\"OCUPADA\"", "¡ATENCIÓN!", JOptionPane.CANCEL_OPTION) == 0) {
                    labelEstado.setText("OCUPADA");
                    botonEstado.setIcon(imgOcupada);
                    labelEstado.setBackground(Color.RED);
                    botonEstado.setBackground(Color.RED);
                    habData.ocuparHabitacion(idHabitacion);
                }
                break;
            case "OCUPADA":
                if (JOptionPane.showConfirmDialog(this, "Se marcará la Habitación como \n\"LIBRE\"", "¡ATENCIÓN!", JOptionPane.CANCEL_OPTION) == 0) {
                    botonEstado.setBackground(Color.GREEN);
                    labelEstado.setBackground(Color.GREEN);
                    labelEstado.setText("LIBRE");
                    botonEstado.setIcon(imgLibre);
                    habData.liberarHabitacion(idHabitacion);
                }
                break;
            case "DESHABILITADA":
                if (JOptionPane.showConfirmDialog(this, "Se marcará la Habitación como \n\"HABILITADA\"", "¡ATENCIÓN!", JOptionPane.CANCEL_OPTION) == 0) {
                    botonEstado.setBackground(Color.GREEN);
                    labelEstado.setText("LIBRE");
                    botonEstado.setIcon(imgLibre);
                    botonEditar.setEnabled(true);
                    botonEliminar.setEnabled(true);
                    botonReservas.setEnabled(true);
                    this.setBackground(new Color(35, 149, 169));
                    habData.habilitarHabitacion(idHabitacion);
                    break;
                }
        }
        panelAdmin.filtrarHabitaciones();
    }//GEN-LAST:event_botonEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonEstado;
    private javax.swing.JButton botonReservas;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelN;
    private javax.swing.JLabel labelNPiso;
    private javax.swing.JLabel labelNumHab;
    private javax.swing.JLabel labelPiso;
    private javax.swing.JLabel labelTipoHab;
    private javax.swing.JPanel panelCentro;
    private javax.swing.JPanel panelEdit;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelNorte;
    private javax.swing.JPanel panelNumero;
    private javax.swing.JPanel panelPiso;
    private javax.swing.JPanel panelReservas;
    private javax.swing.JPanel panelSur;
    // End of variables declaration//GEN-END:variables

    private void cargarDatosHabitacion() {
        labelNumHab.setText(idHabitacion + "");
        if (ocupada) {
            botonEstado.setBackground(Color.RED);
            labelEstado.setBackground(Color.RED);
            labelEstado.setText("OCUPADA");
            botonEstado.setIcon(imgOcupada);
        } else {
            botonEstado.setBackground(Color.GREEN);
            labelEstado.setBackground(Color.GREEN);
            labelEstado.setText("LIBRE");
            botonEstado.setIcon(imgLibre);
        }
        labelNPiso.setText(piso + "");
        labelTipoHab.setText(tipoHabitacion.name());
        botonReservas.setEnabled(habilitada);
        botonEditar.setEnabled(habilitada);
        botonEliminar.setEnabled(habilitada);
        if (habilitada) {
            this.setBackground(new Color(35, 149, 169));
        } else {
            labelEstado.setText("DESHABILITADA");
            botonEstado.setBackground(Color.YELLOW);
            botonEstado.setIcon(imgDeshabilitada);
            labelEstado.setBackground(Color.LIGHT_GRAY);
            this.setBackground(Color.gray);
        }
    }
}
