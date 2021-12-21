package com.company;

import java.util.List;

public class Estacion {

    private String nombre;

    public Estacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
