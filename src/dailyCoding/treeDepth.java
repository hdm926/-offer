package dailyCoding;

/**
 * 获取树的深度
 * 2019.10.04
 * @author h
 *
 */
public class treeDepth {
    public int TreeDepth(TreeNode root) {  	
        return depth(root);
    }
    
    public int depth(TreeNode rootNode) {
    	if(rootNode==null)
    		return 0;
    	else
    		return Math.max(depth(rootNode.left)+1, depth(rootNode.right)+1);
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