package com.mycompany.proyectogrupalpoo;

/**
 *
 * @author Emanuel
 */
public abstract class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void mostrarInformacion();

    public void saludar() {
        System.out.println("Hola, soy " + nombre);
    }
}
