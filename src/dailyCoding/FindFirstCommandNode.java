package dailyCoding;

public class FindFirstCommandNode {
	 public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		 int pcount1=0,pcount2=0;
		 ListNode pnode1,pnode2;
		 pnode1=pHead1;
		 pnode2=pHead2;
		 //得到pHead1的长度
		 while(pnode1!=null) {
			 pcount1+=1;
			 pnode1=pnode1.next;
		 }
		 
		 while(pnode2!=null) {
			 pcount2+=1;
			 pnode2=pnode2.next;
		 }
		 
		 int sub=pcount1-pcount2;//两个链表长度的差
		 
		 pnode1=pHead1;
		 pnode2=pHead2;
		 if(sub>0) {//pHead1比较长
			 for(int i=0;i<sub;i++) {
				 pnode1=pnode1.next;
			 }
		 }else {
			 for(int i=0;i<Math.abs(sub);i++) {
				 pnode2=pnode2.next;
			 }
		 }
		 
		 while(pnode1!=pnode2) {
			 pnode1=pnode1.next;
			 pnode2=pnode2.next;
		 }
		 return pnode1;
	    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}