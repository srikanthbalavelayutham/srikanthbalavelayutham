package basics;

public class Pattern6 {

	
	public static void main(String[] args)
	{
		
		for(int row=1;row<=5;row++)
		{
			for(int col=5;col>=row;col--)
			{
				System.out.print(row);
			}
			for(int colcap=1;colcap<=row;colcap++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
