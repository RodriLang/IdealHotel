/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entidades;

public class Huesped implements Comparable<Huesped>{
    
    private int idHuesped;
    private String nombre;
    private int dni;
    private String domicilio;
    private String correo;
    private String celular;
    private boolean alojado;

    public Huesped() {}

    public Huesped(String nombre, int dni, String domicilio, String correo, String celular, boolean alojado) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
        this.alojado = alojado;
    }

    public Huesped(int idHuesped, String nombre, int dni, String domicilio, String correo, String celular, boolean alojado) {
        this.idHuesped = idHuesped;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
        this.alojado = alojado;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public boolean isAlojado() {
        return alojado;
    }

    public void setAlojado(boolean alojado) {
        this.alojado = alojado;
    }

    @Override
    public String toString() {
        return "Huesped: "+idHuesped+ "\n"+nombre + "\n"+ dni + "\n"+ domicilio + "\n"+ correo + "\n"+ celular + "\n"+ alojado+"\n";
    }

    @Override
    public int compareTo(Huesped huesped) {
        return this.idHuesped - huesped.getIdHuesped();
    }
    
    
    
}
