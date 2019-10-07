package dailyCoding;
/**
 * 两数相加，不能用四则运算
 * 不考虑近位，做异或运算；做与运算，结果左移一位，得到进位，当进位不为0时为结果
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