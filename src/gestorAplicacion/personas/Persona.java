package Hotel.personas;

public abstract class Persona {
    //Atributos universales a personas
    protected String nombre;
    protected int edad;
    protected long cedula;
    protected char sexo;
    protected static int numPersonas=0;

    //constructores
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
}
