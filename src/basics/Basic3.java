package basics;

import java.util.Scanner;

public class Basic3 {
    public  static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite pirma sveika skaiciu");
        int sk1 = scan.nextInt();
        System.out.println("Iveskite antra sveika skaiciu");
        int sk2 = scan.nextInt();

        int dsk = sk1 / sk2;
        System.out.printf("%.3f",(double) dsk);
        System.out.println();
    }
}
