package dailyCoding;

/**
 * ����һ�����������飬����������������ƴ�������ų�һ������
 * ��ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 * @author h
 *
 */
public class printMinNum {
	public String PrintMinNumber(int [] numbers) {
		//������ð�����򣬵�����Ԫ�صĴ�С���¶���
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
