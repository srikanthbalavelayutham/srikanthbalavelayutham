package basics;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number  :  ");
		int num=sc.nextInt();
		boolean prime=true;
		int i=2;
		while(i<num)
		{
			
		
	
			if(num%i==0)
			{
				System.out.println(num+ "  is not prime");
				prime=false;
				break;
			}
			
			
			i++;
		
		}
		if(num==1)
		{
			System.out.println(num + " is not prime");
			prime=false;
		}
		
		if(prime==true)
		{
			System.out.println(num + " is prime");
		}

	}

}
