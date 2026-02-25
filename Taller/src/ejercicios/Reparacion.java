package ejercicios;

import java.time.LocalDate;

public class Reparacion {
    private LocalDate fecha;
    private String descripcion;
    private double costePiezas;
    private Vehiculo vehiculo;

    public Reparacion(LocalDate fecha, String descripcion, double costePiezas, Vehiculo vehiculo) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.costePiezas = costePiezas;
        this.vehiculo = vehiculo;
    }

    public double calcularCosteTotal() {

        return 0.0;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCostePiezas() {
        return costePiezas;
    }

    public void setCostePiezas(double costePiezas) {
        this.costePiezas = costePiezas;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
