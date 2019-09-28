package dailyCoding;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * @author h
 *
 */
public class printMinNum {
	public String PrintMinNumber(int [] numbers) {
		//对数组冒泡排序，但对于元素的大小重新定义
		StringBuffer buffer= new StringBuffer();
		if(numbers==null || numbers.length==0)
			return buffer.toString();
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				int num1=Integer.valueOf(numbers[j]+""+numbers[i]);
				int num2=Integer.valueOf(numbers[i]+""+numbers[j]);
				if(num1<num2) {
					int temp=numbers[j];
					numbers[j]=numbers[i];
					numbers[i]=temp;
				}
			}
		}
		for(int num:numbers) {
			buffer.append(String.valueOf(num));
		}
		
		return buffer.toString();

    }


}
