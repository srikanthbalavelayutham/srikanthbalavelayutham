package basics;

import java.util.Scanner;

public class String_ReversePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name to reverse  :  ");
String name=sc.nextLine();

for(int i=name.length()-1;i>=0;i--)
{
	System.out.print(name.charAt(i));
}
	}

}
