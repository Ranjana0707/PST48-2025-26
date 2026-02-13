package PST;
import java.util.Scanner;

class Markcalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter mark 3: ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        float average = total / 3.0f;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);

        sc.close();
    }
}

