/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

public class Habitacion {

    private int idHabitacion;
    private TipoHabitacion tipoHabitacion;
    private int piso;
    private int precio;
    private boolean ocupada;
    private boolean habilitada;

    public Habitacion() {
    }

    public Habitacion(TipoHabitacion tipoHabitacion, int piso, int precio, boolean ocupada, boolean habilitada) {
        this.tipoHabitacion = tipoHabitacion;
        this.piso = piso;
        this.ocupada = ocupada;
        this.habilitada = habilitada;
        this.precio = calcularPrecio(precio);
    }

    public Habitacion(int idHabitacion, TipoHabitacion tipoHabitacion, int piso, int precio, boolean ocupada, boolean habilitada) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.piso = piso;
        this.ocupada = ocupada;
        this.habilitada = habilitada;
        this.precio = calcularPrecio(precio);
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecioFinal(int precio) {
        this.precio = precio;
    }

    public void setPrecioBruto(int precio) {
        this.precio = calcularPrecio(precio);
    }

    //retorna el precio ingresado multiplicado por el indice de aumento del tipoHabitacion
    private int calcularPrecio(int precio) {
        return precio *= tipoHabitacion.getIndicePrecio();
    }

    @Override
    public String toString() {
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", tipoHabitacion=" + tipoHabitacion + ", piso=" + piso + ", precio=" + precio + ", ocupada=" + ocupada + ", habilitada=" + habilitada + '}';
    }
}
