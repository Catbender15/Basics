package Object.Object3.TicTacToeAi;

import Object.Object3.TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeMain {
    private static String[][] cor = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
    };
    private String[][] cor1 = cor;

    public TicTacToeMain() {
        this.cor1 = cor1;
    }
    public String[][] getCor(){
        return cor1;
    }

    public static void main(String[] args) {

        String wx0 = " ";
        boolean check = true;
        int x = 0;
        int y = 0;
        int ejimas =1;
        TicTacToeAi ticTacToeAi = new TicTacToeAi();
        do {
            ticTacToeAi.mainAI();
            wx0 = checkXOr0(ejimas,wx0);
            if(wx0.equals("0")) {
                System.out.println("Kur norite istatyti? (iveskite koordinates nuo (0,0)): ");
                System.out.println("Jei norite iseiti is zaidimo parasykite vieno is koordinaciu 9: ");
                x = scanXY("Eilute");
                y = scanXY("Stulpelis");
            }
            if(wx0.equals("X")){
                x = ticTacToeAi.getxAI();
                y = ticTacToeAi.getyAI();
            }
            if(checkInput(x, y) == true) {
                ejimas++;
                cor[x][y] = wx0;
                printTicTacToe();
            }
            if(((y == 9) || (x == 9)) || (ejimas == 10)){ check = false; }
            check = backXAnswer(check);
            check = back0Answer(check);
        } while (check);
    }
    private static boolean backXAnswer(boolean check){
        {
            //eilute
            if ((cor[0][0].equals("")) && (cor[0][1].equals("X")) && (cor[0][2].equals("X"))) {
                System.out.println("Laimėjo X");
                return false;
            }
            if ((cor[1][0].equals("X")) && (cor[1][1].equals("X")) && (cor[1][2].equals("X"))) {
                System.out.println("Laimėjo X");
                return false;
            }
            if ((cor[2][0].equals("X")) && (cor[2][1].equals("X")) && (cor[2][2].equals("X"))) {
                System.out.println("Laimėjo X");
                return false;
            }
            //stulpelis
            if ((cor[0][0].equals("X")) && (cor[1][0].equals("X")) && (cor[2][0].equals("X"))) {
                System.out.println("Laimėjo X");
                return false;
            }
            if ((cor[0][1].equals("X")) && (cor[1][1].equals("X")) && (cor[2][1].equals("X"))) {
                System.out.println("Laimėjo X");
                return false;
            }
            if ((cor[0][2].equals("X")) && (cor[1][2].equals("X")) && (cor[2][2].equals("X"))) {
                System.out.println("Laimėjo X");
                return false;
            }
            //Istrizaine
            if ((cor[0][0].equals("X")) && (cor[1][1].equals("X")) && (cor[2][2].equals("X"))) {
                System.out.println("Laimėjo X");
                return false;
            }
            if ((cor[0][2].equals("X")) && (cor[1][1].equals("X")) && (cor[2][0].equals("X"))) {
                System.out.println("Laimėjo X");
                return false;
            }
        } // X atsakymai
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
    private static boolean checkInput(int x, int y){
        if((x > 2) || (x < 0) || (y >2) || (y < 0) || (x == 9) || (y == 9)){
            System.out.println();
            if(((x != 9) && (y != 9)) && ((x != 12) && (y != 12))){
                System.out.println("Per dideles koordinates parasiai (koordinates prasideda nuo (0;0) iki (2;2))!!!  Turesi per nauja eiti  :)");
                System.out.println();
                return false;
            }
            if(((x == 9) ||( y == 9))){
                System.out.println("Tu sekmingai baigiai žaidima!! ;)");
                System.out.println();
                return false;
            }

        }
        if((cor[x][y].equals("X")) || (cor[x][y].equals("0"))){
            System.out.println();
            System.out.println("Tu negali uzdeti ant kito zaidejo zenklo!!!  Turesi per nauja eiti :)");
            System.out.println();
            return false;
        }

        return true;
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
    private static String checkXOr0(int ejimas, String wx0){
        if((ejimas % 2) != 0){
            System.out.println("Dabar eina x ");
            wx0 = "X";
        }
        if((ejimas % 2) == 0){
            System.out.println("Dabar eina 0 ");
            wx0 = "0";
        }
        return wx0;
    }
    private static int scanXY(String message){
        Scanner scancord = new Scanner(System.in);
        System.out.print(message);
        return scancord.nextInt();
    }
}