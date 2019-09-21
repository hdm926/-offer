package dailyCoding;

import java.util.ArrayList;

public class printMatrix {
	public ArrayList<Integer> printMatrix(int [][] matrix) {
	       ArrayList result = new ArrayList<>();
	       
	       if(matrix==null)
	    	   return result;
	       
	       int up=0;
	       int down=matrix.length-1;//最后一行
	       int left=0;
	       int right=matrix[0].length-1;//最后一列
	       //每一圈都是往右-往下-往左-往上
	       
	       while(up<=down && left<=right) {
	    	   //往右
	    	   for(int j=left;j<=right;j++) {
	    		   result.add(matrix[up][j]);  
	    	   }
            
	    	   //往下
	    	   for(int j=up+1;j<=down;j++) {
	    		   result.add(matrix[j][right]); 
	    	   }
            
	    	   //往左,注意只有一行的时候
            if(up < down){
	    	      for(int j=right-1;j>=left;j--) {
	    		     result.add(matrix[down][j]);  
	    	    }
            }
	    	   //往上,注意只有一列的时候
            if(left < right){
	    	    for(int j=down-1;j>up;j--) {
	    		   result.add(matrix[j][left]); 
	    	    } 
            }
            up++;
            down--;
            left++;
            right--;
	       }
	       return result;
	    }
}