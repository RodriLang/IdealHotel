/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entidades;
import TipoHabitacion.*;

public class Habitacion {
    
    private int idHabitacion;
    private TipoHabitacion tipoHabitacion;
    private int piso;
    private boolean ocupada;
    private boolean habilitada;

    public Habitacion() {}

    public Habitacion(TipoHabitacion tipoHabitacion, int piso, boolean ocupada, boolean habilitada) {
        this.tipoHabitacion = tipoHabitacion;
        this.piso = piso;
        this.ocupada = ocupada;
        this.habilitada = habilitada;
    }

    public Habitacion(int idHabitacion, TipoHabitacion tipoHabitacion, int piso, boolean ocupada, boolean habilitada) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.piso = piso;
        this.ocupada = ocupada;
        this.habilitada = habilitada;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public TipoHabitacion gettipoHabitacion() {
        return tipoHabitacion;
    }

    public void setIdTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public boolean isHabilitada() {
        return habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }
    
    
    
    

}
