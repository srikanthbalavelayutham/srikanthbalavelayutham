package practise;

public class Array_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {1,2,3,4,5,6,7};
		int sum=0;
		for(int  x:a)
		{
			sum=sum+x;
			//System.out.println(x);
		}
		
		System.out.println("Sum of elements in the array :  "+sum);
	}

}
