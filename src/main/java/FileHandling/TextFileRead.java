package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileRead {
	
	String filepath = "C:\\Users\\sathishkumar\\eclipse-workspace\\FITASeleniumWeekEnd\\Inputfile\\";
	String filename = "Sample.txt";
	
	public void Readdata() throws IOException
	{
		File F = new File (filepath+filename);
		FileInputStream FI = new FileInputStream(F);
		
		int i;
		while((i=FI.read())!=-1)
		{
		System.out.print((char)i);
		}
	}
	
	public void ReaddatawithFileReader() throws IOException, InterruptedException
	{
		File F = new File (filepath+filename);
		FileReader FI = new FileReader(F);
		
		int i;
		while((i=FI.read())!=-1)
		{
		System.out.print((char)i);
		Thread.sleep(500);
		}
	}
	
	public void ReaddatawithBufferedReader() throws IOException, InterruptedException
	{
		int count=0;
		File F = new File (filepath+filename);
		FileReader FI = new FileReader(F);
		//FileInputStream FI = new FileInputStream(F);
		BufferedReader BF = new BufferedReader(FI);
		String i;
		while((i=BF.readLine())!=null)
		{
		System.out.println(i);
		String[] splitedvalue = i.split(" ");
		for(String eachvalue: splitedvalue)
		{
			if(eachvalue.equalsIgnoreCase("FITA"))
			{
				count=count+1;
			}
		}
		Thread.sleep(500);
		}
		System.out.println("The keyword fita is available " + count+ " "
				+ "times");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		TextFileRead T = new TextFileRead();
		T.ReaddatawithBufferedReader();
	}

}
