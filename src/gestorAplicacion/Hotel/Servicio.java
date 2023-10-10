package gestorAplicacion.hotel;

import java.util.ArrayList;

import gestorAplicacion.personas.Empleado;

public class Servicio {
    private String nombre;
    private double precio;
    private String horario;
    private ArrayList<Hotel> hoteles;
    private ArrayList<Empleado> empleados;
    Servicio(String nombre, double precio, String horario,  ArrayList<Hotel> hoteles,  ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.precio = precio;
        this.horario = horario;
        this.hoteles = hoteles;
        this.empleados = empleados;
        
    }

    public void addHotel(Hotel h) {
		hoteles.add(h);
		h.addServicio(this);
	}
    
    public void addEmpleado(Empleado e) {
		empleados.add(e);
		e.setServicio(this);
	}
    
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getHorario() {
        return horario;
    }

    public ArrayList<Hotel> getHoteles() {
        return hoteles;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

	public void setHoteles(ArrayList<Hotel> hoteles) { //si se usa el set, se garantiza que cada hotel que tiene este servicio lo tenga como atributo
		this.hoteles = hoteles;
		for (Hotel hotel : hoteles) {
			hotel.addServicio(this);
		}
	} 

	public void setEmpleados(ArrayList<Empleado> empleados) {//lo mismo que en hotel
		this.empleados = empleados;
		for (Empleado empleado : empleados) {
			empleado.setServicio(this);
		}
	}  
}
