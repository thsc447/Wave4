package POO_II.classII.Ex02.entities;

public class Círculo extends FiguraGeometrica{

    private final double PI = Math.PI;
    private double raio;

    public Círculo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI * (Math.sqrt(raio));
    }

    @Override
    public String toString() {
        return "Círculo{" +
                "PI=" + String.format("%.5f",PI) +
                ", raio=" + raio +
                ", area=" + String.format("%.3f",area()) +
                '}';
    }
}
