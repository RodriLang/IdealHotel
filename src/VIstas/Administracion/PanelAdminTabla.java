/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIstas.Administracion;

import entidades.TipoHabitacion;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import VIstas.AdministracionView;
import entidades.Habitacion;
import entidades.Huesped;
import entidades.Reserva;
import java.awt.Color;
import java.awt.Component;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


/**
 *
 * @author Rodri
 */
public class PanelAdminTabla extends javax.swing.JPanel {

   private DefaultTableModel modelo=new DefaultTableModel(){
        public boolean isCellEditable(int f, int c){
            return false;//ninguna celda es editable
        } 
    };
    private LocalDate fecha1 = LocalDate.of(2023,12,1);
    private LocalDate fecha2 = LocalDate.of(2023,12,20);
    private HabitacionData habitacionData= new HabitacionData();
    private List<LocalDate> fechas=new ArrayList<>();
    
    private HuespedData huespedData=new HuespedData();
    private ReservaData reservaData=new ReservaData(huespedData, habitacionData);
    
    public PanelAdminTabla() {
        initComponents();
        this.setVisible(false);
        armarCabecera();
        cargarComboPisos();
        //System.out.println("armar Cabecera: "+modelo.getColumnCount());
        cargarComboBoxTipoHabitacion();
        llenarTablaPorPiso();
        //System.out.println("llenar tabla initComponents: "+modelo.getColumnCount());
        TablaHabitaciones.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        TablaHabitaciones.setAutoCreateRowSorter(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ComboPisos = new javax.swing.JComboBox<>();
        ComboTipoHabitaciones = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHabitaciones = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DetNombre = new javax.swing.JTextField();
        DetDni = new javax.swing.JTextField();
        DetTelefono = new javax.swing.JTextField();
        DetTextCheckInn = new javax.swing.JTextField();
        DetTextCheckOut = new javax.swing.JTextField();
        DetDomicilio = new javax.swing.JTextField();
        DetIdHuesped = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DetIdReserva = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DetCorreo = new javax.swing.JTextField();
        DetImporte = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        DetAlojado = new javax.swing.JTextField();

        setBackground(new java.awt.Color(27, 118, 134));
        setPreferredSize(new java.awt.Dimension(1007, 573));

        jPanel5.setBackground(new java.awt.Color(27, 118, 134));
        jPanel5.setPreferredSize(new java.awt.Dimension(1007, 573));

        jPanel1.setBackground(new java.awt.Color(27, 118, 134));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Habitaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel2.setText("Tipo de Habitación");

        jLabel1.setText("Piso");

        ComboPisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPisosActionPerformed(evt);
            }
        });

        ComboTipoHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoHabitacionesActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        TablaHabitaciones.setBackground(new java.awt.Color(153, 204, 255));
        TablaHabitaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TablaHabitaciones.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TablaHabitaciones.setForeground(new java.awt.Color(102, 102, 102));
        TablaHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaHabitaciones.setRowHeight(20);
        TablaHabitaciones.setSelectionForeground(new java.awt.Color(204, 204, 255));
        TablaHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaHabitacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaHabitaciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(ComboPisos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(ComboTipoHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 398, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboPisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(ComboTipoHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(27, 118, 134));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(956, 177));

        jLabel5.setText("E-Mail:");

        jLabel8.setText("ID Huésped:");

        jLabel7.setText("Teléfono:");

        jLabel.setText("Domicilio");

        jLabel6.setText("Dni:");

        jLabel15.setText("Huésped:");

        jLabel9.setText("Check-Inn:");

        jLabel10.setText("Check-Out:");

        DetNombre.setEditable(false);
        DetNombre.setBackground(new java.awt.Color(27, 118, 134));
        DetNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DetNombre.setForeground(new java.awt.Color(0, 153, 255));

        DetDni.setEditable(false);
        DetDni.setBackground(new java.awt.Color(27, 118, 134));

        DetTelefono.setEditable(false);
        DetTelefono.setBackground(new java.awt.Color(27, 118, 134));

        DetTextCheckInn.setEditable(false);
        DetTextCheckInn.setBackground(new java.awt.Color(27, 118, 134));

        DetTextCheckOut.setEditable(false);
        DetTextCheckOut.setBackground(new java.awt.Color(27, 118, 134));

        DetDomicilio.setEditable(false);
        DetDomicilio.setBackground(new java.awt.Color(27, 118, 134));

        DetIdHuesped.setEditable(false);
        DetIdHuesped.setBackground(new java.awt.Color(27, 118, 134));

        jLabel3.setText("ID Reserva:");

        DetIdReserva.setEditable(false);
        DetIdReserva.setBackground(new java.awt.Color(27, 118, 134));

        jLabel4.setText("Importe:");

        DetCorreo.setEditable(false);
        DetCorreo.setBackground(new java.awt.Color(27, 118, 134));

        DetImporte.setEditable(false);
        DetImporte.setBackground(new java.awt.Color(27, 118, 134));

        jLabel11.setText("Alojado:");

        DetAlojado.setEditable(false);
        DetAlojado.setBackground(new java.awt.Color(27, 118, 134));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel)
                    .addComponent(jLabel15)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DetDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DetNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(48, 48, 48)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(DetIdHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel3)
                                .addGap(31, 31, 31)
                                .addComponent(DetIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DetTelefono)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DetDni, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(DetTextCheckInn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(DetCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(29, 29, 29)
                                .addComponent(DetTextCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DetImporte, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(DetAlojado))))
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(DetNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(DetIdHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(DetIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel)
                    .addComponent(DetDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(DetTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(DetDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DetCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11))
                                .addGap(2, 2, 2)))
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(DetAlojado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(DetTextCheckInn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DetTextCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(DetImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ComboPisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPisosActionPerformed
        llenarTablaPorPiso();
    }//GEN-LAST:event_ComboPisosActionPerformed

    private void ComboTipoHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoHabitacionesActionPerformed
        llenarTablaPorTipoHabitacion();
    }//GEN-LAST:event_ComboTipoHabitacionesActionPerformed

    private void TablaHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaHabitacionesMouseClicked
        mostrarDetalles();
    }//GEN-LAST:event_TablaHabitacionesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Integer> ComboPisos;
    private javax.swing.JComboBox<TipoHabitacion> ComboTipoHabitaciones;
    private javax.swing.JTextField DetAlojado;
    private javax.swing.JTextField DetCorreo;
    private javax.swing.JTextField DetDni;
    private javax.swing.JTextField DetDomicilio;
    private javax.swing.JTextField DetIdHuesped;
    private javax.swing.JTextField DetIdReserva;
    private javax.swing.JTextField DetImporte;
    private javax.swing.JTextField DetNombre;
    private javax.swing.JTextField DetTelefono;
    private javax.swing.JTextField DetTextCheckInn;
    private javax.swing.JTextField DetTextCheckOut;
    private javax.swing.JTable TablaHabitaciones;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
            //(List<LocalDate> fechasDeLaTemporada)
        
       ArrayList<LocalDate> fechas = new ArrayList<>();
        LocalDate fechaActual =fecha1;
        modelo.addColumn("HAB");
        
        while (!fechaActual.isAfter(fecha2)) {
            fechas.add(fechaActual);
            fechaActual = fechaActual.plusDays(1);
        }
       
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM");

        for (LocalDate fecha : fechas) {
            String nombreColumna = fecha.format(formatoFecha);
            modelo.addColumn(nombreColumna);
        }
            
        TablaHabitaciones.setModel(modelo);
        for (int column = 1; column < TablaHabitaciones.getColumnCount(); column++) {
            TablaHabitaciones.getColumnModel().getColumn(column).setCellRenderer(new CustomCellRenderer());
        }
        
//        JScrollPane scrollPane = new JScrollPane(TablaHabitaciones);
//        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//        this.add(scrollPane);
    }

    private void cargarComboPisos() {
        ComboPisos.addItem(1);
        ComboPisos.addItem(2);
        ComboPisos.addItem(3);
        ComboPisos.addItem(4);
        ComboPisos.addItem(5);
        ComboPisos.addItem(6);
        ComboPisos.addItem(7);
        ComboPisos.addItem(8);
    }
     
    public void cargarComboBoxTipoHabitacion() {
        ComboTipoHabitaciones.addItem(TipoHabitacion.ESTANDAR_SIMPLE);
        ComboTipoHabitaciones.addItem(TipoHabitacion.ESTANDAR_SIMPLE_QUEEN);
        ComboTipoHabitaciones.addItem(TipoHabitacion.ESTANDAR_DOBLE_MAT);
        ComboTipoHabitaciones.addItem(TipoHabitacion.ESTANDAR_DOBLE_TWIN);
        ComboTipoHabitaciones.addItem(TipoHabitacion.ESTANDAR_TRIPLE_MAT);
        ComboTipoHabitaciones.addItem(TipoHabitacion.ESTANDAR_TRIPLE_TWIN);
        ComboTipoHabitaciones.addItem(TipoHabitacion.SUITE_DE_LUJO);
    }
     
    private void llenarTablaPorPiso(){
        modelo.setRowCount(0);
        List<Integer> habitaciones = habitacionData.listarIDhabitacionesHabilitadasPorPiso((int)ComboPisos.getSelectedItem());
        List<LocalDate> fechas = reservaData.obtenerFechas(fecha1, fecha2);
 
        
        int columnas=TablaHabitaciones.getColumnCount();
 
        
        for(Integer idHabitacion : habitaciones) {
            Object[] fila= new Object[columnas+3];
            fila[0]=idHabitacion; 
            int indice = 1;
            for (LocalDate fecha : fechas){
               try{
                    Reserva reserva=reservaData.buscarReservasPorIDHabitacionYfecha(fecha, idHabitacion);
                    int idReserva=reserva.getIdReserva();
                    if(idReserva==0){
                        fila[indice] =null;
                    }else{
                        fila[indice]=idReserva;
                    }
               }catch(NullPointerException ex){
                    
               }
               indice++;
            }
            modelo.addRow(fila);

            }
    }
       
    private void llenarTablaPorTipoHabitacion(){
        modelo.setRowCount(0);
        List<Habitacion> habitaciones = habitacionData.listarHabitacionesPorTipo((TipoHabitacion) ComboTipoHabitaciones.getSelectedItem());
        List<LocalDate> fechas = reservaData.obtenerFechas(fecha1, fecha2);
 
        
        int columnas=TablaHabitaciones.getColumnCount();
 
        
        for(Habitacion hab : habitaciones) {
            Object[] fila= new Object[columnas+3];
            fila[0]=hab.getIdHabitacion(); 
            int indice = 1;
            for (LocalDate fecha : fechas){
               try{
                    Reserva reserva=reservaData.buscarReservasPorIDHabitacionYfecha(fecha, hab.getIdHabitacion());
                    int idReserva=reserva.getIdReserva();
                    if(idReserva==0){
                        fila[indice] =null;
                    }else{
                        fila[indice]=idReserva;
                    }
               }catch(NullPointerException ex){
                    
               }
               indice++;
            }
            modelo.addRow(fila);

            }
    }
        
    
    private void mostrarDetalles(){
        limpiarDetalles();
        try{
            int valorCelda=((int)TablaHabitaciones.getValueAt(TablaHabitaciones.getSelectedRow(), TablaHabitaciones.getSelectedColumn()));
            Reserva reserva=reservaData.buscarReservaId(valorCelda);
            Huesped huesped = huespedData.buscarHuespedId(reserva.getHuesped().getIdHuesped());
            DetNombre.setText(huesped.getNombre());
            DetDni.setText(String.valueOf(huesped.getDni()));
            DetDomicilio.setText(huesped.getDomicilio());
            DetTelefono.setText(huesped.getCelular());
            DetCorreo.setText(huesped.getCorreo());
            DetIdHuesped.setText(String.valueOf(reserva.getHuesped().getIdHuesped()));
            DetIdReserva.setText(String.valueOf(reserva.getIdReserva()));
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DetTextCheckInn.setText(reserva.getFechaInn().format(formato));
            DetTextCheckOut.setText(reserva.getFechaOut().format(formato));
            DetImporte.setText(String.valueOf(reserva.getImporte()));
            if(huesped.isAlojado()==true){
                DetAlojado.setText("SI");
            }else{
                DetAlojado.setText("NO");
            }
        }catch(NullPointerException ex){}

    }
    
    private void limpiarDetalles(){
        DetNombre.setText("");
        DetDni.setText("");
        DetDomicilio.setText("");
        DetTelefono.setText("");
        DetCorreo.setText("");
        DetIdHuesped.setText("");
        DetIdReserva.setText("");
        DetTextCheckInn.setText("");
        DetTextCheckOut.setText("");
        DetImporte.setText("");
        DetAlojado.setText("");
    }
    
    class CustomCellRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        try {
            if (value == null) {
                component.setBackground(table.getBackground());
            } else {
                int valor = (int) value;
                
                int idReserva= valor;
                Reserva reserva=reservaData.buscarReservaId(idReserva);
                Huesped huesped = huespedData.buscarHuespedId(reserva.getHuesped().getIdHuesped());
                Boolean alojado=huesped.isAlojado();
                if (alojado) {
                    component.setBackground(Color.GREEN);
                } else {
                    component.setBackground(Color.YELLOW);
                }
            }
        } catch (NullPointerException ex) {
        }

            return component;
        }
    }
        
}
