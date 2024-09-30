package com.betek.nivelacion.reservas;

import java.time.LocalDateTime;

public class Reserva {
    private Usuario usuario;
    private Vehiculo vehiculo;
    private LocalDateTime tiempoReserva;

    public Reserva(Usuario usuario, Vehiculo vehiculo) {
        this.usuario = usuario;
        this.vehiculo = vehiculo;
        this.tiempoReserva = LocalDateTime.now();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public LocalDateTime getTiempoReserva() {
        return tiempoReserva;
    }
}
