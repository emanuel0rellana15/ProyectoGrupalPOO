package com.mycompany.proyectogrupalpoo;

/**
 *
 * @author Emanuel
 */
// Superclase abstracta
public abstract class Persona {
    // Propiedades protegidas (encapsulamiento)
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
