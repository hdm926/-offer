package dailyCoding;

import java.util.ArrayList;

public class printMatrix {
	public ArrayList<Integer> printMatrix(int [][] matrix) {
	       ArrayList result = new ArrayList<>();
	       
	       if(matrix==null)
	    	   return result;
	       
	       int up=0;
	       int down=matrix.length-1;//���һ��
	       int left=0;
	       int right=matrix[0].length-1;//���һ��
	       //ÿһȦ��������-����-����-����
	       
	       while(up<=down && left<=right) {
	    	   //����
	    	   for(int j=left;j<=right;j++) {
	    		   result.add(matrix[up][j]);  
	    	   }
            
	    	   //����
	    	   for(int j=up+1;j<=down;j++) {
	    		   result.add(matrix[j][right]); 
	    	   }
            
	    	   //����,ע��ֻ��һ�е�ʱ��
            if(up < down){
	    	      for(int j=right-1;j>=left;j--) {
	    		     result.add(matrix[down][j]);  
	    	    }
            }
	    	   //����,ע��ֻ��һ�е�ʱ��
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