package PracticeCodes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class OddNoCheck {

	public static void main(String[] args) {
		for(int i=10;i<=20;i++) 
		{
			if(i%2==1) {
				System.out.println("Odd Number: "+i);
			}
		}
		Date date=new Date();
		System.out.println(date);
		DateFormat df=new SimpleDateFormat("dd");
		System.out.println(df.format(date));
		String today=df.format(date);
		int t=Integer.parseInt(today)+1;
		System.out.println(t);

	}

}
