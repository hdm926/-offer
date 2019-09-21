package dailyCoding;

import java.util.LinkedList;
import java.util.Queue;

public class reOrderArray {
	static void reOrderArray(int [] array) {
		if(array == null ||array.length == 1)
			return;
		
		Queue<Integer> queue1 = new LinkedList<>();
		Queue<Integer> queue2 = new LinkedList<>();
		
		for(int i : array) {
			if(i % 2 ==0)
				queue2.offer(i);
			else
				queue1.offer(i);
		}
		
		
		int j=0;
		while(!queue1.isEmpty()) {
			array[j++]=queue1.poll();
		}
			
			
		while(!queue2.isEmpty()) {
			array[j++]=queue2.poll();
		}
			
	}
	
	public static void main(String[] arg) {
		int[] array= {1,3,6,4,5};
		System.out.print(array);
	}

}
