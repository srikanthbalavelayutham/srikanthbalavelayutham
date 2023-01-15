package basics;

public class Pattern_F {

	public static void main(String[] args)
	{
		for(int row=1;row<=6;row++)
		{
			System.out.print("* ");
		}
		for(int rowcal=1;rowcal<=7;rowcal++)
		{
			if(rowcal==4)
			{
				for(int col=5;col>=rowcal;col--)
				{
				System.out.print("* ");
				}
			}
			
			if(rowcal==7)
			{
				for(int col=1;col<rowcal;col++)
				{
					System.out.print("* ");
				}
			}
			System.out.println("*");
		}
		
		
		
	}
}
