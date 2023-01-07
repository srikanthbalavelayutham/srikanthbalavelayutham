package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Java is Started");
System.out.println("Program is in progress....");

Scanner sc =new Scanner(System.in);

System.out.println("Enter the number  :  ");
try
{
int num=sc.nextInt();
System.out.println(100/num);
}
catch(ArithmeticException ae)
{
	//ae.printStackTrace();
	System.out.println(ae.getMessage());
	System.out.println("You have entered invalid input....");
}

catch(InputMismatchException ae)
{
	System.out.println("You have entered invalid input......");
}

catch(Exception e)
{
	System.out.println("You have entered invalid data....");
}

System.out.println("Program is completed");
System.out.println("Program is exited");
	}

}
