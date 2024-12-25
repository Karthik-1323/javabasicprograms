import java.util.Scanner;

public class sumofintinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s = "";
		int num = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {

				s += ch;
			}

			else if (!s.equals("")) {
				num += Integer.parseInt(s);
				s = "";

			}
		}
		System.out.print(num);
	}

}
