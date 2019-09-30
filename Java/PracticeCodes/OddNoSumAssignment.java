package PracticeCodes;

public class OddNoSumAssignment {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==1) { //checking whether the no is Odd
				sum=sum+i; //adding the Odd Numbers
			}
		}
		System.out.println("Sum of first 100 Odd Numbers = "+sum);

	}

}
