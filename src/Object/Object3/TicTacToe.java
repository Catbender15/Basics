package Object.Object3;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static String[][] cor = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
    };
    public static void main(String[] args) {
        //0Scanner wscan = new Scanner(System.in);
        Scanner scancord = new Scanner(System.in);
        String wx0 = " ";
        boolean check = true;
        int x;
        int y;
        int ejimas =1;
        do {
            wx0 = checkXOr0(ejimas,wx0);
            System.out.println("Kur norite istatyti? (iveskite koordinates nuo (0,0)): ");
            System.out.print("eilute: ");
            x = scancord.nextInt();
            System.out.print("stulpelis: ");
            y = scancord.nextInt();

            if(checkInput(x, y) == true) {
                ejimas++;
                cor[x][y] = wx0;
                printTicTacToe();
            }
            check = backXAnswer(check);
            check = back0Answer(check);
        } while (check);


    }
    private static boolean backXAnswer(boolean check){
        {
            //eilute
            if ((cor[0][0].equals("x")) && (cor[0][1].equals("x")) && (cor[0][2].equals("x"))) {
                System.out.println("Laimėjo x");
                return false;
            }
            if ((cor[1][0].equals("x")) && (cor[1][1].equals("x")) && (cor[1][2].equals("x"))) {
                System.out.println("Laimėjo x");
                return false;
            }
            if ((cor[2][0].equals("x")) && (cor[2][1].equals("x")) && (cor[2][2].equals("x"))) {
                System.out.println("Laimėjo x");
                return false;
            }
            //stulpelis
            if ((cor[0][0].equals("x")) && (cor[1][0].equals("x")) && (cor[2][0].equals("x"))) {
                System.out.println("Laimėjo x");
                return false;
            }
            if ((cor[0][1].equals("x")) && (cor[1][1].equals("x")) && (cor[2][1].equals("x"))) {
                System.out.println("Laimėjo x");
                return false;
            }
            if ((cor[0][2].equals("x")) && (cor[1][2].equals("x")) && (cor[2][2].equals("x"))) {
                System.out.println("Laimėjo x");
                return false;
            }
            //Istrizaine
            if ((cor[0][0].equals("x")) && (cor[1][1].equals("x")) && (cor[2][2].equals("x"))) {
                System.out.println("Laimėjo x");
                return false;
            }
            if ((cor[0][2].equals("x")) && (cor[1][1].equals("x")) && (cor[2][0].equals("x"))) {
                System.out.println("Laimėjo x");
                return false;
            }
        } // x atsakymai
        return check;
    }
    private static boolean back0Answer(boolean check){
        {
            //eilute
            if ((cor[0][0].equals("0")) && (cor[0][1].equals("0")) && (cor[0][2].equals("0"))) {
                System.out.println("Laimėjo 0");
                return false;
            }
            if ((cor[1][0].equals("0")) && (cor[1][1].equals("0")) && (cor[1][2].equals("0"))) {
                System.out.println("Laimėjo 0");
                return false;
            }
            if ((cor[2][0].equals("0")) && (cor[2][1].equals("0")) && (cor[2][2].equals("0"))) {
                System.out.println("Laimėjo 0");
                return false;
            }
            //stulpelis
            if ((cor[0][0].equals("0")) && (cor[1][0].equals("0")) && (cor[2][0].equals("0"))) {
                System.out.println("Laimėjo 0");
                return false;
            }
            if ((cor[0][1].equals("0")) && (cor[1][1].equals("0")) && (cor[2][1].equals("0"))) {
                System.out.println("Laimėjo 0");
                return false;
            }
            if ((cor[0][2].equals("0")) && (cor[1][2].equals("0")) && (cor[2][2].equals("0"))) {
                System.out.println("Laimėjo 0");
                return false;
            }
            //Istrizaine
            if ((cor[0][0].equals("0")) && (cor[1][1].equals("0")) && (cor[2][2].equals("0"))) {
                System.out.println("Laimėjo 0");
                return false;
            }
            if ((cor[0][2].equals("0")) && (cor[1][1].equals("0")) && (cor[2][0].equals("0"))) {
                System.out.println("Laimėjo 0");
                return false;
            }
        } // 0 atsakymai
        return check;
    }
    private static void printTicTacToe(){
        for (int i = 0; i <= 2; i++) {
            for (int a = 0; a <= 2; a++) {
                System.out.print(" " + cor[i][a] + " ");
                if (a != 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i != 2) {
                System.out.println("-----------");
            }
        }
    }
    private static boolean checkInput(int x, int y){
        if((x > 2) || (x < 0) || (y >2) || (y < 0)){
            System.out.println();
            System.out.println("Per dideles koordinates parasiai (koordinates prasideda nuo (0;0) iki (2;2))!!!  Turesi per nauja eiti  :)");
            System.out.println();
            return false;
        }
        if((cor[x][y].equals("x")) || (cor[x][y].equals("0"))){
            System.out.println();
            System.out.println("Tu negali uzdeti ant kito zaidejo zenklo!!!  Turesi per nauja eiti :)");
            System.out.println();
            return false;
        }
        return true;
    }
    private static String checkXOr0(int ejimas, String wx0){
        if((ejimas % 2) != 0){
            System.out.println("Dabar eina x ");
            wx0 = "x";
        }
        if((ejimas % 2) == 0){
            System.out.println("Dabar eina 0 ");
            wx0 = "0";
        }
        return wx0;
    }

}