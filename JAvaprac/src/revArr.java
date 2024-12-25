import java.util.Scanner;

public class revArr {

	public static void rarray(int[] arr) {

		int l = arr.length;

		int i = 0, j = l-1;

		while (i < j) {

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		for (int k = 0; k < l; k++) {

			System.out.print(arr[k] + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();

		}

		rarray(arr);
	}

}
