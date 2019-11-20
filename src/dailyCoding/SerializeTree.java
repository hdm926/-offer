package dailyCoding;

import java.util.LinkedList;
import java.util.Queue;
/**
 * �������л��뷴���л�
 * @author h
 *
 */
public class SerializeTree {
	String Serialize(TreeNode root) {
		StringBuffer sb = new StringBuffer();
		Queue<TreeNode> queue = new LinkedList<>();
        //�������
		if(root==null)
			return sb.toString();
		
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode topNode = queue.poll();
			if(topNode!=null) {
				queue.add(topNode.left);
				queue.add(topNode.right);
				sb.append(String.valueOf(topNode.val));
				sb.append(",");
			}
			else 
				sb.append("#,");//������ʹ��ռλ��
		}
		sb.deleteCharAt(sb.length()-1);//ȥ�����һ������
		return sb.toString();
	  }
	    TreeNode Deserialize(String str) {
	    	TreeNode root = null;
	    	if(str.length()==0)
	    		return root;
	    	
	    	String[] nodes= str.split(",");
	    	TreeNode[] treeNode = new TreeNode[nodes.length];
	    	for(int i =0; i<nodes.length;i++) {
	    		if(!nodes[i].equals("#")) {
	    			treeNode[i]=new TreeNode(Integer.valueOf(nodes[i]));
	    		}
	    	}
	    	
	    	for(int i=0,j=1;j<treeNode.length;i++) {
	    		if(treeNode[i]!=null) {
	    			treeNode[i].left = treeNode[j++];
	    			treeNode[i].right = treeNode[j++];
	    		}
	    	}
	      root = treeNode[0];
	      return root;
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