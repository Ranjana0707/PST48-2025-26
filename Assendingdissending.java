package PST;

	import java.util.Arrays;
	import java.util.Scanner;

	public class Assendingdissending{
	public static void main(String[] args) {
	        Scanner Sc = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = Sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = Sc.nextInt();
	        }

	      
	        int[] asc = arr.clone();
	        Arrays.sort(asc);
	        System.out.print("Ascending order: ");
	        for (int num : asc) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	    
	        int[] desc = arr.clone();
	        Arrays.sort(desc);
	        System.out.print("Descending order: ");
	        for (int i = desc.length - 1; i >= 0; i--) {
	            System.out.print(desc[i] + " ");
	        }
	    }
	}


