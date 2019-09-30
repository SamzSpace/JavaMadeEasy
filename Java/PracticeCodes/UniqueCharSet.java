package PracticeCodes;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharSet {

	public static void main(String[] args) {
		String input="Amazon India Private Limited";
		char[] charArray = input.toCharArray();
Set <Character> s= new LinkedHashSet<Character>();
for(int i=0;i<charArray.length;i++) {
	if(charArray[i]!=' ') {
	s.add(charArray[i]);
	}
}
for (Character character : s) {
	System.out.print(character);
}

	}

}
