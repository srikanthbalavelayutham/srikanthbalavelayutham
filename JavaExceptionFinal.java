package exceptionhandling;

public class JavaExceptionFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		String s=null;
		try
		{
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception occured... handled...");
		}
		finally
		{
			System.out.println("Finally block will always execute");
		}
		System.out.println("Program is completed");
		System.out.println("Program is exited");
	}

}
