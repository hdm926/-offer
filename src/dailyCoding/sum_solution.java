package dailyCoding;
/**
 * ��Ȳ����еĺͣ�����ʹ�ó˳����Լ��ж�ѭ�����
 * sum=(n+n*n)/2;����һλ��ʾ/2
 * @author h
 *2019.10.07
 */
public class sum_solution {
    public int Sum_Solution(int n) {
    	double sum = Math.pow(n, 2) + n;
    	return (int)sum>>1;
        
    }
}
