package dailyCoding;

import java.util.ArrayList;

//¾ØÕó³Ë»ı
/**
 * C[i] = A[0] * A[1] *...*A[i-1]=C[i-1]*A[i-1](i >= 1)
   D[i] = A[i + 1] *...* A[n-1]=D[i + 1]* A[i + 1](i <= n-2)
   B[i] = C[i] * D[i]
 * @author h
 */
public class multiply {
	 public int[] multiply(int[] A) {
		int n = A.length;
		int[] B = new int[n];
		
		for(int i=0;i<n;i++) {
			int temp = 1;
		    for(int j=0;j<i;j++) {
			   temp*=A[j];
		    }
		    for(int m=n-1;m>i;m--) {
		    	temp*=A[m];
		    }
		    B[i]=temp;
		}
		return B;
	    }
}
