package dailyCoding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 按“之”字顺序打印二叉树的节点
 * @author h
 *
 */
public class printNodes {
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if(pRoot==null)
			return result;
           
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
          
        stack2.add(pRoot);
        while(!stack2.isEmpty() || !stack.isEmpty()) {
        	ArrayList<Integer> temp = new ArrayList<>();
        	if(!stack2.isEmpty()) {
        	while(!stack2.isEmpty()) {
        		TreeNode popNode = stack2.peek();
        		if(popNode.left!=null)
        			stack.add(popNode.left);
        		if(popNode.right!=null)
        			stack.add(popNode.right);
        		temp.add(stack2.pop().val);
        	}
        	result.add(temp);
        	}
        	
        	else {
        	while(!stack.isEmpty()) {
        		TreeNode popNode = stack.peek();
        		if(popNode.right!=null)
        			stack2.add(popNode.right);
        		if(popNode.left!=null)
        			stack2.add(popNode.left);
        		
        		temp.add(stack.pop().val);
        		
        	}
        	result.add(temp);
        	}
        }
		return result;
    }

}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}