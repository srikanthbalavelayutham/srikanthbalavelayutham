package practise;

import java.util.Scanner;

public class Count_of_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int count=0;
int oddcount=0;
int evencount=0;
int sum=0;
int oddsum=0;
int evensum=0;
while(number>0)
{
	int remainder=number%10;
	count++;
	sum=sum+remainder;
	if(remainder%2==0)
	{
		evencount++;
		evensum=evensum+remainder;
	}
	else
	{
		oddcount++;
		oddsum=oddsum+remainder;
	}
	number=number/10;
		
}

System.out.println("Number of digits : "+count);
System.out.println("Number of odddigits :  "+oddcount);
System.out.println("Number of evendigits : "+evencount);
System.out.println("Sum of digits :  "+sum);
System.out.println("Sum of evendigits :  "+evensum);
System.out.println("Sum of odddigits :  "+oddsum);

	}

}
