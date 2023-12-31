/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import java.sql.Connection;
import entidades.Huesped;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class HuespedData {

    private Connection con = null;

    public HuespedData() {
        con = Conexion.getConexion();
    }

    public void agregarHuesped(Huesped huesped) {
        String sql = "INSERT INTO huesped (nombre, dni, domicilio, correo, celular, alojado) "
                + " VALUES (?,?,?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
                ps.setString(1, huesped.getNombre());
                ps.setInt(2, huesped.getDni());
                ps.setString(3, huesped.getDomicilio());
                ps.setString(4, huesped.getCorreo());
                ps.setString(5, huesped.getCelular());
                ps.setBoolean(6, false);
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    huesped.setIdHuesped(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Huésped guardado. ID: " + huesped.getIdHuesped());
                }
                ps.close();
            } catch (SQLException ex) {
                if (ex.getSQLState().equals("23000") && ex.getErrorCode() == 1062) {
                    JOptionPane.showMessageDialog(null, "El Dni ingresado ya existe");
            } else {
                    JOptionPane.showMessageDialog(null, "Error en el método guardarHuesped" + ex.getMessage());
        }
        }
        }

    

    public void modificarHuesped(Huesped huesped) {
        String sql = "UPDATE huesped SET nombre=?, dni=?, domicilio=?, correo=?, celular=?, alojado=?"
                + " WHERE idHuesped=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, huesped.getNombre());
            ps.setInt(2, huesped.getDni());
            ps.setString(3, huesped.getDomicilio());
            ps.setString(4, huesped.getCorreo());
            ps.setString(5, huesped.getCelular());
            ps.setBoolean(6, huesped.isAlojado());
            ps.setInt(7, huesped.getIdHuesped());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Huesped modificado exitosamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método modificarHuesped" + ex.getMessage());
        }
    }

   public Huesped buscarHuespedId(int id){
        String sql = "SELECT nombre, dni, domicilio, correo, celular, alojado FROM huesped WHERE idHuesped=?";
        Huesped huesped = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                huesped = new Huesped();
                huesped.setIdHuesped(id);
                huesped.setNombre(rs.getString("nombre"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getString("celular"));
                huesped.setAlojado(rs.getBoolean("alojado"));
            } else {
                JOptionPane.showMessageDialog(null, "El huesped con IdHuesped: " + id + " no existe.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método buscar Huésped por Id. " + ex.getMessage());
        }
        return huesped;
    }

    public Huesped buscarHuespedDni(int dni){
        String sql = "SELECT idHuesped, nombre, dni, domicilio, correo, celular, alojado FROM huesped WHERE dni=?";
        Huesped huesped = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                huesped = new Huesped();
                huesped.setDni(dni);
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getString("celular"));
                huesped.setAlojado(rs.getBoolean("alojado"));
            } else {
                System.out.println("El huesped con dni: "+ dni + " no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método buscarHuesped por Dni. " + ex.getMessage());
        }
        return huesped;
    }

    public List<Huesped> listarHuespedes() {
        List<Huesped> hd = new ArrayList<>();
        String sql = "SELECT * FROM huesped";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        Huesped huesped = new Huesped();
                        huesped.setIdHuesped(rs.getInt("idHuesped"));
                        huesped.setNombre(rs.getString("nombre"));
                        huesped.setDni(rs.getInt("dni"));
                        huesped.setDomicilio(rs.getString("domicilio"));
                        huesped.setCorreo(rs.getString("correo"));
                        huesped.setCelular(rs.getString("celular"));
                        huesped.setAlojado(rs.getBoolean("alojado"));
                        hd.add(huesped);
                    }
                    ps.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, " Error en el método listarHuesped. " + ex.getMessage());
                }
        return hd;
    }
    
    public List<Huesped> listarHuespedesAlojados() {
        List<Huesped> hd = new ArrayList<>();
        String sql = "SELECT * FROM huesped WHERE alojado=1";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        Huesped huesped = new Huesped();
                        huesped.setIdHuesped(rs.getInt("idHuesped"));
                        huesped.setNombre(rs.getString("nombre"));
                        huesped.setDni(rs.getInt("dni"));
                        huesped.setDomicilio(rs.getString("domicilio"));
                        huesped.setCorreo(rs.getString("correo"));
                        huesped.setCelular(rs.getString("celular"));
                        huesped.setAlojado(rs.getBoolean("alojado"));
                        hd.add(huesped);
                    }
                    ps.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, " Error en el método listarHuespedesAlojados " + ex.getMessage());
                }
        return hd;
    }
    
    private void eliminarHuesped(int idHuesped){
        String sql="DELETE FROM `huesped` WHERE idHuesped=?";
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            int exito=ps.executeUpdate();
            if(exito==1){       
                JOptionPane.showMessageDialog(null, "Huesped Eliminado");
            }else{
                JOptionPane.showMessageDialog(null, "Huesped no encontrado");  
            }            
            ps.close();
            
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en el método EliminarHuesped"+ ex.getMessage());
        }
    }
    
}

