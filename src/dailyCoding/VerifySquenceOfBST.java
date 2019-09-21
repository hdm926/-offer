package dailyCoding;

import java.util.Arrays;

public class VerifySquenceOfBST {
	//该数组是不是二叉搜索树后序遍历的结果
	//二叉搜索树：左子树均小于根节点，右子树均小于根节点
	 public boolean VerifySquenceOfBST(int [] sequence) {
		 if(sequence.length==0 || sequence ==null)
			 return false;
		
		return isBST(sequence, 0, sequence.length-1);
	    }
	 
	 public boolean isBST(int[] seq,int start,int end) {
		 if(start>=end)
			 return true;
		 
		 int key=seq[end];//根节点
		 int i;//分界点
		 
		 for(i=start;i<end;i++) {
			 if(seq[i]>key)
				 break;
		 }
		 
		 
		 //此时i是右子树的第一个结点，往右找，看有没有小于根节点的点
		 for(int j=i;j<end;j++) {
			 if(seq[j]<key)
				 return false;
		 }
		 return isBST(seq, start, i-1) && isBST(seq, i, end-1);
	 }
}