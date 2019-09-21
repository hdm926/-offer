package dailyCoding;

import java.util.Arrays;

public class minNumberInRotateArray {
	
	 static int minNumberInRotateArray(int [] array) {
		if(array.length==0)
			return 0;
		
		Arrays.sort(array);
		return array[0]; 
    }
	 
	 public static void main(String[] arg) {
		 int[] arr= {1,2,3};
		 int a=minNumberInRotateArray(arr);
		 System.out.print(a);
	}

}
