package com.ikasgela;

public class Persona implements Visualizable {

    private final String nombre;
    private final String apellido;
    private final int edad;

    //Constructor

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public void visualizar() {
        System.out.printf("| P | %-15s\t| %-15s\t|%16d |%n", nombre, apellido, edad);
    }
}
