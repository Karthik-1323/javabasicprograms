import java.util.Scanner;

public class primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {

				System.out.println("not prime");

				return;
			}
		}
		System.out.println("prime");
		sc.close();

	}

}
