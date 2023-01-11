package basics;

public class Array_Merge2arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {90,80,90,82,78};
		int [] brr= {15,25,35,45};
		int cLength=arr.length+brr.length;
		
		int [] crr=new int[cLength];
		int j=0;
		
		for(int i=0;i<crr.length;i++)
		{
			if(i<arr.length)
		{
			crr[i]=arr[i];
		}
			else
			{
				crr[i]=brr[j];
				j++;
			}
		}
		
		for(int i=0;i<crr.length;i++)
		{
			System.out.print(crr[i]+"||");
		}
	}

}
