package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	String filepath = System.getProperty("user.dir")+"//Output//OutputData.xlsx";
	String[] course = {"Python","java","C#","Mysql"};

	public void WriteData() throws IOException
	{
		File F = new File(filepath);
		FileOutputStream FS = new FileOutputStream(F);
		XSSFWorkbook wbk = new XSSFWorkbook();
		//HSSFWorkbook wbk = new HSSFWorkbook();
		Sheet sheet = wbk.createSheet("Login");
		
		for(int i=0;i<course.length;i++)
		{
			Row eachRow = sheet.createRow(i);	
			Cell eachCell = eachRow.createCell(i);
			eachCell.setCellValue(course[i]);
		}
		wbk.write(FS);
		wbk.close();
		System.out.println("Its done");
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelWrite E = new ExcelWrite();
		E.WriteData();
	}

}
