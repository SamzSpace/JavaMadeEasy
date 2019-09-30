package PracticeCodes;

public class PrimeNo100Assignment {

	public static void main(String[] args) {
		int c=0; //counter variable
		for(int i=1;i<100;i++) { //setting range between 1 to 100
			
			for (int j=1;j<=i;j++) { //division of the number from 1 to the num value
				if(i%j==0) { //checking whether the no is divisible by itself or 1
					c++; //increasing count value
				}
				
			}
			if(c==2) {
				System.out.println(i+" is Prime"); 
			}
			c=0; //resetting count
	}
	}

}
