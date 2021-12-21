package com.company;

public class Main {

    public static void main(String[] args) throws RecorridoExcepcion {

        Agencia agencia1 = new Agencia("Agencia1");

        Estacion estacion1 = new Estacion("Buenos Aires");
        Estacion estacion2 = new Estacion("Luján");
        Estacion estacion3 = new Estacion("Mercedes");
        Estacion estacion4 = new Estacion("Suipacha");
        Estacion estacion5 = new Estacion("Chivilcoy");
        Estacion estacion6 = new Estacion("Alberti");
        Estacion estacion7 = new Estacion("Bragado");

        agencia1.agregarReserva(new Reserva(234,estacion1,estacion2,10));
        agencia1.agregarReserva(new Reserva(234,estacion1,estacion3,20));
        agencia1.agregarReserva(new Reserva(234,estacion1,estacion4,50));
        agencia1.agregarReserva(new Reserva(234,estacion1,estacion5,20));
        agencia1.agregarReserva(new Reserva(234,estacion1,estacion6,5));
        agencia1.agregarReserva(new Reserva(234,estacion1,estacion7,10));

        System.out.println(agencia1.recaudacionTotal());

            String estacionAbuscar = "Chivilcoy";
            agencia1.cantVecesRecorrida("Chivilcoy");



    }
}

