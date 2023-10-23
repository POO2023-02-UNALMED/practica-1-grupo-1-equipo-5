package gestorAplicacion.uiMain;

import gestorAplicacion.personas.*;
import gestorAplicacion.hotel.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class App {
	
    static List<Hotel> hoteles = Hotel.getHoteles();
    public static List<Servicio> servicios = new LinkedList<>();
    public static List<Habitacion> habitaciones = new LinkedList<>();
    
 // Inicializacion de la App
    public static void initApp() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Cliente client;
        Boolean pago = false;
        // TODO: Datos de prueba
        Servicio serv1 = new Servicio("Desayuno", 2.99, 5, "01-01-2023", "01-20-2023");
        Servicio serv2 = new Servicio("Actividad tematica", 6.99, 4, "01-30-2023", "02-05-2023");

        //habitaciones.add(habi1);
        //habitaciones.add(habi2);
        servicios.add(serv1);
        servicios.add(serv2);
        Hotel hotelObj = new Hotel();
        hotelObj.setNombre("Sol caribe");
        hotelObj.setDireccion("<direccion>");
        hotelObj.setComentarios(new String[]{"Excelente", "Hola"});
        Hotel hotel02 = new Hotel("OnVcation", "San Luis");
        hotel02.setComentarios(new String[]{"Excelente", "Hola"});
        //hotelObj.setHabitaciones(habitaciones);
        hotelObj.setServicios(servicios);
        hotelObj.addHabitaciones(new Habitacion(hotelObj,"101", 1, 200000.0, TipoHabitacion.INDIVIDUAL, false));
        hotelObj.addHabitaciones(new Habitacion(hotelObj, "102", 2, 200000.0, TipoHabitacion.DOBLE, true));
        hotelObj.addHabitaciones(new Habitacion(hotelObj, "103", 2, 200000.0, TipoHabitacion.DOBLE, false));
        hotelObj.addHabitaciones(new Habitacion(hotelObj,"104", 2, 200000.0, TipoHabitacion.MATRIMONIAL, true));
        hotelObj.addHabitaciones(new Habitacion(hotelObj, "105", 1, 200000.0, TipoHabitacion.INDIVIDUAL, true));
        hotelObj.addHabitaciones(new Habitacion(hotelObj, "106", 2, 200000.0, TipoHabitacion.DOBLE, false));
        hotelObj.addHabitaciones(new Habitacion(hotelObj,"107", 3, 200000.0, TipoHabitacion.SUITE, true));
        hotelObj.addHabitaciones(new Habitacion(hotelObj,"108", 2, 200000.0, TipoHabitacion.DOBLE, true));


}
