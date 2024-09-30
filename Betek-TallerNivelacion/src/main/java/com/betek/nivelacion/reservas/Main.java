package com.betek.nivelacion.reservas;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Alice", "alice@example.com");
        Vehiculo coche1 = new Coche("ABC123", "Toyota", "Corolla");
        Vehiculo moto1 = new Moto("XYZ789", "Honda", "CBR500R");

        // Alquilar un coche
        ((Alquilable) coche1).alquilar();
        Reserva reserva1 = new Reserva(usuario1, coche1);

        // Alquilar una moto
        ((Alquilable) moto1).alquilar();
        Reserva reserva2 = new Reserva(usuario1, moto1);

        // Devolver vehículos
        ((Alquilable) coche1).devolverVehiculo();
        ((Alquilable) moto1).devolverVehiculo();
    }
}
