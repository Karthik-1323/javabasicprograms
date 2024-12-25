import java.util.Scanner;

public class vowelS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s = str.toLowerCase();
		int Vcount = 0;
		int Ccount = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				Vcount++;

			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				Ccount++;

			}

		}
		System.out.println("Vowels" + Vcount);
		System.out.print("consonents" + Ccount);

	}

}
