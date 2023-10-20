package gestorAplicacion.personas;
import gestorAplicacion.Hotel.*;
import java.util.ArrayList;

public class Empleado extends Persona {
    //Atributos especificos de los empleados
    private long IDempleado;
    private ROL cargo;
    private Hotel hotel;
    private double sueldo;
    private enum ROL {RECEPCIONISTA, GERENTE, CONSERJE, MANTENIMIENTO, SEGURIDAD, ENTRENADOR, MASAJISTA}
    private ArrayList<Servicio> listServicio = new ArrayList<>();

    //constructores---------------------------------------------------------------------
    public Empleado() {super();}
    public Empleado(String nombre, int edad, TPD tipoDocumento, long cedula, char sexo, long IDempleado, Hotel hotel, double sueldo, ROL cargo) {
        super(nombre, edad, tipoDocumento, cedula, sexo);
        this.IDempleado = IDempleado;
        this.sueldo = sueldo;
        this.cargo = cargo;
        this.hotel = hotel;
    }


    // set y get
    public void setCargo(ROL cargo) {this.cargo = cargo;}

    public ROL getCargo() {return cargo;}

    public void setSueldo(double sueldo) {this.sueldo = sueldo;}

    public double getSueldo() {return sueldo;}

    public void setHotel(Hotel hotel) {this.hotel = hotel;}

    public Hotel getHotel() {return hotel;}

    public void setServicio(Servicio s) {
        listServicio.add(s);
        s.addEmpleado(this);
    }

    public ArrayList<Servicio> getServicio() {return listServicio;}

    public void setIDempleado(long IDempleado) {this.IDempleado = IDempleado;}

    public long getIDempleado() {return IDempleado;}


    //--------------------------------------------------------------------

    //usando el metodo abstracto de la clase padre Persona

    @Override
    public void ascender() {
        //logica implicada en el ascenso
    }

    @Override
    public String personaRol() {
        return "Empleado "+cargo+"  en el Hotel"+hotel;
    }

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
}