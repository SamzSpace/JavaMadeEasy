package PracticeCodes;

public class Palindrome {
public static void main(String[] args) {
	String input="malayala";
	String output = "";
	char[] ch=input.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		System.out.print(ch[i]);
		output=output+ch[i]; //append char array to a String
		
	}
	System.out.println();
	if(input.equals(output)) {
		System.out.println(input +" is a Palindrome");
	}
	else
		System.out.println(input +" is not a Palindrome");
}
}
