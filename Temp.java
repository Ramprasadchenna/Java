package sample;
import java.io.*;
public class Temp {
	public static void main(String[] args)throws IOException 
		{
			File f1=new File("C:\\Users\\Dell\\ .eclipse");
			f1.createNewFile();
			System.out.println(f1.getName());
			System.out.println(f1.getAbsolutePath());
			System.out.println(f1.getPath());
			System.out.println(f1.canRead());
			System.out.println(f1.canWrite());
			System.out.println(f1.exists());
			System.out.println(f1.lastModified());
			System.out.println(f1.isFile());
		}

	}


