/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entidades;

import java.time.LocalDate;

public class Reserva {
    
    private int idReserva;
    private Huesped idHuesped;
    private Habitacion idHabitacion;
    private int cantPax;
    private LocalDate fechaInn;
    private LocalDate fechaOut;
    private int importe;

    public Reserva() {}

    public Reserva(Huesped idHuesped, Habitacion idHabitacion, int cantPax, LocalDate fechaInn, LocalDate fechaOut, int importe) {
        this.idHuesped = idHuesped;
        this.idHabitacion = idHabitacion;
        this.cantPax = cantPax;
        this.fechaInn = fechaInn;
        this.fechaOut = fechaOut;
        this.importe = importe;
    }

    public Reserva(int idReserva, Huesped idHuesped, Habitacion idHabitacion, int cantPax, LocalDate fechaInn, LocalDate fechaOut, int importe) {
        this.idReserva = idReserva;
        this.idHuesped = idHuesped;
        this.idHabitacion = idHabitacion;
        this.cantPax = cantPax;
        this.fechaInn = fechaInn;
        this.fechaOut = fechaOut;
        this.importe = importe;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Huesped getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(Huesped idHuesped) {
        this.idHuesped = idHuesped;
    }

    public Habitacion getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Habitacion idHabitacion) {
        this.idHabitacion = idHabitacion;
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
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }
    
    
    
    

}
