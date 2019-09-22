package dailyCoding;

import java.util.HashMap;
import java.util.Iterator;

public class moreThanHalfList {
	 public int MoreThanHalfNum_Solution(int [] array) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        
	        for(int i :array) {
	        	if(map.get(i)!=null)
	        	   map.put(i, map.get(i)+1);
	        	else
	        		map.put(i, 1);
	        }
	        
	        for(int key : map.keySet()) {
	        	if(map.get(key) > (array.length/2)) {
	        		return key;
	        	}	
	        }
	        
	        return 0;
	    
      }
}
