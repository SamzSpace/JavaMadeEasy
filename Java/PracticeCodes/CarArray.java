package PracticeCodes;

import java.util.Scanner;

public class CarArray {

	public static void main(String[] args) {
		
		
	
		String[] car= {"BMW","Bentley","Benz","Audi","Jaguar","Ferrari","Lambo"};

		System.out.println("FOR LOOP");
		System.out.println("--------------------------");

		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}

		System.out.println("FOR EACH LOOP");
		System.out.println("--------------------------");
/*Scanner s=new Scanner(System.in);
System.out.println("Enter number of models to input");
int n=s.nextInt();
		String[] car1=new String[n];
		for(int j=1;j<=n;j++){
		s.nextline();
		}
		*/
		
		for( String m:car) {
			System.out.println(m);
		}
	}

}
