package dailyCoding;
/**
 * 读入字符，返回第一个只出现一次的字符
 * @author h
 *2019.10.07
 */
public class firstChar {
	static String str="";
	static int[] hash = new int[256];
	
	//Insert one char from stringstream
    public static void Insert(char ch)
    {
        str+=ch;
        hash[ch]+=1;
        System.out.println(ch+" "+hash[ch]);
        
        
    }
  //return the first appearence once char in current stringstream
    public static char FirstAppearingOnce()
    {
       for(int i =0;i<str.length();i++) {
    	   if(hash[str.charAt(i)]==1) {
    		   System.out.println(str + ","+str.charAt(i)+" "+hash[str.charAt(i)]);
    		   return str.charAt(i);
    		  }
       }
       return '#';
    }
    
    public static void main(String[] arg) {
    	Insert('h');
    	
    	Insert('e');
    	Insert('l');
    	FirstAppearingOnce();
    	
    }
}