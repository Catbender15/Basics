package Object.Object4;

import java.util.Scanner;

public class PalindromasMain {
    public static void main(String[] args){
        Scanner wscan = new Scanner(System.in);
        String word = wscan.nextLine();
        String reversetext = "";
        char []chword = word.toCharArray();
        for(int i = chword.length-1; i >= 0; i--){
            reversetext += chword[i];
        }
       if(reversetext.equals(word)){
           System.out.println("Zodis " + word + " yra Palindromas");
       }else {
           System.out.println("Zodis " + word + " yra ne palindromas");
       }
    }
}
