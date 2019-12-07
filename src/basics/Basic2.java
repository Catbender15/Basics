package basics;

import java.util.Scanner;

public class Basic2 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite per kableli skaiciu");
        double sk = scan.nextDouble();
        System.out.printf("%.2f", sk);
        System.out.println();
    }

}
