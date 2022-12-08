package basics;

import java.util.Scanner;

public class Guessnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1000;  
		int max = 10000;  
		System.out.println("Random value of type int between "+min+" to "+max+ ":");  
		int num = (int)(Math.random()*(max-min+1)+min);  
		//System.out.println("The random number is :  "+num);  
		
		int originalnum=num;
		
		int count=0;
		
		int [] arr=new int[4];
		
		for(int i=arr.length-1;i>=0;i--)
		{
			arr[i]=num%10;
			num=num/10;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"||");
		}
		
		System.out.println();
		while(true)
		{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num2=sc.nextInt();
		boolean flag=true;
		
		if (num2==originalnum)
		{
			System.out.println("Got your number : "+num2);
		}
		
		if(num2<1000 || num2>10000)
		{
			System.out.println("Please enter 4 digit number");
			flag=false;
		}
		
		int [] brr=new int[arr.length];
		
		if(flag==true)
		{
			for(int i=brr.length-1;i>=0;i--)
			{
				brr[i]=num2%10;
				num2=num2/10;
			}
		}
		
		for(int i=0;i<brr.length;i++)
		{
			System.out.print(brr[i]+"||");
		}
		
		System.out.println();
		
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr.length;j++)
			{
				if(arr[i]==brr[i])
				{
					System.out.println(arr[i]+"present in correct position");
					break;
				}
				
				else if(arr[i]==brr[j])
				{
					System.out.println(arr[i]+"present in wrong position");
				}
			}
		}
		
		
		
		}
		
		
	}

}
