package Hacker_Rank;

import java.util.Scanner;
public class For_loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of t");
        int t=in.nextInt();
        for(int i=0;i<t;i++) {
            System.out.println("Enter the value of a");
            int a = in.nextInt();
            System.out.println("Enter the value of b");
            int b = in.nextInt();
            System.out.println("Enter the value of n");
            int n = in.nextInt();
            int c = a;
            for (int j = 0; j < n ; j++) {
                c += Math.pow(2, j) * b;
                System.out.printf(String.valueOf(c));
            }
        }
        System.out.println();

        in.close();
    }
}
