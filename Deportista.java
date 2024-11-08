/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectogrupalpoo;

public class Deportista extends Persona {
    // Atributo específico para el Deportista
    private String deporte;

    // Constructor que incluye el nombre, edad y deporte
    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad); // Llama al constructor de la superclase Persona
        this.deporte = deporte;
    }

    // Implementación del método abstracto mostrarInformacion
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Deporte: " + deporte);
    }

    // Método específico de la clase Deportista
    public void entrenar() {
        System.out.println(nombre + " está entrenando en " + deporte + ".");
    }
}