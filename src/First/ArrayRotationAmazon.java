package First;

public class ArrayRotationAmazon {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6};
		int temp=0;
		int count=0;
		int n=4;
		while(count<n) {
		for (int i = 0; i < a.length; i++) {
			if(i==0) {
				temp=a[0];
			}
			if((i+1)<a.length) {
				a[i]=a[i+1];
				
			}
			if((i+1)==a.length) {
				a[a.length-1]=temp;
				
			}
		}
		count++;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
