package PracticeCodes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegExp {

	public static void main(String[] args) {

String Name="Project Strength is 18 members out of 5    	 Teams";
//To extract nos out of String
String pattern="[0-9]+";
Pattern p=Pattern.compile(pattern);
Matcher matcher = p.matcher(Name);
while(matcher.find()) {
	System.out.println(matcher.group());
}

//To extract words out of String
 pattern="\\w+";
 p=Pattern.compile(pattern);
 matcher = p.matcher(Name);
while(matcher.find()) {
	//System.out.println(matcher.group());
}

//Patterns in Real Life 

String email="Dean.V1994@gmail.co.in";
pattern="[a-zA-Z0-9.]+@[a-zA-Z]+.[a-z.]{2,}";
p=Pattern.compile(pattern);
matcher=p.matcher(email);
System.out.println(matcher.matches());
	}

}
