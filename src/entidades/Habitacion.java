/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entidades;

public class Habitacion {
    
    private int idHabitacion;
    private TipoHabitacion idTipoHabitacion;
    private int piso;
    private boolean ocupada;
    private boolean habilitada;

    public Habitacion() {}

    public Habitacion(TipoHabitacion idTipoHabitacion, int piso, boolean ocupada, boolean habilitada) {
        this.idTipoHabitacion = idTipoHabitacion;
        this.piso = piso;
        this.ocupada = ocupada;
        this.habilitada = habilitada;
    }

    public Habitacion(int idHabitacion, TipoHabitacion idTipoHabitacion, int piso, boolean ocupada, boolean habilitada) {
        this.idHabitacion = idHabitacion;
        this.idTipoHabitacion = idTipoHabitacion;
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

    public TipoHabitacion getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(TipoHabitacion idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
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
