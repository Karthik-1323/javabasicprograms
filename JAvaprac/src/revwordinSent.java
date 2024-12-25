import java.util.Scanner;

public class revwordinSent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		String[] b = str.split(" ");

		for (int i = 0; i < b.length; i++) {

			String words = b[i];

			for (int j = words.length() - 1; j >= 0; j--) {

				System.out.print(words.charAt(j));
			}
		}

	}

}
