package basics;

public class Array_print2digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {90,80,90,82,78,500,1000,345,435};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
	if(arr[i]>9&&arr[i]<100)
	{
		System.out.print(arr[i]+"||");
		count++;
	}
	
		}
		System.out.println();
		
		System.out.println("Total double digit number in the array is :  "+ count);
	}

}
