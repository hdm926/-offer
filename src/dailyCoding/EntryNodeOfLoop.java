package dailyCoding;

import java.util.HashMap;

/**
 * 如果链表存在环，则返回环的入口
 *遍历链表，第一个出现的重复结点即入口
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