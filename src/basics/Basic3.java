package basics;

import java.util.Scanner;

public class Basic3 {
    public  static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite pirma sveika skaiciu");
        double sk1 = scan.nextDouble();
        System.out.println("Iveskite antra sveika skaiciu");
        double sk2 = scan.nextDouble();

        double dsk = sk1 / sk2;
        System.out.printf("%.3f",dsk);
        System.out.println();
    }
}
