package gestorAplicacion.Hotel;

public class Habitacion {
    //Atributos----------------------------------------------
	private Hotel hotel;
	private int num_habitacion;
    private int capacidad;
    private double precio;
    private String tipo;
    private boolean ocupada;
    private double calificacion;
    private String resenas;

    //Contructores
    public Habitacion(){
    }
    public Habitacion(int capacidad, double precio, Hotel hotel){
        this.capacidad=capacidad;
        this.precio=precio;
        this.hotel=hotel;
        this.hotel.addHabitacion(this);
        this.calificacion=this.hotel.calificacion;
    }

    //metodos (provisional)
    public void addResena(String resena){
        this.resenas = resena+"\n"+ this.resenas;
    }

    public void setHotel(Hotel hotel) {this.hotel = hotel;}
    public Hotel getHotel() {return hotel;}

    public void setPrecio(double precio) {this.precio = precio;}
    public double getPrecio() {return precio;}

    public void setCalificacion(double calificacion){
        if (calificacion<=5 && calificacion>=0) {
            this.calificacion = calificacion;
            if (calificacion>4.5){
                this.precio*=1.15; //las habitaciones con mayor calificacion aumentan un 15% su precio
            }
        }else{/*excepcion por si no se da una calificacion valida*/}
    }
    public double getCalificacion() {return calificacion;}

    public void setNumero(int num_habitacion) {this.num_habitacion = num_habitacion;}
    public int getNumero() {return num_habitacion;}

    public void setResenas(String resenas) {this.resenas = resenas;}
    public String getResenas(){return(this.resenas);}

    public void setCapacidad(int capacidad) {this.capacidad = capacidad;}
    public int getCapacidad() {return capacidad;}

    public void ocupar() {this.ocupada = true;}
    public boolean isOcupada(){return this.ocupada;}
    public String estado(){
        if (this.isOcupada()){return "Ocupada";}
        else{return "Libre";}
    }

    public void setTipo(String tipo) {this.tipo = tipo;}
    public String getTipo() {return tipo;}

    //toString
    @Override
    public String toString(){
        return "habitacion numero: "+this.num_habitacion+" del hotel "+ this.hotel+".\n" +
                "estado: "+this.estado()+"\n"+
                "Capacidad para "+this.capacidad+" personas.\n"+
                "Precio: $"+this.precio+" la noche.\n"+
                "Calificacion: "+this.calificacion+"\n\nReseñas: "+this.resenas;
    }
}