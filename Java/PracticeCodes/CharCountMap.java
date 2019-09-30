package PracticeCodes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharCountMap {

	public static void main(String[] args) {
		String Company="Tata Consultancy Solutions";
		char[] charArray = Company.toLowerCase().toCharArray();
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
for(char c:charArray){
	if(c!=' ') { // To eliminate Space
	if(map.containsKey(c)) {
		Integer integer=map.get(c)+1;
				map.put(c,integer);
	}else
	{
		map.put(c,1);
	}
}
}
System.out.println(map);

	}

}
