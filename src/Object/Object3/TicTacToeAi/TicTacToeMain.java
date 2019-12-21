package Object.Object3.TicTacToeAi;

import javafx.util.Pair;

import java.util.Scanner;

public class TicTacToeMain {
    private static String[][] cor = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
    };

    public String[][] getCor() {
        return cor;
    }

    public static void main(String[] args) {
        TicTacToeAi ticTacToeAi = new TicTacToeAi();
        int pl = scanXY("Jeigu norite žaist su AI parašykit: 1", "Jei norite dviese tai parašykite 2: ");
        if(pl == 1){
            startAIGame(ticTacToeAi);
        }
        if(pl == 2){
            start2PlGame();
        }
    }
    private static void startAIGame(TicTacToeAi ticTacToeAi){
        String wx0 = " ";
        boolean check = true;
        int x = 0;
        int y = 0;
        int ejimas = 1;
        do {
            ticTacToeAi.mainAI();
            wx0 = checkXOr0(ejimas, wx0);
            if (wx0.equals("0")) {
                int sk = scanXY("Kur norite istatyti? (iveskite nuo 1 iki 9)", "Jei norite iseiti is zaidimo parasykite vieno is koordinaciu 10: ");
                numToCor(sk, x, y);
                x = numToCor(sk, x, y).getKey();
                y = numToCor(sk,x,y).getValue();
            }
            if (wx0.equals("X")) {
                x = ticTacToeAi.getxAI();
                y = ticTacToeAi.getyAI();
            }
            if (checkInput(x, y) == true) {
                ejimas++;
                cor[x][y] = wx0;
                printTicTacToe();
            }
            if (((y == 9) || (x == 9)) || (ejimas == 10)) {
                check = false;
            }
            check = backXAnswer(check);
            check = back0Answer(check);
        } while (check);
    }

    private static void start2PlGame(){
        String wx0 = " ";
        boolean check = true;
        int x = 0;
        int y = 0;
        int ejimas =1;
        printTicTacToe();
        do {
            wx0 = checkXOr0(ejimas,wx0);
            int sk = scanXY("Kur norite istatyti? (iveskite nuo 1 iki 9)", "Jei norite iseiti is zaidimo parasykite vieno is koordinaciu 10: ");
            numToCor(sk, x, y);
            x = numToCor(sk, x, y).getKey();
            y = numToCor(sk,x,y).getValue();

            if(checkInput(x, y) == true) {
                ejimas++;
                cor[x][y] = wx0;
                printTicTacToe();
            }
            if((y == 9) || (x == 9)){ check = false; }
            check = backXAnswer(check);
            check = back0Answer(check);
        } while (check);
    }

    private static boolean backXAnswer(boolean check) {
        if ((cor[0][0].equals("X")) && (cor[0][1].equals("X")) && (cor[0][2].equals("X"))) {
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
        if ((cor[0][0].equals("X")) && (cor[1][1].equals("X")) && (cor[2][2].equals("X"))) {
            System.out.println("Laimėjo X");
            return false;
        }
        if ((cor[0][2].equals("X")) && (cor[1][1].equals("X")) && (cor[2][0].equals("X"))) {
            System.out.println("Laimėjo X");
            return false;
        }
        return check;
    }

    private static boolean back0Answer(boolean check) {
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
        return check;
    }

    private static boolean checkInput(int x, int y) {
        if ((x > 2) || (x < 0) || (y > 2) || (y < 0) || (x == 9) || (y == 9)) {
            System.out.println();
            if (((x != 9) && (y != 9)) && ((x != 12) && (y != 12))) {
                System.out.println("Per dideles koordinates parasiai (koordinates prasideda nuo (0;0) iki (2;2))!!!  Turesi per nauja eiti  :)");
                System.out.println();
                return false;
            }
            if (((x == 9) || (y == 9))) {
                System.out.println("Tu sekmingai baigiai žaidima!! ;)");
                System.out.println();
                return false;
            }

        }
        if ((cor[x][y].equals("X")) || (cor[x][y].equals("0"))) {
            System.out.println();
            System.out.println("Tu negali uzdeti ant kito zaidejo zenklo!!!  Turesi per nauja eiti :)");
            System.out.println();
            return false;
        }
        return true;
    }

    private static void printTicTacToe() {
        int sk = 0;
        for (int i = 0; i <= 2; i++) {
            for (int a = 0; a <= 2; a++) {
                sk++;
                if(cor[i][a].equals(" ")){
                    System.out.print(" " + sk + " ");
                }else{
                    System.out.print(" " + cor[i][a] + " ");
                }

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

    private static String checkXOr0(int ejimas, String wx0) {
        if ((ejimas % 2) != 0) {
            System.out.println("Dabar eina x ");
            wx0 = "X";
        }
        if ((ejimas % 2) == 0) {
            System.out.println("Dabar eina 0 ");
            wx0 = "0";
        }
        return wx0;
    }

    private static int scanXY(String message1, String message2) {
        Scanner scancord = new Scanner(System.in);
        System.out.println(message1);
        System.out.print(message2);
        return scancord.nextInt();
    }

    private static Pair<Integer, Integer> numToCor(int num, int x, int y){

        switch (num){
            case 1:
                x = 0;
                y = 0;
                break;
            case 2:
                x = 0;
                y = 1;
                break;
            case 3:
                x = 0;
                y = 2;
                break;
            case 4:
                x = 1;
                y = 0;
                break;
            case 5:
                x = 1;
                y = 1;
                break;
            case 6:
                x = 1;
                y = 2;
                break;
            case 7:
                x = 2;
                y = 0;
                break;
            case 8:
                x = 2;
                y = 1;
                break;
            case 9:
                x = 2;
                y = 2;
                break;
            case 10:
                x= 9;
                y=9;
                break;
            default:
                x = 15;
                y = 15;
                break;
        }
        Pair<Integer, Integer> pair = new Pair<>(x, y);
        return pair;
    }
}