package dailyCoding;
import java.util.ArrayList;
/**
 * �ҵ����������Ϊsum��������������ж�����
 * @author h
 *2019.10.06
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0;i<array.length;i++) {
        	for(int j=array.length-1;j>i;j--) {
        		if(array[i]+array[j]==sum) {//�ж��ǲ��Ǳ��Ѵ�Ľ���˻���С
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
