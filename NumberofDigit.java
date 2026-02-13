package PST;
import java.util.Scanner;

public class NumberofDigit {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a Number:");
	int num = sc.nextInt();
	
	int number = 0;
	
	while (num != 0) {
        int digit = num % 10;
        number += digit;
        num = num / 10;
    }

    System.out.println("Number of digits = " + number);

    
	}
}
	


	


