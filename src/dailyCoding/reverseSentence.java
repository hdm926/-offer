package dailyCoding;

import java.util.ArrayList;
/**
 * ��ת���ӵ���˳��
 * @author h
 *2019.10.07
 */
public class reverseSentence {
      public String ReverseSentence(String str) {
    	  if(str==null || str.length()==0)
    		  return str;
    	  
    	  StringBuffer result = new StringBuffer();
    	  String[] arr = str.split(" ");
    	  
    	  if(arr.length==0)//���ǿո�����
    		  return str;
    	  
    	  for(int i=arr.length-1;i>=0;i--) {
    		  result.append(arr[i]);
    		  result.append(" ");
    	  }
    	  
        
    	  return result.toString().trim();
      }


}
