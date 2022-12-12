package stringprograms;

public class Substring_ExamplePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="JAVATPOINT";
System.out.println(s1.substring(2,4));// returns VA
System.out.println(s1.substring(2));// returns VATPOINT

//* Applications of substring method

System.out.println(" Program for using substring() method");
System.out.println("-----------------------------------------");

String[] str= {"Srikanthbalavelayutham","Rajajeya Singh","Yuvraj Singh","Harbajan Singh", "Mandeep Singh",
		"Praveen Kumar","Milkha Singh","Virat Kohli","Amjit Singh","Amarendar Singh"};

String surName="Singh";

int surNameSize=surName.length();

int size=str.length;

for(int i=0;i<size;i++)
{
	int length=str[i].length();
	
	String subStr=str[i].substring(length-surNameSize);
	
	if(subStr.equals(surName))
	{
		System.out.println(str[i]);
	}
	
}


	}

}
