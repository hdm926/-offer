package dailyCoding;

public class count1s {
	
	public int NumberOf1(int n) {
		int count=0;
		while(n!=0) {
			count += (n & 1);
			n>>>=1;//�޷������ơ�����һλ��ʾ��2
		}
		return count;

    }
}
	


