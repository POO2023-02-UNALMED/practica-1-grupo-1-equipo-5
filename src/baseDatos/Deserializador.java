package baseDatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

import gestorAplicacion.Hotel.*;
import gestorAplicacion.personas.*; //

public class Deserializador {
    static File archivo = new File("");

    public static ArrayList<Habitacion> deserializarHamburgueseria() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\Hotel.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Habitacion> lista_Habitaciones = (ArrayList<Habitacion>) o.readObject();

            file.close();
            o.close();
            return lista_Habitaciones;

        } catch (FileNotFoundException e) {
            return new ArrayList<Habitacion>();
        } catch (IOException e) {
            return new ArrayList<Habitacion>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Habitacion>();
        }
    }

    public static ArrayList<Hotel> deserializarCalificacion() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\Hotel.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Hotel> lista_Hoteles= (ArrayList<Hotel>) o.readObject();

            file.close();
            o.close();
            return lista_Hoteles;

        } catch (FileNotFoundException e) {
            return new ArrayList<Hotel>();
        } catch (IOException e) {
            return new ArrayList<Hotel>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Hotel>();
        }
    }

    public static ArrayList<Pago> deserializarContabilidad() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\Hotel.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Pago> lista_Pagos = (ArrayList<Pago>) o.readObject();

            file.close();
            o.close();
            return lista_Pagos;

        } catch (FileNotFoundException e) {
            return new ArrayList<Pago>();
        } catch (IOException e) {
            return new ArrayList<Pago>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Pago>();
        }
    }

    public static ArrayList<Reserva> deserializarEmpleado() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\Hotel.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Reserva> lista_Reservas = (ArrayList<Reserva>) o.readObject();

            file.close();
            o.close();
            return lista_Reservas;

        } catch (FileNotFoundException e) {
            return new ArrayList<Reserva>();
        } catch (IOException e) {
            return new ArrayList<Reserva>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Reserva>();
        }
    }


    public static ArrayList<Servicio> deserializarnoFactura() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\Hotel.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Servicio> lista_Servicios = (ArrayList<Servicio>) o.readObject();

            file.close();
            o.close();
            return lista_Servicios;

        } catch (FileNotFoundException e) {
            return new ArrayList<Servicio>();
        } catch (IOException e) {
            return new ArrayList<Servicio>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Servicio>();
        }
    }

    public static ArrayList<Cliente> deserializarGaseosas() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\personas.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Cliente> lista_Clientes = (ArrayList<Cliente>) o.readObject();

            file.close();
            o.close();
            return lista_Clientes;

        } catch (FileNotFoundException e) {
            return new ArrayList<Cliente>();
        } catch (IOException e) {
            return new ArrayList<Cliente>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Cliente>();
        }

    }

    public static ArrayList<Empleado> deserializarIngredientes() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\personas.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Empleado> lista_Empleados= (ArrayList<Empleado>) o.readObject();

            file.close();
            o.close();
            return lista_Empleados;

        } catch (FileNotFoundException e) {
            return new ArrayList<Empleado>();
        } catch (IOException e) {
            return new ArrayList<Empleado>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Empleado>();
        }

    }

    public static ArrayList<Persona> deserializarInventario() {
        try {
            FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\baseDatos\\temp\\personas.txt"));
            ObjectInputStream o = new ObjectInputStream(file);

            ArrayList<Persona> lista_Personas = (ArrayList<Persona>) o.readObject();

            file.close();
            o.close();
            return lista_Personas;

        } catch (FileNotFoundException e) {
            return new ArrayList<Persona>();
        } catch (IOException e) {
            return new ArrayList<Persona>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<Persona>();
        }

    }

    }
