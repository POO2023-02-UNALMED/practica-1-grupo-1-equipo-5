package Hotel.personas;

public class Cliente extends Persona{

    //Atributos especificos de clientes
	private Hotel hotel;
	private Habitacion habitacion;
    private Gestion_reserva reserva;

    //Contructores---------------------------------------------------
    public Cliente(){
        super();
    }
    public Cliente(String nombre, int edad, String tipo_doc, long cedula, char sexo){
        super();
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
               "Habitación: " + habitacion.getNumeroHabitacion() + "\n" + // Suponiendo que Habitacion tiene un método getNumeroHabitacion()         
    }

    //-----------------------------------------------------------------
    
    
    
    
    
}
