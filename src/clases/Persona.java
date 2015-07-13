/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Cristo
 */
public class Persona {
    private String nombreApellido;    
    private int edad;
    private String direccion;
    
    public Persona() {
    }

    public Persona(String nombreApellido, int edad, String direccion) {
        this.nombreApellido = nombreApellido;        
        this.direccion = direccion;
        this.edad = edad;
    }
    
    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {        
        return "Nombre: "+this.nombreApellido+                
                "\nApellido : "+this.direccion+
                "\nEdad : "+this.edad;
    }
    
}
