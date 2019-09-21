package dailyCoding;

public class mirrorTree {
	static void changeLeftToRight(TreeNode root) {
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
	}
	
	public void mirror(TreeNode root) {
		if(root==null) {
			return;
		}
       changeLeftToRight(root);
       mirror(root.left);
       mirror(root.right);
		
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