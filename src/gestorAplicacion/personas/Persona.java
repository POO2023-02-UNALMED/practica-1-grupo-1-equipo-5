package gestorAplicacion.personas;

import java.util.ArrayList;

public abstract class Persona {
    private String nombre;
    private Integer edad;
    private Character sexo;
    private String tipo_documento;
    private String num_documento;
    private String telefono;
    private String direccion;
    private String correo;

    public Persona() {
    }

    public Persona(String nombre, Integer edad, Character sexo, String tipo_documento, String num_documento, String telefono, String direccion, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.tipo_documento = tipo_documento;
        this.num_documento = num_documento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

    public Persona(String nombre, String tipo_documento, String num_documento, String telefono) {
        this.nombre = nombre;
        this.tipo_documento = tipo_documento;
        this.num_documento = num_documento;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
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

    public abstract String toString();
    //public abstract void ascender();
    public abstract String personaRol();
}