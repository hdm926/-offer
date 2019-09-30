package dailyCoding;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * 在一个字符串(0<=字符串长度<=10000，
 * 全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 
 * 如果没有则返回 -1（需要区分大小写）.
 * @author h
 *
 */
public class FirstRepeatingChar {
	public static int FirstNotRepeatingChar(String str) {
        //linkedHashMap保存了插入的顺序，遍历字符串记录每个字符出现的顺序，再遍历map，找到第一个只出现一次的字符
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		//entrySet方法返回的是一个set	集合，集合里是entry对象，每一个entry对象表示map的一对键值
		Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<Character, Integer> entry=it.next();
			if(entry.getValue()==1) {
				//System.out.print(it.next());
				return str.indexOf(entry.getKey());
				
			}
			    
		}
		return -1;
    }
	public static void main(String[] arg) {
		FirstNotRepeatingChar("kYVmIJVzYWPQLtIdKMmvkVSoKtqJANOfCCOfLVJEjjhbnPrDOwKCDeqhts");
	}

}

