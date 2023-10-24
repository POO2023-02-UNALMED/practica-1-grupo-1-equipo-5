package gestorAplicacion.personas;
import gestorAplicacion.Hotel.*;
import java.util.ArrayList;

public class Empleado extends Persona{
    private String IDEmpleado;
    private String rol;
    private Double sueldo;

    public Empleado(){

    }

    public Empleado(String nombre, Integer edad, Character sexo, String tipo_documento, String num_documento, String telefono, String direccion, String correo, Integer calificacion, String IDEmpleado, String rol, Double sueldo) {
        super(nombre, edad, sexo, tipo_documento, num_documento, telefono, direccion, correo);
        this.IDEmpleado = IDEmpleado;
        this.rol = rol;
        this.sueldo = sueldo;
    }

    public String getIDEmpleado() {
        return IDEmpleado;
    }

    public void setIDEmpleado(String IDEmpleado) {
        this.IDEmpleado = IDEmpleado;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String personaRol() {
        return "Hola";
    }
    public void ascender() {

    }
    @Override
    public String toString() {
        return null;
    }
}
    