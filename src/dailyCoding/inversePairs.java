package dailyCoding;
//����ԣ������ĳ��ֵȡģ
public class inversePairs {
public int InversePairs(int [] array) {
	//��ʱ
        int count = 0;
        for(int i=0;i<array.length;i++) {
        	for(int j=i+1;j<array.length;j++) {
        		if(array[i]>array[j])
        			count+=1;
        	}
        }
        return count%1000000007;
    }
}