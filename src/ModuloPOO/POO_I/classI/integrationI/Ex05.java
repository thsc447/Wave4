package ModuloPOO.POO_I.classI.integrationI;

import ModuloPOO.POO_I.classI.integrationI.entities.StringConverter;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite n: ");
        int n = sc.nextInt();
        System.out.println("Digite m: ");
        int m = sc.nextInt();
        System.out.println("Digite d");
        char d = sc.next().charAt(0);
        sc.close();

        int increment = 0;
        while (n != 0) {
            int isValid = 0;
            char[] validador = StringConverter.execute(increment);
            for (int i = 0; i < validador.length; i++) {
                if (validador[i] == d) {
                    isValid++;
                }
            }
            if (isValid == m) {
                System.out.println(isValid);
                n--;
            }
            increment++;
        }


    }
}
