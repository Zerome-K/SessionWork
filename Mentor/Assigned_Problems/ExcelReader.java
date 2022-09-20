package mentorAssignment;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class ExcelReader {

    public static void main(String[] args) {

        try {

            File file = new File("E:\\sampledatafoodsales\\sampledatafoodsales.xlsx");

            FileInputStream fr = new FileInputStream(file);


            XSSFWorkbook wb = new XSSFWorkbook(fr);
            XSSFSheet sheet = wb.getSheetAt(0);

            Iterator<Row> iter = sheet.iterator();

            while(iter.hasNext()){

                Row row = iter.next();

                Iterator<Cell> cell = row.cellIterator();

                while(cell.hasNext()){

                    Cell c = cell.next();

                    switch (c.getCellType()){

                        case NUMERIC:
                            System.out.print(c.getNumericCellValue() + "t");
                            break;

                        case STRING:
                            System.out.print(c.getStringCellValue() + "t");
                            break;
                    }
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}