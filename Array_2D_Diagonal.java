package basics;

public class Array_2D_Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a= {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int row=-0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				if(row==col)
				{
					System.out.print(a[row][col]+"||");
				}
			}
			
		}
		
		

	}
}
