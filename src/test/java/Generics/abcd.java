package Generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import Constant.BaseTest;

public class abcd extends BaseTest{
	

	public static WebDriver aDriver;
    public static File src = new File(ExcelFilePath.excelInput);
    public static FileInputStream fs;
    public static XSSFWorkbook wb;
    public static XSSFSheet xs;
    public static FileOutputStream fo;

    public void CommonFunc() {
        aDriver = BaseTest.driver;
    }

    public String readFromExcel(int sheetno, int rowno, int cellno)
    {

        String data;
        try {
            fs = new FileInputStream(src);
            wb = new XSSFWorkbook(fs);
            xs = wb.getSheetAt(sheetno);
            data = xs.getRow(rowno).getCell(cellno).getStringCellValue();
        } catch (FileNotFoundException e) {
            System.out.println("File not Found!");
            throw e;
        }
        return data;
    }



}
