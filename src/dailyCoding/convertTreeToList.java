package dailyCoding;

import java.util.ArrayList;

public class convertTreeToList {
	
	 ArrayList<TreeNode> arrayList = new ArrayList<>();
	 
	 public TreeNode Convert(TreeNode pRootOfTree) {
	        if(pRootOfTree==null)
	        	return pRootOfTree;
	        
	        addNode(pRootOfTree);
	        
	        return convertPointer(arrayList);       
	        
	    }
	 
	 //中序遍历
	 public void addNode(TreeNode root) {
		 if(root.left!=null)
			 addNode(root.left);;
		 
		 arrayList.add(root);
		 
		 if(root.right!=null) {
			 addNode(root.right);
		 } 
	 }
	 
	 //修改指针
	 public TreeNode convertPointer(ArrayList<TreeNode> arrayList) {
		 for(int i=0;i<arrayList.size()-1;i++) {
			 arrayList.get(i).right=arrayList.get(i+1);
			 arrayList.get(i+1).left=arrayList.get(i);
		 }
		 
		 
		 return arrayList.get(0);
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
