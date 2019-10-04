package dailyCoding;
/**
 * ���������������г��ֵĴ��������ַ��ҵ���ֵ������ǰ������
 * @author h
 *2019.10.04
 */
public class getNumberOfK {
	public int GetNumberOfK(int [] array , int k) {
		if(array.length==0 || array==null)
			return 0;
		  
		int count=0;
	      int low=0;
	      int high=array.length-1;
	      int mid=(low+high)/2;
	      while(low<high && array[mid]!=k) { 
	    	  if(array[mid]>k)
	    		  low=mid+1;
	    	  else if(array[mid]<k)
	    		  high=mid-1;
	    	  
	    	  mid=(low+high)/2;
	      }
	      if(array[mid]==k) {
	    	  for(int i=mid;i>=0 && array[i]==k;i--) {//��ǰ��
	    		  count+=1;
	    	  }
	    	  for(int i=mid+1;i<array.length && array[i]==k;i++) {//������
	    		  count+=1;
	    	  }
	      }
	      
	      return count;
    }
}
