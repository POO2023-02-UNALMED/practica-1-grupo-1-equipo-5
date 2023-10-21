package gestorAplicacion.Hotel;
import gestorAplicacion.personas.*;
import java.util.ArrayList;

public class Reserva {
	public enum MetodoDePago {
        EFECTIVO("Efectivo"),
        TARJETA_DE_CREDITO("Tarjeta de Crédito"),
        TARJETA_DE_DEBITO("Tarjeta de Débito"),
        PAYPAL("PayPal"),
        TRANSFERENCIA_BANCARIA("Transferencia Bancaria");

        private String nombre;

        MetodoDePago(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        @Override
        public String toString() {
            return nombre;
        }
    }
	//atributos----------------------------------------------------------
	
	private Cliente cliente;
	private Habitacion habitacion;
	private Pago factura;
	private String ingreso;
	private String salida;
	private int total;
	private Servicio servicioAdicional;
	private ArrayList<Servicio> servicios= new ArrayList<Servicio>();
	//private Cliente[] clientes = new ArrayList<Cliente>();
    private ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();


	
	//------------------------------------------------------------------
	
	public Reserva () {
		
	}
	
	 public Cliente getCliente() {
	        return cliente;
	    }

	    public void setCliente(Cliente cliente) {
	        this.cliente = cliente;
	    }

	    // Getter y Setter para el atributo 'habitacion'
	    public Habitacion getHabitacion() {
	        return habitacion;
	    }

	    public void setHabitacion(Habitacion habitacion) {
	        this.habitacion = habitacion;
	    }

	    // Getter y Setter para el atributo 'factura'
	    

	    public void setFactura(Pago factura) {
	        this.factura = factura;
	    }

	    // Getter y Setter para el atributo 'ingreso'
	    public String getIngreso() {
	        return ingreso;
	    }

	    public void setIngreso(String ingreso) {
	        this.ingreso = ingreso;
	    }

	    // Getter y Setter para el atributo 'salida'
	    public String getSalida() {
	        return salida;
	    }

	    public void setSalida(String salida) {
	        this.salida = salida;
	    }

	    // Getter y Setter para el atributo 'total'
	    public int getTotal() {
	        return total;
	    }

	    public void setTotal(int total) {
	        this.total = total;
	    }

	    // Getter y Setter para el atributo 'servicioAdicional'
	    public Servicio getServicioAdicional() {
	        return servicioAdicional;
	    }
	    
	    

	    public void setServicioAdicional(Servicio servicioAdicional) {
	        this.servicioAdicional = servicioAdicional;
	    }
	 public Reserva(Cliente cliente, ArrayList<Servicio> servicios,ArrayList<Habitacion> habitaciones, Pago factura, String ingreso, String salida, int total, Servicio servicioAdicional) {
	        this.cliente = cliente;
	        this.servicios = servicios;
	        this.habitaciones = habitaciones;
	        this.factura = factura;
	        this.ingreso = ingreso;
	        this.salida = salida;
	        this.servicioAdicional = servicioAdicional;
	        cotizarPrecio();

	        
	    }
	 public void addService(Servicio service) {
		 servicios.add(service);
		 cotizarPrecio();
	 }
	 public void deleteService(Servicio service) {
		    // Utiliza el método remove para eliminar el servicio
		    servicios.remove(service);
		}
	 private void  cotizarPrecio(){
		 int totalServicios = 0;
		 int totalHabitacion = 0;
	        
	        for (Servicio servicio : servicios) {
	            totalServicios += servicio.getPrecio();
	        }
	        for (Habitacion habitacion : habitaciones) {
	            totalServicios += habitacion.getPrecio();
	        }
		 int pagar = totalServicios + totalHabitacion;
		 setTotal(pagar);
		 
		 
	 }
	 
	 public String procesarPago(MetodoDePago metodoDePago,String fecha ,String fecha_vencimiento, String pswd) {
		 	cotizarPrecio();
		 	String password = crearContrasena(cliente.getNombre(),cliente.getEdad(),cliente.getTelefono(),Long.toString(cliente.getNumDocumento())) ;
		 	 if (cliente.getDinero() >= total) {
		 		   total -= cliente.getDinero();
			        
			        
		 		switch (metodoDePago) {
	            case EFECTIVO:
	            	if (total > 1000) {
	                    // Ofrecer descuento o bono si el pago en efectivo es mayor a 1000 unidades
	                    return "Pago en efectivo exitoso. ¡Obtuviste un bono de descuento!";
	                } else {
	                    return "Pago en efectivo exitoso.";
	                }
	            case TARJETA_DE_CREDITO:
	            	if (realizarTransaccionConTarjetaDeCredito((int) cliente.getDinero(),total,fecha,pswd,password)) {
	                    return "Pago con Tarjeta de Débito exitoso.";
	                } else {
	                    return "La transacción con Tarjeta de Crédito falló.";
	                }
	              
	            case TARJETA_DE_DEBITO:
	            	   if (realizarTransaccionConTarjetaDeDebito((int) cliente.getDinero(),total,fecha,pswd,password)) {
	                       return "Pago con Tarjeta de Débito exitoso.";
	                   } else {
	                       return "La transacción con Tarjeta de Débito falló.";
	                   }


	            case PAYPAL:
	            	if (realizarPagoConPayPal((int) cliente.getDinero(),total,fecha,pswd,password)) {
	                    return "Pago con PayPal exitoso.";
	                } else {
	                    return "El pago con PayPal falló.";
	                }
	                
	            case TRANSFERENCIA_BANCARIA:
	            	  if (realizarTransferenciaBancaria((int) cliente.getDinero(),total,fecha,pswd,password)) {
	                      return "Transferencia bancaria exitosa.";
	                  } else {
	                      return "La transferencia bancaria falló.";
	                  }

	            default:
	                return "Método de pago no válido";
	        }
		 	
		 		
		 		
		 	 }else {
		 		 return "La cantidad disponible, no es suficiente";
		 	 }
			
	    }

	
	 public static String crearContrasena(String nombre, int edad, String telefono, String cedula) {
	        // Tomar el primer y último caracter de cada atributo
	        char primerCaracterNombre = nombre.charAt(0);
	        char ultimoCaracterNombre = nombre.charAt(nombre.length() - 1);
	        char primerCaracterEdad = Integer.toString(edad).charAt(0);
	        char ultimoCaracterEdad = Integer.toString(edad).charAt(Integer.toString(edad).length() - 1);
	        char primerCaracterTelefono = telefono.charAt(0);
	        char ultimoCaracterTelefono = telefono.charAt(telefono.length() - 1);
	        char primerCaracterCedula = cedula.charAt(0);
	        char ultimoCaracterCedula = cedula.charAt(cedula.length() - 1);

	        // Concatenar los caracteres para crear la contraseña
	        String contrasena = "" + primerCaracterNombre + ultimoCaracterNombre +
	                           primerCaracterEdad + ultimoCaracterEdad +
	                           primerCaracterTelefono + ultimoCaracterTelefono +
	                           primerCaracterCedula + ultimoCaracterCedula;

	        return contrasena;
	    }
	 private boolean realizarTransaccionConTarjetaDeCredito(int dinero, int totalPagar,String fecha,String password,String password2) {
		 	if(password != password2) {
		 		return false;
		 		
		 	}
		 	
		    // Lógica para procesar la transacción con tarjeta de crédito
		    // Devuelve true si la transacción es exitosa, false en caso contrario

		    // Aplicar descuento si el precio supera un cierto umbral
		    double descuento = 0;
		    double umbral = 1000; // Definir el umbral para aplicar descuento, por ejemplo, 1000 unidades

		    if (totalPagar > umbral) {
		        descuento = totalPagar * 0.1; // Aplicar un descuento del 10% si el precio supera el umbral
		    }

		    // Calcular el monto final que se cobrará al cliente después del descuento
		    double montoFinal = totalPagar - descuento;

		    // Simular la transacción, aquí puedes agregar lógica adicional según tus necesidades
		    boolean transaccionExitosa = dinero >= montoFinal;
		    Pago pago = new Pago(montoFinal,fecha);
		    if (transaccionExitosa) {

		        cliente.getPagos().add(pago);
		        cliente.getHistoriaReserva().add(this);
		        cliente.setDinero(cliente.getDinero()-montoFinal);
		        // Realizar la transacción, por ejemplo, cobrar el monto final
		        // ...
		        return true;
		    } else {
		        return false;
		    }
		}
	 private boolean realizarTransaccionConTarjetaDeDebito(int dinero, int totalPagar,String fecha,String password,String password2) {
		 if(password != password2) {
		 		return false;
		 		
		 	}
		    // Lógica para procesar la transacción con tarjeta de débito
		    // Devuelve true si la transacción es exitosa, false en caso contrario

		    // Aplicar descuento si el total a pagar supera un cierto umbral
		    double descuento = 0;
		    int umbral = 100000; // Definir el umbral para aplicar descuento, por ejemplo, 100000 unidades

		    if (totalPagar > umbral) {
		        descuento = 0.05 * (totalPagar - umbral); // Aplicar un descuento del 5% del monto que supera el umbral
		    }

		    // Calcular el monto final que se cobrará al cliente después del descuento
		    double montoFinal = totalPagar - descuento;

		    // Simular la transacción, aquí puedes agregar lógica adicional según tus necesidades
		    boolean transaccionExitosa = dinero >= montoFinal;
		    Pago pago = new Pago(montoFinal,fecha);

		    if (transaccionExitosa) {
		        cliente.getPagos().add(pago);
		        cliente.getHistoriaReserva().add(this);
		        cliente.setDinero(cliente.getDinero()-montoFinal);
		        // Realizar la transacción, por ejemplo, cobrar el monto final
		        // ...
		        return true;
		    } else {
		        return false;
		    }
		}

	 private boolean realizarPagoConPayPal(int dinero, int totalPagar,String fecha,String password,String password2) {
		 if(password != password2) {
		 		return false;
		 		
		 	}
		    // Lógica para procesar el pago con PayPal
		    // Devuelve true si el pago es exitoso, false en caso contrario

		    double descuento = 0;

		    if (totalPagar % 2 == 0) {
		        // Si el total a pagar es un número par, aplicar un descuento del 15%
		        descuento = 0.15 * totalPagar;
		    } else {
		        // Si el total a pagar es un número impar, aplicar un descuento fijo de 50 unidades
		        descuento = 50;
		    }

		    // Calcular el monto final que se cobrará al cliente después del descuento
		    double montoFinal = totalPagar - descuento;

		    // Simular la transacción con PayPal, aquí puedes agregar lógica adicional según tus necesidades
		    boolean transaccionExitosa = dinero >= montoFinal;
		    Pago pago = new Pago(montoFinal,fecha);

		    if (transaccionExitosa) {
		    	 cliente.getPagos().add(pago);
			        cliente.getHistoriaReserva().add(this);
			        cliente.setDinero(cliente.getDinero()-montoFinal);
		        // Realizar la transacción, por ejemplo, cobrar el monto final
		        // ...
		        return true;
		    } else {
		        return false;
		    }
		}
	 private boolean realizarTransferenciaBancaria(int dinero, int totalPagar,String fecha,String password,String password2) {
		 if(password != password2) {
		 		return false;
		 		
		 	}
		    // Lógica para procesar la transferencia bancaria
		    // Devuelve true si la transferencia es exitosa, false en caso contrario

		    double descuento = 0;

		    // Aplicar descuentos específicos según el monto total
		    if (totalPagar > 100000) {
		        // Si el total a pagar supera 100,000 unidades, aplicar un descuento del 7%
		        descuento = 0.07 * totalPagar;
		    } else if (totalPagar > 50000) {
		        // Si el total a pagar está entre 50,000 y 100,000 unidades, aplicar un descuento fijo de 200 unidades
		        descuento = 200;
		    }

		    // Calcular el monto final que se cobrará al cliente después del descuento
		    double montoFinal = totalPagar - descuento;

		    // Simular la transferencia bancaria, aquí puedes agregar lógica adicional según tus necesidades
		    boolean transferenciaExitosa = dinero >= montoFinal;
		    Pago pago = new Pago(montoFinal,fecha);

		    if (transferenciaExitosa) {
		    	cliente.getPagos().add(pago);
		        cliente.getHistoriaReserva().add(this);
		        cliente.setDinero(cliente.getDinero()-montoFinal);
		        // Realizar la transferencia, por ejemplo, debitar el monto final
		        // ...
		        return true;
		    } else {
		        return false;
		    }
		}
	public Pago getFactura() {return factura;}

	//el sistema de reserva debe tener uno o mas clientes asociados, una o mas habitaciones asociadas,
    // una o mas actividades, todo con su respectivo precio y fechas
}
