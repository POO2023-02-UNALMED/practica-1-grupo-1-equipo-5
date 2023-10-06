package Hotel.personas;
import Hotel.servicios.Hotel;


public class Empleado extends Persona{
    //Atributos especificos de los empleados
    private String IDempleado;
    private String cargo;
    private Hotel hotel;
    private double sueldo= 1100000;     //el sueldo por defecto es un salario minimo.

    //constructores---------------------------------------------------------------------
    public Empleado(){
        super();
    }
    public Empleado(String nombre, int edad, String tipo_doc,String cedula, char sexo, String ID, String cargo, Hotel hotel, double sueldo){
        super();
        this.IDempleado=ID;
        this.cargo=rol;
        this.hotel=hotel;
        this.sueldo=sueldo;
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
               "Rol: " + rol + "\n" +
               "Hotel: " + hotel.getNombre() + "\n"  // Suponiendo que Hotel tiene un método getNombre()
    }
    
    
    //--------------------------------------------------------------------
    
    
    
    
}
