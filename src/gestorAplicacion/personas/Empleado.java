package Hotel.personas;
import Hotel.servicios.Hotel;
public class Empleado extends Persona{
    //Atributos especificos de los empleados
    private int IDempleado;
    private String rol;
    private Hotel hotel;
    private double sueldo= 1100000;     //el sueldo por defecto es un salario minimo.

    //constructores
    public Empleado(){
        super();
    }
    public Empleado(String nombre, int edad, long cedula, char sexo, int ID, String rol, Hotel hotel, double sueldo){
        super();
        this.IDempleado=ID;
        this.rol=rol;
        this.hotel=hotel;
        this.sueldo=sueldo;
    }
}
