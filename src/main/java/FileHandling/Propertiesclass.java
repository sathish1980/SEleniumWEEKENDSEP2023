package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesclass {

	String file = "C:\\Users\\sathishkumar\\eclipse-workspace\\FITASeleniumWeekEnd\\Inputfile\\Env.properties";
	
	public void Readdata() throws IOException
	{
		File F = new File (file);
		FileInputStream FI = new FileInputStream(F);
		Properties ps = new Properties();
		ps.load(FI);
		System.out.println(ps.getProperty("username"));
		System.out.println(ps.getProperty("age"));
		System.out.println(ps.getProperty("dob"));
		ps.setProperty("edu", "B.tech");
		System.out.println(ps.getProperty("edu"));
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Propertiesclass P = new Propertiesclass();
		P.Readdata();
	}

}
