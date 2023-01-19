package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class File_Handling_Image {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File_Handling_Image fhi=new File_Handling_Image();
File file=new File("C:\\Users\\HARI\\Desktop\\siva designs\\piston.jpg");
fhi.readImage();
	}

	private void readImage() throws IOException {
		InputStream is=new FileInputStream("C:\\Users\\HARI\\Desktop\\siva designs\\piston.jpg");
		OutputStream os=new FileOutputStream("C:\\Users\\HARI\\eclipse-workspace\\JAVABASICS\\src\\fileHandling\\rnewImage.jpg");
		int r=is.read();
		while(r!=-1)
		{
			os.write(r);
		}
		
	}

}
