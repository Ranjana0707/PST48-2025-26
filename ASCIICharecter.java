package Pattern;
import java.util.Scanner;

public class ASCIICharecter {

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter ASCII charecter: ");
		        int ascii = sc.nextInt();

		        char[] ch = Character.toChars(ascii);
		        System.out.println("Enter a value:");
		    }
		}


