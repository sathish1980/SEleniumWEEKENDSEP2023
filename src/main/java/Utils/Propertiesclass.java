package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesclass {

	static String  file = System.getProperty("user.dir")+"\\Env\\environment.properties";

	public static Properties Readdata() throws IOException
	{
		File F = new File (file);
		FileInputStream FI = new FileInputStream(F);
		Properties ps = new Properties();
		ps.load(FI);
		return ps;
	}
}
