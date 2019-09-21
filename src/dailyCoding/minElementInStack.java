package dailyCoding;

import java.util.Stack;

public class minElementInStack {
	 Stack<Integer> stack = new Stack<Integer>();
	 Stack<Integer> minStack = new Stack<Integer>();
	 
	 int min=Integer.MAX_VALUE;
	 public void push(int node) {
		 stack.push(node);
		 //总是将最小元素放在栈顶
		 if(node<min) {
			 //minStack.push(node);//minStack的栈顶总是维护当前最小的元素
			 min=node;
		 }
		     minStack.push(min);
		 
	    }
	    
	    public void pop() {
	        stack.pop();
	        minStack.pop();
	        min=minStack.peek();
	    }
	    
	    public int top() {
	        return stack.peek();
	    }
	    
	    public int min() {
	        return min;
	    }
}