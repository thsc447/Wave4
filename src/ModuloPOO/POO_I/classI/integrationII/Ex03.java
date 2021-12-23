package ModuloPOO.POO_I.classI.integrationII;

import ModuloPOO.POO_I.classI.integrationII.entities.Produtos;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Produtos[] products = new Produtos[3];

        for (int i = 0; i < products.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the product name: ");
            String name = sc.nextLine();
            System.out.print("Enter the price: ");
            BigDecimal price = sc.nextBigDecimal();
            System.out.print("Enter the quantity: ");
            int quantity = sc.nextInt();

            products[i] = new Produtos(name, price, quantity);
        }
        BigDecimal totalPrice = BigDecimal.valueOf(0);
        for (Produtos product : products) {
            System.out.println(product);
            totalPrice = totalPrice.add((product.getPreco().multiply(BigDecimal.valueOf(product.getQuantidade()))));
        }
        System.out.printf("Total Price %.2f", totalPrice);
    }
}
