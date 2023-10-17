package gestorAplicacion.personas;
import gestorAplicacion.Hotel.*;
import java.util.ArrayList;

public class Empleado extends Persona{
    //Atributos especificos de los empleados
    private double IDempleado;
    private ROL cargo;
    private Hotel hotel;
    private double sueldo;
    private enum ROL {RECEPCIONISTA, GERENTE, CONSERJE, MANTENIMIENTO, SEGURIDAD, ENTRENADOR, MASAJISTA}
    private ArrayList<Servicio> listServicio= new ArrayList<Reserva>();

    //constructores---------------------------------------------------------------------
    public Empleado(){
        super();
    }
    public Empleado(String nombre, int edad, TPD  tipoDocumento, long cedula, char sexo, String IDempleado, Hotel hotel, double sueldo){
        super(nombre,edad,tipoDocumento,cedula,sexo);
        this.IDempleado=IDempleado;
        this.sueldo=sueldo;
        this.setHotel(hotel);
    }
    //metodos (provisional)


    // set y get
    public void setCargo(String cargo) {
    	this.cargo = cargo;
    }
    
    public String getCargo() {
    	return cargo;
    }

    public void setSueldo(double sueldo) {
    	this.sueldo = sueldo;
    }
    
    public double getSueldo() {
    	return sueldo;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
    
    public Hotel getHotel() {
    	return hotel;
    }

    public void setIDempleado(double IDempleado) {
    	this.IDempleado = IDempleado;
    }

    public double getIDempleado() {
    	return IDempleado;
    }
    
    public ArrayList getServicio() {
    	return listServicio;
    }


    //--------------------------------------------------------------------
    
    //usando el metodo abstracto de la clase padre Persona
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Cédula: " + num_documento + "\n" + // num_documento es un atributo heredado de Persona
               "Sexo: " + sexo + "\n" +
               "ID Empleado: " + IDempleado + "\n" +
               "Rol: " + cargo + "\n" +
               "Hotel: " + hotel.getNombre(); // Suponiendo que Hotel tiene un método getNombre()
    }
    
    
    //--------------------------------------------------------------------
    
    //Servicios-----------------------------------------------------------
    
    
    
}
