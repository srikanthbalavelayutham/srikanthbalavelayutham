package basics;

public class SpiralmatrixClockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] spiral=new int[4][4];
		
		int minRow=0,minCol=0;
		int maxCol=spiral.length-1;
		int maxRow=spiral.length-1;
		int num=1;
		int element=spiral.length*spiral.length;
		while(num<=element)
		{
		for(int i=minCol;i<=maxCol;i++)
		{
		spiral[minRow][i]=num;
		System.out.print(num+"||");
		num++;
		}
		
		for(int i=minRow+1;i<=maxRow;i++)
		{
			spiral[i][maxCol]=num;
			System.out.print(num+"||");
			num++;
		}
		
		for(int i=maxCol-1;i>=minCol;i--)
		{
			spiral[maxRow][i]=num;
			System.out.print(num+"||");
			num++;
		}
		
		for(int i=maxRow-1;i>=minRow+1;i--)
		{
			spiral[i][minCol]=num;
			System.out.print(num+"||");
			num++;
		}
		
		minRow++;
		minCol++;
		maxRow--;
		maxCol--;
		}
		
		System.out.println();
		
		for(int i=0;i<spiral.length;i++)
			
		{
			System.out.println("-----------------");
			for(int j=0;j<spiral.length;j++)
			{
				System.out.printf(spiral[i][j]+" | ");
		}
			System.out.println();
			
		
		}

	}

}
