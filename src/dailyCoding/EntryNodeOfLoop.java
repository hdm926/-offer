package dailyCoding;

import java.util.HashMap;

/**
 * ���������ڻ����򷵻ػ������
 *����������һ�����ֵ��ظ���㼴���
 * @author h
 *2019.10.07
 */
public class EntryNodeOfLoop {
	 public ListNode EntryNodeOfLoop(ListNode pHead)
	    {
	       HashMap<ListNode, Integer> map = new HashMap<>();
	       while(pHead!=null) {
	    	   if(map.containsKey(pHead))
	    	      return pHead;
	    	   else {
	    		   map.put(pHead, 1);
	    		   pHead=pHead.next;
	    	   }   
	       }
	       return null;
	    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}