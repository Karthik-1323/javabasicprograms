import java.util.Scanner;

public class replacespacewthSc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {

				str2 += '$';
			}
			if (str.charAt(i) != ' ') {

				str2 += str.charAt(i);
			}

		}
		System.out.print(str2);

	}

}
