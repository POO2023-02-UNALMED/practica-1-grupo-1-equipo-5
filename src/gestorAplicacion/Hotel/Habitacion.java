package Hotel.servicios;
import java.util.ArrayList;
public class Habitacion {
    //Atributos
    private String medidas;
    private int capacidad;
    private int precio;
    private Hotel hotel;
    private int numero;
    private ArrayList<Reserva> reservas=new ArrayList<Reserva>();
    private double calificacion;
    private String reseñas;

    //Contructores
    public Habitacion(){
    }
    public Habitacion(String medidas, int capacidad, int precio, Hotel hotel){
        this.medidas=medidas;
        this.capacidad=capacidad;
        this.precio=precio;
        this.hotel=hotel;
        this.hotel.addHabitacion(this);
        this.calificacion=this.hotel.calificacion;
    }
}
