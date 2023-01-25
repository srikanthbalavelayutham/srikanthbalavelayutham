package practise;

import java.util.Scanner;

public class Swapping_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc =  new Scanner(System.in);
		//System.out.println("Enter the number1: ");
		int number1=10;
		//System.out.println("Enter the number2 : ");
		int number2=20;
		System.out.println("Before Swapping  "+"Number1 is : "+number1+"  Number2 is : "+number2);
		
		number2=number2-number1;
		number1=number1+number2;
		System.out.println("After Swapping  "+"Number1 is : "+number1+"  Number2 is : "+number2);
		

	}

}
