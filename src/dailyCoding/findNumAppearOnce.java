package dailyCoding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class findNumAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int k : array) {
        	if(map.containsKey(k))
        		map.remove(k);
        	else
        		map.put(k, 1);
        }
        
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        
        Map.Entry entry = it.next();
        num1[0]=(int) entry.getKey();
        entry=it.next();
        num2[0]=(int) entry.getKey();
        
    }
}


