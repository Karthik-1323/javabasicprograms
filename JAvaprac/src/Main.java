import java.util.*;
import java.lang.*;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] b = str.split(" ");
		String rev = "";

		for (int i = 0; i < b.length; i++) {
			String word = b[i];
			String revword = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				revword = revword + word.charAt(j);

			}
			rev = rev + revword + " ";
		}

		System.out.print(rev);
	}
}
