package dailyCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.SortOrder;

public class delay {
	public static void main(String[] arg) {
		int n;
		int total = 0;
		ArrayList<Integer> delay = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			int min = sc.nextInt();
			
			for(int j=0;j<num;j++) {
				delay.add(min);
			}
		}
		
	    Arrays.sort(delay.toArray());
	    
	    for(int i=0,j=delay.size()-1;i<j;i++,j--) {
	    	total+=delay.get(i);
	    	total+=delay.get(j);
	    }
		System.out.println(total/2);
	}
    
}
