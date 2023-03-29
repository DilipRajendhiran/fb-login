package orgmav;


import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import demo.Base;
import demo.Base1;


public class Auto extends Base {
	
	public static Base1 b;
	public static Sheet s;
	/*@BeforeClass
	public static void launch() throws IOException {
		browLanuch("chrome");
		b = new Base1();
		 s = getSheet("C:\\Users\\ELCOT\\eclipse-workspace\\orgmav\\Excel2\\Data.xlsx", "data");
		
	}
	
	@Test
	public void tc1() throws InterruptedException {
		url("https://www.facebook.com/");
		b.getuser().sendKeys(excelRead(s, 0, 0));
		b.getpass().sendKeys(excelRead(s, 1,0));
		b.getlog().click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().refresh();
		b.getuser().sendKeys(excelRead(s, 0, 1));
		b.getpass().sendKeys(excelRead(s, 1,1));
		b.getlog().click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().refresh(); 
		
		
	}*/



	@BeforeClass
	@Test
	public static void browMethod() throws IOException {
		browLanuch("chrome");
		url("https://www.facebook.com/");
		b = new Base1();
		 s = getSheet("C:\\Users\\ELCOT\\eclipse-workspace\\orgmav\\Excel2\\Data.xlsx", "data");
		
	}
	
	
	
	
	
	
	@Test(priority= -10)
	public void p() throws IOException, InterruptedException {
		
			
			b.getuser().sendKeys(excelRead(s, 1, 2));
			b.getpass().sendKeys(excelRead(s,0, 1));
			driver.navigate().back();
			driver.navigate().refresh();
			Thread.sleep(1000);
			}
	@Test(priority=-5,dependsOnMethods={"p"},alwaysRun=true)
	public void a() throws IOException, InterruptedException {
		b.getuser().sendKeys(excelRead(s, 1, 0));
		b.getpass().sendKeys(excelRead(s,1, 1));
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(1000);

	}
	
	@Test(priority=1)
	public void d() throws IOException, InterruptedException {
		b.getpass().sendKeys(excelRead(s,2, 1));
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(1000);

	}
	



}




/*browLanuch("chrome", "https://www.amazon.in/");
Sheet sheet = getSheet("C:\\Users\\ELCOT\\eclipse-workspace\\orgmav\\Excel2\\Amazon.xlsx", "Sheet1");
String excelRead = excelRead(sheet, 0, 0);
sendData("id", "twotabsearchtextbox",excelRead);
click("id", "nav-search-submit-button");
click("xpath", "(//div[@data-index])[4]//a");
window(1);
click("id","add-to-cart-button" );
screen("C:\\Users\\ELCOT\\eclipse-workspace\\orgmav\\src\\main//screenshot.amazon.png");

browLanuch("edge","https://www.amazon.in/");
Sheet sheet1 = getSheet("C:\\Users\\ELCOT\\eclipse-workspace\\orgmav\\Excel2\\Amazon.xlsx", "Sheet1");
String excelRead1= excelRead(sheet1, 0, 1);
sendData("id", "twotabsearchtextbox",excelRead1);
click("id", "nav-search-submit-button");
click("xpath", "//div[@class='a-section aok-relative s-image-fixed-height']");
window(1);
click("id","add-to-cart-button" );
screen("C:\\Users\\ELCOT\\eclipse-workspace\\orgmav\\src\\main//screenshot.amazon.png");

*/