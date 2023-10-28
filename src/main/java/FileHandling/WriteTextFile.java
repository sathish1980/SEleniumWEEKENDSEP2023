package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class WriteTextFile {
	
	String filepath = System.getProperty("user.dir")+"\\Inputfile\\";
	String inputfilename="Sample.txt";
	String fileName = "output.txt";
	String name = "Welcome to FITA";
	
	public void writedata() throws IOException
	{
		File F = new File(filepath+fileName);
		FileOutputStream FS = new FileOutputStream(F);
		FS.write(name.getBytes());
		System.out.println("done");
	}
	
	public void writedatawithfileWriter() throws IOException
	{
		File F = new File(filepath+fileName);
		FileWriter FS = new FileWriter(F);
		FS.write(name);
		System.out.println("done");
	}

	public void ReadAndWrite() throws IOException
	{
		File F = new File (filepath+inputfilename);
		FileReader FI = new FileReader(F);
		//FileInputStream FI = new FileInputStream(F);
		BufferedReader BF = new BufferedReader(FI);
		File outFile = new File(filepath+fileName);
		FileWriter FS = new FileWriter(outFile);
		
		String i;
		while((i=BF.readLine())!=null)
		{
			FS.write(i);
			FS.write("\n");
		}
		FS.close();
		System.out.println("done");
	}
	
	public void copyfile() throws IOException
	{
		File SourseFile = new File(filepath+inputfilename);
		File destinationFile = new File(filepath+fileName);
		FileUtils.copyFile(SourseFile, destinationFile);
		System.out.println("Done");
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WriteTextFile W =new WriteTextFile();
		W.copyfile();
	}

}
