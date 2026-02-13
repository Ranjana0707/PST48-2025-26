package PST;

import java.util.Scanner;

public class Lenghtofstring{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();   

        int count = 0;

       
        if (num == 0) {
            count = 1;
        } else {
            
            if (num < 0) {
                num = -num;
            }

            while (num != 0) {
                num = num / 10;   
                count++;          
            }
        }

        System.out.println("Length of Number = " + count);
    }
}
 