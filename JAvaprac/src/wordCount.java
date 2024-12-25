import java.util.Scanner;

public class wordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int count = 1;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ' && str.charAt(0) != ' ') {

				count++;
			}
		}

		System.out.print(count);
	}

}
