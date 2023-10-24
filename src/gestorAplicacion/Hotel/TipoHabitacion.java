package gestorAplicacion.Hotel;

public enum TipoHabitacion {
    INDIVIDUAL("Individual", 200000d),
    DOBLE("Doble", 200000d),
    MATRIMONIAL("Matrimonial", 200000d),
    SUITE("Suite", 200000d);

    private String descripcion;
    private double precio;

    TipoHabitacion(String descripcion, double precio) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio(){
        return precio;
    }
}