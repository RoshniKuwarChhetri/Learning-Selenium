package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file = new FileInputStream("C:\\Users\\HP\\OneDrive\\Documents");
	Workbook wb = WorkbookFactory.create(file);
	
	String value = wb.getSheet("Sheet2").getRow(16).getCell(5).getStringCellValue();
	System.out.println(value);
	wb.close();
    file.close();

}
}
