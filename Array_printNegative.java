package basics;

public class Array_printNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {90,80,90,82,78,-89,-90,-100,-110,-98};
int count=0;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]<0)
	{
		System.out.print(arr[i]+"||");
		count++;
	}
}

System.out.println();
System.out.println("The negative number in the array is : "+count);
	}

}
