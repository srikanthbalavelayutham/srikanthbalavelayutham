package recursionpractise;

import java.util.Scanner;

public class FactRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to to check : ");
		int num=sc.nextInt();
		System.out.println("Factorial of "+num+ " is "+findFact(num));

	}
	
	static int findFact(int num)
	{
		
		if(num==1)
		{
			return num;
		}
		else
		{
			return num * findFact(num-1);
		}
		
	}

}
