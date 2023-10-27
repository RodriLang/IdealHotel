package VIstas.Administracion;

import AccesoADatos.HabitacionData;
import AccesoADatos.ReservaData;
import VIstas.AdministracionView;
import com.toedter.calendar.JCalendar;
import entidades.Habitacion;
import entidades.Reserva;
import java.sql.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CheckInSinReservaView extends javax.swing.JFrame {

    private Reserva reserva;
    private HabitacionData habData;
    private ReservaData resData;
    private Habitacion habitacion;
    private PanelAdminHabitaciones panelAdmin;
    private AdministracionView ventana;

    public CheckInSinReservaView(AdministracionView ventana, PanelAdminHabitaciones panelAdmin, HabitacionData habData, ReservaData resData, Habitacion habitacion) {
        this.habitacion = habitacion;
        this.habData = habData;
        this.resData = resData;
        this.ventana = ventana;
        this.panelAdmin = panelAdmin;
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        labelChekIn.setText("CHECK IN HABITACIÓN N° " + habitacion.getIdHabitacion());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelAtributos1 = new javax.swing.JPanel();
        labelEmail = new javax.swing.JLabel();
        labelDomicilio = new javax.swing.JLabel();
        textFieldDomicilio = new javax.swing.JTextField();
        labelHuesped = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        labelDocumento = new javax.swing.JLabel();
        textFieldDni = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        textFieldTelefono = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labelFechaIn = new javax.swing.JLabel();
        labelFechaOut = new javax.swing.JLabel();
        textFieldValor = new javax.swing.JTextField();
        labelValor = new javax.swing.JLabel();
        dateChooserEntrada = new com.toedter.calendar.JDateChooser();
        dateChooserSalida = new com.toedter.calendar.JDateChooser();
        botonLimpiar = new javax.swing.JButton();
        botonLimpiar1 = new javax.swing.JButton();
        labelChekIn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 118, 134));
        jPanel1.setPreferredSize(new java.awt.Dimension(984, 581));

        jPanel2.setOpaque(false);

        panelAtributos1.setOpaque(false);

        labelEmail.setBackground(new java.awt.Color(176, 184, 157));
        labelEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEmail.setText("EMAIL");
        labelEmail.setOpaque(true);

        labelDomicilio.setBackground(new java.awt.Color(176, 184, 157));
        labelDomicilio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelDomicilio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDomicilio.setText("DOMICILIO");
        labelDomicilio.setOpaque(true);

        textFieldDomicilio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldDomicilio.setPreferredSize(new java.awt.Dimension(80, 28));

        labelHuesped.setBackground(new java.awt.Color(176, 184, 157));
        labelHuesped.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelHuesped.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHuesped.setText("DATOS  DEL  HUESPED");
        labelHuesped.setOpaque(true);
        labelHuesped.setPreferredSize(new java.awt.Dimension(300, 30));

        labelNombre.setBackground(new java.awt.Color(176, 184, 157));
        labelNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre.setText("NOMBRE");
        labelNombre.setOpaque(true);

        textFieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldNombre.setPreferredSize(new java.awt.Dimension(80, 28));

        labelDocumento.setBackground(new java.awt.Color(176, 184, 157));
        labelDocumento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelDocumento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDocumento.setText("N° DOCUMENTO");
        labelDocumento.setOpaque(true);

        textFieldDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldDni.setPreferredSize(new java.awt.Dimension(80, 28));
        textFieldDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldDniKeyReleased(evt);
            }
        });

        labelTelefono.setBackground(new java.awt.Color(176, 184, 157));
        labelTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTelefono.setText("TELÉFONO");
        labelTelefono.setOpaque(true);

        textFieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldEmail.setPreferredSize(new java.awt.Dimension(80, 28));

        textFieldTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldTelefono.setPreferredSize(new java.awt.Dimension(80, 28));

        javax.swing.GroupLayout panelAtributos1Layout = new javax.swing.GroupLayout(panelAtributos1);
        panelAtributos1.setLayout(panelAtributos1Layout);
        panelAtributos1Layout.setHorizontalGroup(
            panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtributos1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelAtributos1Layout.createSequentialGroup()
                        .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelAtributos1Layout.createSequentialGroup()
                        .addComponent(labelDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAtributos1Layout.createSequentialGroup()
                        .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(textFieldDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(labelHuesped, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelAtributos1Layout.setVerticalGroup(
            panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAtributos1Layout.createSequentialGroup()
                .addComponent(labelHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAtributos1Layout.createSequentialGroup()
                        .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAtributos1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(labelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAtributos1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonGuardar.setBackground(new java.awt.Color(176, 184, 157));
        botonGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonGuardar.setText("GUARDAR");
        botonGuardar.setEnabled(false);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        jPanel4.setOpaque(false);

        labelFechaIn.setBackground(new java.awt.Color(176, 184, 157));
        labelFechaIn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelFechaIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFechaIn.setText("FECHA ENTRADA");
        labelFechaIn.setOpaque(true);

        labelFechaOut.setBackground(new java.awt.Color(176, 184, 157));
        labelFechaOut.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelFechaOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFechaOut.setText("FECHA SALIDA");
        labelFechaOut.setOpaque(true);

        textFieldValor.setEditable(false);
        textFieldValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldValor.setPreferredSize(new java.awt.Dimension(80, 28));

        labelValor.setBackground(new java.awt.Color(176, 184, 157));
        labelValor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelValor.setText("VALOR $");
        labelValor.setOpaque(true);

        dateChooserEntrada.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                dateChooserEntradaAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        dateChooserSalida.setEnabled(false);
        dateChooserSalida.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                dateChooserSalidaAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelFechaOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelFechaIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textFieldValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChooserEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateChooserSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooserEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFechaOut, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooserSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonLimpiar.setBackground(new java.awt.Color(176, 184, 157));
        botonLimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonLimpiar.setText("LIMPIAR");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonLimpiar1.setBackground(new java.awt.Color(176, 184, 157));
        botonLimpiar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonLimpiar1.setText("CANCELAR");
        botonLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelAtributos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(botonLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelAtributos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonLimpiar)
                    .addComponent(botonLimpiar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelChekIn.setBackground(new java.awt.Color(176, 184, 157));
        labelChekIn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelChekIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelChekIn.setText("CHECK IN");
        labelChekIn.setOpaque(true);
        labelChekIn.setPreferredSize(new java.awt.Dimension(300, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelChekIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelChekIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldDniKeyReleased

        if (textFieldDni.getText().equals("dni")) {

        }
    }//GEN-LAST:event_textFieldDniKeyReleased

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        habData.ocuparHabitacion(habitacion.getIdHabitacion());

        resData.guardarReserva(reserva);
        limpiarCampos();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonLimpiar1ActionPerformed

    private void dateChooserEntradaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_dateChooserEntradaAncestorMoved
        dateChooserEntrada.setMinSelectableDate(Date.valueOf(AdministracionView.FECHA));
        dateChooserSalida.setEnabled(true);

    }//GEN-LAST:event_dateChooserEntradaAncestorMoved

    private void dateChooserSalidaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_dateChooserSalidaAncestorMoved
        
        dateChooserEntrada.setMaxSelectableDate(Date.valueOf(AdministracionView.FECHA.plusDays(90)));       
        dateChooserSalida.setMinSelectableDate(dateChooserEntrada.getDate());
    }//GEN-LAST:event_dateChooserSalidaAncestorMoved

    private void limpiarCampos() {

        textFieldNombre.setText("");
        textFieldDni.setText("");
        textFieldEmail.setText("");
        textFieldTelefono.setText("");
        textFieldDomicilio.setText("");
        textFieldValor.setText("");
        botonGuardar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonLimpiar1;
    private com.toedter.calendar.JDateChooser dateChooserEntrada;
    private com.toedter.calendar.JDateChooser dateChooserSalida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelChekIn;
    private javax.swing.JLabel labelDocumento;
    private javax.swing.JLabel labelDomicilio;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFechaIn;
    private javax.swing.JLabel labelFechaOut;
    private javax.swing.JLabel labelHuesped;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelValor;
    private javax.swing.JPanel panelAtributos1;
    private javax.swing.JTextField textFieldDni;
    private javax.swing.JTextField textFieldDomicilio;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldTelefono;
    private javax.swing.JTextField textFieldValor;
    // End of variables declaration//GEN-END:variables

}