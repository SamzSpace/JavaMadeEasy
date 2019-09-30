package PracticeCodes;

public class RevEvenWordsStringAssgn {

	public static void main(String[] args) {
		String a="I am a Software Tester";
		String op="";
		String[] spl=a.split(" ");//splitting each word by delimiter
		for(int i=0;i<spl.length;i++) {
			if(i%2==1) {//taking Even no words
				char[] ch=spl[i].toCharArray();//splitting even words to char
				for(int j=ch.length-1;j>=0;j--) {
					op=op +ch[j]; //reversing char and saving it as String
				}
				op=op.concat(" ");//adding space at the end of the word
			}
			else
				op=op+spl[i].concat(" "); //adding space at the end of the word
		}
		System.out.print(op);
	}

}
