package Object.Object5;


import java.util.Scanner;

public class CezarioSifrasMain {
    private static String SABC = "abcdefghiyjklmnopqrstuvz";
    private static char[] CABC = SABC.toCharArray();

    public static void main(String[] args) {
        Scanner wscan = new Scanner(System.in);
        String word = wscan.nextLine();
        char[] chText = word.toCharArray();
        String wtest = "";
        //int charNum;
        for (int i = 0; i < chText.length; i++) {
            if(chText[i] != ' '){
                for (int k = 0; k < CABC.length; k++) {
                    if (chText[i] == CABC[k]) {
                        if (k < CABC.length - 5) {
                            wtest += CABC[k + 5];
                        } else {
                            wtest += CABC[k + 5 - CABC.length];
                        }

                    } else if (k == CABC.length) {
                        wtest += chText[i];
                    }
                }
            }else
            {
                wtest+= " ";
            }

        }
        System.out.println(wtest);
    }
}
