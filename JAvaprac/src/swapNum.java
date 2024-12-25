
public class swapNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1032;
		int rev =0;
		int temp = a;
		
while(temp>0) {
	
	int rem = temp %10;
	rev = rev*10 +rem;
	temp = temp/10;

	}

System.out.print(rev);
	}

}
