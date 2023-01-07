package exceptionhandling;

public class Multiplecatch {

	public static void main(String[] args) {
		
		
		try
		{
			int [] a=new int[5];
		a[6]=50/0;
		System.out.println(a[10]);
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Array index out of bounds exception occurs");
		}
		catch(Exception ae)
		{
			System.out.println("Parent  Exception occurs");
		}
		
		System.out.println("Rest of the code");
	}

}
