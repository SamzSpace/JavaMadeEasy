package PracticeCodes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseSort {

	public static void main(String[] args) {
	
		List<String> myList=new LinkedList<String>();
		myList.add("HCL");
		myList.add("TCS");
		myList.add("Aspire Systems");
		Collections.sort(myList);
		Collections.reverse(myList);
		for (String string : myList) {
			System.out.println(string);
		}

	}

}
