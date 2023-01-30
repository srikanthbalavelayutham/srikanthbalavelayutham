package practise;

public class Array_Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {1,2,3,4,5,6,7};
		int count=0;
		int evencount=0;
		int oddcount=0;
		
		for(int x:a)
		{
			System.out.print("| "+x+" |");
			count++;
			if(x%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
		System.out.println();
		
		System.out.println("Number of elements in the array :  "+count);
		System.out.println("Even numbers in the array  : "+evencount);
		System.out.println("Odd numbers in the array : "+oddcount);
		

	}

}
