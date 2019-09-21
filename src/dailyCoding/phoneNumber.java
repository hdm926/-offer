package dailyCoding;

import java.util.Scanner;

public class phoneNumber {
	public void main() {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0) {
        	Scanner sc2 = new Scanner(System.in);
            int len = sc2.nextInt();
            
            String phone= sc2.nextLine();
            
            if(len!=11) {
            	System.out.println("NO");
            	t--;
            	continue;
            }
            
            if(len>11 && phone.substring(len-11))
            
            
        }
        
	}

}
