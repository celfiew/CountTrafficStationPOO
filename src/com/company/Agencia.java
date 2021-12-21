package com.company;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nombre;
    private List<Reserva> reservas;
    private List<Estacion> estaciones;

    public Agencia(String nombre) {
        this.nombre = nombre;
        this.reservas = new ArrayList<>();
        this.estaciones = new ArrayList<>();
    }


    public void agregarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public void agregarEstacion(Estacion estacion) {
        this.estaciones.add((estacion));
    }


    public void cantVecesRecorrida(String estacionbuscar) {
        int cantidadPersonas = 0;
            for (Reserva reserva : reservas) {
                try {
                if (reserva.getEstacionPartida().toString().equals(estacionbuscar) || reserva.getEstacionDestino().toString().equals(estacionbuscar)) {
                    cantidadPersonas += reserva.getCantPersonas();
                }
                    throw new RecorridoExcepcion("No se encontró ninguna coincidencia");

            }catch (RecorridoExcepcion excepcion) {
                    System.out.println(excepcion.getMessage());
                }
            }
        System.out.println(("La cantidad de personas que pasaron por la estación " + estacionbuscar + " son " + cantidadPersonas));
    }






    public double recaudacionTotal() {
        double total = 0;
        for (Reserva reserva : reservas) {
            if (reserva.getEstacionDestino().equals("Buenos Aires") && reserva.getEstacionPartida().equals("Bragado")
                    || reserva.getEstacionPartida().equals("Buenos Aires") && reserva.getEstacionDestino().equals("Bragado")) {

                total += (reserva.getCantPersonas() * 50) * (1 - 0.20);
            } else {
                    total += (reserva.getCantPersonas() * 50);
                }
            }
            return total;
        }
}

