package PracticeCodes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class uniqueChar {

	public static void main(String[] args) {
		String Company="Amazon India Private Limited";
		char[] charArray = Company.toCharArray();
		Map<Character, Integer> my=new LinkedHashMap<Character, Integer>();
		for (char c : charArray) {
			if(c!=' ') {
			if(my.containsKey(c)) {
				Integer integer=my.get(c)+1;
				my.put(c,integer);
			}
			else
				my.put(c, 1);
		}
		}
		System.out.println(my.entrySet());
			for(Entry<Character, Integer> en:my.entrySet()) {
				if(en.getValue()==1) {
				System.out.print(en.getKey());
				}
			}
		}

}
