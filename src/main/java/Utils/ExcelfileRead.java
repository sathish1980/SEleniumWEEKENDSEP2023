package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelfileRead {

	String filepath =System.getProperty("user.dir")+"//Input//SampleData.xls";

	public Object[][] ReadData() throws IOException
	{
		Object[][] excelreadarray = null;

		File F = new File(filepath);
		FileInputStream FS = new FileInputStream(F);
		//XSSFWorkbook wbk = new XSSFWorkbook(FS);
		HSSFWorkbook wbk = new HSSFWorkbook(FS);
		Sheet sheet = wbk.getSheet("Login");
		int totalRows =sheet.getPhysicalNumberOfRows();
		Row row1 = sheet.getRow(1);
		int totalColumn = row1.getLastCellNum();

		excelreadarray =  new Object[totalRows][totalColumn];
		for(int i=0;i<totalRows;i++)
		{
			Row row = sheet.getRow(i);
			int totalColumns = row.getLastCellNum();
			for(int j=0;j<totalColumns;j++)
			{
				Cell cell = row.getCell(j);
				excelreadarray[i][j]=GetData(cell);

			}

		}
		FS.close();
		return excelreadarray;
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

}
