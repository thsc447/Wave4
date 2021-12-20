package POO_I.classI.integrationI;

import POO_I.classI.integrationI.entities.VerificaNumeroPrimo;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade desejada: ");
        int quantidade = sc.nextInt();

        int contador = 1;
        while (quantidade != 0) {
            if (VerificaNumeroPrimo.execute(contador)) {
                System.out.printf("O número %d é prime!%n", contador);
                quantidade--;
            }
            contador++;
        }
    }
}
