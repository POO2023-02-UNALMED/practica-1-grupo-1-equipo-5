package Hotel.servicios;
import java.util.ArrayList;
public class Habitacion {
    //Atributos----------------------------------------------
	private Hotel hotel;
	private String num_habitacion;
    private int capacidad;
    private double precio;
    
    private double calificacion;
    private String reseñas;

    //Contructores
    public Habitacion(){
    }
    public Habitacion(String medidas, int capacidad, double precio, Hotel hotel){
        this.medidas=medidas;
        this.capacidad=capacidad;
        this.precio=precio;
        this.hotel=hotel;
        this.hotel.addHabitacion(this);
        this.calificacion=this.hotel.calificacion;
    }
}
