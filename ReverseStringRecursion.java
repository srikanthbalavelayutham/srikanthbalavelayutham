package recursionpractise;

import java.io.InputStream;
import java.util.Scanner;


public class ReverseStringRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the text you want to reverse : ");
		
		String s =sc.nextLine();
		
		System.out.println("Reversed text is here");
		System.out.println("----------------------");
		reverseString(s);

	}



	private static String reverseString(String s) {
		// TODO Auto-generated method stub
		if(s.isEmpty())
		{
			return s;
		}
		else
			System.out.print(s.charAt(s.length()-1));
		return  reverseString(s.substring(0,s.length()-1));
		
		
	}

}
