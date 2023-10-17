package gestorAplicacion.personas;
import gestorAplicacion.Hotel.*;
import java.util.ArrayList;

public class Empleado extends Persona{
    //Atributos especificos de los empleados
    private String IDempleado;
    private ROL cargo;
    private Hotel hotel;
    private double sueldo;
    private enum ROL {RECEPCIONISTA, GERENTE, CONSERJE, MANTENIMIENTO, SEGURIDAD, ENTRENADOR, MASAJISTA}
    private ArrayList<Servicio> listServicio= new ArrayList<Reserva>();

    //constructores---------------------------------------------------------------------
    public Empleado(){
        super();
    }
    public Empleado(String nombre, int edad, TPD tipoDocumento, long cedula, char sexo, String IDempleado, Hotel hotel, double sueldo, ROL cargo) {
        super(nombre, edad, tipoDocumento, cedula, sexo);
        this.IDempleado = IDempleado;
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.hotel = hotel;
    }

    // Métodos
    // ...

    // Setters y getters
    public void setCargo(ROL cargo) {
        this.cargo = cargo;
    }

    public ROL getCargo() {
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

    public void setIDempleado(String IDempleado) {
        this.IDempleado = IDempleado;
    }

    public String getIDempleado() {
        return IDempleado;
    }

    public ArrayList<Servicio> getServicio() {
        return listServicio;
    }

    // Otros métodos, getters y setters...
}