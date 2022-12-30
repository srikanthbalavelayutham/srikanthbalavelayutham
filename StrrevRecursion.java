package recursionpractise;

public class StrrevRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="srikanth bala velayutham";
		StrrevRecursion str=new StrrevRecursion();
		System.out.println(str.reverseWord(word));
	}
	
	private String reverseWord(String word)
	{
		if(word.length()==1)
		{
			return word;
		}
		String val=reverseWord(word.substring(1));
		char val2=word.charAt(0);
	return val+val2;	
	}

}
