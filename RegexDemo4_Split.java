package javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String sentence="Srikanth bala velayutham";
		
		String sentence1="www.payilagam.com";
		
		String [] str=sentence1.split("\\.");
		
		for(String i:str)
			System.out.println(i);
		
		Pattern p=Pattern.compile("\\s");
		
		String[] str1=p.split(sentence);
		Matcher m=p.matcher(sentence);
	/*	while(m.find())
		{
			System.out.println(m.group());
		}*/
		
		
		System.out.println(m.find());
		
		for(String i: str1)
			System.out.println(i);
		
	
	}

}
