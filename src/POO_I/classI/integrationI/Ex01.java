package POO_I.classI.integrationI;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int numerosDePar = sc.nextInt();
        for(int i = 1; i <= numerosDePar * 2; i++){
            if(i % 2 == 0)
                System.out.println(i);
        }
    }
}
