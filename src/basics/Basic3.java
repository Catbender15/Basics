package basics;

import java.util.Scanner;

public class Basic3 {
    public  static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite sveika skaiciu");
        double sk = scan.nextDouble();
        double dsk = sk /2;
        System.out.printf("%.3f",dsk);
        System.out.println();
    }
}
