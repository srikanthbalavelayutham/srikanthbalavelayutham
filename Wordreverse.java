package stringprograms;

public class Wordreverse {

	public static void main(String[] args) {
		
		
		String str="India is my country";
		
	 String [] words=str.split(" ");
	 
	 int len=words.length-1;
	 
	 String reverse="";
	 
	 for(int i=len;i>=0;i--)
	 {
		 reverse=reverse+words[i]+" ";
	 }
	 
	 System.out.println(reverse);

	}

}
