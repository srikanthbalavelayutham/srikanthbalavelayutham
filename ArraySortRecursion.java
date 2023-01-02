package recursionpractise;

public class ArraySortRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char [] a= {'A','C','B','D','E','F'};

int l=a.length;

int sorting=isArraySorted(a,l);

if(sorting==1)
{
	System.out.println("Sorted Array");
}
else
{
	System.out.println("Non Sorted Array");
}
		

	}

	static int isArraySorted(char []a,int l)
	{
		if(l==1)
		{
			return 1;
		}
		else
		{
			return( (a[l-1]<a[l-2])?0:isArraySorted(a,l-1));
		}
	}
}
