import java.util.Scanner;

public class chcountofeachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] b = str.split(" ");

		for (int i = 0; i < b.length; i++) {
			int count = 0;
			String s = "";

			String words = b[i];

			for (int j = 0; j < words.length(); j++) {
				if (words.charAt(j) != ' ') {

					count++;
					s = s + words.charAt(j);

				}

			}
			System.out.println(s + ":" +" "+ count);

		}

	}

}
