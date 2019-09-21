package dailyCoding;

import javax.management.openmbean.TabularData;

public class RectCover {
	 public int RectCover(int target) {
		 if(target<=2) 
			 return target;
		 
		 int[] dp = new int[target+1];
		 dp[0]=0;
		 dp[1]=1;
		 dp[2]=2;
		 
		 for(int i=3;i<target+1;i++) {
			 dp[i]=dp[i-1]+dp[i-2];
		 }
		 return dp[target];

	    }
	}


