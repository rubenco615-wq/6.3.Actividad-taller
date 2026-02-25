package ejercicios;

public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String matricula, String marca, String modelo, int numPuertas) {
        super(matricula, marca, modelo);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}
