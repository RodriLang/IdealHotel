package AccesoADatos;

import entidades.TipoHabitacion;
import entidades.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class HabitacionData {

    private Connection con = null;
    private TipoHabitacionData tipoHabData;

    public HabitacionData() {
        con = Conexion.getConexion();
    }

    public void guardarHabitacion(Habitacion habitacion) {
        String sql = "INSERT INTO habitacion (tipoHabitacion, piso, precio, ocupada, habilitada)"
                + "VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setObject(1, habitacion.getTipoHabitacion().toString());
            ps.setInt(2, habitacion.getPiso());
            ps.setInt(3, habitacion.getPrecio());
            ps.setBoolean(4, habitacion.isOcupada());
            ps.setBoolean(5, habitacion.isHabilitada());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            while (rs.next()) {
                habitacion.setIdHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Habitación guardada con el id N°: "
                        + habitacion.getIdHabitacion());
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL guardarHabitacion\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
    }

    public Habitacion buscarHabitacion(int idHabitacion) {
        Habitacion habitacion = new Habitacion();
        String sql = "SELECT * FROM habitacion WHERE idHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getObject("tipoHabitacion"));
                habitacion.setIdHabitacion(idHabitacion);
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setTipoHabitacion(TipoHabitacion.valueOf(rs.getString("tipoHabitacion")));
                habitacion.setOcupada(rs.getBoolean("ocupada"));
                habitacion.setHabilitada(rs.getBoolean("habilitada"));
                habitacion.setPrecioFinal(rs.getInt("precio"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL listarHabitaciones\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
        return habitacion;
    }

    public void modificarHabitacion(Habitacion habitacion) {
        String sql = "UPDATE habitacion SET idTipoHabitacion = ?, piso = ?, precio = ?, tipoHabitacion = ?, ocupada = ?,"
                + " habilitada = ? WHERE idHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, habitacion.getIdHabitacion());
            ps.setInt(2, habitacion.getPiso());
            ps.setInt(3, habitacion.getPrecio());
            ps.setObject(4, habitacion.getTipoHabitacion().toString());
            ps.setBoolean(5, habitacion.isOcupada());
            ps.setBoolean(6, habitacion.isHabilitada());

            if (ps.executeUpdate(sql) == 1) {
                JOptionPane.showMessageDialog(null, "Habitacion modificada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL modificarHabitacion\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ocuparHabitacion(int idHabitacion) {
        String sql = "UPDATE habitacion SET ocupada = 1 WHERE idHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            if (ps.executeUpdate(sql) == 1) {
                JOptionPane.showMessageDialog(null, "Habitacion marcada como OCUPADA");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL ocuparHabitacion\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
    }

    public void liberarHabitacion(int idHabitacion) {
        String sql = "UPDATE habitacion SET ocupada = 0 WHERE idHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            if (ps.executeUpdate(sql) == 1) {
                JOptionPane.showMessageDialog(null, "Habitacion marcada como LIBRE");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL liberarHabitacion\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
    }

    public void habilitarHabitacion(int idHabitacion) {
        String sql = "UPDATE habitacion SET habilitada = 1 WHERE idHabitacion = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            if (ps.executeUpdate(sql) == 1) {
                JOptionPane.showMessageDialog(null, "Habitacion marcada como HABILITADA");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL habilitarHabitacion\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
    }

    public void dehabilitarHabitacion(int idHabitacion) {
        String sql = "UPDATE habitacion SET habilitada = 0 WHERE idHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            if (ps.executeUpdate(sql) == 1) {
                JOptionPane.showMessageDialog(null, "Habitacion marcada como DESHABILITADA");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL deshabilitarHabitacion\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Habitacion> listarHabitaciones() {
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitacion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setTipoHabitacion(TipoHabitacion.valueOf(rs.getString("tipoHabitacion")));
                habitacion.setOcupada(rs.getBoolean("ocupada"));
                habitacion.setHabilitada(rs.getBoolean("habilitada"));
                habitacion.setPrecioFinal(rs.getInt("precio"));
                habitaciones.add(habitacion);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL listarHabitaciones\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesPorPiso(int piso) {
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE piso = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, piso);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setPiso(piso);
                habitacion.setTipoHabitacion(TipoHabitacion.valueOf(rs.getString("tipoHabitacion")));
                habitacion.setOcupada(rs.getBoolean("ocupada"));
                habitacion.setHabilitada(rs.getBoolean("habilitada"));
                habitacion.setPrecioFinal(rs.getInt("precio"));
                habitaciones.add(habitacion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL listarHabitacionesPorPiso\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesPorTipo(TipoHabitacion tipo) {
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE tipoHabitacion = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, tipo.toString());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setPiso(rs.getInt("idTipoHabitacion"));
                habitacion.setTipoHabitacion(tipo);
                habitacion.setOcupada(rs.getBoolean("ocupada"));
                habitacion.setHabilitada(rs.getBoolean("habilitada"));
                habitacion.setPrecioFinal(rs.getInt("precio"));
                habitaciones.add(habitacion);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesOcupadas() {
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE ocupada = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setTipoHabitacion(TipoHabitacion.valueOf(rs.getString("tipoHabitacion")));
                habitacion.setOcupada(true);
                habitacion.setHabilitada(rs.getBoolean("habilitada"));
                habitacion.setPrecioFinal(rs.getInt("precio"));
                habitaciones.add(habitacion);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesDisponibles() {
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE ocupada = 0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setTipoHabitacion(TipoHabitacion.valueOf(rs.getString("tipoHabitacion")));
                habitacion.setOcupada(false);
                habitacion.setHabilitada(rs.getBoolean("habilitada"));
                habitacion.setPrecioFinal(rs.getInt("precio"));
                habitaciones.add(habitacion);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesHabilitadas() {
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE habilitada = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setTipoHabitacion(TipoHabitacion.valueOf(rs.getString("tipoHabitacion")));
                habitacion.setOcupada(rs.getBoolean("ocupada"));
                habitacion.setHabilitada(true);
                habitacion.setPrecioFinal(rs.getInt("precio"));
                habitaciones.add(habitacion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL listarHabitacionesHabilitadas\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesDeshabilitadas() {
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE habilitada = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setTipoHabitacion(TipoHabitacion.valueOf(rs.getString("tipoHabitacion")));
                habitacion.setOcupada(rs.getBoolean("ocupada"));
                habitacion.setHabilitada(true);
                habitacion.setPrecioFinal(rs.getInt("precio"));
                habitaciones.add(habitacion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL listarHabitacionesDeshabilitadas\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
        return habitaciones;
    }

    public void modificarPrecio(TipoHabitacion tipo, int precio) {
        String sql = "UPDATE habitacion SET precio = ? WHERE tipoHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, precio);
            ps.setObject(2, tipo.toString());
            if (ps.executeUpdate(sql) == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizó el precio por noche de las habitaciones del tipo: "+tipo);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL modificarPrecio\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
    }

}
