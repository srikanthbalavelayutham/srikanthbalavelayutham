package fileHandling;

import java.io.File;
import java.io.IOException;

public class File_Handling_Demo {

	public static void main(String[] args) throws IOException,StringIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
		/*File fff=new File("C:\\Users\\HARI\\Desktop\\Learnbasics\\Srikanth");
		boolean created=fff.mkdir();//creating folder in this location named as Srikanth
		System.out.println(created)*/
//creating sub folders in Srikanth
		
	/*	File  fff=new File("C:\\Users\\HARI\\Desktop\\Learnbasics\\Srikanth\\Java\\FileIO");
		boolean created=fff.mkdirs();
		System.out.println(created);
		*/
		
		//creating new file
		
		File fff=new File("C:\\Users\\HARI\\Desktop\\Learnbasics");
/*		boolean created =fff.createNewFile();
		System.out.println(created);
		System.out.println(fff.canExecute());
		System.out.println(fff.canRead());
		System.out.println(fff.canWrite());
		System.out.println(fff.getAbsolutePath());
		System.out.println(fff.length());
		System.out.println(fff.getAbsoluteFile());
		*/
		
//To get list of filenames
		
		String[] fileList=fff.list();
		
/*		for(String s:fileList)
		{
			System.out.println(s);
		}
		
		System.out.println(fileList.length);
	
*/
	//To get particular files use listFiles()

	File [] files=fff.listFiles();
	
//	for (File s:files)
	//{
		//System.out.println(s);
	//}
	
	//To get only directories in that location 
/*	System.out.println("Folders in this location");	
	for(File s: files)
	{ 
		
		if(s.isDirectory())
		{
			
			System.out.println(s);
		}
	}
	
	System.out.println("Files in this location");
	
	for(File s: files)
	{
		System.out.println(s);
		}
	
	*/
	System.out.println("Only java files");
	
	for(File file:files)
	{

		if(file.isFile())
	{
		String fileName=file.getName();
		//System.out.println(fileName);
		int dotIndex=fileName.lastIndexOf(".");
		//System.out.println(dotIndex);
		if(dotIndex!=-1) {
		String fileExtension=fileName.substring(dotIndex);
	//System.out.println(fileExtension);
		if(fileExtension.equals(".java"))
		{
		System.out.println(fileName);
		}
	}
	
	}
	}
	}
	
}
