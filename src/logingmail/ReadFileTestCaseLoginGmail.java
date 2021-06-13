package logingmail;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileTestCaseLoginGmail {
    public Sheet readFile(String sheetName) throws IOException {
        File file = new File("LoginGmail.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheetFile = workbook.getSheet(sheetName);
        return sheetFile;
    }

}
