package PracticeCodes;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		System.out.println("Enter the Age");
		Scanner s=new Scanner(System.in);
		byte age=s.nextByte();
	
if (age<18) {
	System.out.println("Kid");
}else if ((age>=18)&&(age<=60)) {
	System.out.println("Adult");
}else
	System.out.println("Senior");
	}

}
