package dailyCoding;

/**
 * 删除链表的重复结点
 * @author h
 *2019.10.07
 */
public class deleteDuplication {
	public ListNode deleteDuplication(ListNode pHead){
	   if(pHead==null || pHead.next==null)
		   return pHead;
	   
       ListNode head = pHead;//保存头指针
       ListNode pre = new ListNode(-1);
       pre.next=pHead;//pre指向当前结点
       
       while(pHead!=null) {
    	   if(pHead.next!=null && pHead.val==pHead.next.val) {//删除下一个结点、当前结点//和后一个元素比较容易出错，当111的时候，最后一个1删不掉
    		   
    		  //删掉下一个结点,可能不止一个，下面的连续多个都是重复元素
    		   ListNode q = pHead.next;
    		   while(q.next!=null && q.val==q.next.val) {
    			   q=q.next;
    		   }
    		   
    		   pHead.next=q.next;
    		   //这里应该释放q的内存
    		   
    		   //删掉当前结点
    		   //假如当前结点是头结点
    		   if(head==pHead)
    			   head=pHead.next;
    		   
    		   pre.next=pHead.next;
    		   pHead=pHead.next;
    		   //这里应该释放内存
    	   }
    	   else {
    		   pre=pHead;
    		   pHead=pHead.next;
    	   }
    		  
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