package PST;

	import java.util.Scanner;

	public class Factorial {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char ch = sc.next().toLowerCase().charAt(0);

	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            System.out.println(ch + " is a vowel");
	        } else if (Character.isLetter(ch)) {
	            System.out.println(ch + " is a consonant");
	        } else {
	            System.out.println("Invalid input (not a letter)");
	        }

	        sc.close();
	    }
	}



