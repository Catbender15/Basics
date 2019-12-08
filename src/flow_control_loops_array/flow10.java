package flow_control_loops_array;

import java.util.Random;

public class flow10 {
    private static String[] ha ={"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
    public static void main(String[] args){
        Random rand = new Random();
        int longest = 0;
        String wlong = "";
        for(int i = 0; i<=5; i++){
            int sk = rand.nextInt(7);
            String word = "";
            for(int a = 0; a<=sk; a++){
                int sk1 = rand.nextInt(ha.length);
                word = word + ha[sk1];
            }
            System.out.println(word);

            if(longest < word.length()){
                longest = word.length();
                wlong = word;
            }
        }
        System.out.println("Ilgiausia kombinacija: " + wlong + "raidziu kiekis: " + wlong.length());

    }
}
