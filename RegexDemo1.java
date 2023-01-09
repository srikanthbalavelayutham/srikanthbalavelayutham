package javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sentence="Thupparkku thuppaya thuppakki thupparku thuppaya thoovum mazhai";
Pattern p=Pattern.compile("mazhai Thuppa thuppa");
Matcher m=p.matcher(sentence);
int count=0;
while(m.find())
{
	count++;
	System.out.println(m.group()+"Starts at "+m.start()+"and ends at "+m.end());
}

System.out.println(p +" appears at "+count+" times" );
	}

}
