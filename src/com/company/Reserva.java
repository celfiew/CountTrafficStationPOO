package com.company;

public class Reserva {
    private static double PRECIO_TIQUETE = 50.00;
    private int codigo;
    private Estacion estacionDestino;
    private Estacion estacionPartida;
    private int cantPersonas;


    public Reserva(int codigo, Estacion estacionDestino, Estacion estacionPartida, int cantPersonas) {
        this.codigo = codigo;
        this.estacionDestino = estacionDestino;
        this.estacionPartida = estacionPartida;
        this.cantPersonas = cantPersonas;
    }

    public Estacion getEstacionDestino() {
        return estacionDestino;
    }

    public Estacion getEstacionPartida() {
        return estacionPartida;
    }



    public String nombreReservaEstacionDestino(){
      return  this.estacionDestino.toString();
    }

    public String nombreReservaEstacionPartida(){
        return this.estacionPartida.toString();
    }

    public int getCantPersonas() {
        return cantPersonas;
    }



}
