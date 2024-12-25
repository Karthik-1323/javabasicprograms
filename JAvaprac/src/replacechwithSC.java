import java.util.Scanner;

public class replacechwithSC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s = sc.next();
		char ch = s.charAt(0);
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {

				str2 += '$';
			}
			if (str.charAt(i) != ch) {

				str2 += str.charAt(i);
			}

		}
		System.out.print(str2);

	}

}
