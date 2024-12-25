import java.util.Scanner;

public class movezersRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
		}

		int index = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {

				arr[index] = arr[i];

				index++;

			}

		}

		while(index < arr.length) {

			arr[index++] = 0;
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]);
		}

	}

}
