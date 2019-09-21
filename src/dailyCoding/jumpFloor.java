package dailyCoding;

public class jumpFloor {
	
	public int JumpFloorII(int target) {
		int[] total=new int[target+1];
		
		if(target<=2)
			return target;
		
		total[0]=1;
		total[1]=1;
		total[2]=2;
		for(int i=3;i<=target;i++) {
			for(int j=i-1;j>=0;j--) {
				total[i]+=total[j];
			}
		}
		
			return total[target];
			

    }
}