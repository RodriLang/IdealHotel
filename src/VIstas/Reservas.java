/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIstas;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import com.toedter.calendar.JTextFieldDateEditor;
import entidades.Habitacion;
import entidades.Huesped;
import entidades.Reserva;
import entidades.TipoHabitacion;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DateFormatter;
import org.mariadb.jdbc.plugin.codec.LocalDateCodec;

/**
 *
 * @author Lenovo
 */
public class Reservas extends javax.swing.JInternalFrame {
private DefaultTableModel modelo= new DefaultTableModel();
private HuespedData huesData=new HuespedData();
private HabitacionData habData=new HabitacionData();
private ReservaData resData=new ReservaData(huesData, habData);
    /**
     * Creates new form Reservas
     */
    public Reservas() {
        initComponents();
        modeloTabla();
        Date fechaActual;
        if (AdministracionView.FECHA!=null) {
        fechaActual= Date.from(AdministracionView.FECHA.atStartOfDay(ZoneId.systemDefault()).toInstant());   
        }else{
        fechaActual=new Date();
        }       
        Calendar fe=Calendar.getInstance();
        fe.setTime(fechaActual);
        fe.add(Calendar.DAY_OF_YEAR, 120);
        Date fechalimite=fe.getTime();
        fe.add(Calendar.DAY_OF_YEAR, 1);
        Date fechalimite1=fe.getTime();
        jdIngreso.setMinSelectableDate(fechaActual);  
        jdIngreso.setMaxSelectableDate(fechalimite);
        jdSalida.setMaxSelectableDate(fechalimite1);
        jpDatos.setVisible(false);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) jdIngreso.getDateEditor(); //se convierte el jDateChooser en jTextFieldDateEditor para desactivar la edicion del campo de texto
        editor.setEditable(false);
        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) jdSalida.getDateEditor(); //se convierte el jDateChooser en jTextFieldDateEditor para desactivar la edicion del campo de texto
        editor1.setEditable(false);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpReservas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jdIngreso = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jdSalida = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHabitaciones = new javax.swing.JTable();
        jbReservar = new javax.swing.JButton();
        jpDatos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtDNI = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtDomicilio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtCelular = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbCompletarReserva = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtTipoHabitacion = new javax.swing.JTextField();
        jtIngreso = new javax.swing.JTextField();
        jtSalida = new javax.swing.JTextField();
        jtCantPersonas = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1020, 700));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jpReservas.setBackground(new java.awt.Color(27, 118, 134));
        jpReservas.setPreferredSize(new java.awt.Dimension(1020, 700));

        jLabel5.setBackground(new java.awt.Color(176, 184, 157));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RESERVAS");
        jLabel5.setMaximumSize(new java.awt.Dimension(225, 22));
        jLabel5.setMinimumSize(new java.awt.Dimension(225, 22));
        jLabel5.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(176, 184, 157));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingreso:");
        jLabel1.setOpaque(true);

        jdIngreso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdIngresoPropertyChange(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(176, 184, 157));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Salida:");
        jLabel2.setOpaque(true);

        jdSalida.setEnabled(false);
        jdSalida.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdSalidaPropertyChange(evt);
            }
        });

        jtHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jtHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtHabitaciones);

        jbReservar.setText("Reservar");
        jbReservar.setEnabled(false);
        jbReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpReservasLayout = new javax.swing.GroupLayout(jpReservas);
        jpReservas.setLayout(jpReservasLayout);
        jpReservasLayout.setHorizontalGroup(
            jpReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReservasLayout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addComponent(jbReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpReservasLayout.createSequentialGroup()
                .addGroup(jpReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpReservasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jdIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jdSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(jpReservasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(214, 214, 214))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpReservasLayout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jpReservasLayout.setVerticalGroup(
            jpReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReservasLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jdSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jdIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jbReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        getContentPane().add(jpReservas);

        jpDatos.setBackground(new java.awt.Color(27, 118, 134));
        jpDatos.setPreferredSize(new java.awt.Dimension(1020, 700));

        jLabel8.setBackground(new java.awt.Color(176, 184, 157));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Nombre y apellido:");
        jLabel8.setOpaque(true);

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(176, 184, 157));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("DNI:");
        jLabel7.setOpaque(true);

        jtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDNIKeyTyped(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(176, 184, 157));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Domicilio:");
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(176, 184, 157));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Correo:");
        jLabel10.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(176, 184, 157));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Celular:");
        jLabel11.setOpaque(true);

        jtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCelularKeyTyped(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(176, 184, 157));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DATOS PARA RESERVAR");
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(131, 29));
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jbCompletarReserva.setBackground(new java.awt.Color(51, 255, 51));
        jbCompletarReserva.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jbCompletarReserva.setText("COMPLETAR RESERVA!");
        jbCompletarReserva.setOpaque(false);
        jbCompletarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCompletarReservaActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(176, 184, 157));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Tipo de habitación:");
        jLabel12.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(176, 184, 157));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Cant. de Personas:");
        jLabel13.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(176, 184, 157));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Ingreso:");
        jLabel14.setOpaque(true);

        jLabel15.setBackground(new java.awt.Color(176, 184, 157));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Salida:");
        jLabel15.setOpaque(true);

        jtTipoHabitacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtTipoHabitacion.setEnabled(false);

        jtIngreso.setEnabled(false);

        jtSalida.setEnabled(false);

        jtCantPersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCantPersonasKeyTyped(evt);
            }
        });

        jbBuscar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jbBuscar.setText("Buscar ");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDatosLayout = new javax.swing.GroupLayout(jpDatos);
        jpDatos.setLayout(jpDatosLayout);
        jpDatosLayout.setHorizontalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosLayout.createSequentialGroup()
                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpDatosLayout.createSequentialGroup()
                                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpDatosLayout.createSequentialGroup()
                                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                                        .addGap(114, 114, 114))
                                    .addGroup(jpDatosLayout.createSequentialGroup()
                                        .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jpDatosLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jpDatosLayout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(91, 91, 91)))
                                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpDatosLayout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(69, 69, 69)
                                        .addComponent(jtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtNombre)
                                    .addComponent(jtDNI)
                                    .addComponent(jtDomicilio)
                                    .addComponent(jtCorreo)
                                    .addComponent(jtCelular)
                                    .addComponent(jtCantPersonas))))
                        .addGap(27, 27, 27)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jbCompletarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpDatosLayout.setVerticalGroup(
            jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jpDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCantPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jbCompletarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpDatos);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jdIngresoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdIngresoPropertyChange
        if (jdIngreso.getCalendar()!=null) { 
        LocalDate fe=jdIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        fe=fe.plusDays(1);
        jdSalida.setMinSelectableDate(Date.from(fe.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        jdSalida.setEnabled(true);
        jdSalida.transferFocus();        
        }
        //Se habilita el jdSalida con la fecha minima que es un dia despues de la jdIngreso
    }//GEN-LAST:event_jdIngresoPropertyChange

    private void jbReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReservarActionPerformed
        jpReservas.setVisible(false);
        jpDatos.setVisible(true);
        jtNombre.transferFocus();
        int filaSeleccionada=jtHabitaciones.getSelectedRow();
        if (filaSeleccionada>-1) {
            jtTipoHabitacion.setText(jtHabitaciones.getValueAt(filaSeleccionada, 0).toString());
            DateTimeFormatter formatefecha= DateTimeFormatter.ofPattern("dd/MM/yyyy");
            jtIngreso.setText(jdIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().format(formatefecha));
            jtSalida.setText(jdSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().format(formatefecha));
        }
        JOptionPane.showMessageDialog(jpDatos, "Si usted ya se hospedo en nuestro Hotel, coloque su DNI y busque sus datos");
        //Al apretar el boton reserva, desaparece jpReservas y aparece jpDatos con celdas cargagas y mensaje para que se busque
        //si ya se hospedo anteriormente
    }//GEN-LAST:event_jbReservarActionPerformed

    private void jdSalidaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdSalidaPropertyChange
        if (jdIngreso.getCalendar()!=null&&jdSalida.getCalendar()!=null) {
          cargarTabla();
        }
        //carga la tabla si existen dos fechas
    }//GEN-LAST:event_jdSalidaPropertyChange

    private void jbCompletarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCompletarReservaActionPerformed
           
        if (jtNombre.getText().length()>=1&&jtDNI.getText().length()>=1&&jtDomicilio.getText().length()>=1&&jtCelular.getText().length()>=1&&jtCorreo.getText().length()>=1&&jtCantPersonas.getText().length()>=1) {
         int dni=Integer.valueOf(jtDNI.getText());
            Habitacion hab=null;
            Huesped h=null;
            Reserva res=null;
            for (Habitacion habitacionesDisponible : resData.habitacionesDisponibles(jdIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), jdSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate())) {
                if (habitacionesDisponible.getTipoHabitacion().toString().equals(jtTipoHabitacion.getText())) {
                    hab=habitacionesDisponible;
                    break;
                }
            }
            if (huesData.buscarHuespedDni(dni)!=null) {               
            res=new Reserva(huesData.buscarHuespedDni(dni), hab, Integer.valueOf(jtCantPersonas.getText()),jdIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), jdSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            } else{
            h=new Huesped(jtNombre.getText(), dni, jtDomicilio.getText(), jtCorreo.getText(), jtCelular.getText(), false);
            huesData.agregarHuesped(h);
            res=new Reserva(h, hab, Integer.valueOf(jtCantPersonas.getText()),jdIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), jdSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            }
            resData.guardarReserva(res);
            limpiarCeldas();
            jpDatos.setVisible(false);
            jpReservas.setVisible(true); 
            jdIngreso.removeAll();
            jdSalida.removeAll();
            jtHabitaciones.removeAll();
            JOptionPane.showMessageDialog(jpDatos, "Reserva guardada. Su numero de habitación es "+ hab.getIdHabitacion());
        }else{         
            JOptionPane.showMessageDialog(jpDatos, "Faltan datos por completar");
        }
    }//GEN-LAST:event_jbCompletarReservaActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        if (jtDNI.getText().length()>=1) {
         Huesped h=huesData.buscarHuespedDni(Integer.valueOf(jtDNI.getText()));
        if (h!=null) {
        jtNombre.setText(h.getNombre());
        jtDomicilio.setText(h.getDomicilio());
        jtCorreo.setText(h.getCorreo());
        jtCelular.setText(h.getCelular());   
        }else{
            JOptionPane.showMessageDialog(jpDatos, "DNI no encontrado");
        }
        }else{
        JOptionPane.showMessageDialog(jpDatos, "Por favor ingrese su DNI");
        }       
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtCantPersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCantPersonasKeyTyped
        char c=evt.getKeyChar();
        Habitacion hab=null;
        for (Habitacion habitacion : habData.listarHabitaciones()) {
                if (habitacion.getTipoHabitacion().toString().equals(jtTipoHabitacion.getText())) {
                    hab=habitacion;
                    break;
                }
            }
        int cantMax=hab.getTipoHabitacion().getCantidadMaxPax();
        if (c>'9'||c<'1'||jtCantPersonas.getText().length()==1||Integer.valueOf(String.valueOf(c))>cantMax) {
        evt.consume();
        }      
    }//GEN-LAST:event_jtCantPersonasKeyTyped

    private void jtHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtHabitacionesMouseClicked
        if (jtHabitaciones.getSelectedRow()!=-1) {
         jbReservar.setEnabled(true);   
        }//habilita el boton reservar
    }//GEN-LAST:event_jtHabitacionesMouseClicked

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        char c=evt.getKeyChar();
        if (c!=' ') {
         if (c<'A'||c>'z'||jtNombre.getText().length()>30) {
            evt.consume();
        }   
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDNIKeyTyped
        char c=evt.getKeyChar();
        if (c>'9'||c<'0'||jtDNI.getText().length()>10) {
        evt.consume();
        }
    }//GEN-LAST:event_jtDNIKeyTyped

    private void jtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCelularKeyTyped
        char c=evt.getKeyChar();
        if (c>'9'||c<'0'||jtCelular.getText().length()>15) {
        evt.consume();
        }
    }//GEN-LAST:event_jtCelularKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCompletarReserva;
    private javax.swing.JButton jbReservar;
    private com.toedter.calendar.JDateChooser jdIngreso;
    private com.toedter.calendar.JDateChooser jdSalida;
    private javax.swing.JPanel jpDatos;
    private javax.swing.JPanel jpReservas;
    private javax.swing.JTextField jtCantPersonas;
    private javax.swing.JTextField jtCelular;
    private javax.swing.JTextField jtCorreo;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTable jtHabitaciones;
    private javax.swing.JTextField jtIngreso;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtSalida;
    private javax.swing.JTextField jtTipoHabitacion;
    // End of variables declaration//GEN-END:variables

    public void modeloTabla(){
 
        modelo.addColumn("Tipo de Habitación");
        modelo.addColumn("Cantidad de Personas");
        modelo.addColumn("Descripción");
        modelo.addColumn("Valor");
        jtHabitaciones.setModel(modelo);
    }
    public void cargarTabla(){
        limpiarTabla();
        int simple=0;
        int simpleq=0;
        int doblemat=0;
        int dobletwin=0;
        int triplemat=0;
        int tripletwin=0;
        int suite=0;
        LocalDate fecha1=jdIngreso.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fecha2=jdSalida.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        List<Habitacion>hab=new ArrayList<>();
        hab=resData.habitacionesDisponibles(fecha1,fecha2);
        for (Habitacion habitacion : hab) {
            if (null!=habitacion.getTipoHabitacion()) switch (habitacion.getTipoHabitacion()) {
                case ESTANDAR_SIMPLE:                                   
                    if (simple==0){
                    modelo.addRow(new Object[]{habitacion.getTipoHabitacion(),habitacion.getTipoHabitacion().getCantidadMaxPax(),habitacion.getTipoHabitacion().getDescripcion(),"$"+(habitacion.getPrecio()*fecha2.compareTo(fecha1))});
                    }
                    simple=1;
                    break;
                case ESTANDAR_SIMPLE_QUEEN:
                    if (simpleq==0){
                    modelo.addRow(new Object[]{habitacion.getTipoHabitacion(),habitacion.getTipoHabitacion().getCantidadMaxPax(),habitacion.getTipoHabitacion().getDescripcion(),"$"+(habitacion.getPrecio()*fecha2.compareTo(fecha1))});
                    }
                    simpleq=1;
                    break;
                case ESTANDAR_DOBLE_MAT:
                    if (doblemat==0){
                    modelo.addRow(new Object[]{habitacion.getTipoHabitacion(),habitacion.getTipoHabitacion().getCantidadMaxPax(),habitacion.getTipoHabitacion().getDescripcion(),"$"+(habitacion.getPrecio()*fecha2.compareTo(fecha1))});
                    }
                    doblemat=1;
                    break;
                case ESTANDAR_DOBLE_TWIN:
                    if (dobletwin==0){
                        modelo.addRow(new Object[]{habitacion.getTipoHabitacion(),habitacion.getTipoHabitacion().getCantidadMaxPax(),habitacion.getTipoHabitacion().getDescripcion(),"$"+(habitacion.getPrecio()*fecha2.compareTo(fecha1))});
                    }
                    dobletwin=1;
                    break;
                case ESTANDAR_TRIPLE_MAT:
                    if (triplemat==0){
                    modelo.addRow(new Object[]{habitacion.getTipoHabitacion(),habitacion.getTipoHabitacion().getCantidadMaxPax(),habitacion.getTipoHabitacion().getDescripcion(),"$"+(habitacion.getPrecio()*fecha2.compareTo(fecha1))});
                    }
                    triplemat=1;
                    break;
                case ESTANDAR_TRIPLE_TWIN:
                    if (tripletwin==0){
                    modelo.addRow(new Object[]{habitacion.getTipoHabitacion(),habitacion.getTipoHabitacion().getCantidadMaxPax(),habitacion.getTipoHabitacion().getDescripcion(),"$"+(habitacion.getPrecio()*fecha2.compareTo(fecha1))});
                    }
                    tripletwin=1;
                    break;
                case SUITE_DE_LUJO:
                    if (suite==0){
                    modelo.addRow(new Object[]{habitacion.getTipoHabitacion(),habitacion.getTipoHabitacion().getCantidadMaxPax(),habitacion.getTipoHabitacion().getDescripcion(),"$"+(habitacion.getPrecio()*fecha2.compareTo(fecha1))});
                    }
                    suite=1;
                    break;                    
                default:
                    break;
            }
            
        }
    }
   
    private void limpiarTabla(){
        int filas =modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    } 
    private void limpiarCeldas(){

        jtCantPersonas.setText("");
        jtCelular.setText("");
        jtCorreo.setText("");
        jtDNI.setText("");
        jtNombre.setText("");
        jtDomicilio.setText("");
                
    }
}
