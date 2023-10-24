/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIstas;

import VIstas.Administracion.PanelAdminHabitaciones;
import VIstas.Administracion.PanelAdminReservas;
import VIstas.Administracion.PanelAdminHuespedes;
import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import javafx.scene.text.TextFlow;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import VIstas.Administracion.PanelAdminTabla;
import javax.swing.JTextField;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;


/**
 *
 * @author Rodri
 */
public class AdministracionView extends javax.swing.JInternalFrame {

    private HabitacionData habData;
    private HuespedData huesData;
    private ReservaData reserData;
    private PanelAdminHabitaciones panelHabitaciones;
    private PanelAdminHuespedes panelHuespedes;
    private PanelAdminReservas panelReservas;
    private static LocalDate fecha;
    private DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private PanelAdminTabla panelTabla;

    /**
     * Creates new form AdministracionView
     */
    public AdministracionView(HabitacionData habData, HuespedData huesData, ReservaData reserData) {
        this.habData = habData;
        this.huesData = huesData;
        this.reserData = reserData;
        initComponents();
        this.setOpaque(true);
        this.setBackground(new Color(27, 118, 134, 254));

        fecha = LocalDate.now();

        panelReservas = new PanelAdminReservas();
        panelHabitaciones = new PanelAdminHabitaciones(habData, reserData, this, panelReservas, fecha);
        panelHuespedes = new PanelAdminHuespedes();
        panelTabla=new PanelAdminTabla();
        mostrarPanelTabla(panelTabla,botonHome);

        botonFecha.setText("   " + fecha.format(formatoFecha));

//        panelContenido.add(panelHabitaciones);
//        panelContenido.add(panelHuespedes);
//        panelContenido.add(panelReservas);
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelGeneral = new javax.swing.JPanel();
        panelContenido = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JButton();
        labelIcono = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonHome = new javax.swing.JButton();
        botonHabitaciones = new javax.swing.JButton();
        botonHuespedes = new javax.swing.JButton();
        botonReservas = new javax.swing.JButton();
        botonFecha = new javax.swing.JButton();

        setBackground(new java.awt.Color(27, 118, 134));
        setPreferredSize(new java.awt.Dimension(1020, 721));

        panelGeneral.setBackground(new java.awt.Color(27, 118, 134));

        panelContenido.setBackground(new java.awt.Color(27, 118, 134));
        panelContenido.setAlignmentX(0.0F);
        panelContenido.setOpaque(false);
        panelContenido.setLayout(new javax.swing.OverlayLayout(panelContenido));

        panelTitulo.setBackground(new java.awt.Color(176, 184, 157));

        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        botonCerrar.setContentAreaFilled(false);
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        labelIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/concierge.png"))); // NOI18N

        labelTitulo.setBackground(new java.awt.Color(176, 184, 157));
        labelTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("ADMINISTRACIÓN");
        labelTitulo.setOpaque(true);

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCerrar))
            .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelTituloLayout.createSequentialGroup()
                    .addComponent(labelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 962, Short.MAX_VALUE)))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))
            .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(labelIcono, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        botonHome.setBackground(new java.awt.Color(176, 184, 157));
        botonHome.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        botonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home.png"))); // NOI18N
        botonHome.setText("   HOME");
        botonHome.setContentAreaFilled(false);
        botonHome.setOpaque(true);
        botonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHomeActionPerformed(evt);
            }
        });
        jPanel1.add(botonHome);

        botonHabitaciones.setBackground(new java.awt.Color(176, 184, 157));
        botonHabitaciones.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        botonHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/king_bed.png"))); // NOI18N
        botonHabitaciones.setText("   HABITACIONES");
        botonHabitaciones.setContentAreaFilled(false);
        botonHabitaciones.setOpaque(true);
        botonHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHabitacionesActionPerformed(evt);
            }
        });
        jPanel1.add(botonHabitaciones);

        botonHuespedes.setBackground(new java.awt.Color(176, 184, 157));
        botonHuespedes.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        botonHuespedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/person.png"))); // NOI18N
        botonHuespedes.setText("   HUESPEDES");
        botonHuespedes.setContentAreaFilled(false);
        botonHuespedes.setOpaque(true);
        botonHuespedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHuespedesActionPerformed(evt);
            }
        });
        jPanel1.add(botonHuespedes);

        botonReservas.setBackground(new java.awt.Color(176, 184, 157));
        botonReservas.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        botonReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_online.png"))); // NOI18N
        botonReservas.setText("   RESERVAS");
        botonReservas.setContentAreaFilled(false);
        botonReservas.setOpaque(true);
        botonReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReservasActionPerformed(evt);
            }
        });
        jPanel1.add(botonReservas);

        botonFecha.setBackground(new java.awt.Color(176, 184, 157));
        botonFecha.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        botonFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendar_month.png"))); // NOI18N
        botonFecha.setContentAreaFilled(false);
        botonFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        botonFecha.setOpaque(true);
        botonFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFechaActionPerformed(evt);
            }
        });
        jPanel1.add(botonFecha);

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHabitacionesActionPerformed
        mostrarPanelContenido(panelHabitaciones, botonHabitaciones);
    }//GEN-LAST:event_botonHabitacionesActionPerformed

    private void botonHuespedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHuespedesActionPerformed
        mostrarPanelContenido(panelHuespedes, botonHuespedes);
    }//GEN-LAST:event_botonHuespedesActionPerformed

    private void botonReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservasActionPerformed
        mostrarPanelContenido(panelReservas, botonReservas);
    }//GEN-LAST:event_botonReservasActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHomeActionPerformed
        mostrarPanelTabla(panelTabla,botonHome);
    }//GEN-LAST:event_botonHomeActionPerformed

    private void botonFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFechaActionPerformed
        JCalendar calendario = new JCalendar(Date.valueOf(LocalDate.now()));
        JOptionPane.showMessageDialog(this, calendario);
        fecha = calendario.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        botonFecha.setText("   " + fecha.format(formatoFecha));
        panelHabitaciones.setFecha(fecha);
    }//GEN-LAST:event_botonFechaActionPerformed

    public void mostrarPanelContenido(JPanel panel, JButton boton) {
        if (boton != null) {
            botonHuespedes.setBackground(new Color(176, 184, 157));
            botonReservas.setBackground(new Color(176, 184, 157));
            botonHabitaciones.setBackground(new Color(176, 184, 157));
            botonHome.setBackground(new Color(176, 184, 157));
            boton.setBackground(new Color(225, 212, 195));
        }
        panelContenido.removeAll();
        panelContenido.repaint();
        panelContenido.add(panel);
        panel.setVisible(true);
    }

    public JButton getBotonReservas() {
        return botonReservas;
    }
    
    public void mostrarPanelTabla(JPanel panel,JButton boton){
         if (boton != null) {
            botonHuespedes.setBackground(new Color(176, 184, 157));
            botonReservas.setBackground(new Color(176, 184, 157));
            botonHabitaciones.setBackground(new Color(176, 184, 157));
            botonHome.setBackground(new Color(176, 184, 157));
            boton.setBackground(new Color(225, 212, 195));
        }
        panelContenido.removeAll();
        panelContenido.repaint();
        panelContenido.add(panel);
        panel.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonFecha;
    private javax.swing.JButton botonHabitaciones;
    private javax.swing.JButton botonHome;
    private javax.swing.JButton botonHuespedes;
    private javax.swing.JButton botonReservas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelIcono;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}
