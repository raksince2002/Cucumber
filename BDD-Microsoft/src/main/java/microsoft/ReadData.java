package microsoft;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	String filepath="./TestData/testdata.xlsx";
	
	public int ReadExpectedCount() throws IOException {
		
		FileInputStream f = new FileInputStream(filepath);
		Workbook wb = new XSSFWorkbook(f);
		Sheet sh = wb.getSheetAt(0);
		
		int cell = 0; 
		int row = 1;
		
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		
		return (int) c.getNumericCellValue();
	}
	
}
