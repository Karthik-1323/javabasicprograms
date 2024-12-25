import java.util.Arrays;
import java.util.Scanner;

public class anagraM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();

		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();

		if (ch1.length != ch2.length) {

			System.out.print("Not Anagram");
			System.exit(0);
		}
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for (int i = 0; i < ch1.length; i++) {

			if (ch1[i] != ch2[i]) {

				System.out.print("Not Anagram");
				System.exit(0);
			}
		}
		System.out.print("Anagram");
	}

}
