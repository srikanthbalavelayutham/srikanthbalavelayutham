package basics;

public class Array_2D_Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a= {{10,20,30},{40,50,60},{70,80,90}};
		
		int [][] b=new int[3][3];
		
		for(int row=0;row<a.length;row++) 
		{
			for(int col=0;col<a[row].length;col++)
			{
				b[row][col]=a[col][row];
			}

	}

		for(int row=0;row<a.length;row++)
		{
			System.out.println("-------------");
			 
			for(int col=0;col<a[row].length;col++)
			{
				System.out.print(b[row][col]+"||");
			}
			System.out.println();
			System.out.println("-------------");
		}
}
}