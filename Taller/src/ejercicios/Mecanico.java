package ejercicios;

public class Mecanico implements Especialista {
    private String idEmpleado;
    private String nombre;
    private String especialidad;

    public Mecanico(String idEmpleado, String nombre, String especialidad) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public void reparar(Reparacion r) {
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
