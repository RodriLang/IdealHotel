package AccesoADatos;

import entidades.TipoHabitacion;
import entidades.Habitacion;
import entidades.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class HabitacionData {

    private Connection con = null;
    private ReservaData resData;
    private HuespedData huesData;

    public HabitacionData() {
        con = Conexion.getConexion();
        huesData = new HuespedData();
        resData = new ReservaData(huesData, this);
    }

    public void guardarHabitacion(Habitacion habitacion) {
        String sql = "INSERT INTO habitacion (tipoHabitacion, piso, precio, ocupada, habilitada)"
                + "VALUES (?,?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
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
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL guardarHabitacion\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
    }

    public Habitacion buscarHabitacion(int idHabitacion) {
        Habitacion habitacion = new Habitacion();
        String sql = "SELECT * FROM habitacion WHERE idHabitacion = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idHabitacion);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
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
        String sql = "UPDATE habitacion SET tipoHabitacion = ?, piso = ?, precio = ?, tipoHabitacion = ?, ocupada = ?,"
                + " habilitada = ? WHERE idHabitacion = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, habitacion.getIdHabitacion());
            ps.setInt(2, habitacion.getPiso());
            ps.setInt(3, habitacion.getPrecio());
            ps.setObject(4, habitacion.getTipoHabitacion().toString());
            ps.setBoolean(5, habitacion.isOcupada());
            ps.setBoolean(6, habitacion.isHabilitada());
            ps.setInt(7, habitacion.getIdHabitacion());

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Habitacion modificada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL modificarHabitacion\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ocuparHabitacion(int idHabitacion) {
        String sql = "UPDATE habitacion SET ocupada = 1 WHERE idHabitacion = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idHabitacion);
            if (ps.executeUpdate() == 1) {
//                JOptionPane.showMessageDialog(null, "Habitacion marcada como OCUPADA");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL ocuparHabitacion\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
    }

    public void liberarHabitacion(int idHabitacion) {
        String sql = "UPDATE habitacion SET ocupada = 0 WHERE idHabitacion = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idHabitacion);
            if (ps.executeUpdate() == 1) {
//                JOptionPane.showMessageDialog(null, "Habitacion marcada como LIBRE");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL liberarHabitacion\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
    }

    public void habilitarHabitacion(int idHabitacion) {
        String sql = "UPDATE habitacion SET habilitada = 1 WHERE idHabitacion = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idHabitacion);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Habitacion marcada como HABILITADA");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL habilitarHabitacion\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
    }

    public void dehabilitarHabitacion(int idHabitacion) {
        String sql = "UPDATE habitacion SET habilitada = 0, ocupada = 0 WHERE idHabitacion = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idHabitacion);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Habitacion marcada como DESHABILITADA");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL deshabilitarHabitacion\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Habitacion> listarHabitaciones() {
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitacion";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
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
        try (PreparedStatement ps = con.prepareStatement(sql)) {
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
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL listarHabitacionesPorPiso\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesPorTipo(TipoHabitacion tipo) {
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE tipoHabitacion = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, tipo.toString());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setPiso(rs.getInt("piso"));
                habitacion.setTipoHabitacion(tipo);
                habitacion.setOcupada(rs.getBoolean("ocupada"));
                habitacion.setHabilitada(rs.getBoolean("habilitada"));
                habitacion.setPrecioFinal(rs.getInt("precio"));
                habitaciones.add(habitacion);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesOcupadas() {
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE ocupada = 1";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
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
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesDisponibles() {
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE ocupada = 0";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
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
        } catch (SQLException ex) {
            Logger.getLogger(HabitacionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesHabilitadas() {
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE habilitada = 1";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
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
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL listarHabitacionesHabilitadas\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
        return habitaciones;
    }

    public List<Habitacion> listarHabitacionesDeshabilitadas() {
        List<Habitacion> habitaciones = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE habilitada = 0";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
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
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL listarHabitacionesDeshabilitadas\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
        return habitaciones;
    }

    public void modificarPrecioPotTipo(TipoHabitacion tipo, int precio) {
        String sql = "UPDATE habitacion SET precio = ? WHERE tipoHabitacion = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, precio);
            ps.setObject(2, tipo.toString());
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizó el precio por noche de las habitaciones del tipo: " + tipo);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL modificarPrecio\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
    }

    public void modificarPrecioGeneral(int precio) {
        String sql = "UPDATE habitacion SET precio = ? WHERE tipoHabitacion = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, precio);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizó el precio base por noche de todas las habitaciones");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL modificarPrecio\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Habitacion> listarHabitacionesPorFiltros(int ocupada, int habilitada, int piso, TipoHabitacion tipo) {
        List<Habitacion> habitaciones = new ArrayList<>();
        String estadoString = "NOT ocupada = " + ocupada + " AND ";
        if (ocupada <= 1) {
            estadoString = "ocupada = " + ocupada + " AND ";
        }
        String condicionString = "NOT habilitada = " + habilitada + " AND ";
        if (habilitada <= 1) {
            condicionString = "habilitada = " + habilitada + " AND ";
        }
        String pisosString = "NOT piso = " + piso + " AND ";
        if (piso != 0) {
            pisosString = "piso = " + piso + " AND ";
        }
        String tipoString = "NOT tipoHabitacion = 'SIN_TIPO';";
        if (tipo != null) {
            tipoString = "tipoHabitacion = \'" + tipo.name() + "\';";
        }
        String sql = "SELECT * FROM habitacion Where " + estadoString + condicionString + pisosString + tipoString;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
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
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL listarHabitacionesPorFiltro\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
        return habitaciones;
    }

    public List<Integer> listarIDhabitacionesHabilitadasPorPiso(int piso) {
        List<Integer> habitacionesHabilitadasPorPiso = new ArrayList<>();
        String sql = "SELECT idHabitacion FROM habitacion WHERE piso = ? AND habilitada= ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, piso);
            ps.setBoolean(2, true);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                habitacionesHabilitadasPorPiso.add((Integer) rs.getInt("idHabitacion"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la sentencia SQL listarHabitacionesHabilitadasPorPiso\n" + ex.getMessage(), ex.getSQLState(), JOptionPane.ERROR_MESSAGE);
        }
        return habitacionesHabilitadasPorPiso;
    }
}
