package sample;
import java.io.*;
public class Test1 {

	public static void main(String st[]) {
		try
		{
		File f=new File("pw2.java");
		@SuppressWarnings("resource")
		FileReader fin=new FileReader(new File("pwd1.txt"));
		FileWriter fout=new FileWriter(f);
		int i=0;
		while((i=fin.read())!=-1) {
			fout.write(i);
}
	fout.close();
		}
		catch(Exception e) {
			
		}
	
	}
}


