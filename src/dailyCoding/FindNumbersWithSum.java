package dailyCoding;
import java.util.ArrayList;
/**
 * 找递增数组里和为sum的两个数，如果有多个结果
 * @author h
 *2019.10.06
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0;i<array.length;i++) {
        	for(int j=array.length-1;j>i;j--) {
        		if(array[i]+array[j]==sum) {//判断是不是比已存的结果乘积更小
        			if(result.size()==0 || (result.size()!=0 && 
        					result.get(0) * result.get(1) > array[i] * array[j])) {
        				result.clear();
        			    result.add(array[i]);
        				result.add(array[j]); 
        				}    			
        			} 
        		} 
        	}
        
        return result;
    }
}
