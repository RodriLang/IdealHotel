

package entidades;


public enum TipoHabitacion {
    ESTANDAR_SIMPLE("Descripción", 1, 1, "Individual", 1),
    ESTANDAR_SIMPLE_QUEEN("Descripción",1, 1,"Queen", 1.5),
    ESTANDAR_DOBLE_TWIN("Descripción",2, 2, "Individual", 2),
    ESTANDAR_DOBLE_MAT("Descripción", 1, 2, "King Size", 2),
    ESTANDAR_TRIPLE_TWIN("Descripción", 3, 3, "Individual",3),
    ESTANDAR_TRIPLE_MAT("Descripción", 2, 3, "Queen + Individual", 2),
    SUITE_DE_LUJO("Descripción", 2, 3, "King Size + Queen", 5);

    private String descripcion;
    private int cantidadCamas;
    private int cantidadMaxPax;
    private String tipoCama;
    private double indicePrecio;

    private TipoHabitacion(String descripcion, int cantidadCamas, int cantidadMaxPax, String tipoCama, double indicePrecio) {
        this.descripcion = descripcion;
        this.cantidadCamas = cantidadCamas;
        this.cantidadMaxPax = cantidadMaxPax;
        this.tipoCama = tipoCama;
        this.indicePrecio = indicePrecio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public int getCantidadMaxPax() {
        return cantidadMaxPax;
    }

    public void setCantidadMaxPax(int cantidadMaxPax) {
        this.cantidadMaxPax = cantidadMaxPax;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public double getIndicePrecio() {
        return indicePrecio;
    }

    public void setIndicePrecio(double indicePrecio) {
        this.indicePrecio = indicePrecio;
    }

  
}