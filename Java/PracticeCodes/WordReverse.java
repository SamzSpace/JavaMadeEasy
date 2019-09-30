package PracticeCodes;

public class WordReverse {

	public static void main(String[] args) {
		String input="Welcome to TestLeaf Chennai";
		String[] split = input.split(" ");
		String output="";
		for(int i=split.length-1;i>=0;i--) {
			output=output.concat(split[i]+" ");
		}
		System.out.println(output);

	}

}
