package javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sentence="abcaabbbcccAACCBBBddeee12345!@#$$%%^&*()";
Pattern p=Pattern.compile("[^a-zA-z0-9]");
Matcher m=p.matcher(sentence);
while(m.find())
{
	System.out.println(m.group()+" appears at "+ m.start());
}
	}

}
