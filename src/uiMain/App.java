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

        Cliente cl001 = new Cliente("Omar", "cc", "111421412", "323242442","cl001", hotelObj, "Gold", 2);
        //GestionReserva gr001 = new GestionReserva(cl001, h)
        // Inicio del Menu interactivo
        System.out.println("---- Servicio de reserva ----\n");

        do {
            System.out.println("Escoja una opción: ");
            System.out.println("1. Ver hoteles disponibles");
            System.out.println("2. Gestionar reserva");
            System.out.println("3. Gestion de pagos");
            System.out.println("4. Comentarios y calificaciones");
            System.out.println("5. Puntos");
            System.out.println("6. Gestión de equipajes");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("---------- Hoteles ----------");

                    for (Hotel hotel : hoteles) {
                        System.out.println(hotel);
                    }
                    System.out.println("-----------------------------");
                    break;

                case 2:

                    System.out.print("Digite el nombre del hotel a reservar: ");
                    sc.nextLine();
                    String opcionReserva = sc.nextLine();

                    if (!opcionReserva.equals("0")){
                        int count = 0;
                        int cuentaHab = 0;
                        for (Hotel hotel : hoteles) {
                            if (hotel.getNombre().equals(opcionReserva)) {
                                habitaciones = hotel.getHabitaciones();
                                System.out.println("Seleccione la habitación deseada: ");
                                for (Habitacion hab : habitaciones){
                                    if (!hab.getOcupacion()){
                                        System.out.println(hab);
                                    }

                                }
                                String opcionHab = sc.nextLine();
                                for (Habitacion habitacion : habitaciones){
                                    if(opcionHab.equals(habitacion.getNumHabitacion())){
                                        System.out.println("1. Cliente nuevo");
                                        System.out.println("2. Cliente antiguo");
                                        String opcioncl = sc.nextLine();
                                        if (opcioncl.equals("1")){
                                            System.out.println("¿Cual es su nombre?");
                                            String nombre = sc.nextLine();
                                            System.out.println("Tipo de documento: ");
                                            String tipoDoc = sc.nextLine();
                                            System.out.println("Número de documento: ");
                                            String numDoc = sc.nextLine();
                                            System.out.println("Numero de telefono: ");
                                            String numTlf = sc.nextLine();
                                            System.out.println("Cuantas piezas de equipaje lleva: ");
                                            int numEqui = sc.nextInt();
                                            client = new Cliente(nombre, tipoDoc, numDoc, numTlf, "cl0"+ Cliente.getClientes().size(), hotel, "Basic", numEqui);
                                        } else {
                                            List<Cliente> clients = Cliente.getClientes();
                                            System.out.println("Elija el cliente existente: ");
                                            for (int i = 0; i < clients.size(); i++) {
                                                System.out.println((i+1)+". "+clients.get(i));
                                            }
                                            int eleccion = sc.nextInt();
                                            client = Cliente.getClientes().get(eleccion-1);
                                        }
                                        System.out.println("Cuantas noches desea quedarse: ");
                                        int noches = sc.nextInt();

                                        GestionReserva reserva = new GestionReserva(client, habitacion, noches, pago);
                                        System.out.println("---------[OK]----------");
                                        System.out.println("!! Reserva realizada !!");
                                        System.out.println("-----------------------");
                                        break;
                                    }
                                   cuentaHab++;
                                }
                                if (cuentaHab == habitaciones.size()) {
                                    System.out.println("---------[ERROR]---------");
                                    System.out.println("!! Habitación no encontrada !!");
                                    System.out.println("-------------------------\n");
                                }

                                break;
                            }
                            count ++;
                        }
                        if (count == hoteles.size()) {
                            System.out.println("---------[ERROR]---------");
                            System.out.println("!! Hotel no encontrado !!");
                            System.out.println("-------------------------\n");
                        }
                    }
                    break;
                case 3:

            }
        } while (opcion != 0);

    }
}