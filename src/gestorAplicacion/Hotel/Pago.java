package gestorAplicacion.Hotel;
import java.util.ArrayList;
public class Pago {
    private double totalPago;
    private ArrayList<Reserva> reservas= new ArrayList<Reserva>();
    private String fechaPago;

    public void setFechaPago(String fechaPago) {this.fechaPago = fechaPago;}
    public String getFechaPago() {return fechaPago;}
    public void setTotalPago(double totalPago) {this.totalPago = totalPago;}
    public double getTotalPago() {return totalPago;}
}
