package com.ikasgela;

public class Maquina implements Visualizable {

    private final String marca;
    private final String modelo;
    private final String numero_serie;

    //Constructor
    public Maquina(String marca, String modelo, String numero_serie) {
        this.marca = marca;
        this.modelo = modelo;
        this.numero_serie = numero_serie;
    }

    @Override
    public void visualizar() {
        System.out.printf("| M | %-15s\t| %-15s\t|%16s |%n", marca, modelo, numero_serie);
    }
}
