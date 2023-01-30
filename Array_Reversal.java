package basics;

public class Array_Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {90,80,90,82,78};
		int[] brr=new int[arr.length];
		System.out.println("Before Reversal");
		for(int i=0;i<brr.length;i++)
		{
			System.out.print(brr[i]+"||");
		}
		
		System.out.println();		
		
		System.out.println("After Reversal");
		int i=0;
		
		for(int j=arr.length-1;j>=0;j--)
		{
			brr[i]=arr[j];
			System.out.println(brr[i]);
			i++;
			}
		
		for(int k=0;k<brr.length;k++)
		{
			System.out.print(brr[k]+"||");
		}

	}

}
