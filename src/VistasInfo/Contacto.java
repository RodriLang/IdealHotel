/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VistasInfo;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joelb
 */
public class Contacto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Contacto
     */
    public Contacto() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(27, 118, 134));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(176, 184, 157));
        jPanel1.setPreferredSize(new java.awt.Dimension(1020, 60));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTACTO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(344, 0, 315, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1020, 60);

        jPanel2.setBackground(new java.awt.Color(27, 118, 134));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nuestros Datos");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(650, 40, 200, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(330, 100, 140, 15);

        jTextField1.setBackground(new java.awt.Color(176, 184, 157));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(330, 120, 240, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Correo");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 170, 140, 15);

        jTextField2.setBackground(new java.awt.Color(176, 184, 157));
        jTextField2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(40, 190, 240, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 100, 140, 15);

        jTextField3.setBackground(new java.awt.Color(176, 184, 157));
        jTextField3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(40, 120, 240, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Mensaje");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 260, 120, 15);

        jTextArea1.setBackground(new java.awt.Color(176, 184, 157));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(40, 250, 530, 230);

        jPanel3.setBackground(new java.awt.Color(176, 184, 157));
        jPanel3.setLayout(null);

        jCheckBox1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("No soy un robot");
        jPanel3.add(jCheckBox1);
        jCheckBox1.setBounds(20, 20, 120, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(40, 520, 150, 70);

        jButton1.setBackground(new java.awt.Color(176, 184, 157));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("ENVIAR MENSAJE");
        jPanel2.add(jButton1);
        jButton1.setBounds(410, 530, 160, 40);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Contáctenos");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 40, 160, 40);

        jPanel4.setBackground(new java.awt.Color(176, 184, 157));
        jPanel4.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/marcador.png"))); // NOI18N
        jPanel4.add(jLabel9);
        jLabel9.setBounds(30, 20, 40, 40);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Correo");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(70, 180, 170, 16);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("info@hotelideal.com");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(70, 200, 220, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/llamada-telefonica.png"))); // NOI18N
        jPanel4.add(jLabel11);
        jLabel11.setBounds(30, 100, 40, 40);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Dirección");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(70, 20, 170, 16);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Güemes 201, La Falda, Córdoba");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(70, 40, 220, 20);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sobre.png"))); // NOI18N
        jPanel4.add(jLabel14);
        jLabel14.setBounds(30, 180, 43, 40);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Teléfonos");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(70, 100, 170, 16);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("+54 351 4227133");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(70, 120, 220, 20);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/instagram.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jPanel4.add(jButton5);
        jButton5.setBounds(80, 400, 40, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facebook.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jPanel4.add(jButton2);
        jButton2.setBounds(130, 400, 38, 40);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/whatsapp.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jPanel4.add(jButton3);
        jButton3.setBounds(180, 400, 40, 40);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/maps.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel17);
        jLabel17.setBounds(20, 240, 270, 140);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(650, 120, 320, 450);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 1020, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        try {
            // TODO add your handling code here:
            URI uri = new URI("https://www.google.com/maps/place/Hotel+Ideal+La+Falda/@-31.0923101,-64.4887941,17z/data=!3m1!4b1!4m9!3m8!1s0x942d83028ea9653d:0xc8ae13c14f1ea26b!5m2!4m1!1i2!8m2!3d-31.0923101!4d-64.4887941!16s%2Fg%2F11fxdxs0b6?entry=ttu");
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jLabel17MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
