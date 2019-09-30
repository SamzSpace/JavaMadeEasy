package PracticeCodes;

import java.util.Scanner;

public class Greater3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s.nextInt();
		System.out.println("Enter value of b");
		int b=s.nextInt();
		System.out.println("Enter value of c");
		int c=s.nextInt();
		System.out.println("Value of a "+a);
		System.out.println("Value of b "+b);
		System.out.println("Value of c "+c);
if((a>b)&&(a>c)) {
	System.out.println("A is the Greatest "+a);
}
else if((b>a)&&(b>c)) {
	System.out.println("B is the Greatest "+b);
}
else
	System.out.println("C is the Greatest "+c);
	}

}
