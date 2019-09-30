package PracticeCodes;

public class OddIndexUpperCaseAssgn {

	public static void main(String[] args) {
		String input="changeme";
		String output="";
		String temp="";
		char[] ch = input.toCharArray();
for (int i = 0; i < ch.length; i++) {
	//System.out.print(ch[i]);
	if(i%2==1) {
	 temp=(temp+ch[i]).toUpperCase();
		output=output+ temp;
		temp="";
	}
	else
		output=output+ ch[i];
	
}
System.out.print(output);
	}

}
