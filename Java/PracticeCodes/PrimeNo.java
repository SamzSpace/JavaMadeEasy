package PracticeCodes;

public class PrimeNo {

	public static void main(String[] args) {
		int a=4;
		byte c=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println("a is prime");
		}
		else
			System.out.println("Not prime");
	}
	}


