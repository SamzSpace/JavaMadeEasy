package PracticeCodes;

import java.util.Arrays;

public class DuplicateRemovalArrayAgilysys {

	public static void main(String[] args) {
	int [] a = {1,4,6,3,5,2,4,6,4,8,6,9,6};
	int n=a.length;
	for (int i = 0; i < n; i++) {
		for (int j = i+1; j < n; j++) {
			if(a[i]==a[j]) {
				a[j]=a[n-1];
				n--;
				j--;
			}
		}
	}
int [] b=Arrays.copyOf(a, n);
for (int i = 0; i < b.length; i++) {
	System.out.print(b[i]+" ");
}
	}

}
