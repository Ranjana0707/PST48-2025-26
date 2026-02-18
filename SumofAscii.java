package Pattern;
import java.util.Scanner;

public class SumofAscii{
	
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a string: ");
		        String str = sc.nextLine();

		        int sum = 0;

		        for (int i = 0; i < str.length(); i++) {
		            sum = sum + str.charAt(i);
		        }

		        System.out.println("Sum of ASCII values = " + sum);
		    }
		}


