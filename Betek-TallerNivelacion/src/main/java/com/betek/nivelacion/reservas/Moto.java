package com.betek.nivelacion.reservas;

public class Moto extends Vehiculo implements Alquilable {
    private boolean estaAlquilada;

    public Moto(String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.estaAlquilada = false;
    }

    @Override
    public void alquilar() {
        if (!estaAlquilada) {
            estaAlquilada = true;
            System.out.println("Moto alquilada: " + getModelo());
        } else {
            System.out.println("La moto ya está alquilada.");
        }
    }

    @Override
    public void devolverVehiculo() {
        if (estaAlquilada) {
            estaAlquilada = false;
            System.out.println("Moto devuelta: " + getModelo());
        } else {
            System.out.println("La moto no estaba alquilada.");
        }
    }
}
