package recursionpractise;

import java.util.Scanner;

public class Triangularnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		
		Triangularnumber tr=new Triangularnumber();
		System.out.println(tr.findTriangle(num));
		

	}
	
	public int findTriangle(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			int triangle=n+findTriangle(n-1);
			return triangle;
		}
	}

}
