package workingwithFileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class workingwithfile2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =new File("sample.txt");//naming the file
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("file is created");
		}
		else {
			System.out.println("file already exists");
		}
		//to give the input to the file
		FileOutputStream fos=new FileOutputStream(file);
String s="i live in bangalore";
fos.write(s.getBytes());
	}

}
