package dailyCoding;

import java.util.ArrayList;

/**
 * ����һ�Ŷ��������������ص�KС�Ľ��
 * ��������������������С�ڸ��ڵ㣬�����������ڸ��ڵ㣬���԰�����������Ľ������K������������
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
	//�������
	
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