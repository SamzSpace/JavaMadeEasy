package PracticeCodes;

import java.util.Scanner;

public class SumOfDigitsAssgn {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=s.nextInt();
	s.close();
	int sum=0;
	while(n>0) {
		int z=n%10;
		sum=sum+z;
		n=n/10;
	}
System.out.println("Sum of the Digits = "+sum);
	}

}
