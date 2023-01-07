package exceptionhandling;

public class NestedTryBlock {

	public static void main(String[] args) {
		
		try
		{
			try 
			{
				System.out.println("Divide by zero");
				int divide=30/0;
				
				
			}
			
			catch(ArithmeticException ae)
			{
				System.out.println(ae);
			}
			
			try
			{
				System.out.println("trying array out of bounds exception");
				int [] arr=new int[5];
				System.out.println(arr[10]);
			}
			
			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println(ae);
			}
			
			System.out.println("Other Statement");
		}
		
		catch(Exception ae)
		{
			System.out.println(ae);
		}
		
		System.out.println("Normal flow");

	}

}
