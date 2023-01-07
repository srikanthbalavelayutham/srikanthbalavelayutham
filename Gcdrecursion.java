package recursionpractise;

import java.util.Scanner;

public class Gcdrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gcdrecursion gc=new Gcdrecursion();
		Scanner sc =new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int small=num1<num2?num1:num2;

		int gcd=gc.findGCD(num1,num2,small);
		
		if(gcd>0)
		{
			System.out.println("Gcd is "+gcd);
		}
		else
			System.out.println("GCD is not found");
	}

	
	public int findGCD(int num1,int num2,int small)
	{
		if(small>1)
		{
			if((num1%small==0)&&(num2%small==0))
			{
				//System.out.println("GCD is "+small);
				return small;
			}
			else
			{
				return findGCD(num1,num2,small-1);
			}
		}
		return -1;
	}
}
