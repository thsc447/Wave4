package POO_I.classI.integrationI;

import POO_I.classI.integrationI.entities.VerificaNumeroPrimo;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int numero = sc.nextInt();
        boolean result = VerificaNumeroPrimo.execute(numero);
        if(result)
            System.out.printf("O numero %d é primo", numero);
        else
            System.out.printf("O numero %d não é primo", numero);
    }
}
