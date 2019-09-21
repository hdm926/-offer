package dailyCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class printX {
	public static void main(String[] arg) {
		int n,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		
		ArrayList<Integer > num = new ArrayList<>();
		for(int i=0;i<n;i++) {
			num.add(sc.nextInt());
		}
		
		Arrays.sort(num.toArray());
		
		for(int i=0;i<k;k--) {
			for(int j=0;j<num.size();j++) {
				if(num.get(j)>k)
				   num.set(j, num.get(j)-num.get(0));
				else
					num.set(j, 0);
			}
			int a =0;
			while(num.get(a)>0) {
			 System.out.println(num.get(a));
			 break;}
		}
	}

}
