package ejercicios;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String matricula, String marca, String modelo, boolean tieneSidecar) {
        super(matricula, marca, modelo);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }
}
