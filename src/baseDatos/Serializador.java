package baseDatos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import gestorAplicacion.Hotel.*;
import gestorAplicacion.personas.*;

public class Serializador {
    static File archivo = new File("");

    public static void serializarHabitacion(ArrayList<Habitacion> lista) {
        try {
            FileOutputStream f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\baseDatos\\temp\\Hotel.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");

        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado: "+e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Error de flujo de inicializacion: "+ e.getMessage());
        }

    }

    public static void serializarHotel(ArrayList<Hotel> lista) {
        try {
            FileOutputStream f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\baseDatos\\temp\\Hotel.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");

        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado: "+e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Error de flujo de inicializacion: "+ e.getMessage());
        }

    }

    public static void serializarPago(ArrayList<Pago> lista) {
        try {
            FileOutputStream f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\baseDatos\\temp\\Hotel.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");

        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado: "+e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Error de flujo de inicializacion: "+ e.getMessage());
        }

    }
    public static void serializarReserva(ArrayList<Reserva> lista){
        try {
            FileOutputStream f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\baseDatos\\temp\\Hotel.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");

        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado: "+e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Error de flujo de inicializacion: "+ e.getMessage());
        }
    }
    public static void serializarServicio(ArrayList<Servicio> lista){
        try {
            FileOutputStream f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\baseDatos\\temp\\Hotel.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");

        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado: "+e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Error de flujo de inicializacion: "+ e.getMessage());
        }
    }
    public static void serializarCliente(ArrayList<Cliente> lista){
        try {
            FileOutputStream f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\baseDatos\\temp\\Personas.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");

        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado: "+e.getMessage());
        }
        catch(IOException e) {
            System.out.println("Error de flujo de inicializacion: "+ e.getMessage());
        }
    }

    public static void serializarEmpleado(ArrayList<Empleado> lista) {
        try {
        	FileOutputStream f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\baseDatos\\temp\\Personas.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");


        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de flujo de inicializacion: " + e.getMessage());
        }
    }

    public static void serializarPersona(ArrayList<Persona> lista) {
        try {
            FileOutputStream f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\baseDatos\\temp\\Personas.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(lista);

            o.close();
            f.close();
            System.out.println("La serialización se ha completado correctamente.");


        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de flujo de inicializacion: " + e.getMessage());
        }
    }
    
}

