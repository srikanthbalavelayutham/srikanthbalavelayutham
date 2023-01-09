package javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		RegexDemo rd=new RegexDemo();
		rd.verifyMobileno();
		rd.regexsplit();
	}
	
		private void regexsplit() {
		
			String names="Chennai Madurai Coimbatore";
			
			Pattern patobj=Pattern.compile("[^A-Za-z]");
			String[] namelist=patobj.split(names);
			Matcher m=patobj.matcher(names);
			System.out.println("Match found is "+m.find());
			while(m.find())
			{
				
				System.out.println("Match found is "+m.group());
			}
			
			
			for(int i=0;i<namelist.length;i++)
			{
				System.out.println(namelist[i]);
			}
		
	}

		// TODO Auto-generated method stub
		
		private void verifyMobileno()
		{
		String input="My mobile number is 8248251662";
		
		Pattern patobj=Pattern.compile("[0-9]{10}");
		Matcher m=patobj.matcher(input);
		
		//System.out.println("Match found is "+m.find());
		
		if(m.find())
		{
			System.out.println(m.group());
		}

	}

}
