package gestorAplicacion.Hotel;

import java.util.ArrayList;

import gestorAplicacion.personas.Empleado;

public class Servicio {
    private String nombre;
    private double precio;
    private String hora_inicio;
    private String hora_salida;

    public Servicio(){}
    Servicio(String nombre, double precio, String hora_inicio,  String hora_salida) {
        this.nombre = nombre;
        this.precio = precio;
        this.hora_inicio = hora_inicio;
        this.hora_salida=hora_salida;
    }
    //metodos set y get

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(double precio) {this.precio = precio;}

    public double getPrecio() {return precio;}

}
