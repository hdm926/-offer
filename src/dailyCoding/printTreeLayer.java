package dailyCoding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class printTreeLayer {

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> resultList = new ArrayList<>();
        
	    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
	        if(root!=null) {
	        	queue.add(root);
	        }
	        
	        //addNode(root);
	        
	        while(!queue.isEmpty()) {
	        	root=queue.poll();
	        	addNode(root);
	        }
	        return resultList;
	    }
	    
	    public void addNode(TreeNode root) {
	    	resultList.add(root.val);//根节点入列
	    	if(root.left!=null)
	    		queue.add(root.left);
	    	
	    	if(root.right!=null)
	    		queue.add(root.right);
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
