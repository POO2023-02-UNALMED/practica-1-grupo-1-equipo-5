package Hotel.servicios;
import java.util.ArrayList;
import Hotel.personas.Empleado;
public class Hotel {
    //Atributos
    private String ubicacion;
    private String nombre;
    double calificacion;
    String reseñas;
    private ArrayList<Habitacion> habitaciones= new ArrayList<Habitacion>();
    private ArrayList<Actividades> catalogoAct= new ArrayList<Actividades>();
    private ArrayList<Empleado> empleados= new ArrayList<Empleado>();
    private int numClientes;

    //constructores
    public Hotel(){
    }
    public Hotel(String ubicacion, String nombre, double calificacion){
        this.ubicacion=ubicacion;
        this.nombre=nombre;
        this.calificacion=calificacion;
    }

    //metodos (provisional)
    public void addHabitacion(Habitacion h){
        habitaciones.add(h);
        //h.setNumero(habitaciones.size());
    }

    //nota: hay que añadir metodos set y get para los atributos
    //nota2: hay que añadir metodos add para los atributos catalogoAct y empleados
}
