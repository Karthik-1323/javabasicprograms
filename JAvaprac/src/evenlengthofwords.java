import java.util.Scanner;

public class evenlengthofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String[] b = str.split(" ");
		for (int i = 0; i < b.length; i++) {
			
			String s = b[i];

			if (s.length() % 2 == 0) {

				System.out.println(b[i] + " " + "even");
			}
			else {
				System.out.println(b[i] + " " + "odd");
				
			}

				

			}
	

		}

	}


