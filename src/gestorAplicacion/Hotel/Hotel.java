package gestorAplicacion.Hotel;
import java.util.ArrayList;
import gestorAplicacion.personas.Empleado;

public class Hotel {
    //Atributos
    private String nombre;
	private String direccion;
    private ArrayList<Habitacion> habitaciones= new ArrayList<Habitacion>();
    private ArrayList<Servicio> catalogoSer= new ArrayList<Servicio>();
    private ArrayList<Empleado> empleados= new ArrayList<Empleado>();
	double calificacion;
	String resenas;
    private int numClientes;

    //constructores
    public Hotel(){
    }
    
    public Hotel(String ubicacion, String nombre, double calificacion){
        this.direccion =ubicacion;
        this.nombre=nombre;
        this.calificacion=calificacion;
    }

    //metodos (provisional)
    public void addHabitacion(Habitacion h){
        if (!habitaciones.contains(h)){
			habitaciones.add(h);
			h.setHotel(this);
        	h.setNumero(habitaciones.size());
		}
    }
    public void addServicio(Servicio s) { //cuando se agrega un servicio a un hotel, tambien se agrega a ese servicio el hotel
    	if(!catalogoSer.contains(s)){		//condicion para no agregar servicios repetidos
			catalogoSer.add(s);
    		s.addHotel(this);
			this.addEmpleados(s.getEmpleados());
		}
    }
	public void addResena(String resena){
		this.resenas= resena+"\n"+ this.resenas;
	}
	public void addEmpleados(ArrayList<Empleado> emp){
		for (Empleado i: emp){
			addEmpleados(i);			//añade empleado a la lista del hotel (con sobrecarga)
		}
	}
    public void addEmpleados(Empleado emp){
		if(!empleados.contains(emp)){			//evita que queden elementos repetidos en el array
			this.empleados.add(emp);
			emp.setHotel(this); 				//asocia hotel al empleado
			emp.setIDempleado(empleados.size());//asigna in ID al empleado
		}
	}
	//--------------------------------------------------------
	//set y get
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCalificacion() {return calificacion;}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public String getResenas() {
		return resenas;
	}
	public void setResenas(String resenas) {
		this.resenas = resenas;
	}

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public ArrayList<Servicio> getCatalogoSer() {return catalogoSer;}
	public void setCatalogoSer(ArrayList<Servicio> catalogoSer) {//a cada servicio se le agrega este hotel a su lista de hoteles
		this.catalogoSer = catalogoSer;
		for (Servicio servicio : catalogoSer) {
			servicio.addHotel(this);
			this.addEmpleados(servicio.getEmpleados()); //los empleados asociados al servicio se asocial al hotel
		}
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(ArrayList<Empleado> empleados) { //se debe hacer un proceso analogo que en servicio
		this.empleados = empleados;
	}

	public int getNumClientes() {
		return numClientes;
	}
	public void setNumClientes(int numClientes) {
		this.numClientes = numClientes;
	}



	//nota: añadir toString
}
