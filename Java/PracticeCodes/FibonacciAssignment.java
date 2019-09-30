package PracticeCodes;

public class FibonacciAssignment {

	public static void main(String[] args) {
		int n=20; //range
		int x=0;  //Term1
		int y=1;   //Term2
		for (int i=1;i<=n;i++) {
			if(i!=n) {
			System.out.print(x+" , ");
			}
			else
				System.out.print(x);
			int sum=x+y; //adding a num and its preceding num
			x=y; 
			y=sum;
		}

	}

}
