package dailyCoding;

import java.util.HashMap;

/**
 * 返回任意一个数组中的重复元素
 * @author h
 *2019.10.07
 */
public class duplicate {
	public boolean duplicate(int numbers[],int length,int [] duplication) {
		if(length==0 || numbers==null)
			return false;
		
		HashMap<Integer, Integer> map = new HashMap<>();
	    for(int i: numbers) {
	    	if(map.containsKey(i)) {
	    		duplication[0]=i;
	    		return true;
	    	}
	    	else
	    		map.put(i, 1);
	    }
	    duplication[0]=-1;
	    return false;
    }
}