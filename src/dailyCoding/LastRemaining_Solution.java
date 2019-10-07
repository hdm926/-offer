package dailyCoding;

import java.util.LinkedList;
import java.util.Vector;

import org.omg.CORBA.portable.RemarshalException;

/**
 * 约瑟夫环
 * @author h
 *2019.10.07
 */
public class LastRemaining_Solution {
    public int LastRemaining_Solution(int n, int m) {
        //n个小朋友，数m
    	//用链表太复杂了，换vector
    	if(n<=0)
    		return -1;
    	if(n==1)
    		return 1;
    				
    	Vector<Integer> kids = new Vector<Integer>(n);
    	for(int i=0;i<n;i++) {
    		kids.add(i);
    	}

        int index=-1;//当前位置
        int size=kids.size();
    	while(size>1) {
    		index+=m;
    		index=index % size;
   
    		kids.remove(index--);//移除的是index前面一个的元素，移除之后index就变成index-1
    		
    		size--;
    			
    
    	}
    	return kids.get(0);

    }

}
