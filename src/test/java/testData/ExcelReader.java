package testData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {


    public void excelConnection() throws IOException {

            FileInputStream fis = new FileInputStream("C:\\Users\\dpate\\Selenium1\\src\\test\\ExternalFiles\\SpreadSheet.xlsx");
            XSSFWorkbook workbook= new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("sheet1");

            int rowNumber = sheet.getPhysicalNumberOfRows();
            System.out.println(rowNumber);

            int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
            System.out.println(columnCount);
        }

        public static void main(String[] args) throws IOException {
            testData.ExcelReader excel = new testData.ExcelReader();
            excel.excelConnection();
        }

    }


