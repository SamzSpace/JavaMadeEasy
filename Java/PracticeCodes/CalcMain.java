package PracticeCodes;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num1");
		int a=s.nextInt();
		System.out.println("Enter num2");
		int b=s.nextInt();
		s.close();
		CalcOperations Cal=new CalcOperations();
		int sum=Cal.add(a, b);
		System.out.println("Addition : "+sum);
		int sub=Cal.sub(a, b);
		System.out.println("Subtraction : "+sub);
		int mul=Cal.mul(a, b);
		System.out.println("Multiplication : "+mul);
		int div=Cal.div(a, b);
		System.out.println("Division : "+div);
		int mod=Cal.mod(a, b);
		System.out.println("Modulus : "+mod);
	}

}
