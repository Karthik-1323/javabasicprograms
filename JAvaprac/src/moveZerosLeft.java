import java.util.Scanner;

public class moveZerosLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
		}

		
		  int j = 0; 
		  
		  
		  for (int i = 0; i < arr.length; i++) {
		 
		 if (arr[i]== 0 && i != j) {
		 
		  int temp = arr[i]; 
		  arr[i] = arr[j]; 
		  arr[j] = temp;
		  
		 j++; 
		 }
		  
		  }

	

	for(int i = 0;i<arr.length;i++){

		System.out.print(arr[i]);
	}

}
}


