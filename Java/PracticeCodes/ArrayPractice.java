package PracticeCodes;

public class ArrayPractice {
public static void main(String[] args) {
	///===========================Store Random values in Array===================///
	
	double [] array=new double[6];
	System.out.println("Before Reverse");
	for (int i = 0; i < 6; i++) {
		array[i]=Math.random();
		System.out.println((float)array[i]);
	}
	int n=6;
	//---------------Reverse a array----------------//
	for(int i=0;i<n/2;i++) {
		double temp=array[i];
		array[i]=array[n-1-i];
		array[n-i-1]=temp;
	}
	System.out.println("After Reverse");
	for (int i = 0; i < n; i++) {
		System.out.println((float)array[i]);
	}
	//----------------Find Max of Array-----------------//
	double sum = 0;
	 double avg=0;
	double max=Double.NEGATIVE_INFINITY;
	double min=Double.POSITIVE_INFINITY;
	System.out.println(max);
	for (int i = 0; i < 6; i++) {
		array[i]=Math.random();
		 sum+=array[i];
		avg=sum/6;
		//System.out.println((float)array[i]);
		
		if(array[i]>max) {
			max=array[i];
		}
		else if (array[i]<min)
		{
			min=array[i];
		}
		
	}
	//System.out.println("Sum of array "+sum);
	//System.out.println("Avg of array "+avg);
	//System.out.println("Maximum value of Array "+max);
	//System.out.println("Minimum value of Array "+min);
}

}
