package firstPoject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;

//public class Db_validation {
//	public static void main(String[] args) throws SQLException {
//		
//		//step 1: to register driver.
//		Driver dr=new Driver();
//		DriverManager.registerDriver(dr);
//		
//		//step 2: to get connection for database.
//		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/crm", "root", "root");
//		
//		//step 3: to create statement.
//		Statement state=con.createStatement();
//		String query= "select * from games";
//		
//		//step 4: to execute query
//		ResultSet result = state.executeQuery(query);
//		while(result.next()) {
//			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
//		}
//		
//		//step 5: close database
//		con.close();
//	}
//}
//
//
//
//public class Db_validation {
//	public static void main(String[] args) throws SQLException {
//		Driver dr=new Driver();
//		DriverManager.registerDriver(dr);
//		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/crm", "root", "root");
//		Statement state=con.createStatement();
//		String query= "insert into games values('tuni','swimming',4),('gani','boxing',5)";
//		int result = state.executeUpdate(query);
//		String q2="select * from games";
//		ResultSet res=state.executeQuery(q2);
//		while(res.next()) {
//			System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getString(3));
//		}
//		con.close();
//	}
//}
//
//
//
//
//public class Db_validation {
//	public static void main(String[] args) throws SQLException {
//		Driver dr=new Driver();
//		DriverManager.registerDriver(dr);
//		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/crm", "root", "root");
//		Statement state=con.createStatement();
//		String query= "delete from games where subject='boxing'";
//		int result = state.executeUpdate(query);
//		String q2="select * from games";
//		ResultSet res=state.executeQuery(q2);
//		while(res.next()) {
//			System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getString(3));
//		}
//		con.close();
//	}
//}



//public class Db_validation {
//	public static void main(String[] args) throws SQLException  {
//		WebDriver x=new FirefoxDriver();
//		x.manage().window().maximize();
//		x.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		x.get("http://rmgtestingserver:8084/");
//		x.findElement(By.xpath("//input[@id='usernmae']")).sendKeys("rmgyantra");
//		x.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("rmgy@9999");
//		x.findElement(By.xpath("//button[.='Sign in']")).click();
//		x.findElement(By.xpath("//a[.='Projects']")).click();
//		x.findElement(By.xpath("//span[.='Create Project']")).click();
//		x.findElement(By.xpath("//input[@name='projectName']")).sendKeys("leadwave2_crm");
//		x.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("Prakash");
//	    WebElement web=	x.findElement(By.xpath("//select[@name='status' and @class='form-control']"));
//	    Select sel =new Select(web);
//	    sel.selectByValue("Created");
//		x.findElement(By.xpath("//input[@type='submit']")).click();
//		Driver d= new Driver();
//		DriverManager.registerDriver(d);
//		Connection con=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
//		Statement state=con.createStatement();
//		String str="select * from project where lower(project_name)='leadwave2_crm'";
//		ResultSet rs=state.executeQuery(str);
//		System.out.println(rs.getMetaData());
//		while(rs.next()) {
//			String st=rs.getString(4);
//			if(st.equals("leadwave2_crm")) {
//				System.out.println("data is present");
//			}
//			else {
//				System.out.println("data is not present");
//			}
//		}
//		con.close();
//	}
//}


//class Db_validation{
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		FileInputStream f=new FileInputStream(".\\src\\test\\resources\\Book 4.xlsx");
//		Workbook w=WorkbookFactory.create(f);
//		Sheet s= w.getSheet("sheet1");
//		try {
//		int rowcount=s.getLastRowNum();
//		int cellcount=s.getRow(0).getLastCellNum();
//		System.out.println(rowcount);
//		System.out.println(cellcount);
//		for(int i=0;i<=rowcount;i++) {
//			String str=s.getRow(i).getCell(0).getStringCellValue();
//			String str2=s.getRow(i).getCell(1).getStringCellValue();
//			System.out.println(str+"--->"+str2);
//		}
//		System.out.println();
//		}
//		catch(Exception e) {
//			
//		}
//	}
//}



//class Db_validation{
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		FileInputStream f=new FileInputStream(".\\src\\test\\resources\\Book 4.xlsx");
//		Workbook w=WorkbookFactory.create(f);
//		Sheet s= w.getSheet("sheet1");
//		try {
//		int rowcount=s.getLastRowNum();
//		int cellcount=s.getRow(0).getLastCellNum();
//		System.out.println(rowcount);
//		System.out.println(cellcount);
//		for(int i=0;i<=rowcount;i++) {
//			for(int j=0;j<cellcount;j++)
//		{
//			String value=s.getRow(i).getCell(j).getStringCellValue();
//			System.out.print(value+" ");
//		}
//			System.out.println(" ");
//		}
//		}
//		catch(Exception e) {
//			
//		}
//}
//}



class Db_validation{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Book 4.xlsx");
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet("sheet2");
		s.createRow(4).createCell(0).setCellValue("boiii");
		s.createRow(5).createCell(2).setCellValue("hakrooooo");
		FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Book 4.xlsx");
		w.write(fos);
		w.close();
	}
}



//class Db_validation{
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Book8.xlsx");
//		Workbook w=WorkbookFactory.create(fis);
//		Sheet s=w.getSheet("Sheet2");
//		int row=s.getLastRowNum();
//		int cells=s.getRow(0).getLastCellNum();
//		String exp_data="kgf";
//		for(int i=0;i<=row;i++) {
//			String sb=s.getRow(i).getCell(0).getStringCellValue();
//			if(sb.equalsIgnoreCase(exp_data))
//				for(int j=0;j<cells;j++) {
//                  String ab= s.getRow(i).getCell(j).getStringCellValue();
//					System.out.print(ab+" ");
//				}
//			}
//		}
//	}
















