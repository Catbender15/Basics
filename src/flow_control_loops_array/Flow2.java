package flow_control_loops_array;

import java.util.Scanner;

public class Flow2 {
    public  static void main(String[] args){
        int i = 30;
        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int sk = scan.nextInt();
        System.out.println("Iveskite antra skaiciu");
        int sk2 = scan.nextInt();
        if(sk < i) {System.out.println(sk + " = mazesnis uz 30");}
        if(sk > i) {System.out.println(sk + " = didesnis uz 30");}
        if(sk == i) {System.out.println(sk + " = lygus 30");}

        if(sk2 < i) {System.out.println(sk2 + " = mazesnis uz 30");}
        if(sk2 > i) {System.out.println(sk2 + " = didesnis uz 30");}
        if(sk2 == i) {System.out.println(sk2 + " = lygus 30");}
    }
}
