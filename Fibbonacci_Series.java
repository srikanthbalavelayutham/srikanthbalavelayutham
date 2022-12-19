package basics;

import java.util.Scanner;

public class Fibbonacci_Series {
	
	static int n1=0,n2=1,n3=0;
	
	static void fibbonacci(int fibbcount)
	{
		if(fibbcount>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.print(" "+n3);
			fibbonacci(fibbcount-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc =new Scanner(System.in);
		
	/*	System.out.println("Enter the number to check : ");
		
		int num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Please wait we will check.......");
	
		}
		
		else
		{
			System.out.println("please enter positive number");
			
		}
		
		
		
		int f=0;
		int s=1;
		int t=f+s;
		int count=1;
		
		while(t<num)
		{
			s=f+s;
			f=s-f;
			t=f+s;
			count++;
			
		}
		
		if(t==num)
		{
			System.out.println(num+" is fibbocci series :  "+count);
		}
		else
		{
			System.out.println(num+"is not fibbonacci series");
		}*/
		
		System.out.println("Enter the count to find  : ");
		
		int fibbcount = sc.nextInt();
		
		System.out.print(n1+" "+n2);
		
		fibbonacci(fibbcount-2);
		
		// Program to find fibbonacci series for given count  
		
		

	}

}
