package ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String idFactura;
    private LocalDate fechaEmision;
    private Cliente cliente;
    private List<Reparacion> reparaciones;
    private double totalImporte;

    public Factura(String idFactura, LocalDate fechaEmision, Cliente cliente) {
        this.idFactura = idFactura;
        this.fechaEmision = fechaEmision;
        this.cliente = cliente;
        this.reparaciones = new ArrayList<>();
    }

    public void addReparacion(Reparacion r) {
        this.reparaciones.add(r);
    }

    public double calcularTotal() {
        // Lógica para calcular el total leyendo el costo de las reparaciones
        return 0.0;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Reparacion> getReparaciones() {
        return reparaciones;
    }

    public double getTotalImporte() {
        return totalImporte;
    }

    public void setTotalImporte(double totalImporte) {
        this.totalImporte = totalImporte;
    }
}
