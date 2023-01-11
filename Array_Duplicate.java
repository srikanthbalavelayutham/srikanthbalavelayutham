package basics;

public class Array_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {90,81,99,80,78,90,80};
int count=0;
for(int i=0;i<arr.length;i++)
{
	int m=arr[i];
	for(int j=i+1;j<arr.length;j++)
	{
		if(m==arr[j])
		{
			count++;
			break;
		}
	}
}

if(count==0)
{
	System.out.println("No duplicate value in the array");
}
else
{
System.out.println("Duplicate values in the given array is : "+ count);
}
	}

}
