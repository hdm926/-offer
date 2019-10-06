package dailyCoding;
/**
 * 找出和为sum的连续整数
 * 2019.10.06
 */
import java.util.ArrayList;

public class FindContinuousSequence {
	 public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	      
	      ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	      
	      for(int i=1;i<sum;i++) {
	    	  int tempSum = 0;
	    	  int j=i;
	    	  while(tempSum<sum) {
	    		  tempSum+=j;
	    		  j++;
	    	  }
	    	  if(tempSum==sum) {
	    		  ArrayList<Integer> list = new ArrayList<Integer>();
	    		  for(int m=i;m<j;m++) {
	    			  list.add(m);
	    		  }
	    		  if(list.size()>1) {
	    			  result.add(list);
	    		  }
	    	  }  
	      }
	      return result;
	 }
}