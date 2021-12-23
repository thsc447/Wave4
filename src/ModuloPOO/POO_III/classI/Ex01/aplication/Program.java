package ModuloPOO.POO_III.classI.Ex01.aplication;

import ModuloPOO.POO_III.classI.Ex01.entities.Pj;

public class Program {
    public static void main(String[] args) {
        Pj bob = new Pj(1, "Bob", "23", "IT", 234, 41.3);
        System.out.printf("Salário: %.2f", bob.pagarSalario());
    }
}
