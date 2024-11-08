/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectogrupalpoo;

public class Deportista extends Persona {
    private String deporte;

    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad); 
        this.deporte = deporte;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Deporte: " + deporte);
    }

    public void entrenar() {
        System.out.println(nombre + " esta entrenando en " + deporte + ".");
    }
}
