package flow_control_loops_array;

import java.util.Scanner;

public class Exercise1 {
        public static  void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Iveskite skaiciu");
            int i = 30;
            int sk = scan.nextInt();
            if(sk < i) {System.out.println("mazesnis");}
            if(sk > i) {System.out.println("didesnis");}
            if(sk == i) {System.out.println("lygus");}
        }
}
