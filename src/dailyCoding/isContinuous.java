package dailyCoding;

import java.util.Arrays;

/**
 * 扑克牌抽顺子
 * @author h
 *2019.10.07
 */
public class isContinuous {
	public boolean isContinuous(int [] numbers) {
		//最大值-最小值=4，没有重复值，大小王是0
		if(numbers.length<5)
			return false;
		
		Arrays.sort(numbers);
		int count=0;//大小王个数
		for(int i = 0;i<numbers.length;i++) {
			if(numbers[i]==0)
				count++;
				
			else if(i+1<numbers.length){
				int sub=numbers[i+1]-numbers[i];
				if(sub==0)
					return false;
				
				else if(sub>1)
					count=count-sub+1;
			}	
		}
		if(count==0 || count==4)
			return true;
		else
			return false;

    }
}



