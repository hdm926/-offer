package dailyCoding;

import java.util.Stack;

public class isPopOrder {
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		Stack<Integer> stack = new Stack<Integer>();
		
		if(pushA.length!=popA.length)
			return false;
		
	    int i = 0;//push
	    int j=0;//pop

	    while(!stack.isEmpty() && i<pushA.length && j<popA.length) {
	    	stack.push(pushA[i]);
	        i++;
	        
	         while(!stack.isEmpty() && stack.peek()==popA[j]) {
	        	 stack.pop();
	        	 j++;
	         }
	        	 
	        	 
	         
	    }
	    
	    return stack.isEmpty();
	    
    }
	
	public static void main(String[] arg) {
		int[] pushA= {1,2,3,4,5};
		int[] popA= {4,5,3,2,1};
		boolean b =IsPopOrder(pushA,popA);
		System.out.print(b);
	}
}