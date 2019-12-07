package flow_control_loops_array;

import java.util.Scanner;

public class flow6 {
    public  static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanprice = new Scanner(System.in);
        Scanner scanage = new Scanner(System.in);
        System.out.println("Ka pirksite piena ar vyna");
        String prod = scan.nextLine();
        if (prod.equals("piena")) {
            double price = 2.56;
            System.out.println("Pieno kaina = " + price);
            double money = scanprice.nextDouble();
            if (money == price) {
                System.out.println("Aciu viskas teisinga");
            }
            if (money < price || money > price) {
                boolean check = true;
                do {
                    if (money < price) {
                        System.out.println("Dar per mazai ant " + (price - money));
                        System.out.println("Ar dar turesite?");
                        String wcheck = scan.nextLine();
                        if (wcheck.equals("taip")) {
                            double money1 = scanprice.nextDouble();
                            money = money +money1;
                        }
                        if (wcheck.equals("ne")) {
                            check = false;
                        }
                    }
                    if (money > price) {
                        System.out.println("Per daug ant " + (money - price));
                        System.out.println("Jusu graza = " + (money - price));
                        check = false;
                    }
                } while (check);

            }
        }
        if (prod.equals("vyna")) {
            System.out.println("Kiek jums metu?");
            int age = scanage.nextInt();
            if (age < 18) {
                System.out.println("Negalime parduot nes jums maziau negu 18 metu");
            }
            if (age >= 18) {
                double price = 2.56;
                System.out.println("vyno kaina = " + price);
                double money = scanprice.nextDouble();
                if (money == price) {
                    System.out.println("Aciu viskas teisinga");
                }
                if (money < price || money > price) {
                    boolean check = true;
                    do {
                        if (money < price) {
                            System.out.println("Dar per mazai ant " + (price - money));
                            System.out.println("Ar dar turesite?");
                            String wcheck = scan.nextLine();
                            if (wcheck.equals("taip")) {
                                double money1 = scanprice.nextDouble();
                                money = money + money1;
                            }
                            if (wcheck.equals("ne")) {
                                check = false;
                            }
                        }
                        if (money > price) {
                            System.out.println("Per daug ant " + (money - price));
                            System.out.println("Jusu graza = " + (money - price));
                            check = false;
                        }
                    } while (check);
                }

            }

        }
    }
}
