package flow_control_loops_array;

import java.util.Scanner;

public class flow7 {
    public static void main(String[] args){
        double sk1;
        double sk2;
        double rezult;
        Scanner scan = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("iveskite pirma skaiciu:");
            sk1 = scan.nextDouble();
            System.out.println("Iveskite antra skaiciu:");
            sk2 = scan.nextDouble();
            if ((sk1 == 0) || (sk2 == 0)){
                check = false;
            }
            if((sk1 != 0) && (sk2 !=0)){
                rezult = sk1 / sk2;
                System.out.printf("%.4f", rezult);
                System.out.println();
            }
        }while (check);


    }
}
