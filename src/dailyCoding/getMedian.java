package dailyCoding;
/**
 * ���������ж���λ��
 */
import java.util.ArrayList;
import java.util.Collections;

public class getMedian {
	 ArrayList<Integer> list = new ArrayList<>();
	 
	public void Insert(Integer num) {
        list.add(num);
        Collections.sort(list);
    }

    public Double GetMedian() {
        int len=list.size();
        if(len%2==0)
        	return Double.valueOf(( list.get(len/2) + list.get(len/2 - 1) )/2);
        else
        	return Double.valueOf(list.get((len-1)/2));
    }
}
