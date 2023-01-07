package exceptionhandling;

public class ExceptionFinallyBlock {

	public static void main(String[] args) {
	
		
		/* Finally block executed always without depending try-catch block
		 * it will explained in 3 cases
		 */
		
//case:1 exception not occured
		
		try
		{
			int num= 25;
			System.out.println(num/2);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic exception occured");
		}
		finally
		{
			System.out.println("Finally block is executed");
		}
		
//case:2 exception occured and not handled
		
/*		try
		{
			int [] arr=new int[5];
			
			System.out.println(arr[10]);
		}
		
		finally
		{
			System.out.println("If exception not handled finally executed");
		} */
//case:3 exception occurs and handled
		
		try
		{
			
			String s=null;
		}
		
		catch(NullPointerException ae)
		{
			System.out.println("Nullpointer exception handled");
		}
		
		finally
		{
			System.out.println("IF exception handled, finallly also executed ");
		}
		
		
	}

}
