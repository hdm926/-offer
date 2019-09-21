package dailyCoding;

import java.util.Stack;

public class findKthNode {
	  
	public class Solution {
	    public ListNode FindKthToTail(ListNode head,int k) {
	    	if(head==null || k==0)
	    		return null;
	    	
	    	int index=1;
	    	Stack<ListNode> stack = new Stack<>();
	    	while(head!=null) {
	    		stack.push(head);
	    		head=head.next;
	    	}
	    	
	    	while(index!=k) {
	    		stack.pop();
	    		index++;
	    	}
	    	
	    	return stack.pop();

	    }
	}
    
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
  
