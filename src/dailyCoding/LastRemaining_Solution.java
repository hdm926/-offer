package dailyCoding;

import java.util.LinkedList;
import java.util.Vector;

import org.omg.CORBA.portable.RemarshalException;

/**
 * Լɪ��
 * @author h
 *2019.10.07
 */
public class LastRemaining_Solution {
    public int LastRemaining_Solution(int n, int m) {
        //n��С���ѣ���m
    	//������̫�����ˣ���vector
    	if(n<=0)
    		return -1;
    	if(n==1)
    		return 1;
    				
    	Vector<Integer> kids = new Vector<Integer>(n);
    	for(int i=0;i<n;i++) {
    		kids.add(i);
    	}

        int index=-1;//��ǰλ��
        int size=kids.size();
    	while(size>1) {
    		index+=m;
    		index=index % size;
   
    		kids.remove(index--);//�Ƴ�����indexǰ��һ����Ԫ�أ��Ƴ�֮��index�ͱ��index-1
    		
    		size--;
    			
    
    	}
    	return kids.get(0);

    }

}
