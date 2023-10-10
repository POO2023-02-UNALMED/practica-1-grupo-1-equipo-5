package gestorAplicacion.hotel;

import java.util.ArrayList;

public enum Servicio {
    PISCINA("Piscina", 10.0, "9:00 - 18:00"),
    TENNIS("Tennis", 15.0, "10:00 - 20:00"),
    SPA("Spa", 30.0, "11:00 - 19:00"),
    SAUNA("Sauna", 12.0, "12:00 - 22:00"),
    TURCO("Turco", 8.0, "14:00 - 20:00"),
    MAQUINA_ARCADE("Máquina Arcade", 2.0, "9:00 - 22:00");

    private String nombre;
    private double precio;
    private String horario;
    private ArrayList<Hotel> hoteles;
    private ArrayList<Empleado> empleados;

    Servicio(String nombre, double precio, String horario) {
        this.nombre = nombre;
        this.precio = precio;
        this.horario = horario;
        
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

	public void setHoteles(ArrayList<Hotel> hoteles) {
		this.hoteles = hoteles;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
    
    
}
