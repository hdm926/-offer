package dailyCoding;
/**
 * �ж��ǲ���ƽ�������:1�����������ĸ߶Ȳ����1�� 2�������������ֱ���ƽ�������
 * @author h
 *2019.10.04
 */
public class isBalancedTree {
      public boolean IsBalanced_Solution(TreeNode root) {
    	  if(root==null)
    		  return true;
    	  
    	  if(Math.abs(depth(root.left)-depth(root.right))>1)
    		  return false;
    	  
    	  return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
            
      }
      //���
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