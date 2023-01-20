package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class File_Handling_MobileNumber {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw=new PrintWriter("C:\\Users\\HARI\\Desktop\\Learnbasics\\output.txt");

		Pattern p=Pattern.compile("(0/91)*[6-9][0-9]{9}");
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\HARI\\Desktop\\Learnbasics\\input.txt"));
		String line=br.readLine();
		
		  	          
	        while (line != null) 
	        {
	            Matcher m = p.matcher(line);
	  
	            while (m.find()) 
	            {
	                // Write the mobile number to output.txt file
	                pw.println(m.group());
	            }
	  
	            line = br.readLine();
	        }
	        pw.flush();
	    }
	}
