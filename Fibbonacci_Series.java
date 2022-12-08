package basics;

import java.util.Scanner;

public class Fibbonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter thw number to check : ");
		
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
		}

	}

}
