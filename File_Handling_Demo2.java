package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Handling_Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("C:\\\\Users\\\\HARI\\\\Desktop\\\\Learnbasics\\Test.txt");
		file.createNewFile();
		FileWriter fw=new FileWriter(file,true);
	
		/*	fw.write("\nKadhale En kadhale enna seyya pokirai\n naan oviyan endru therinthum nee en kannirandai ketkirai\n Siluvaikal sirakukal rendil enna thara pokiraai");
		fw.flush();
		fw.close();
		FileReader fr=new FileReader(file);
		int r=fr.read();
		while(r!=-1)
		{
			System.out.print((char)r);
			r=fr.read();
		}*/
		
		//Usage of BufferedWriter
		
	/*	BufferedWriter bw =new BufferedWriter(fw);

		
		bw.write("Unmai kadhal yaarenraal unnai ennai solvene");
		bw.newLine();
		bw.write("Neeyum naanum poyyendraal kadhalai thedi kolvene");
		bw.newLine();
		bw.write("\nUnnai naan thedi thedi ennidam kandu kondaen\nunnai naan thedi thedi ennidam kandu konden");
		bw.flush();
		bw.close();*/
		
		//Usage of Buffered Writer
		
		FileReader fr=new FileReader(file);
		BufferedReader br =new BufferedReader(fr);
		String line=br.readLine();
		int lineCount=0;
		int wordcount=0;
		int charcount=0;
		
		while(line!=null)
		{
			line.contains(".");
		
			
			System.out.println(line);
			line=br.readLine();
			
			
			
			lineCount++;
			
		}

		System.out.println(lineCount+"lines in this file");
		
		FileReader fr1=new FileReader(file);
		int r=fr1.read();
		while(r!=-1)
		{
			if((char)r==' ')
			{
				wordcount++;
			}
			
			r=fr1.read();
			charcount++;
		}
		
		System.out.println(wordcount+" words in this file");
		System.out.println(charcount+" characters in this file");
	}

}
