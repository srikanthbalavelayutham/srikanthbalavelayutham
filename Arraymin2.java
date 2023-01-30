package basics;

public class Arraymin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {50,40,30,20,10};
		int min=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min2=min;
				min=arr[i];
			}
			else if(arr[i]<min2)
			{
				min2=arr[i];
			}
		}
		
		System.out.println("The 1st minimum in the given array is : "+min);
		System.out.println("The 2nd minimum in the given array is : "+min2);
		

	}

}
