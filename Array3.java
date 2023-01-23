package basics;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find: ");
		int num=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				System.out.println("yes I got the number in Position : "+i);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Number not found");
		}

	}

}
