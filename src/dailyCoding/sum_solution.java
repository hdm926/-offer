package dailyCoding;
/**
 * 算等差数列的和，不能使用乘除、以及判断循环语句
 * sum=(n+n*n)/2;右移一位表示/2
 * @author h
 *2019.10.07
 */
public class sum_solution {
    public int Sum_Solution(int n) {
    	double sum = Math.pow(n, 2) + n;
    	return (int)sum>>1;
        
    }
}
