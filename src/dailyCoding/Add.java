package dailyCoding;
/**
 * ������ӣ���������������
 * �����ǽ�λ����������㣻�������㣬�������һλ���õ���λ������λ��Ϊ0ʱΪ���
 * @author h
 *2019.10.07
 */
public class Add {
    public int Add(int num1,int num2) {
    	if(num2==0)
    		return num1;
    	
        int sum;
        sum = num1^num2;
        int carry = (num1 & num2)<<1;
        
  
        return Add(sum, carry);

         
    }
}