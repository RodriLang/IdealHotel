/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameMari;

import entidades.TipoHabitacion;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import entidades.Huesped;
import entidades.Reserva;
/**
 *
 * @author Usuario
 */
public class jFrameBasico extends javax.swing.JFrame {
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
    
    
    public jFrameBasico() {
        initComponents();
        cargarComboPisos();
        cargarComboBoxTipoHabitacion();
        mostrarFecha();
        armarCabecera();
       // llenarTablaPorPiso();
        mostrarDetalles();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        AdminPensiones = new javax.swing.JButton();
        AdminConsumos = new javax.swing.JButton();
        AdminHabitaciones = new javax.swing.JButton();
        AdminHuespedes = new javax.swing.JButton();
        AdminCocheras = new javax.swing.JButton();
        AdminTemporada = new javax.swing.JButton();
        AdminReservas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ComboPisos = new javax.swing.JComboBox<>();
        ComboTipoHabitaciones = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaHabitaciones = new javax.swing.JTable();
        TextFecha = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DetCheckInn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DetNombreHuesped = new javax.swing.JLabel();
        DetBotonModificar = new javax.swing.JButton();
        DetBotonCheckInn = new javax.swing.JButton();
        DetBotonCheckOut = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DetNombre = new javax.swing.JTextField();
        DetDni = new javax.swing.JTextField();
        DetTelefono = new javax.swing.JTextField();
        DetTextCheckInn = new javax.swing.JTextField();
        DetTextCheckOut = new javax.swing.JTextField();
        DetDomicilio = new javax.swing.JTextField();
        DetCorreo = new javax.swing.JTextField();
        DetIdHuesped = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DetIdReserva = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        ReportePensiones = new javax.swing.JButton();
        ReporteIngresos = new javax.swing.JButton();
        ReporteEgresos = new javax.swing.JButton();
        ReporteCocheras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOTEL IDEAL-Sistema de Gestión");
        setBackground(new java.awt.Color(0, 204, 204));
        setSize(new java.awt.Dimension(1900, 950));

        Escritorio.setBackground(new java.awt.Color(0, 204, 204));
        Escritorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Escritorio.setPreferredSize(new java.awt.Dimension(1900, 950));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(51, 51, 255))); // NOI18N

        AdminPensiones.setText("PENSIONES");

        AdminConsumos.setText("CONSUMOS");

        AdminHabitaciones.setText("HABITACIONES");

        AdminHuespedes.setText("HUESPEDES");

        AdminCocheras.setText("COCHERAS");

        AdminTemporada.setText("TEMPORADA");

        AdminReservas.setText("RESERVAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdminHuespedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminConsumos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminPensiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminCocheras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminTemporada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(AdminReservas)
                .addGap(61, 61, 61)
                .addComponent(AdminHuespedes)
                .addGap(63, 63, 63)
                .addComponent(AdminHabitaciones)
                .addGap(57, 57, 57)
                .addComponent(AdminConsumos)
                .addGap(62, 62, 62)
                .addComponent(AdminPensiones)
                .addGap(57, 57, 57)
                .addComponent(AdminCocheras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(AdminTemporada)
                .addGap(40, 40, 40))
        );

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Habitaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel2.setText("Tipo de Habitación");

        jLabel1.setText("Piso");

        ComboPisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPisosActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

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

        TextFecha.setEditable(false);
        TextFecha.setBackground(new java.awt.Color(0, 204, 204));
        TextFecha.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TextFecha.setForeground(new java.awt.Color(51, 51, 255));
        TextFecha.setBorder(null);
        TextFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFechaActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 986, Short.MAX_VALUE)
                        .addComponent(TextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ComboPisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(ComboTipoHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(TextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel5.setText("E-Mail");

        jLabel8.setText("ID Huésped:");

        jLabel7.setText("Teléfono:");

        DetCheckInn.setText("Domicilio");

        jLabel6.setText("Dni:");

        DetNombreHuesped.setText("Huésped:");

        DetBotonModificar.setText("Modificar");

        DetBotonCheckInn.setText("Check-Inn");

        DetBotonCheckOut.setText("Check-Out");

        jLabel9.setText("Check-Inn:");

        jLabel10.setText("Check-Out:");

        DetNombre.setEditable(false);
        DetNombre.setBackground(new java.awt.Color(0, 204, 204));

        DetDni.setEditable(false);
        DetDni.setBackground(new java.awt.Color(0, 204, 204));

        DetTelefono.setEditable(false);
        DetTelefono.setBackground(new java.awt.Color(0, 204, 204));

        DetTextCheckInn.setEditable(false);
        DetTextCheckInn.setBackground(new java.awt.Color(0, 204, 204));

        DetTextCheckOut.setEditable(false);
        DetTextCheckOut.setBackground(new java.awt.Color(0, 204, 204));

        DetDomicilio.setEditable(false);
        DetDomicilio.setBackground(new java.awt.Color(0, 204, 204));

        DetCorreo.setEditable(false);
        DetCorreo.setBackground(new java.awt.Color(0, 204, 204));

        DetIdHuesped.setEditable(false);
        DetIdHuesped.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setText("ID Reserva:");

        DetIdReserva.setEditable(false);
        DetIdReserva.setBackground(new java.awt.Color(0, 204, 204));

        jLabel4.setText("Importe:");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DetCheckInn)
                            .addComponent(DetNombreHuesped))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DetNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DetDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DetCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(DetIdHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DetIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(DetTextCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                        .addGap(51, 51, 51)
                        .addComponent(DetBotonCheckOut))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DetTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(DetDni, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DetTextCheckInn))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DetBotonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DetBotonCheckInn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(DetBotonModificar)
                        .addComponent(DetDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DetNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DetNombreHuesped)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DetCheckInn)
                            .addComponent(jLabel7)
                            .addComponent(DetTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DetDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(DetTextCheckInn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DetCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(DetBotonCheckInn)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(DetBotonCheckOut)
                    .addComponent(DetTextCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DetIdHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(DetIdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reportes Diarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(51, 51, 255))); // NOI18N

        ReportePensiones.setText("Pensiones");

        ReporteIngresos.setText("Ingresos");

        ReporteEgresos.setText("Egresos");

        ReporteCocheras.setText("Cocheras");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ReportePensiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReporteEgresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReporteIngresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReporteCocheras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(ReporteIngresos)
                .addGap(26, 26, 26)
                .addComponent(ReporteEgresos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ReportePensiones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ReporteCocheras)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Escritorio.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel2.getAccessibleContext().setAccessibleName("ADMINISTRAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboPisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPisosActionPerformed
        
    }//GEN-LAST:event_ComboPisosActionPerformed

    private void TextFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFechaActionPerformed
       
    }//GEN-LAST:event_TextFechaActionPerformed

    private void TablaHabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaHabitacionesMouseClicked
        
    }//GEN-LAST:event_TablaHabitacionesMouseClicked

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
            java.util.logging.Logger.getLogger(jFrameBasico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameBasico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameBasico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameBasico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            new jFrameBasico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminCocheras;
    private javax.swing.JButton AdminConsumos;
    private javax.swing.JButton AdminHabitaciones;
    private javax.swing.JButton AdminHuespedes;
    private javax.swing.JButton AdminPensiones;
    private javax.swing.JButton AdminReservas;
    private javax.swing.JButton AdminTemporada;
    private javax.swing.JComboBox<Integer> ComboPisos;
    private javax.swing.JComboBox<TipoHabitacion> ComboTipoHabitaciones;
    private javax.swing.JButton DetBotonCheckInn;
    private javax.swing.JButton DetBotonCheckOut;
    private javax.swing.JButton DetBotonModificar;
    private javax.swing.JLabel DetCheckInn;
    private javax.swing.JTextField DetCorreo;
    private javax.swing.JTextField DetDni;
    private javax.swing.JTextField DetDomicilio;
    private javax.swing.JTextField DetIdHuesped;
    private javax.swing.JTextField DetIdReserva;
    private javax.swing.JTextField DetNombre;
    private javax.swing.JLabel DetNombreHuesped;
    private javax.swing.JTextField DetTelefono;
    private javax.swing.JTextField DetTextCheckInn;
    private javax.swing.JTextField DetTextCheckOut;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton ReporteCocheras;
    private javax.swing.JButton ReporteEgresos;
    private javax.swing.JButton ReporteIngresos;
    private javax.swing.JButton ReportePensiones;
    private javax.swing.JTable TablaHabitaciones;
    private javax.swing.JTextField TextFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private void armarCabecera() {
            //(List<LocalDate> fechasDeLaTemporada)
        
       ArrayList<LocalDate> fechas = new ArrayList<>();
        LocalDate fechaActual = LocalDate.now();
        modelo.addColumn("HAB");

        while (!fechaActual.isAfter(fechaActual.plusDays(20))) {
            fechas.add(fechaActual);
            fechaActual = fechaActual.plusDays(1);
        }
       
        // Crear un formato para las fechas
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM");

        // Agregar las fechas como nombres de columna
        for (LocalDate fecha : fechas) {
            String nombreColumna = fecha.format(formatoFecha);
            modelo.addColumn(nombreColumna);
        }
            
        TablaHabitaciones.setModel(modelo);

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
    
        List<Integer> habitaciones = habitacionData.listarIDhabitacionesHabilitadasPorPiso((int)ComboPisos.getSelectedItem());
        List<LocalDate> fechas = reservaData.obtenerFechas(fecha1, fecha2);
        int columnas=TablaHabitaciones.getColumnCount();
        //System.out.println(columnas);
        Object[] fila= new Object[columnas];
        
        
        for(Integer idHabitacion : habitaciones) {
            fila[0]= idHabitacion;
            fila[1]=1;
//            int indice =1;
//            for (LocalDate fecha : fechas) {
//                int idReserva = reservaData.buscarIdReservasPorIDHabitacionyFecha(fecha, idHabitacion);
//
//                if (idReserva == 0) {
//                    fila[indice] = " ";
//                } else {
//                    fila[indice] = idReserva;
//                }
//                indice++;
//                System.out.println(idHabitacion+"-"+idReserva+"/n");
            }
            
            modelo.addRow(fila);
        }
    
    private void mostrarFecha(){
        LocalDate fecha = LocalDate.now();   
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaHoy=fecha.format(formato);
        TextFecha.setText(fechaHoy);
    }
    private void mostrarDetalles(){
        int valorCelda=((int)TablaHabitaciones.getValueAt(TablaHabitaciones.getSelectedRow(), TablaHabitaciones.getSelectedColumn()));
        Reserva reserva=reservaData.buscarReservaId(valorCelda);
        Huesped huesped=huespedData.buscarHuespedId(reserva.getHuesped().getIdHuesped());
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
    }
}