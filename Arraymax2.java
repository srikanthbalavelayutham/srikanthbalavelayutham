package basics;

public class Arraymax2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {10,20,30,80,40,50};
int max=Integer.MIN_VALUE;
int max2=Integer.MIN_VALUE;

	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max2=max;
			max=arr[i];
			}
		else if(arr[i]>max2)
		{
			max2=arr[i];
		}
		
		
		
		
	}
	
	System.out.println("The maximum in the given array is : " +max);
	System.out.println("The 2nd maximum in the given array is : " +max2);
	}

}
