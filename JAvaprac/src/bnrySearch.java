import java.util.Arrays;
import java.util.Scanner;

public class bnrySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr = new int[8];
        		 
        		 Scanner sc = new Scanner(System.in);
         for(int i=0; i<arr.length;i++) {
        	 
        	 arr[i]=sc.nextInt();
        	 
         }
         
         Arrays.sort(arr);
         boolean flag = false;
         
         int key = 7;
         
         int l = 0;
         int h = arr.length - 1;
         
         
         while(l<=h) {
        	 
        	 int m = (l+h)/2;
        	 if(arr[m] == key) {
        		 
        		 System.out.print("element found");
        		 flag = true;
        		 break;
        	 }
        	if(key < arr[m]) {
        		h = m-1;	 
        			 
        		 }
        	if(key > arr[m]) {
        		
        		l = m+1;
        	}
        	 
         }
         
         if (flag == false) {
      
        	 System.out.print("not found");
         }
	}

}
