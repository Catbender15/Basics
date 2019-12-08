package Object.Object2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patrolmain {
    public static void main(String[] args){
        List<Gas> gasList = new ArrayList<>();
        Scanner price_lit_scan = new Scanner(System.in);
        Scanner wscan = new Scanner(System.in);
        boolean check = true;
        double price = 0;
        double lit = 0;
        double sum = 0;


        do {
            System.out.println("Iveskite degalu kaina: ");
            price = price_lit_scan.nextDouble();
            System.out.println("Iveskite degalu kieki: ");
            lit = price_lit_scan.nextDouble();
            gasList.add(mapGasData(price,lit));
            System.out.println("Kuro kaina: " + price + ", litrazas: " + lit);
            System.out.println("Jei norite pilti toliau iveskite continue o jei ne iveskite quit: ");
            String wcheck = wscan.nextLine();
            if (wcheck.equals("quit")){
                check = false;
            }
            if (wcheck.equals("continue")){
                check = true;
            }

        }while (check);
        for(int i = 0; i< gasList.size(); i++){
            sum = sum + gasList.get(i).getTotalprice();
        }
        System.out.println("Susimokekite uz kura: ");
        double money = price_lit_scan.nextDouble();
        if (money == price) {
            System.out.println("Aciu viskas teisinga");
        }
        if (money < sum || money > sum) {
            check = true;
            do {
                if (money < price) {
                    System.out.println("Dar per mazai ant " + (sum - money));
                    System.out.println("Ar dar turesite?");
                    String wcheck = wscan.nextLine();
                    if (wcheck.equals("taip")) {
                        double money1 = price_lit_scan.nextDouble();
                        money = money + money1;
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
    private static Gas mapGasData(double price, double lit){
        return new Gas(price, lit);
    }
}
