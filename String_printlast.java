package basics;

public class String_printlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names= {"vineeth","muthuselvi","Lavanya","durai","naresh","raja"};
		
		for(int count=0;count<names.length;count++)
		{
		String name=names[count];
		
		//for(int i=0;i<name.length();i++)
		//{
			
		int last=name.length()-1;
			if(name.charAt(last)=='h')
			{
				System.out.println(name);
			}
		//}
		}
	}
}
