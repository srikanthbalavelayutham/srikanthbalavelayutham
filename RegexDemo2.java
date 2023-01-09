package javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Tamil is the oldest language";
		Pattern p=Pattern.compile("^Tamil");
		Matcher m=p.matcher(str);
		Pattern p1=Pattern.compile("language$");
		Matcher m1=p1.matcher(str);
		Pattern p2=Pattern.compile("T|a|l");
		Matcher m2=p2.matcher(str);
		while(m.find())
		{
			System.out.println(m.group()+" starts at "+ m.start()+" and it ends at " +m.end());
		}
		while(m1.find())
		{
			System.out.println(m1.group()+" starts at "+m1.start()+" ends at "+m1.end());
		}
		while(m2.find())
		{
			System.out.println(m2.group()+" appears at "+m2.start());
		}

	}

}
