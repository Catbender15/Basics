package flow_control_loops_array;

import java.util.Scanner;

public class flow8 {
    public static void main(String[] arsg){
        Scanner scan = new Scanner(System.in);
        boolean check = true;

        do {
            System.out.println("Iveskite zodi: ");
            String word = scan.nextLine();
            System.out.println(word);
            System.out.println("You will continue or quit?");
            String wcheck = scan.nextLine();
            if(wcheck.equals("continue")){
                check = true;
            }
            if(wcheck.equals("quit")){
                check = false;
            }

        }while (check);
    }
}
