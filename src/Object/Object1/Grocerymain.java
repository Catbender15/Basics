package Object.Object1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grocerymain {
    public static void main(String[] args){
        Product[] product = new Product[5];
        Scanner namescan = new Scanner(System.in);
        Scanner pricescan = new Scanner(System.in);
        String name = "";
        double price = 0;
        //List<Product> products = new ArrayList<>(5);

        for(int i = 0; i<5; i++)
        {
            System.out.println("Iveskite produkto pavadinima: ");
            name = namescan.nextLine();
            System.out.println("Iveskite produkto kaina: ");
            price = pricescan.nextDouble();
            product[i] = new Product(name, price);

        }
        double sum = 0;
        for(int i = 0; i<5; i++){
            sum = sum + product[i].getPrice();

        }
        System.out.println("Reikia sumoketi: " + sum);
        double money = pricescan.nextDouble();
        boolean check = true;
        do {
            if (money < sum) {
                System.out.println("Dar per mazai ant " + (sum - money));
                System.out.println("Ar dar turesite?");
                String wcheck = namescan.nextLine();
                if (wcheck.equals("taip")) {
                    double money1 = pricescan.nextDouble();
                    money = money +money1;
                }
                if (wcheck.equals("ne")) {
                    check = false;
                }
            }
            if (money > sum) {
                System.out.println("Per daug ant " + (money - sum));
                System.out.println("Jusu graza = " + (money - sum));
                check = false;
            }
        } while (check);




    }
}
