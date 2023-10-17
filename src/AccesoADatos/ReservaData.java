
package AccesoADatos;

import entidades.Habitacion;
import entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class ReservaData {
    private Connection con;
    private HuespedData huesData;
    private HabitacionData habData;

    public ReservaData( HuespedData huesData, HabitacionData habData) {
        con=Conexion.getConexion();
        this.huesData = huesData;
        this.habData = habData;
    }
    
    public void guardarReserva(Reserva res){
        List<LocalDate> fechas=obtenerFechas(res.getFechaInn(), res.getFechaOut());
        Boolean puede=true;
        System.out.println(fechas);
        for (LocalDate fecha : fechas) {
            for (Reserva reserva : buscarReservaPorHabitacion(res.getHabitacion().getIdHabitacion())) {
             if (fecha.equals(reserva.getFechaInn())||fecha.equals(reserva.getFechaOut())) {
               puede = false;
               break;
            }   
            }           
        }     
        if (puede) {       
        String sql="INSERT INTO reserva (idHuesped,idHabitacion,cantPax,fechaInn,fechaOut,importe) "
            + "VALUES (?,?,?,?,?,?)";       
        try {
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, res.getHuesped().getIdHuesped());
            ps.setInt(2, res.getHabitacion().getIdHabitacion());
            ps.setInt(3, res.getCantPax());
            ps.setDate(4,Date.valueOf(res.getFechaInn()));
            ps.setDate(5,Date.valueOf(res.getFechaOut()));
            ps.setInt(6, res.getImporte());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()) {
                res.setIdReserva(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Reserva Guardada");               
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al trabajar en guardarReserva "+ex.getMessage());
        }    
    }else{
            System.out.println("No se puede reserva ");}
    }
    
    public void eliminarReserva(int idHuesped, int idHabitacion){
    String sql="DELETE FROM `reserva` WHERE idHuesped=? AND idHabitacion=?";
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ps.setInt(2, idHabitacion);
            int exito=ps.executeUpdate();
            if(exito==1){       
                JOptionPane.showMessageDialog(null, "Reserva eliminada");
            }else{
                  JOptionPane.showMessageDialog(null, "Reserva no encontrada");  
            }            
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al trabajar con eliminarReserva"+ ex.getMessage());
        }
    }
    public void modificarReserva(Reserva res){
    
        String sql="UPDATE reserva SET cantPax=?,fechaInn=?,fechaOut=?,importe=? ,idHuesped=?,idHabitacion=? WHERE idReserva=?";    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, res.getCantPax());
            ps.setDate(2, Date.valueOf(res.getFechaInn()));
            ps.setDate(3, Date.valueOf(res.getFechaOut()));
            ps.setInt(4, res.getImporte());
            ps.setInt(5, res.getHuesped().getIdHuesped());
            ps.setInt(6, res.getHabitacion().getIdHabitacion());
            ps.setInt(7, res.getIdReserva());
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Reserva modificada exitosamente");
            }else{
                  JOptionPane.showMessageDialog(null, "Reserva no encontrada para modificarla");  
            }           
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al trabajar con modificarReserva"+ ex.getMessage());
        }
    }
    
    public List <Reserva> buscarReservaPorHuesped(int idHuesped){
    
        List<Reserva> reserva=new ArrayList<Reserva>();
        String sql = "SELECT idReserva,idHuesped, idHabitacion, cantPax, fechaInn, fechaOut, importe FROM reserva WHERE  idHuesped=?";
        Reserva res = null;
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ResultSet rs = ps.executeQuery();           
                while (rs.next()) {                    
                res = new Reserva();
                res.setIdReserva(rs.getInt("idReserva"));
                res.setHuesped(huesData.buscarHuespedId(idHuesped));
                res.setHabitacion(habData.buscarHabitacion(rs.getInt("idHabitacion")));
                res.setCantPax(rs.getInt("cantPax"));
                res.setFechaInn(rs.getDate("fechaInn").toLocalDate());
                res.setFechaOut(rs.getDate("fechaOut").toLocalDate()); 
                res.setImporte(rs.getInt("importe")); 
                reserva.add(res);               
                } 
                ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método buscarReservaPorHuesped" + ex.getMessage());
        }
        return reserva;   
    }
    
    public List<Reserva> buscarReservaPorFecha(LocalDate fecha){
    
        List<Reserva>reserva=new ArrayList<>();
        String sql = "SELECT * FROM `reserva` WHERE ? BETWEEN fechaInn AND fechaOut;";
        Reserva res = null;
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
                while(rs.next()){
                res = new Reserva();
                res.setIdReserva(rs.getInt("idReserva"));
                res.setHuesped(huesData.buscarHuespedId(rs.getInt("idHuesped")));
                res.setHabitacion(habData.buscarHabitacion(rs.getInt("idHabitacion")));
                res.setCantPax(rs.getInt("cantPax"));
                res.setFechaInn(rs.getDate("fechaInn").toLocalDate());
                res.setFechaOut(rs.getDate("fechaOut").toLocalDate()); 
                res.setImporte(rs.getInt("importe"));
                reserva.add(res);
                }
                ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método buscarReservaPorFecha" + ex.getMessage());
        }
        return reserva;   
    }
    
     public List <Reserva> buscarReservaPorHabitacion(int idHabitacion){
    
        List<Reserva> reserva=new ArrayList<Reserva>();
        String sql = "SELECT idReserva,idHuesped, idHabitacion, cantPax, fechaInn, fechaOut, importe FROM reserva WHERE  idHabitacion=?";
        Reserva res = null;
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            ResultSet rs = ps.executeQuery();           
                while (rs.next()) {                    
                res = new Reserva();
                res.setIdReserva(rs.getInt("idReserva"));
                res.setHuesped(huesData.buscarHuespedId(rs.getInt("idHuesped")));
                res.setHabitacion(habData.buscarHabitacion(idHabitacion));
                res.setCantPax(rs.getInt("cantPax"));
                res.setFechaInn(rs.getDate("fechaInn").toLocalDate());
                res.setFechaOut(rs.getDate("fechaOut").toLocalDate()); 
                res.setImporte(rs.getInt("importe")); 
                reserva.add(res);               
                } 
                ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método buscarReservaPorHabitacion" + ex.getMessage());
        }
        return reserva;   
    }
    public List<Reserva> listarReservas(){
        List<Reserva>reserva=new ArrayList<>();
        String sql = "SELECT * FROM `reserva`";
        Reserva res = null;
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
                while(rs.next()){
                res = new Reserva();
                res.setIdReserva(rs.getInt("idReserva"));
                res.setHuesped(huesData.buscarHuespedId(rs.getInt("idHuesped")));
                res.setHabitacion(habData.buscarHabitacion(rs.getInt("idHabitacion")));
                res.setCantPax(rs.getInt("cantPax"));
                res.setFechaInn(rs.getDate("fechaInn").toLocalDate());
                res.setFechaOut(rs.getDate("fechaOut").toLocalDate()); 
                res.setImporte(rs.getInt("importe"));
                reserva.add(res);
                }
                ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método listarReserva" + ex.getMessage());
        }
        return reserva;   
    }
    
    public List<Habitacion> habitacionesDisponibles(LocalDate fecha1,LocalDate fecha2){
    List<LocalDate> fechas=obtenerFechas(fecha1, fecha2);
    List<Habitacion> habitaciones = habData.listarHabitaciones();
    List<Reserva> ocupadas = new ArrayList<>();
     for (LocalDate fecha : fechas) {
         for (Reserva ocupada : buscarReservaPorFecha(fecha)) {
             ocupadas.add(ocupada);
         }        
     }
    List<Habitacion> habitacionesDisponibles = new ArrayList<>();

    for (Habitacion habitacion : habitaciones) {
        boolean estaOcupada = false;
        for (Reserva reserva : ocupadas) {
            if (habitacion.getIdHabitacion() == reserva.getHabitacion().getIdHabitacion()) {
                estaOcupada = true;
                break;
            }
        }
        if (!estaOcupada) {
            habitacionesDisponibles.add(habitacion);
        }
    }
    return habitacionesDisponibles;
}  
 public List<LocalDate> obtenerFechas(LocalDate fecha1,LocalDate fecha2){
 
     List<LocalDate> fechas=new ArrayList<>();
        int dias = (int) ChronoUnit.DAYS.between(fecha1, fecha2);
        for (int i = 0; i < dias; i++) {
            fechas.add(fecha1.plusDays(i));
        } 
        return fechas;
 }
 public int buscarIdReservasPorIDHabitacionyFecha(LocalDate fecha, int ID){
        int idReserva=0;
        String sql = "SELECT idReserva FROM `reserva` WHERE ? BETWEEN fechaInn AND fechaOut AND idHabitacion=?";
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ps.setInt(2,ID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                idReserva = rs.getInt("idReserva");
                System.out.println(idReserva + "-ok");
            } else {
                idReserva=0;
                System.out.println(idReserva+"-Casi ok");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método listarReservaPorIDyPorFecha" + ex.getMessage());
        }catch (NullPointerException ex){
             System.out.println(idReserva+"- no ok");
        }
       
        return idReserva;
 }
 
 public Reserva buscarReservaId(int idReserva){
    
        Reserva reserva=new Reserva();
        String sql = "SELECT idReserva,idHuesped, idHabitacion, cantPax, fechaInn, fechaOut, importe FROM reserva WHERE  idReserva=?";
        Reserva res = null;
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idReserva);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                while (rs.next()) {                    
                res = new Reserva();
                res.setIdReserva(rs.getInt("idReserva"));
                res.setHuesped(huesData.buscarHuespedId(rs.getInt("idHuesped")));
                res.setHabitacion(habData.buscarHabitacion(rs.getInt("idHabitacion")));
                res.setCantPax(rs.getInt("cantPax"));
                res.setFechaInn(rs.getDate("fechaInn").toLocalDate());
                res.setFechaOut(rs.getDate("fechaOut").toLocalDate()); 
                res.setImporte(rs.getInt("importe")); 
                reserva=res;            
                } 
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra una reserva con el Id seleccionado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método buscarReservaPorId" + ex.getMessage());
        }
        return reserva;   
        }            
} //Seguir con la lista de fechas y ponerlas en los metodos!
   
