
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
import java.util.ArrayList;
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
    
    public void guardarReserva(Reserva res,HuespedData huesData, HabitacionData habData){
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
                huesData.buscarHuespedId(res.getHuesped().getIdHuesped()).setAlojado(true);
                habData.buscarHabitacion(res.getHabitacion().getIdHabitacion()).setOcupada(true);
                ps.close();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al trabajar en guardarReserva "+ex.getMessage());
        }    
    }
    
    public void eliminarReserva(int idHuesped, int idHabitacion, HuespedData huesData, HabitacionData habData){
    String sql="DELETE FROM `reserva` WHERE idHuesped=? AND idHabitacion=?";
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ps.setInt(2, idHabitacion);
            int exito=ps.executeUpdate();
            if(exito==1){
                huesData.buscarHuespedId(idHuesped).setAlojado(false);
                habData.buscarHabitacion(idHabitacion).setOcupada(false);       
                JOptionPane.showMessageDialog(null, "Reserva eliminada");
            }else{
                  JOptionPane.showMessageDialog(null, "Reserva no encontrada");  
            }            
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al trabajar con eliminarReserva"+ ex.getMessage());
        }
    }
    public void modificarReserva(int cantPax, LocalDate fechaInn,LocalDate fechaOut,int importe, int idHuesped, int idHabitacion){
    
        String sql="UPDATE reserva SET cantPax=?,fechaInn=?,fechaOut=?,importe=? WHERE idHuesped=? AND idHabitacion=?";
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, cantPax);
            ps.setDate(2, Date.valueOf(fechaInn));
            ps.setDate(3, Date.valueOf(fechaOut));
            ps.setInt(4, importe);
            ps.setInt(5, idHuesped);
            ps.setInt(6, idHabitacion);
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
    
    public List <Reserva> buscarReservaPorHuesped(int idHuesped, HuespedData huesData, HabitacionData habData){
    
        List<Reserva> reserva=new ArrayList<Reserva>();
        String sql = "SELECT idReserva,idHuesped, idHabitacion, cantPax, fechaInn, fechaOut, importe FROM reserva WHERE  idHuesped=?";
        Reserva res = null;
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
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
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra una reserva realizada por: "+huesData.buscarHuespedId(idHuesped).toString());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método buscarReservaPorHuesped" + ex.getMessage());
        }
        return reserva;   
    }
    
    public List<Reserva> buscarReservaPorFecha(LocalDate fecha, HuespedData huesData, HabitacionData habData){
    
        List<Reserva>reserva=new ArrayList<>();
        String sql = "SELECT * FROM `reserva` WHERE ? BETWEEN fechaInn AND fechaOut;";
        Reserva res = null;
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
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
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra una reserva realizada en esta fecha.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método buscarReservaPorFecha" + ex.getMessage());
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
            if(rs.next()) {
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
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentran reservas");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método listarReserva" + ex.getMessage());
        }
        return reserva;   
    }
    
    
    }

