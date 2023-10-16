package gestorAplicacion.personas;

import java.util.ArrayList;

public abstract class Persona {
    //Atributos universales a personas
    protected String nombre;
    protected int edad;
    protected char sexo;
    protected enum TPD {CC, TI, PASAPORTE, CE}
    protected TPD tipoDocumento;
    protected long numDocumento;
    protected String telefono;
    protected String direccion;
    protected String correo;
    protected ArrayList<String> historia_comentario= new ArrayList<String>();
    
    
    protected static int numPersonas=0;

    //constructores----------------------------------------------------------
    public Persona(){
        numPersonas++;
    }
    public Persona(String nombre, int edad, TPD tipoDocumento ,long numDocumento, char sexo, String telefono, String direccion, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.sexo = sexo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        numPersonas++;
    }
    
    public Persona (String nombre, int edad, TPD tipoDocumento ,long numDocumento, char sexo) {
     	 this.nombre = nombre;
         this.edad = edad;
         this.tipoDocumento = tipoDocumento;
         this.numDocumento = numDocumento;
         this.sexo = sexo;
         numPersonas++;
    }
    
    //-----------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public TPD getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TPD tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public long getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(long numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    //método abstracto, obligamos a que se use en empleado y cliente
    
    public abstract String toString();
    public abstract void ascender();
    public abstract String personaRol();
    
    
    
    //-----------------------------------------------------------------------
    
    
    
    
    
    
}
