package practise;

import java.util.Scanner;

public class Largest2Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number1 :");
		int number1=sc.nextInt();
		System.out.println("Enter the number2 : ");
		int number2=sc.nextInt();
		//by using conditional statement
	
		System.out.println("By using conditional statement");
		if(number1>number2) {
			System.out.println(number1+" is greater than "+number2);
		}
		else
			System.out.println(number2+" is greater than "+number1);
		
		System.out.println("By using Terinary operator");
		
	String result=number1>number2?"Number1 : "+  number1 +" is greater than "+"Number2 : "+ number2:"Number2 : "+  number2+ " is greater than "+" Number1 : "+number1;
	
	System.out.println(result);
	
		

	}

}
