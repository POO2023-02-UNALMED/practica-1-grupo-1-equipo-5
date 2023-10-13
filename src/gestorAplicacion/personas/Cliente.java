package gestorAplicacion.personas;
import gestorAplicacion.Hotel.*;
import java.util.ArrayList;
public class Cliente extends Persona{

    //Atributos especificos de clientes
	private Hotel hotel;
    private long IDcliente;
    private Habitacion habitacion;
    private int puntos;
    private String MEMBRESIA;
    private int equipaje;
    private ArrayList<Reserva> Historia= new ArrayList<Reserva>();
    private ArrayList<String> historia_comentario= new ArrayList<String>();
    private Reserva reserva;

    //Contructores---------------------------------------------------
    public Cliente(){
        super();
    }
    public Cliente(String nombre, int edad, String tipo_doc, long cedula, char sexo){
        super(nombre,edad,tipo_doc,cedula,sexo);
    }
    
    //----------------------------------------------------------------
    //usando el metodo abstracto de la clase padre Persona
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Cédula: " + num_documento + "\n" +
               "Sexo: " + sexo + "\n" +
               "Hotel: " + hotel.getNombre() + "\n" + // Suponiendo que Hotel tiene un método getNombre()
               "Habitación: " + habitacion.getNumero();// Suponiendo que Habitacion tiene un método getNumeroHabitacion()
    }

    //-----------------------------------------------------------------
    
    
    
    
    
}
