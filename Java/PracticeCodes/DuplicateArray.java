package PracticeCodes;

public class DuplicateArray {

	public static void main(String[] args) {
		int a[]= {1,2,1,22,23,34,44,33,34,22,1,34,1,22,34,22,34,1};
		int L=a.length;
		int count=a.length;
		do{
		for (int i = 0; i < L; i++) {
			for (int j = i+1; j <L; j++) {
				if(a[i]==a[j]) {
					for(int k=j;k<L-1;k++) {
					a[k]=a[k+1];
					}
					L--;
				}
			}
		}
		count--;
		}while(count>0);
		for(int i=0;i<L;i++)
		{
			System.out.print(a[i]+ " ");
		}

	}

}
