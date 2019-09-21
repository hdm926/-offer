package dailyCoding;

import java.util.HashMap;

public class randomListNode {
	 public RandomListNode Clone(RandomListNode pHead) {
	    HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
	    
	    if(pHead==null)
	    	return pHead;
	    
	    RandomListNode p1=pHead;
	    RandomListNode p2=pHead;
	    
	    while(p1!=null) {
	    	map.put(p1, new RandomListNode(p1.label));//复制前后的对应结点
	    	p1=p1.next;
	    }
	    
	    while(p2!=null) {
	    	if(p2.next!=null) {
	    		map.get(p2).next=map.get(p2.next);
	    	}
	    	else {
	    		map.get(p2).next=null;
	    	}
	    	map.get(p2).random=map.get(p2.random);
	    	p2=p2.next;
	    }
	    return map.get(pHead);     
	 }
}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}