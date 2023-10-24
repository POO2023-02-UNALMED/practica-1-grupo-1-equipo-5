package gestorAplicacion.personas;
import gestorAplicacion.Hotel.*;
import java.util.ArrayList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class Cliente extends Persona {
    private String idCliente;
    private Hotel hotel;
    private int puntos = 0;
    private Habitacion habitacion;

    private String membresia;
    //enum membresia
    private int equipaje;

    private LinkedList<GestionReserva> historial = new LinkedList<>();
    private String historiaComentario;
    private GestionReserva reserva;
    private static List<Cliente> clientes = new ArrayList<>();

    public Cliente(String nombre, String tipo_cedula, String numero_cedula, String telefono, String idCliente, Hotel hotel, String membresia, int equipaje, Habitacion habitacion) {
        super(nombre, tipo_cedula, numero_cedula, telefono);
        this.idCliente = idCliente;
        this.hotel = hotel;
        this.puntos = 0;
        this.membresia = membresia;
        this.equipaje = equipaje;
        this.habitacion = habitacion;
        Cliente.addClientes(this);
    }

    public void solicitarServicio(int servicio) {
        //Se hará con la posición del servicio en la lista de ellos
        this.reserva.aggServicio(Servicio.getServicios().get(servicio));
        this.puntos++;
    }

    public void cancelarServicio(int servicio) {
        //Se hará con la posición del servicio en la lista de ellos
        this.reserva.getServiciosAdicionales().remove(servicio);
        this.puntos--;
    }

    public void realizarReserva(GestionReserva reserva) {
        //Por reserva 20 puntos, por servicio adicional 1 punto
        this.reserva = reserva;
        this.historial.add(reserva);
        this.puntos += 20;
    }

    public String consultaReserva() {
        return this.reserva.toString();
    }

    public Boolean cancelarReserva(GestionReserva reserva) {
        //Por el booleano se determina la respuesta en la ui
        if (this.historial.isEmpty()) {
            return false;
        }
        reserva.borrarReserva();
        historial.removeLast();
        this.reserva = null;
        puntos-=20;
        return true;
    }

    // Devuelve la factura con el total a pagar y la fecha de la creacion
    public Pago generarFactura() {
        double pagoReserva = this.habitacion.getPrecioxNoche() * this.reserva.getNochesXEstadia();
        return new Pago(pagoReserva, this.reserva.getServiciosAdicionales(), LocalDate.now().toString());
    }

    public void pagarFactura() {
        reserva.setEstado(true);
    }

    public int getPuntos() {
        return puntos;
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static Cliente getClienteById(String id) {
        for (Cliente cliente : clientes) {
            if (cliente.getNum_documento().equals(id)) {
                return cliente;
            }
        }
        return null;
    }

    public static void addClientes(Cliente cliente) {
        Cliente.clientes.add(cliente);
    }

    @Override
    public String toString() {
        return "Cliente" +'\n' +
                "idCliente:" + idCliente + '\n' +
                "Nombre: " + getNombre() +'\n' +
                "CC:" + getNum_documento() +'\n' +
                "Puntos:" + getPuntos() +'\n';
    }

    @Override
    public String personaRol() {
        return "Cliente";
    }
}
