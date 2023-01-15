package basics;

public class Pattern_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int row=1;row<=9;row++)
		{
			System.out.print("* ");
			
		}
		System.out.println();
		for(int rowcal=1;rowcal<=9;rowcal++)
		{
			for(int col=1;col<=4;col++)
			{
				System.out.print("  ");
				if(col==4)
				{
					System.out.println("*");
				}
			}
		
		
		
		if(rowcal==9)
		{
			for(int col=1;col<=9;col++)
			{
				
			
			System.out.print("* ");
			}
		}
			
		}

	}

}
