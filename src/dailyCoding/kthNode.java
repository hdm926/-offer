package dailyCoding;

import java.util.ArrayList;

/**
 * 给定一颗二叉搜索树，返回第K小的结点
 * 二叉搜索树：左子树均小于根节点，右子树均大于根节点，所以按照中序遍历的结果，第K个结点就是所求
 * @author h
 *
 */
public class kthNode {
	ArrayList<TreeNode> treeNodes = new ArrayList<>();
	TreeNode KthNode(TreeNode pRoot, int k)
    {
		if(pRoot==null)
			return null;
		
        mid(pRoot);
        
        if(k>treeNodes.size() || k<1)
        	return null;
        
        return treeNodes.get(k-1);
    }
	//中序遍历
	
	public void mid(TreeNode root) {
		
		if(root==null)
			return;
		
		mid(root.left);
		treeNodes.add(root);
		mid(root.right);	
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