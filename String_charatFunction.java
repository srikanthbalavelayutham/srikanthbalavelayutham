package stringprograms;

public class String_charatFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//charAt()-to return the char value at the index
		
		
		String name="JAVATPOIT";
		char ch=name.charAt(6);
		
		System.out.println(ch);
		
//To print string in reverse
		System.out.println("To print string in reverse");
		System.out.println("----------------------------");
		
		
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
		
		System.out.println();
		
		System.out.println("-------------------------------");
		
		
//To print string character present in the odd position
		
		System.out.println("To print odd position character");
		System.out.println("-------------------------------");
		
		for(int i=0;i<name.length()-1;i++)
		{
			if(i%2!=0)
			{
				System.out.print(name.charAt(i)+" ");
			}
		}
		
		System.out.println();
		
		
//To print vowels in the string
		
		System.out.println("To print vowels in the string");
		System.out.println("------------------------------");
		
	for(int i=0;i<name.length();i++)
	{
		
		String name2=name.toLowerCase();
		if(name2.charAt(i)=='a'||name2.charAt(i)=='e'||name2.charAt(i)=='i'||name2.charAt(i)=='o'||name2.charAt(i)=='u')
		{
			System.out.print(name2.toUpperCase().charAt(i)+" ");
		}
	}
	
	System.out.println("");
	
	System.out.println("------------------------------------");

	}

}
