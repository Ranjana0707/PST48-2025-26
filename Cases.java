package Pattern;
import java.util.Scanner;


class Cases{
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a letter: ");
	char ch = sc.next().charAt(0);
	
	
	if (ch>='a'&& ch<='z') {
		ch = (char)(ch-32);
		System.out.println("Uppercase" +ch);
	
	}

	
    else {
    	System.out.println("Lowercase");
	}
	sc.close();
	}
	
}
