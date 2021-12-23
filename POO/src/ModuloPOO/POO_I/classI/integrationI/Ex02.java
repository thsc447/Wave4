package ModuloPOO.POO_I.classI.integrationI;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número m: ");
        double m = sc.nextDouble();
        System.out.println("Deseja quantas ocorrências? ");
        double ocorrencias = sc.nextInt();
        sc.close();

        int i = 1;
        while (ocorrencias != 0) {
            if (i % m == 0) {
                System.out.println(i);
                ocorrencias--;
            }
            i++;
        }
    }
}
