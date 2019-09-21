package dailyCoding;

import java.util.Scanner;

public class distance {
    private static int[][] cost = new int[6][6];
    private static int[][] shortest = new int[6][6];
    private static int[][] path = new int[6][6];
    
    
	 private static void Floyed() {
	        for (int i = 0; i < 6; i++) {
	            for (int j = 0; j < 6; j++) {
	                shortest[i][j] = cost[i][j];
	                path[i][j] = 0;
	            }
	        }
	        for (int k = 0; k < 6; k++) {
	            for (int i = 0; i < 6; i++) {
	                for (int j = 0; j < 6; j++) {
	                    if (shortest[i][j] > (shortest[i][k] + shortest[k][j])) {
	                        shortest[j][i] = shortest[i][j] = shortest[i][k] + shortest[k][j];
	                        path[i][j] = k;
	                        path[j][i] = k;
	                    }
	                }
	            }
	        }
	    }
	 
	 public static void main(String[] arg) {
		 Scanner in = new Scanner(System.in);
		 byte b1=in.nextByte();
		 byte b2=in.nextByte();
		 
		 int i,j;
		 switch (b1) {
		 case 'A':
			i=0;
			break;
		 case 'B':
				i=1;
				break;
		 case 'C':
				i=2;
				break;
		 case 'D':
				i=3;
				break;
		 case 'E':
				i=4;
				break;
		 case 'F':
				i=5;
				break;

		}
		 switch (b2) {
		 case 'A':
			j=0;
			break;
		 case 'B':
			 j=1;
				break;
		 case 'C':
				j=2;
				break;
		 case 'D':
				j=3;
				break;
		 case 'E':
				j=4;
				break;
		 case 'F':
				j=5;
				break;

		}
		 cost[0][1]=12;
		 cost[0][5]=16;
		 cost[1][2]=10;
		 cost[1][5]=7;
		 cost[2][3]=3;
		 cost[2][4]=5;
		 cost[2][5]=6;
		 cost[3][4]=4;
		 cost[4][5]=2;
		 Floyed();
	}
}
