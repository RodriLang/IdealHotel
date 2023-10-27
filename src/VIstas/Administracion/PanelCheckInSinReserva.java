/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIstas.Administracion;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import VIstas.Administracion.PanelAdminHabitaciones;
import VIstas.AdministracionView;
import entidades.Habitacion;
import entidades.Huesped;
import entidades.Reserva;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Rodri
 */
public class PanelCheckInSinReserva extends javax.swing.JPanel {

    private Reserva reserva;
    private HabitacionData habData;
    private ReservaData resData;
    private Habitacion habitacion;
    private PanelAdminHabitaciones panelAdmin;
    private AdministracionView ventana;

    public PanelCheckInSinReserva(AdministracionView ventana, PanelAdminHabitaciones panelAdmin, HabitacionData habData, ReservaData resData) {
         this.habData = habData;
        this.resData = resData;
        this.ventana = ventana;
        this.panelAdmin = panelAdmin;
        initComponents();
        this.setVisible(false);
    }

    /**
     * Creates new form panelAdminHabitaciones
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
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
        textFieldFechaIn = new javax.swing.JTextField();
        labelFechaIn = new javax.swing.JLabel();
        labelFechaOut = new javax.swing.JLabel();
        textFieldFechaOut = new javax.swing.JTextField();
        textFieldValor = new javax.swing.JTextField();
        labelValor = new javax.swing.JLabel();
        botonLimpiar = new javax.swing.JButton();
        botonLimpiar1 = new javax.swing.JButton();
        labelChekIn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(27, 118, 134));
        setPreferredSize(new java.awt.Dimension(984, 581));

        jPanel1.setOpaque(false);

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
                .addContainerGap()
                .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAtributos1Layout.createSequentialGroup()
                        .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAtributos1Layout.createSequentialGroup()
                            .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textFieldTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAtributos1Layout.createSequentialGroup()
                            .addComponent(labelDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(textFieldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(panelAtributos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAtributos1Layout.createSequentialGroup()
                        .addComponent(textFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonGuardar.setBackground(new java.awt.Color(176, 184, 157));
        botonGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonGuardar.setText("GUARDAR");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        jPanel4.setOpaque(false);

        textFieldFechaIn.setEditable(false);
        textFieldFechaIn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldFechaIn.setPreferredSize(new java.awt.Dimension(80, 28));

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

        textFieldFechaOut.setEditable(false);
        textFieldFechaOut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldFechaOut.setPreferredSize(new java.awt.Dimension(80, 28));

        textFieldValor.setEditable(false);
        textFieldValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldValor.setPreferredSize(new java.awt.Dimension(80, 28));

        labelValor.setBackground(new java.awt.Color(176, 184, 157));
        labelValor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelValor.setText("VALOR $");
        labelValor.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelFechaOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFechaIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textFieldFechaOut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldFechaIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelFechaOut, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(textFieldFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldFechaOut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonLimpiar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelAtributos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelAtributos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelChekIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelChekIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if (labelChekIn.getText().equals("CHECK IN")) {
            habData.ocuparHabitacion(habitacion.getIdHabitacion());
        } else {
            habData.liberarHabitacion(habitacion.getIdHabitacion());
        }
        resData.modificarReserva(reserva);
        limpiarCampos();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void textFieldDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldDniKeyReleased

        if (textFieldDni.getText().equals("dni")) {

        }
    }//GEN-LAST:event_textFieldDniKeyReleased

    private void botonLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonLimpiar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonLimpiar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JTextField textFieldFechaIn;
    private javax.swing.JTextField textFieldFechaOut;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldTelefono;
    private javax.swing.JTextField textFieldValor;
    // End of variables declaration//GEN-END:variables


    private void limpiarCampos() {

        textFieldNombre.setText("");
        textFieldDni.setText("");
        textFieldEmail.setText("");
        textFieldTelefono.setText("");
        textFieldDomicilio.setText("");
        textFieldFechaIn.setText("");
        textFieldFechaOut.setText("");
        textFieldValor.setText("");
        botonGuardar.setEnabled(false);
    }

}