package basics;

public class Array_frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {10,20,30,40,10,20,50,60,10,30,10,40};
		
		int [] freq=new int[arr.length];
		
		//int i=0;
		
		for(int  i=0;i<arr.length;i++)
		{
			int num=arr[i];
			int count=1;
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				
				if(num==arr[j])
				{
					count++;
					freq[j]=-1;
					
				}
			}
		
				
				if(freq[i]!=-1)
				{
					freq[i]=count;
				}
			
		}	
		
		
		for(int  i=0;i<freq.length;i++)
		{
			System.out.print(freq[i]+"||");
		}
		
		System.out.println();
		//count of duplicates//
		
		
		int duplicatecount=0;
		
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>1)
			{
				duplicatecount++;
			}
		}
		
		System.out.println("Duplicate numbers in this array is : "+duplicatecount);
		
//count of unique in the array//
		
		int uniquecount=0;
		
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]==1)
			{
				uniquecount++;
			}
		}
		
		System.out.println("count of unique number number in this array is :  "+uniquecount);
		
		
		//How many times repeated//
		
		System.out.println("How many times repeated that number");
		System.out.println("-------------------------------------");
		
		for(int i=0;i<freq.length;i++)
		{
			
			
			if(freq[i]!=-1)
			{
			System.out.println(arr[i] + " present in  "+ freq[i] +" times ");
		}
		}
			//To copy duplicate numbers  in another array//
			
			int[] arr2=new int[arr.length];
			for(int i=0;i<freq.length;i++)
			{
			if(freq[i]>1)
			{
				arr2[i]=arr[i];
			}
			
			
			}
			
			System.out.println("Repeated numbers in the array");
			
			for(int i=0;i<freq.length;i++)
			{
				if(arr2[i]>0)
				{
					System.out.print(arr2[i]+"||");
				}
			}
		}
	}


