package Hotel.personas;

public abstract class Persona {
    //Atributos universales a personas
    protected String nombre;
    protected int edad;
    protected char sexo;
    protected String tipo_documento;
    protected String num_documento;
    protected String telefono;
    protected String direccion;
    protected String correo;
    
    
    protected static int numPersonas=0;

    //constructores----------------------------------------------------------
    public Persona(){
        numPersonas++;
    }
    public Persona(String nombre, int edad, long cedula, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.cedula=cedula;
        this.sexo=sexo;
        numPersonas++;
    }
    
    //-----------------------------------------------------------------------
    //método abstracto, obligamos a que se use en empleado y cliente
    
    public abstract String toString();
    
    
    
    
    //-----------------------------------------------------------------------
    
    
    
    
    
    
}
