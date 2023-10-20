package gestorAplicacion.personas;
import gestorAplicacion.Hotel.*;
import java.util.ArrayList;

public class Cliente extends Persona{

    //Atributos especificos de clientes
	private Hotel hotel;
    private long IDcliente;
    private Habitacion habitacion;
    private int puntos;
    private String MEMBRESIA;
    private int equipaje;
    private ArrayList<Reserva> Historia= new ArrayList<Reserva>();
    private ArrayList<String> historia_comentario= new ArrayList<String>();
    private enum MEMBRESIA {BASIC, PLATA, ORO, DIAMANTE};
    private MEMBRESIA membresia;
    private int equipaje;
    private ArrayList<Reserva> historia_reserva= new ArrayList<Reserva>();
    private Reserva reserva;

    //Contructores---------------------------------------------------
    
    public Cliente(){
        super();
    }
    public Cliente(String nombre, int edad, TPD tipo_doc, long cedula, char sexo) {
        super(nombre, edad, tipo_doc, cedula, sexo);
    }
    public Cliente(String nombre, int edad, TPD tipoDocumento, long numDocumento, char sexo, String telefono, String direccion, String correo, Hotel hotel, long IDcliente) {
        super(nombre, edad, tipoDocumento, numDocumento, sexo, telefono, direccion, correo);
        this.hotel = hotel;
        this.IDcliente = IDcliente;
        this.puntos = 0;
        this.membresia = Cliente.MEMBRESIA.BASIC;
    }
    
    public Cliente(String nombre, int edad, TPD tipoDocumento, long numDocumento, char sexo, Hotel hotel, long IDcliente) {
        super(nombre, edad, tipoDocumento, numDocumento, sexo);
        this.hotel = hotel;
        this.IDcliente = IDcliente;
        this.puntos = 0;
        this.membresia = Cliente.MEMBRESIA.BASIC;
    }
    
    public Hotel getHotel() {
        return hotel;
    }

    public long getIDcliente() {
        return IDcliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getPuntos() {
        return puntos;
    }

    public MEMBRESIA getMembresia() {
        return membresia;
    }

    public int getEquipaje() {
        return equipaje;
    }

    public ArrayList<Reserva> getHistoriaReserva() {
        return historia_reserva;
    }

    public void setHistoriaReserva(ArrayList<Reserva> historia_reserva) {
        this.historia_reserva = historia_reserva;
    }

    public Reserva getReserva() {
        return reserva;
    }
    
    //----------------------------------------------------------------
    //usando el metodo abstracto de la clase padre Persona
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Cédula: " + num_documento + "\n" +
               "Sexo: " + sexo + "\n" +
               "Hotel: " + hotel.getNombre() + "\n" + // Suponiendo que Hotel tiene un método getNombre()
               "Habitación: " + habitacion.getNumero()+// Suponiendo que Habitacion tiene un método getNumeroHabitacion()
               "Hotel: " + hotel.getNombre() + "\n" + 
               "Habitación: " + habitacion.getNumero();

    }

    //-----------------------------------------------------------------
    
    //Sitema de puntos (Funcionalidad)
    public void acumlarPuntos(Pago pago) {
    	int puntosGanados= (int) (pago.getTotalPago()/15000);
    	puntos+=puntosGanados; //Agregra puntos al atributo puntos de la clase
    }    
    public String canjearPuntos(int puntos) {
        if (puntos <= this.puntos) {
            double descuento = 0.0;
          
            switch (membresia) { //Dependiendo de su membresia se evalua su descuento
                case BASIC:
                    descuento = puntos * 5000.0;
                    break;
                case PLATA:
                    descuento = puntos * 7000.0;
                    break;
                case ORO:
                    descuento = puntos * 7500.0;
                    break;
                case DIAMANTE:
                    descuento = puntos * 8000.0;
                    break;
                default:
                    break;
            }
            
            if (reserva != null) {
                reserva.total -= descuento; //Realiza el descuento
            }
            this.puntos -= puntos;
            return "Canje exitoso, se ha aplicado un descuento de " + descuento + " pesos";
        } 
        else {
            return "Puntos insuficientes para canjear";
        }
    }
    
    public void ascender() { //este metodo se ejecuta automaticamente por cada reserva creada en la clase reserva
        int cantidadReservas = this.historia_reserva.size(); 
        
        if (cantidadReservas > 15) {
            this.membresia = MEMBRESIA.DIAMANTE; 
        } 
        else if (cantidadReservas > 10) {
            this.membresia = MEMBRESIA.ORO; 
        } 
        else if (cantidadReservas > 5) {
            this.membresia = MEMBRESIA.PLATA; 
        }
    }
    
    public String personaRol() {
    	int cantidadReservas = this.historia_reserva.size();
        if (cantidadReservas > 15) {
            return "Eres un cliente DIAMANTE.";
        } 
        else if (cantidadReservas > 10) {
            return "Eres un cliente ORO.";
        } 
        else if (cantidadReservas > 5) {
            return "Eres un cliente PLATA.";
        } 
        else {
            return "Eres un cliente BASIC.";
        }
    	
    }

    
  //-----------------------------------------------------------------
    
    
    
}
