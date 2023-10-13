package gestorAplicacion.personas;
import gestorAplicacion.Hotel.*;

public class Empleado extends Persona{
    //Atributos especificos de los empleados
    private double IDempleado;
    private String cargo;
    private Hotel hotel;
    private double sueldo= 1100000;
    private Servicio servicio; //no se si un empleado pueda tener varios servicio a cargo
    //el sueldo por defecto es un salario minimo.

    //constructores---------------------------------------------------------------------
    public Empleado(){
        super();
    }
    public Empleado(String nombre, int edad, String tipo_doc,long cedula, char sexo, String cargo, Hotel hotel){
        super(nombre,edad,tipo_doc,cedula,sexo);
        this.cargo=cargo;
        this.setHotel(hotel);
    }
    //metodos (provisional)


    // set y get
    public void setCargo(String cargo) {this.cargo = cargo;}
    public String getCargo() {return cargo;}

    public void setSueldo(double sueldo) {this.sueldo = sueldo;}
    public double getSueldo() {return sueldo;}

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
        hotel.addEmpleados(this);
    }
    public Hotel getHotel() {return hotel;}

    public void setIDempleado(double IDempleado) {this.IDempleado = IDempleado;}

    public double getIDempleado() {return IDempleado;}

    public void setServicio(Servicio s) {
        this.servicio = s;
        s.addEmpleado(this);
    }
    public Servicio getServicio() {return servicio;}


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
    
    
    
    
}
