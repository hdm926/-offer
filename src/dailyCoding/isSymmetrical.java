package dailyCoding;
/**
 * ÅÐ¶Ï¶þ²æÊ÷ÊÇ·ñ¶Ô³Æ
 * @author h
 *
 */
public class isSymmetrical {
	boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null)
        	return true;
        return jude(pRoot.left, pRoot.right);
    }
	
	boolean jude(TreeNode node1,TreeNode node2) {
		if(node1==null && node2== null)
			return true;
		if(node1==null || node2==null)
			return false;
		if(node1.val != node2.val)
			return false;
		
		return jude(node1.left, node2.right);
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
