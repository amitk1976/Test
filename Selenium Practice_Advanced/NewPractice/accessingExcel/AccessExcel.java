package accessingExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AccessExcel {
	public static void main(String[] args) throws IOException {
		File src = new File("C:\\Users\\amit.kadam\\Desktop\\for Selenium.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		System.out.println(sheet.getSheetName());

		Iterator<Row> rowIterator = sheet.iterator();
		// rowIterator.next();
		rowIterator.next();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();

			Iterator<Cell> cell = row.cellIterator();

			while (cell.hasNext()) {

				Cell c = cell.next();

				System.out.println(c.getStringCellValue());

				if (c.getStringCellValue().equals("tuv")) {
					System.out.println("this is what i wanted");
				}
			}
		}
	}

}
