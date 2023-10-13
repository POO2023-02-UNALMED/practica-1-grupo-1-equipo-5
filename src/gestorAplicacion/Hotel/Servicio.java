package gestorAplicacion.Hotel;

import java.util.ArrayList;

import gestorAplicacion.personas.Empleado;

public class Servicio {
    private String nombre;
    private double precio;
    private String horario;
    private Hotel hotel;
    private ArrayList<Empleado> empleados;
    Servicio(String nombre, double precio, String horario,  Hotel hotel,  ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.precio = precio;
        this.horario = horario;
        this.hotel = hotel;
        this.empleados = empleados;
        
    }

    public void setHotel(Hotel h) {
        this.hotel=hotel;
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

    public Hotel getHotel() {
        return hotel;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

	public void setEmpleados(ArrayList<Empleado> empleados) {//lo mismo que en hotel
		this.empleados = empleados;
		for (Empleado empleado : empleados) {
			empleado.setServicio(this);
		}
	}  
}
