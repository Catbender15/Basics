package flow_control_loops_array;

public class flow5 {
    public static void main(String[] args) {
        int n = 10;
        int nt = n / 2;
        int nt1 = n / 2;
        System.out.println("Triangle");
        for (int i = 0; i < 5; i++) {
            nt = n / 2 - i;
            nt1 = n / 2 + i;
            for (int a = 0; a < n; a++) {
                if (a < nt || a > nt1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("Qua");
        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < 10; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Christmas tree");
        for (int i = 0; i < 5; i++) {
            nt = n / 2 - i;
            nt1 = n / 2 + i;
            for (int a = 0; a < n; a++) {
                if (a < nt || a > nt1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            nt = n/2;
            for (int a = 0; a < n; a++) {
                if (nt == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
