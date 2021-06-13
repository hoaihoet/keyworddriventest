package logingmail;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.junit.jupiter.api.Test;

public class ExcuteTestLoginGmail {
    @Test
    public void testLoginGmail() throws Exception {
        ReadFileTestCaseLoginGmail readFileTestCaseLoginGmail = new ReadFileTestCaseLoginGmail();
        UIOperationLoginGmail uiOperationLoginGmail = new UIOperationLoginGmail();

        Sheet sheet = readFileTestCaseLoginGmail.readFile("Sheet 1");
        int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            if(row.getCell(2).toString().length()!=0){
                uiOperationLoginGmail.perform(row.getCell(2).toString(), row.getCell(3).toString(), row.getCell(4).toString());
            }

        }
    }
}
