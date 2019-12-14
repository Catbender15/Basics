package Object.Object6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IlgiausiasPolindromas {
    private static String FILE_LOCATION = "C:\\Users\\Toshiba\\IdeaProjects\\Basics\\src\\Object\\Object6\\text.txt";

    public static void main(String[] args){
        List<String> wordList = getwordFromFile();
        List<String> wList = new ArrayList<>();
        List<String> poliList = new ArrayList<>();
        //Scanner scanner  = new Scanner(System.in);
        String word; /*= scanner.nextLine();*/
        //String text;
        for(int o = 0; o < wordList.size(); o++){
            word = wordList.get(o);
            for(int i = 0; i <= word.length(); i++){
                for (int j = i+2; j <= word.length(); j++){
                    String lpoli = foundPolidrom(word.substring(i, j));
                    if(lpoli != null){
                        wList.add(lpoli);
                    }
                }
            }
            for(int i = 0; i< 1;i++){
                String poli = foundLongestPolidrom(wList);
                if(poli != null){
                    poliList.add(poli);
                }
            }
        }
   }
   private static String foundPolidrom (String word){
       String reversetext = "";
       char []chword = word.toCharArray();
       for(int i = chword.length-1; i >= 0; i--){
           reversetext += chword[i];
       }
       if(reversetext.equals(word)) {
           return word;
       }
       return null;
   }
   private static String foundLongestPolidrom(List wList){
        int longe = 0;
        String wlong = null;
        for(int i = 0; i<=wList.size(); i++){
            String wcheck = wList.get(i).toString();
            if(longe < wcheck.length()){
                longe = wcheck.length();
                wlong = wcheck;
            }
        }
        return wlong;
   }
    private static  List<String> getwordFromFile() {
        List<String> wordList = new ArrayList();
       try(BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION));){
           StringBuilder stringBuilder = new StringBuilder();
           String line;
           while (true){
               line = br.readLine();
               if (line != null){
                   wordList.add(line);
               }
           }
       }catch (IOException e){
           e.printStackTrace();
       }
       return  wordList;
   }
}
