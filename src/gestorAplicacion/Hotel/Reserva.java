package gestorAplicacion.Hotel;
import gestorAplicacion.personas.*;
import java.util.ArrayList;

public class Reserva {
	
	//atributos----------------------------------------------------------
	
	private Cliente cliente;
	private Habitacion habitacion;
	private Pago factura;
	private String ingreso;
	private String salida;
	private int total;
	private Servicio servicioAdicional;
	private ArrayList<Servicio> servicios= new ArrayList<Servicio>();
	
	//------------------------------------------------------------------
	
	public Reserva () {
		
	}
	
	
	
	
	
	
	
    //el sistema de reserva debe tener uno o mas clientes asociados, una o mas habitaciones asociadas,
    // una o mas actividades, todo con su respectivo precio y fechas
}
