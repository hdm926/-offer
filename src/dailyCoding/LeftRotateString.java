package dailyCoding;

/**
 * 用字符串实现循环左移
 * @author h
 *2019.10.06
 */
public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if(str.length()==0 || n==0)
        	return str;
        
        n=n%str.length();
        
        return str.substring(n,str.length()) + str.substring(0,n);
    }
}