/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import java.sql.Connection;
import AccesoADatos.Conexion;
import entidades.Huesped;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class HuespedData {

    private Connection con = null;

    public HuespedData() {
        con = Conexion.getConexion();
    }

    public void guardarHuesped(Huesped huesped) {
        try {
            String sql = "INSERT INTO huesped (nombre, dni, domicilio, correo, celular) "
                    + "VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, huesped.getNombre());
            ps.setInt(2, huesped.getDni());
            ps.setString(3, huesped.getDomicilio());
            ps.setString(4, huesped.getCorreo());
            ps.setString(5, huesped.getCelular());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                huesped.setIdHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Huésped guardado. ID: " + huesped.getIdHuesped());
                ps.close();
            }
        } catch (SQLException ex) {
            if (ex.getSQLState().equals("23000") && ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El Dni ingresado ya existe");
            } else {
                JOptionPane.showMessageDialog(null, "Error en el método guardarHuesped" + ex.getMessage());
            }
        }
    }
}
