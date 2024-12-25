import java.util.Scanner;

public class Movezerotoleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
		}

		int lindex = arr.length - 1;

		for (int i = arr.length - 1; i >= 0; i--) {

			if (arr[i] != 0) {

				arr[lindex] = arr[i];

				lindex--;
			}

		}

		
		  for (int i = 0; i <= lindex; i++) {
		  
		 arr[i] = 0; 
		 }
		 

	

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]);
		}

	}

}
