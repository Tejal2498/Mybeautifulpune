package DataDriventesting;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteDatatoExcel {
@Test
public void dataToExcel() {
FileInputStream	 fis=new FileInputStream("")//put location of excel file
Workbook wb = WorkbookFactory.create(fis);
Sheet sheet =wb.getSheet("Sheet1");
Row row = sheet.getRow(0);
Cell cell = row.createCell(2);
cell.setCellType(CellType.STRING);
cell.setCellValue("Qspider");
FileOutputStream fos=new FileOutputStream("")//here also put same location of line number17
wb.write(fos);
wb.close();
}
}
