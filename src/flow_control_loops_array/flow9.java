package flow_control_loops_array;

import java.util.Random;

public class flow9 {
    public static void main(String[] args){
        Random ran = new Random();
        int max = 0;
        for(int i = 0; i< 5; i++){
            int sk = ran.nextInt(100);
            if(max < sk){
                max = sk;
            }
            System.out.println(sk);
        }
        System.out.println("Didziausia reiksme " + max);
    }
}
