package dailyCoding;
//逆序对，结果对某个值取模
public class inversePairs {
public int InversePairs(int [] array) {
	//超时
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