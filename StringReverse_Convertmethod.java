package basics;

import java.util.Scanner;

public class StringReverse_Convertmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to reverse :  ");
		String name=sc.nextLine();
		
		//To convert name string into character array  using toCharArray()
		
		char[] ch=name.toCharArray();
		
		int i=0,j=ch.length-1;
		
		while(i<j)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		
		//To conver charater array into string
		
		String name2=new String(ch);
		
		System.out.println(name2);
	}

}
