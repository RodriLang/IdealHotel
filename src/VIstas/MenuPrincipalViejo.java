package VIstas;

import java.awt.Color;
import javax.swing.JInternalFrame;

public class MenuPrincipalViejo extends javax.swing.JFrame {

    public MenuPrincipalViejo() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        botonAdmin = new javax.swing.JButton();
        botonHome = new javax.swing.JButton();
        botonNosotros = new javax.swing.JButton();
        botonGaleria = new javax.swing.JButton();
        botonReservas = new javax.swing.JButton();
        botonContacto = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelGeneral.setLayout(null);

        panelBotones.setBackground(new java.awt.Color(27, 118, 134));
        panelBotones.setPreferredSize(new java.awt.Dimension(1261, 700));

        botonAdmin.setBackground(new java.awt.Color(176, 184, 157));
        botonAdmin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonAdmin.setText("ADMINISTRACIÓN");
        botonAdmin.setContentAreaFilled(false);
        botonAdmin.setOpaque(true);
        botonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdminActionPerformed(evt);
            }
        });

        botonHome.setBackground(new java.awt.Color(176, 184, 157));
        botonHome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botonHome.setText("HOME");
        botonHome.setContentAreaFilled(false);
        botonHome.setOpaque(true);

        botonNosotros.setBackground(new java.awt.Color(176, 184, 157));
        botonNosotros.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonNosotros.setText("SOBRE NOSOTROS");
        botonNosotros.setContentAreaFilled(false);
        botonNosotros.setOpaque(true);
        botonNosotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNosotrosActionPerformed(evt);
            }
        });

        botonGaleria.setBackground(new java.awt.Color(176, 184, 157));
        botonGaleria.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botonGaleria.setText("GALERÍA");
        botonGaleria.setContentAreaFilled(false);
        botonGaleria.setOpaque(true);

        botonReservas.setBackground(new java.awt.Color(176, 184, 157));
        botonReservas.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botonReservas.setText("RESERVAS");
        botonReservas.setContentAreaFilled(false);
        botonReservas.setOpaque(true);

        botonContacto.setBackground(new java.awt.Color(176, 184, 157));
        botonContacto.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        botonContacto.setText("CONTACTO");
        botonContacto.setContentAreaFilled(false);
        botonContacto.setOpaque(true);

        labelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoHotelIdeal.png"))); // NOI18N

        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        botonCerrar.setContentAreaFilled(false);
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLogo)
                .addGap(52, 52, 52))
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonGaleria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonNosotros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelLogo)
                .addGap(34, 34, 34)
                .addComponent(botonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(botonNosotros, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonGaleria, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(botonReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(botonContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        panelGeneral.add(panelBotones);
        panelBotones.setBounds(0, 0, 260, 700);

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoHabitacion.png"))); // NOI18N
        jDesktopPane1.add(labelFondo);
        labelFondo.setBounds(0, 0, 1020, 700);

        panelGeneral.add(jDesktopPane1);
        jDesktopPane1.setBounds(260, 0, 1020, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonNosotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNosotrosActionPerformed
        SobreNosotrosView ventana = new SobreNosotrosView();
        mostrarVentana(ventana);
    }//GEN-LAST:event_botonNosotrosActionPerformed

    private void botonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAdminActionPerformed
        VentanaLogin login = new VentanaLogin();
        
    }//GEN-LAST:event_botonAdminActionPerformed
    private void mostrarVentana(JInternalFrame ventana) {
        ventana.setVisible(true);
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        jDesktopPane1.add(ventana);
        jDesktopPane1.add(labelFondo);
        jDesktopPane1.moveToFront(this);
        ventana.setSize(jDesktopPane1.getSize());
        ventana.setResizable(false);
    }

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
            java.util.logging.Logger.getLogger(MenuPrincipalViejo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalViejo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalViejo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalViejo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalViejo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdmin;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonContacto;
    private javax.swing.JButton botonGaleria;
    private javax.swing.JButton botonHome;
    private javax.swing.JButton botonNosotros;
    private javax.swing.JButton botonReservas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelGeneral;
    // End of variables declaration//GEN-END:variables

}
