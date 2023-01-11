package basics;
import java.util.Scanner;

public class Array_AddElementinLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,20,30,40,50};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the element to add:  ");
		int value=sc.nextInt();
		int len=arr.length+1;
		int[] brr=new int[len];
		int len2=len-1;
		brr[len2]=value;
		for(int i=0;i<arr.length;i++)
		{
			brr[i]=arr[i];
		}
		
		for(int i=0;i<brr.length;i++)
		{
			System.out.print(brr[i]+"||");
		}
	}

}
