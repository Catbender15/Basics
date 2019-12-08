package Object.Object3;

import java.util.Scanner;

public class TicTacToe {
    public static String[][] cor = {
            {" ", " ", " "},
            {" ", " ", " "},
            {" ", " ", " "}
    };

    public static void main(String[] args) {
        Scanner scanx = new Scanner(System.in);
        Scanner scancord = new Scanner(System.in);
        String wx0 = " ";
        int x;
        int y;
        boolean check = true;
        do {
            System.out.println("Ka ivesite?");
            wx0 = scanx.nextLine();
            System.out.println("Kur norite istatyti? (iveskite koordinates nuo (0,0)): ");
            System.out.print("eilute: ");
            x = scancord.nextInt();
            System.out.print("stulpelis: ");
            y = scancord.nextInt();
            cor[x][y] = wx0;
            for (int i = 0; i <= 2; i++) {
                for (int a = 0; a <= 2; a++) {
                    System.out.print(" " + cor[i][a] + " ");
                    if(a != 2){System.out.print("|");}

                }
                System.out.println();
                if(i != 2){System.out.println("-----------"); }

            }


        } while (check);
        //cor[1][2] = "0";


    }

}

