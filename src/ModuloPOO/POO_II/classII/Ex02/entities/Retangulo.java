package ModuloPOO.POO_II.classII.Ex02.entities;

public class Retangulo extends FiguraGeometrica{

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double area() {
        return altura * largura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "altura=" + altura +
                ", largura= " + largura +
                ", area= " + area() +
                '}';
    }
}
