

package TipoHabitacion;

import entidades.*;

public class TipoHabitacion {
    
    private int tipoHabitacion;
    private String nombreHabitacion;
    private int tipoCama;
    private int cantCamas;
    private int cantMaxPersonas;
    private int precioXnoche;

    public TipoHabitacion() {}

    public TipoHabitacion(String nombreHabitacion, int tipoCama, int cantCamas, int cantMaxPersonas, int precioXnoche) {
        this.nombreHabitacion = nombreHabitacion;
        this.tipoCama = tipoCama;
        this.cantCamas = cantCamas;
        this.cantMaxPersonas = cantMaxPersonas;
        this.precioXnoche = precioXnoche;
    }

    public TipoHabitacion(int idTipoHabitacion, String nombreHabitacion, int tipoCama, int cantCamas, int cantMaxPersonas, int precioXnoche) {
        this.tipoHabitacion = idTipoHabitacion;
        this.nombreHabitacion = nombreHabitacion;
        this.tipoCama = tipoCama;
        this.cantCamas = cantCamas;
        this.cantMaxPersonas = cantMaxPersonas;
        this.precioXnoche = precioXnoche;
    }

    public int getIdTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.tipoHabitacion = idTipoHabitacion;
    }

    public String getNombreHabitacion() {
        return nombreHabitacion;
    }

    public void setNombreHabitacion(String nombreHabitacion) {
        this.nombreHabitacion = nombreHabitacion;
    }

    public int getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(int tipoCama) {
        this.tipoCama = tipoCama;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public int getCantMaxPersonas() {
        return cantMaxPersonas;
    }

    public void setCantMaxPersonas(int cantMaxPersonas) {
        this.cantMaxPersonas = cantMaxPersonas;
    }

    public int getPrecioXnoche() {
        return precioXnoche;
    }

    public void setPrecioXnoche(int precioXnoche) {
        this.precioXnoche = precioXnoche;
    }
    
    
    
    
    

}
