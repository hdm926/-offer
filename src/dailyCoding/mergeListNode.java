package dailyCoding;

public class mergeListNode {
	 public ListNode Merge(ListNode list1,ListNode list2) {
		 if(list1==null){
			 return list2;
		 }
		 
		 if(list2==null) {
			 return list1;
		 }
		 
		 ListNode head = new ListNode(-1);
		 ListNode p = head;
		 while(list1 != null && list2 != null) {
			 if(list1.val < list2.val) {
				 p.next=list1;
				 list1=list1.next;
				 p=p.next;
			 }
			 else {
				 p.next=list2;
				 list2=list2.next;
				 p=p.next;
			}
			 p=p.next;
		 }  
		 
		 while(list1!=null) {
			 p.next=list1;
			 list1=list1.next;
		 }
		 while(list2!=null) {
			 p.next=list2;
			 list2=list2.next;
		 }
		 
		 if(head.next!=null) {
			 head=head.next;
		 }
		 return head;
	 }

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}