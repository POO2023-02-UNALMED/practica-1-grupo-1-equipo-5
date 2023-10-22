package gestorAplicacion.Hotel;


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
    
    public Integer getTotal() {
    	return total;
    }
    
    public void setTotal(Integer total) {
    	this.total=total;
    }
    
    public Servicio getTipo_servicio() {
    	return tipo_servicio;
    	
    }
    
    public void setTipo_servicio(Servicio tipo_servicio) {
    	this.tipo_servicio = tipo_servicio;
    }
    
    public String getFecha_pago() {
    	return fecha_pago;
    }
    
    public void setFecha_pago(String fecha_pago) {
    	this.fecha_pago = fecha_pago;
    }
    
    @Override
    
    @Override
    public String toString() {
        return "Pago{" +
                "tipo_servicio=" + tipo_servicio +
                "total=" + total +
                ", fecha_pago='" + fecha_pago + '\'' +
                '}';
    }
    
    
    
    	
}
   
    