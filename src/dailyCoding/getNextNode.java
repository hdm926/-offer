package dailyCoding;
/**
 * ������һ����㣬������������иý�����һ�����
 * @author h
 *2019.10.08
 */

import java.util.ArrayList;
import java.util.Stack;

public class getNextNode {
	
	static ArrayList<TreeLinkNode> list = new ArrayList<>();
	
	public static TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        //�ҵ����ڵ�
		TreeLinkNode root = pNode;
		TreeLinkNode nextNode = null;
		while(root.next!=null) {
			root=root.next;
		}
		ArrayList<TreeLinkNode> list = new ArrayList<>();
		list=mid(root);
		
		for(TreeLinkNode node : list) {
			System.out.println(node.val);
		}
		//������������
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==pNode && i!=list.size()-1) {
				nextNode = list.get(i+1);
			}
		}
		return nextNode;
		
    }
	//�������
	public static ArrayList<TreeLinkNode> mid(TreeLinkNode root){
		//ÿһ�εݹ鶼�½���һ���µ�list,���ķ���ֵ����
		/*if(root!=null) {
		   mid(root.left);
           list.add(root);
           System.out.print(root.val+",");
           mid(root.right);
		}
        */
		//�ǵݹ�
		Stack<TreeLinkNode> stack = new Stack<>();
		TreeLinkNode pRoot = root;
		while(root!=null || !stack.isEmpty()) {
		    while(pRoot!=null) {
			   stack.push(pRoot);
			   pRoot=pRoot.left;
		    }
		    
		    if(!stack.isEmpty()) {
			   TreeLinkNode p = stack.peek();
			   list.add(p);
			   p=p.right;	
		}
		
		}
	} 
	public static void main(String[] arg) {
		TreeLinkNode node1= new TreeLinkNode(1);
		TreeLinkNode node2 = new TreeLinkNode(2);
		TreeLinkNode node3 = new TreeLinkNode(3);
		node1.left=node2;
		node1.right=node3;
		node1.next=null;
		node2.next=node1;
		node3.next=node1;
		GetNext(node2);
	}
}

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;                                                                                                                                                                                                                          
    TreeLinkNode next = null;//ָ�򸸽ڵ�

    TreeLinkNode(int val) {
        this.val = val;
    }
}