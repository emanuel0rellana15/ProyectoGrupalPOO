/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectogrupalpoo;

public class ProyectoGrupalPOO {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Juan Perez", 45, "Cardiologia");
        doctor.saludar();                
        doctor.mostrarInformacion();       
        doctor.diagnosticar();            

        System.out.println(); 

        Deportista deportista = new Deportista("Luis Gomez", 30, "Futbol");
        deportista.saludar();              
        deportista.mostrarInformacion();   
        deportista.entrenar();             
    }
}
