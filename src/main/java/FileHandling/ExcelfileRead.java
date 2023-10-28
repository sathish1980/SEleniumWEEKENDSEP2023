package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelfileRead {
	
	String filepath =System.getProperty("user.dir")+"//Input//SampleData.xls";
	
	public void ReadData() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FS = new FileInputStream(F);
		//XSSFWorkbook wbk = new XSSFWorkbook(FS);
		HSSFWorkbook wbk = new HSSFWorkbook(FS);
		Sheet sheet = wbk.getSheet("Login");
		int totalRows =sheet.getPhysicalNumberOfRows();
		for(int i=0;i<totalRows;i++)
		{
			Row row = sheet.getRow(i);
			int totalColumns = row.getLastCellNum();
			for(int j=0;j<totalColumns;j++)
			{
				Cell cell = row.getCell(j);
				System.out.print(GetData(cell));
				System.out.print("\t");
			}
			System.out.println("");
		}
	FS.close();
	}
	
	public Object GetData(Cell cellValue)
	{
		switch(cellValue.getCellType())
		{
		case STRING:
			return cellValue.getStringCellValue();
		case NUMERIC:
			DataFormatter DM= new DataFormatter();
			return DM.formatCellValue(cellValue);
		}
		return null;
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelfileRead E= new ExcelfileRead();
		E.ReadData();
	}

}
