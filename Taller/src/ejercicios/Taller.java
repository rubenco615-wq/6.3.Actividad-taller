package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Taller {
    private String cif;
    private String nombre;
    private List<Mecanico> mecanicos;
    private List<Reparacion> reparaciones;

    public Taller(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
        this.mecanicos = new ArrayList<>();
        this.reparaciones = new ArrayList<>();
    }

    public void asignarTarea(Mecanico m, Reparacion r) {
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Mecanico> getMecanicos() {
        return mecanicos;
    }

    public void addMecanico(Mecanico m) {
        this.mecanicos.add(m);
    }

    public List<Reparacion> getReparaciones() {
        return reparaciones;
    }

    public void addReparacion(Reparacion r) {
        this.reparaciones.add(r);
    }
}
