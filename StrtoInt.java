package JAVA;

import JAVA.INTtoSTR.Converter;

public class StrtoInt {
	static void convert (String str) {
   
    	int num = Integer.parseInt(str);
    	
    	System.out.println("converted Integer value:"+num);
    }
	
	
	
	public static void main(String[] args) {
	
	String str = "987";
	
	System.out.println("String value:"+str);

    convert(str);
	
	}
}
