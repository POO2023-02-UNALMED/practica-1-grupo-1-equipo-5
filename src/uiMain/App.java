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
	

}
