package keyworddriven;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.junit.jupiter.api.Test;

public class ExcuteTest {
    @Test
    public void testSearch() throws Exception {
        ReadFile readFile = new ReadFile();
        UIOperation uiOperation = new UIOperation();

        Sheet sheet = readFile.readFile("Sheet 1");
        int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            if(row.getCell(2).toString().length()!=0){
                uiOperation.perform(row.getCell(2).toString(), row.getCell(3).toString(), row.getCell(4).toString());
            }

        }
    }
}