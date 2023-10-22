package gestorAplicacion.Hotel;
import gestorAplicacion.personas.*;
import java.util.ArrayList;

public class GestionReserva {
	    private Cliente cliente;
	    private Habitacion habitacion;
	    private Pago factura;
	    private String ingreso;
	    private String salida;
	    private List<Servicio> serviciosAdicionales;

	    public void aggReserva(Habitacion habitacion){
	        this.habitacion = habitacion;
	    }
	    public void cancelarReserva(){
	        //Reserva
	    }
	    //HACER FUNCION
	    public double cotizar(){
	        return 3.1416d;
	    }

	    public void aggServicio(Servicio servicio){
	        this.serviciosAdicionales.add(servicio);
	    }

	}