package Pattern;

import java.util.Scanner;


public class StarPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value ");
        int num = sc.nextInt();
        int n = 5;
        patt(num);
        pat(num);
    }


   static void patt(int n) {
        for (int i = 1; i <= n-1; i++) {
            System.out.println("*");
        }
    }

    static void pat(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

}


