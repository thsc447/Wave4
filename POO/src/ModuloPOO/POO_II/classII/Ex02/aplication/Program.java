package ModuloPOO.POO_II.classII.Ex02.aplication;

import ModuloPOO.POO_II.classII.Ex02.entities.*;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<FiguraGeometrica> fg = new ArrayList<FiguraGeometrica>();

        fg.add(new Círculo(4));
        fg.add(new Retangulo(10,24));
        fg.add(new Triangulo(10, 5));

        System.out.printf("A area total dos itens é %.2f ", Area.Media(fg));
    }
}
