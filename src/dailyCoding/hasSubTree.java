package dailyCoding;

public class hasSubTree {
	static boolean isSubTree(TreeNode root,TreeNode subTree) {
		 if(subTree == null)
			 return true;
		 
		 if(root == null)
			 return false;
		 
		 //根节点相等，再依次判断左右结点
		 if(root.val!=subTree.val) 
		    return false;
		 
		 return isSubTree(root.left, subTree.left) && 
				 isSubTree(root.right, subTree.right);
	 }
	
	 public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		 if(root1 == null || root2 == null) {
			 return false;
		 }
			 
	     return isSubTree(root1, root2) || 
	    		 isSubTree(root1.left, root2) || 
	    		 isSubTree(root1.right, root2);
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