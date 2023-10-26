/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entidades;

import java.sql.Date;
import java.time.LocalDate;

public class Reserva {
    
    private int idReserva;
    private Huesped huesped;
    private Habitacion habitacion;
    private int cantPax;
    private LocalDate fechaInn;
    private LocalDate fechaOut;
    private int importe;

    public Reserva() {}

    public Reserva(Huesped huesped, Habitacion habitacion, int cantPax, LocalDate fechaInn, LocalDate fechaOut) {
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.cantPax = cantPax;
        this.fechaInn = fechaInn;
        this.fechaOut = fechaOut;
    }

    public Reserva(int idReserva, Huesped huesped, Habitacion habitacion, int cantPax, LocalDate fechaInn, LocalDate fechaOut) {
        this.idReserva = idReserva;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.cantPax = cantPax;
        this.fechaInn = fechaInn;
        this.fechaOut = fechaOut;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getCantPax() {
        return cantPax;
    }

    public void setCantPax(int cantPax) {
        this.cantPax = cantPax;
    }

    public LocalDate getFechaInn() {
        return fechaInn;
    }

    public void setFechaInn(LocalDate fechaInn) {
        this.fechaInn = fechaInn;
    }

    public LocalDate getFechaOut() {
        return fechaOut;
    }

    public void setFechaOut(LocalDate fechaOut) {
        this.fechaOut = fechaOut;
    }

    public int getImporte() {
        calcularImporte();
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }
    
    public void calcularImporte(){
    Date fecha1=Date.valueOf(fechaInn);
    Date fecha2=Date.valueOf(fechaOut);
    this.importe = habitacion.getPrecio()*((int)(fecha2.getTime()-fecha1.getTime())/1000/60/60/24);
    
    }

    @Override
    public String toString() {
        return "Reserva Nro " + idReserva + " a nombre de " + huesped.getNombre() + " para la habitacion " + habitacion.getIdHabitacion() +
                " para " + cantPax + " personas. Ingreso: " + fechaInn + ". Salida: " + fechaOut + ". Valor: $" + importe + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.idReserva;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reserva other = (Reserva) obj;
        if (this.idReserva != other.idReserva) {
            return false;
        }
        return true;
    }
    
    

}
