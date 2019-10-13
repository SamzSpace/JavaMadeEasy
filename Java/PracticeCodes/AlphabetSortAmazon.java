package PracticeCodes;

public class AlphabetSortAmazon {

	public static void main(String[] args) {
		String s="BaBbHgBAmHGaGg";
		char[] ch = s.toCharArray();
		String temp="";
		for (int i = 0; i < ch.length; i++) {
			temp=temp+ch[i];
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					temp=temp+ch[j];
					ch[j]='/';
				}
				if(s.toLowerCase().charAt(i)==ch[j]||s.toUpperCase().charAt(i)==ch[j]) {
					
					temp=temp+ch[j];
					ch[j]='!';
				}
				
			}
		}
		System.out.println(temp.replaceAll("[/!]", ""));
		s=temp;
	}
	}
	
