package com.betek.nivelacion.reservas;

public class Coche extends Vehiculo implements Alquilable {
    private boolean estaAlquilado;

    public Coche(String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.estaAlquilado = false;
    }

    @Override
    public void alquilar() {
        if (!estaAlquilado) {
            estaAlquilado = true;
            System.out.println("Coche alquilado: " + getModelo());
        } else {
            System.out.println("El coche ya está alquilado.");
        }
    }

    @Override
    public void devolverVehiculo() {
        if (estaAlquilado) {
            estaAlquilado = false;
            System.out.println("Coche devuelto: " + getModelo());
        } else {
            System.out.println("El coche no estaba alquilado.");
        }
    }
}
