package Object.Object7;

import java.util.Scanner;

public class Object8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int kiek = scanner.nextInt();
        int[] sk ={};
        for(int i = 0; i< kiek; i++){
            if(i == 1){
                sk[i] = 0;
            }else if(i==2){
                sk[i] = 1;
            }else{
                sk[i] = sk[i-1] + sk[i-2];
            }
        }
        System.out.println(sk[kiek]);
    }
}
