package dailyCoding;

/**
 * ɾ��������ظ����
 * @author h
 *2019.10.07
 */
public class deleteDuplication {
	public ListNode deleteDuplication(ListNode pHead){
	   if(pHead==null || pHead.next==null)
		   return pHead;
	   
       ListNode head = pHead;//����ͷָ��
       ListNode pre = new ListNode(-1);
       pre.next=pHead;//preָ��ǰ���
       
       while(pHead!=null) {
    	   if(pHead.next!=null && pHead.val==pHead.next.val) {//ɾ����һ����㡢��ǰ���//�ͺ�һ��Ԫ�رȽ����׳�����111��ʱ�����һ��1ɾ����
    		   
    		  //ɾ����һ�����,���ܲ�ֹһ���������������������ظ�Ԫ��
    		   ListNode q = pHead.next;
    		   while(q.next!=null && q.val==q.next.val) {
    			   q=q.next;
    		   }
    		   
    		   pHead.next=q.next;
    		   //����Ӧ���ͷ�q���ڴ�
    		   
    		   //ɾ����ǰ���
    		   //���統ǰ�����ͷ���
    		   if(head==pHead)
    			   head=pHead.next;
    		   
    		   pre.next=pHead.next;
    		   pHead=pHead.next;
    		   //����Ӧ���ͷ��ڴ�
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