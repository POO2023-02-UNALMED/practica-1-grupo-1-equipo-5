package gestorAplicacion.hotel;
import java.util.ArrayList;
import Hotel.personas.Empleado;
public class Hotel {
    //Atributos
    private String ubicacion;
    private String nombre;
    double calificacion;
    String reseñas;
    private ArrayList<Habitacion> habitaciones= new ArrayList<Habitacion>();
    private ArrayList<Servicio> catalogoAct= new ArrayList<Actividades>();
    private ArrayList<Empleado> empleados= new ArrayList<Empleado>();
    private int numClientes;

    //constructores
    public Hotel(){
    }
    
    public Hotel(String ubicacion, String nombre, double calificacion){
        this.ubicacion=ubicacion;
        this.nombre=nombre;
        this.calificacion=calificacion;
    }

    //metodos (provisional)
    public void addHabitacion(Habitacion h){
        habitaciones.add(h);
        //h.setNumero(habitaciones.size());
    }
    
    public void addCatalogoAct(Servicio s) {
    	catalogoAct.add(s);
    }
    
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	public String getReseñas() {
		return reseñas;
	}
	public void setReseñas(String reseñas) {
		this.reseñas = reseñas;
	}
	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
	public ArrayList<Actividades> getCatalogoAct() {
		return catalogoAct;
	}
	public void setCatalogoAct(ArrayList<Actividades> catalogoAct) {
		this.catalogoAct = catalogoAct;
	}
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	public int getNumClientes() {
		return numClientes;
	}
	public void setNumClientes(int numClientes) {
		this.numClientes = numClientes;
	}
    
    //nota2: hay que añadir metodos add para los atributos catalogoAct y empleados
}
