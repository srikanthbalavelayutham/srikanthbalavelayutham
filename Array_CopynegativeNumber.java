package basics;

public class Array_CopynegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {90,80,90,82,78,-90,-80,-72,-89,-98};
		int count=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]<0)
		{
			count++;
			
		}
		
		
		int j=0;
		
		int [] brr=new int[count];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				brr[j]=arr[i];
				j++;
			}
		}
		
		for(int i=0;i<brr.length;i++)
		{
			System.out.print(brr[i]+"||");
		}

	}

}
