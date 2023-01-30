package basics;
import java.util.Scanner;

public class Array3delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to remove :  ");
		int key=sc.nextInt();
	int i=0;
	boolean check=false;
		for( i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println(key+"  is present at position :  "+i);
				check=true;
				break;
			}
		}
		
		if(check==true)
		{
		for(int j=i;j<arr.length-1;j++)
		{
			arr[j]=arr[j+1];
		}
		
		
		System.out.println("After removing");
		
		for( i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+"||");
		}
		}
		
		else
		{
			System.out.println("Number not found");
		}

	}

}
