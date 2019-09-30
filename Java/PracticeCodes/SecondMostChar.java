package PracticeCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SecondMostChar {

	public static void main(String[] args) {
		String Company="PPPayPal India";
		char[] charArray = Company.toCharArray();
		List<Integer> l=new ArrayList<Integer>();
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
		for (Entry<Character, Integer> e:my.entrySet()) {
			l.add(e.getValue());
		}
		
		Collections.sort(l);
		Set<Integer> s=new LinkedHashSet<Integer>(l);
		l=new ArrayList<Integer>(s);
		int max=l.get(l.size()-2);
		for (Entry<Character, Integer> e:my.entrySet()) {
			if(e.getValue()==max) {
				System.out.println(e.getKey());
			}
		}
	}


}

