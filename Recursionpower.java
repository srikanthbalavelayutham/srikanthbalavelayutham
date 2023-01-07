package recursionpractise;

import java.util.Scanner;

public class Recursionpower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		
		System.out.println("Enter the power value  : ");
		
		int powervalue=sc.nextInt();
		
		Recursionpower rp=new Recursionpower();
		
		
		
	System.out.println(rp.power(num,powervalue));
		
	}

	
	public int power(int x,int n)
	{
		if(n==0)
		{
			return 1;
			}
		else if(n==1)
		{
			return x;
		}
		else
		{
			int y=power(x,n/2);
			y=y*y;
			if(n%2==0)
			{
				return y;
			}
			else
			{
				return y*x;
			}
		}
	}
}
