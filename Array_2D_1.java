package basics;

import java.util.Scanner;

public class Array_2D_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] marks=new int[3][];
		marks[0]=new int[9];
		marks[1]=new int[8];
		Scanner sc =new Scanner(System.in);
		System.out.println(marks.length);
		System.out.println(marks[0].length);
		System.out.println(marks[1].length);
		for(int row=0;row<marks.length;row++)
		{
			for(int col=0;col<marks[row].length;col++)
			{
				System.out.println("Enter the marks"+"["+row+"]"+"[" + col +"]");
				marks[row][col]=sc.nextInt();
			}
		}
	}

}
