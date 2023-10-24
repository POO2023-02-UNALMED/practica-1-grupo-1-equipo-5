package gestorAplicacion.Hotel;

public class Habitacion implements Serializable {
    private Hotel hotel;
    private String numHabitacion;
    private int capacidad;
    private double precioxNoche;
    private TipoHabitacion tipo;
    private Boolean ocupacion;

    public Habitacion() {
    }

    public Habitacion(Hotel hotel, String numHabitacion, int capacidad, double precioxNoche, TipoHabitacion tipo, Boolean ocupacion) {
        this.hotel = hotel;
        this.numHabitacion = numHabitacion;
        this.capacidad = capacidad;
        this.precioxNoche = precioxNoche;
        this.tipo = tipo;
        this.ocupacion = ocupacion;
    }

    public void ocupar(){
        ocupacion = true;
    }
    public void desocupar(){
        ocupacion = false;
    }
    public Boolean getOcupacion(){
        return ocupacion;
    }

    public String getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(String numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecioxNoche() {
        return precioxNoche;
    }

    public void setPrecioxNoche(double precioxNoche) {
        this.precioxNoche = this.tipo.getPrecio();
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Habitacion: " +'\n' +
                "numHabitacion: '" + numHabitacion + '\n' +
                ", precioxNoche: " + precioxNoche +'\n' +
                ", tipo: " + tipo +'\n' +
                ", ocupacion: " + ocupacion +'\n';
    }
}