package dailyCoding;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * ��һ���ַ���(0<=�ַ�������<=10000��
 * ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, 
 * ���û���򷵻� -1����Ҫ���ִ�Сд��.
 * @author h
 *
 */
public class FirstRepeatingChar {
	public static int FirstNotRepeatingChar(String str) {
        //linkedHashMap�����˲����˳�򣬱����ַ�����¼ÿ���ַ����ֵ�˳���ٱ���map���ҵ���һ��ֻ����һ�ε��ַ�
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		//entrySet�������ص���һ��set	���ϣ���������entry����ÿһ��entry�����ʾmap��һ�Լ�ֵ
		Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			if(it.next().getValue()==1) {
				//System.out.print(it.next());
				//System.out.print(str.indexOf(it.next().getKey())-1);
				//break;
			}
			    
		}
		return -1;
    }
	public static void main(String[] arg) {
		FirstNotRepeatingChar("kYVmIJVzYWPQLtIdKMmvkVSoKtqJANOfCCOfLVJEjjhbnPrDOwKCDeqhts");
	}

}

