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
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> fb0cabcca066bbf8fa4e365084862ce6c6e46b98
        String sql = "INSERT INTO huesped (nombre, dni, domicilio, correo, celular, alojado) "
                + " VALUES (?,?,?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
=======
        try {
            String sql = "INSERT INTO huesped (nombre, dni, domicilio, correo, celular, alojado) "
                    + " VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
>>>>>>> b9e023cee14a531df5c3e4314e9221bfd56db430
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

    public Huesped buscarHuespedId(int id) {
        String sql = "SELECT nombre, dni, domicilio, correo, celular FROM huesped WHERE idHuesped=?";
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
                huesped.setAlojado(true);
            } else {
                JOptionPane.showMessageDialog(null, "El huesped con IdHuesped: " + id + " no existe.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método modificarHuesped por Id. " + ex.getMessage());
        }
        return huesped;
    }

    public Huesped buscarHuespedDni(int dni) {
        String sql = "SELECT idHuesped, nombre, dni, domicilio, correo, celular FROM huesped WHERE dni=?";
        Huesped huesped = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                huesped = new Huesped();
                huesped.setIdHuesped(dni);
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getString("celular"));
                huesped.setAlojado(true);
            } else {
                JOptionPane.showMessageDialog(null, "El huesped con IdHuesped: " + dni + " no existe.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el método modificarHuesped por Dni. " + ex.getMessage());
        }
        return huesped;
    }

    public List<Huesped> listarHuespedes() {
        List<Huesped> hd = new ArrayList<>();
<<<<<<< HEAD
<<<<<<< HEAD
        String sql = "SELECT * FROM huesped";
=======

        String sql = "SELECT * FROM huesped WHERE alojado=1";
>>>>>>> fb0cabcca066bbf8fa4e365084862ce6c6e46b98
        try (PreparedStatement ps = con.prepareStatement(sql)) {
=======
        try {
            String sql = "SELECT * FROM huesped WHERE alojado=1";
            PreparedStatement ps = con.prepareStatement(sql);
>>>>>>> b9e023cee14a531df5c3e4314e9221bfd56db430
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
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en el método listarHuesped. " + ex.getMessage());
        }
        return hd;
    }

    public List<Huesped> listarHuespedesAlojados() {
        List<Huesped> hd = new ArrayList<>();
        String sql = "SELECT idHuesped, nombre, dni, domicilio, correo, celular FROM huesped WHERE alojado=true";
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
                huesped.setAlojado(true);
                hd.add(huesped);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en el método listarHuespedAlojados. " + ex.getMessage());
        }
        return hd;
    }
}
