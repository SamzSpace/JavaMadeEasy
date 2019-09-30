package PracticeCodes;

public class ReverseString {

	public static void main(String[] args) {
		String input="Testleaf";
		//One way
		char[] ch=input.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		} 
		System.out.println();
		//Alternate way
		for(int j=input.length()-1;j>=0;j--)
			System.out.print(input.charAt(j));
		
	}

}
