package Object.Object3.TicTacToeAi;

import java.util.Random;

public class TicTacToeAi {
    private static int[][] value = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
    };
    private int xAI;
    private int yAI;

    public void mainAI() {
        calculateValue();
        //printValue();
        getCor();
    }

    private void getCor() {
        Random random = new Random();
        int[] xM = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] yM = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int maxValue = 0;
        int m = 0;
        for (int i = 0; i <= 2; i++) {
            for (int a = 0; a <= 2; a++) {
                if (maxValue < value[i][a]) {
                    maxValue = value[i][a];
                    m = 0;
                }
                if (maxValue == value[i][a]) {
                    xM[m] = i;
                    yM[m] = a;
                    m++;
                }
            }
        }
        int s = random.nextInt(m);
        xAI = xM[s];
        yAI = yM[s];
    }

    private static void printValue() {
        System.out.println("Galimybe laimeti:");
        System.out.println("------------------------------------------------------");
        System.out.println();
        for (int i = 0; i <= 2; i++) {
            for (int a = 0; a <= 2; a++) {
                System.out.print(" " + value[i][a] + " ");
                if (a != 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i != 2) {
                System.out.println("-----------");
            }
        }
        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println();
    }

    private static void calculateValue() {
        int win[][] = calculateChanceWin();
        int lose[][] = calculateChanceLose();
        for (int i = 0; i <= 2; i++) {
            for (int a = 0; a <= 2; a++) {
                value[i][a] = win[i][a] + lose[i][a];
            }
        }
    }

    private static int[][] calculateChanceWin() {
        TicTacToeMain ticTacToeMain = new TicTacToeMain();
        String[][] cor = ticTacToeMain.getCor();

        int[][] win = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        for (int i = 0; i <= 2; i++) {
            for (int a = 0; a <= 2; a++) {
                if ((cor[i][a].equals("X")) || (cor[i][a].equals("0"))) {
                    win[i][a] = -1;
                } else if (i == 0 && a == 0) {
                    win[i][a] = calcWin(0, 1, 0, 2, win[i][a]);
                    win[i][a] = calcWin(1, 0, 2, 0, win[i][a]);
                    win[i][a] = calcWin(1, 1, 2, 2, win[i][a]);
                } else if (i == 0 && a == 1) {
                    win[i][a] = calcWin(0, 0, 0, 2, win[i][a]);
                    win[i][a] = calcWin(1, 1, 2, 1, win[i][a]);
                } else if (i == 0 && a == 2) {
                    win[i][a] = calcWin(0, 0, 0, 1, win[i][a]);
                    win[i][a] = calcWin(1, 2, 2, 2, win[i][a]);
                    win[i][a] = calcWin(1, 1, 2, 0, win[i][a]);
                } else if (i == 1 && a == 0) {
                    win[i][a] = calcWin(0, 0, 2, 0, win[i][a]);
                    win[i][a] = calcWin(1, 1, 1, 2, win[i][a]);
                } else if (i == 1 && a == 1) { // 4
                    win[i][a] = calcWin(0, 0, 2, 2, win[i][a]);
                    win[i][a] = calcWin(0, 2, 2, 0, win[i][a]);
                    win[i][a] = calcWin(1, 0, 1, 2, win[i][a]);
                    win[i][a] = calcWin(0, 1, 2, 1, win[i][a]);
                } else if (i == 1 && a == 2) {
                    win[i][a] = calcWin(0, 2, 2, 2, win[i][a]);
                    win[i][a] = calcWin(1, 0, 1, 1, win[i][a]);
                } else if (i == 2 && a == 0) {
                    win[i][a] = calcWin(0, 0, 1, 0, win[i][a]);
                    win[i][a] = calcWin(0, 2, 1, 1, win[i][a]);
                    win[i][a] = calcWin(2, 1, 2, 2, win[i][a]);
                } else if (i == 2 && a == 1) {
                    win[i][a] = calcWin(0, 1, 1, 1, win[i][a]);
                    win[i][a] = calcWin(2, 0, 2, 2, win[i][a]);
                } else if (i == 2 && a == 2) {
                    win[i][a] = calcWin(0, 0, 1, 1, win[i][a]);
                    win[i][a] = calcWin(0, 2, 1, 2, win[i][a]);
                    win[i][a] = calcWin(2, 0, 2, 1, win[i][a]);
                } else {
                    System.out.println("Ivyko klaida AI chance win");
                }
            }
        }
        return win;
    }

    private static int[][] calculateChanceLose() {
        TicTacToeMain ticTacToeMain = new TicTacToeMain();
        String[][] cor = ticTacToeMain.getCor();
        int[][] lose = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        for (int i = 0; i <= 2; i++) {
            for (int a = 0; a <= 2; a++) {
                if ((cor[i][a].equals("X")) || (cor[i][a].equals("0"))) {
                    lose[i][a] = -1;
                } else if (i == 0 && a == 0) {
                    lose[i][a] = calcLose(0, 1, 0, 2, lose[i][a]);
                    lose[i][a] = calcLose(1, 0, 2, 0, lose[i][a]);
                    lose[i][a] = calcLose(1, 1, 2, 2, lose[i][a]);
                } else if (i == 0 && a == 1) {
                    lose[i][a] = calcLose(0, 0, 0, 2, lose[i][a]);
                    lose[i][a] = calcLose(1, 1, 2, 1, lose[i][a]);
                } else if (i == 0 && a == 2) {
                    lose[i][a] = calcLose(0, 0, 0, 1, lose[i][a]);
                    lose[i][a] = calcLose(1, 2, 2, 2, lose[i][a]);
                    lose[i][a] = calcLose(1, 1, 2, 0, lose[i][a]);
                } else if (i == 1 && a == 0) {
                    lose[i][a] = calcLose(0, 0, 2, 0, lose[i][a]);
                    lose[i][a] = calcLose(1, 1, 1, 2, lose[i][a]);
                } else if (i == 1 && a == 1) { // 4
                    lose[i][a] = calcLose(0, 0, 2, 2, lose[i][a]);
                    lose[i][a] = calcLose(0, 2, 2, 0, lose[i][a]);
                    lose[i][a] = calcLose(1, 0, 1, 2, lose[i][a]);
                    lose[i][a] = calcLose(0, 1, 2, 1, lose[i][a]);
                } else if (i == 1 && a == 2) {
                    lose[i][a] = calcLose(0, 2, 2, 2, lose[i][a]);
                    lose[i][a] = calcLose(1, 0, 1, 1, lose[i][a]);
                } else if (i == 2 && a == 0) {
                    lose[i][a] = calcLose(0, 0, 1, 0, lose[i][a]);
                    lose[i][a] = calcLose(0, 2, 1, 1, lose[i][a]);
                    lose[i][a] = calcLose(2, 1, 2, 2, lose[i][a]);
                } else if (i == 2 && a == 1) {
                    lose[i][a] = calcLose(0, 1, 1, 1, lose[i][a]);
                    lose[i][a] = calcLose(2, 0, 2, 2, lose[i][a]);
                } else if (i == 2 && a == 2) {
                    lose[i][a] = calcLose(0, 0, 1, 1, lose[i][a]);
                    lose[i][a] = calcLose(0, 2, 1, 2, lose[i][a]);
                    lose[i][a] = calcLose(2, 0, 2, 1, lose[i][a]);
                } else {
                    System.out.println("Ivyko klaida AI chance lose");
                }
            }
        }
        return lose;
    }

    private static int calcWin(int x, int z, int x2, int z2, int calc_win) {
        TicTacToeMain ticTacToeMain = new TicTacToeMain();
        String[][] cor = ticTacToeMain.getCor();
        int win = calc_win;
        if ((cor[x][z].equals("X")) && (cor[x2][z2].equals("X"))) {
            win = 4;
        }
        if (((cor[x2][z2].equals("X"))) && ((cor[x][z].equals(" "))) || ((cor[x][z].equals("X")) && (cor[x2][z2].equals(" ")))) {
            if (win < 1) {
                win = 1;
            }
        }
        return win;
    }

    private static int calcLose(int x, int z, int x2, int z2, int calc_lose) {
        TicTacToeMain ticTacToeMain = new TicTacToeMain();
        String[][] cor = ticTacToeMain.getCor();
        int lose = calc_lose;
        if ((cor[x][z].equals("0")) && (cor[x2][z2].equals("0"))) {
            lose = 4;
        }
        if (((cor[x2][z2].equals("0"))) || ((cor[x][z].equals("0")))) {
            if (lose <= 1) {
                lose = 1;
            }
        }
        if ((((cor[x2][z2].equals("X"))) && ((cor[x][z].equals("0")))) || (((cor[x2][z2].equals("0"))) && ((cor[x][z].equals("X"))))) {
            if (lose != 4) {
                lose = 0;
            }
        }
        return lose;
    }

    public int getxAI() {
        return xAI;
    }

    public int getyAI() {
        return yAI;
    }
}
