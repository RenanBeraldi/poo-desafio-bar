import entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill bill = new Bill();

        System.out.print("Sexo: ");
        bill.gender = sc.next().charAt(0);
        System.out.print("Quantidade de Cervejas: ");
        bill.beer = sc.nextInt();
        System.out.print("Quantidade de Refrigerantes: ");
        bill.softDrink = sc.nextInt();
        System.out.print("Quantidade de Espetinhos: ");
        bill.barbecue = sc.nextInt();

        System.out.println("\n");
        System.out.println("RELATORIO: ");
        System.out.printf("Consumo = R$ %.2f%n", bill.feeding());
        if (bill.cover() == 0.0) {
            System.out.println("Isento de couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", bill.cover());
        }
        System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());

        System.out.println("\n");
        System.out.printf("Valor a pagar = R$ %.2f%n", bill.total());


        sc.close();
    }
}
