package practise;

import java.util.Scanner;

public class Array_Searching_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {10,20,30,40,50,60,70,80,90};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		boolean flag=false;
		
		for(int x:a)
		{
			if(x==num)
			{
				System.out.println("Got your number :  "+x);
				flag=true;
			}
		
		}
		
		if(flag==false)
		{
			System.out.println("Number not found");
		}

	}

}
