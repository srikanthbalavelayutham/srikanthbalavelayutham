package basics;

import java.util.Scanner;

public class Array2_Max_intheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks=new int[5];
		Scanner sc=new Scanner(System.in);
		int total=0;
		int max=0;
		int i=0;
		int min=Integer.MAX_VALUE;
		while(i<marks.length)
		{
			System.out.println("Enter the marks :  ");
			marks[i]=sc.nextInt();
			if(marks[i]>max)
			{
				max=marks[i];
			}
			
			if(marks[i]<min)
			{
				min=marks[i];
			}
			total=total+marks[i];
			i++;
		}
		
		System.out.println("Total is : "+total);
		System.out.println("The maximum in the given array is : "+max);
System.out.println("The minimum in the array is : "+min);
	}

}
