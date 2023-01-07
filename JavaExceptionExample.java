package exceptionhandling;

public class JavaExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int data=100/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Zero and negative numbers not allowed");
		}
System.out.println("Rest of the code ");
	}

}
