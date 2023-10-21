package gestorAplicacion.Hotel;
import java.util.ArrayList;

public class Pago {
	
    private double totalPago;
    
    private String fechaPago;
    private static ArrayList<Servicio> servicios = new ArrayList<Servicio>();
    private ArrayList<Reserva> reservas= new ArrayList<Reserva>();
    
    
    public Pago(double totalPago, String fechaPago) {
        this.totalPago = totalPago;
        this.fechaPago = fechaPago;
    }
    
    public void setFechaPago(String fechaPago) {this.fechaPago = fechaPago;}
    public String getFechaPago() {return fechaPago;}
    public void setTotalPago(double totalPago) {this.totalPago = totalPago;}
    public double getTotalPago() {return totalPago;}
    
    public  void descontar(int totalReserva) {
    	
    	setTotalPago(totalPago-totalReserva);
    	
    }

    public static void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    public int sumarTotal() {
        int total = 0;
        for (Servicio servicio : servicios) {
            total += servicio.getPrecio();
        }
        return total;
    }
}
