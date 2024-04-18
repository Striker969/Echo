package gen_utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_data {
	public Workbook w=null;
	public String readdatafromexcel(String sheetname,int rowno,int cellno) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(Sites_and_data.excelpath);
		w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheetname);
		String value=s.getRow(rowno).getCell(cellno).getStringCellValue();
		return value;
	}
	public int gettotalrowcount(String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(Sites_and_data.excelpath);
		w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheetname);
		int rowcount=s.getLastRowNum();
		return rowcount;
	}
	public int gettotalcellcount(String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(Sites_and_data.excelpath);
		w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheetname);
		int rowcount=s.getLastRowNum();
		return rowcount;
	}
	public void writedataintoexcel(String sheetname,int rowno,int cellno,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(Sites_and_data.excelpath);
		w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheetname);
		s.createRow(rowno).createCell(cellno).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(Sites_and_data.excelpath);
		w.write(fos);
	}
	public HashMap<String, String> readmultipledata(String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(Sites_and_data.excelpath);
		w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet(sheetname);
		int rowcount=s.getLastRowNum();
		HashMap< String, String> map=new HashMap<String, String>();
		for(int i=0;i<=rowcount;i++) {
			String key=s.getRow(i).getCell(0).getStringCellValue();
			String value=s.getRow(i).getCell(1).getStringCellValue();
			map.put(key, value);
		}
		return map;
	}
	public void closeexcel() throws IOException {
		w.close();
	}
}



























