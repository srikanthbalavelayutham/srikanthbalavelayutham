package basics;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] marks=new int[5];
		Scanner sc=new Scanner(System.in);
		int i=0;
		int total=0;
		while(i<marks.length)
		{
			System.out.println("Enter the mark : ");
			marks[i]=sc.nextInt();
			total=total+marks[i];
			i++;
		}
		
		System.out.println(total);
	}

}
