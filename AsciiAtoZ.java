package Pattern;

public class AsciiAtoZ {

	public static void main(String[] args) {
	  printLetter();

	}
	
	static void printLetter() {
		for (char ch ='A';ch<='Z' ; ch++) {
			showAscii(ch);
		}
	}
	static void showAscii(char ch) {
		int ascii=ch;
		System.out.println(ch+"="+ascii);
	}

}
