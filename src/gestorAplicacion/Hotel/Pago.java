package gestorAplicacion.Hotel;
import java.util.ArrayList;

public class Pago {
	
    private Integer total;
    private Servicio tipo_servicio;
    private String fecha_pago;
    
    public Pago() {
    	
    }
    
    public Pago(Integer total, Servicio tipo_servicio, String fecha_pago) {
    	this.total = total;
    	this.tipo_servicio= tipo_servicio;
    	this.fecha_pago = fecha_pago;
    	
    }
    
    
    
    