package gestorAplicacion.Hotel;
import gestorAplicacion.personas.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestionReserva implements Serializable {
    public static List<GestionReserva> reservas = new ArrayList<>();
    private Cliente cliente;
    private Habitacion habitacion;
    private Pago factura;
    private int nochesXestadia;

    public List<Servicio> serviciosAdicionales = new ArrayList<>();

    private Boolean estado;
    private Hotel hotel;

    public GestionReserva(Cliente cliente, Habitacion habitacion, int nochesXestadia, Boolean estado, Hotel hotel) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.nochesXestadia = nochesXestadia;
        this.estado = estado;
        this.hotel = hotel;
        reservas.add(this);
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void aggReserva(Habitacion habitacion){
        this.habitacion = habitacion;
    }
    public void cancelarReserva(){
        //Reserva
    }
    //HACER FUNCION
    public double cotizar(int[] servicios){
        double precioCotizacion = 0;
        if(Servicio.getServicios().isEmpty()){
            return 0d;
        }
        for (int i = 0; i < servicios.length; i++) {
            precioCotizacion += Servicio.getServicios().get(servicios[i]).getPrecio();
        }
        return precioCotizacion;

    }

    public void aggServicio(Servicio servicio){
        this.serviciosAdicionales.add(servicio);
    }

    public Integer getNochesXEstadia() {
        return this.nochesXestadia;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public Habitacion getHabitacion(){
        return habitacion;
    }

    //public String getIngreso() {return ingreso;}

    //public void setIngreso(String ingreso) {this.ingreso = ingreso;}

    //public String getSalida() {return salida;}

    //public void setSalida(String salida) {this.salida = salida;}

    public List<Servicio> getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(List<Servicio> serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    //Hacer la de ver factura
    //public Pago verFactura(){
      //  factura.toString();
    //}

public void borrarReserva(){
        GestionReserva.reservas.remove(this);
}

    @Override
    public String toString() {
        return "Reservas" +'\n' +
                "cliente:" + cliente.toString() +'\n' +
                "habitacion:" + habitacion +'\n' +
                "dias reservados: " + nochesXestadia +'\n' +
                "serviciosAdicionales:" + serviciosAdicionales +'\n'+
                "-----------------------------------------------------";
    }
}	
