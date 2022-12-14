package stringprograms;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.length()--> to calculate number of characters in the string
		
		String s="Welcome";
		
		System.out.println(s.length());  //7-- Number of characters in the string
		
		//2.concat()---> to join two strings
		
		String s1="Welcome to ";
		
		String s2="Training";
		
		System.out.println(s1+s2);
		
		System.out.println(s1.concat(s2));
		
		System.out.println("Welcome to "+ "Training");
		
		System.out.println("Welcome to".concat(" Training"));
		
		//3. equals() and equalsIgnoreCase--> Comparing 2 strings
		
		String s3="WELCOME";
		
		String s4="Welcome";
		
		System.out.println(s3.equals(s4));//-->false
		
		System.out.println(s4.equalsIgnoreCase(s3));//-->true
		
		//4.contains()-->To check given string is available in the another string
		
		String s5="XYZ";
		
		System.out.println(s3.contains(s5));//-->false
		
		
		//5.Substring
		
		System.out.println(s.substring(0,3));
		
		System.out.println(s.substring(2,5));
		
		System.out.println(s.substring(4,7));
		
		//6.Replace
		
		System.out.println(s.replace('e','a'));
		
		System.out.println(s.replace("come", "ljhg"));
		
		System.out.println(s);
		
		
		
		
		
		
		
	}

}
