package Practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exceldatadriven {
	
public static void main(String[] args) throws IOException {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		
		FileInputStream file = new FileInputStream("E:\\Eclipsworkspace\\basic\\Excel\\datadriven.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int row = sheet.getLastRowNum();
		
		for(int i=1; i<=row;i++) {
			
			int principle=(int) sheet.getRow(i).getCell(0).getNumericCellValue();//return double need to change into int
			int rop = (int) sheet.getRow(i).getCell(1).getNumericCellValue();
			int period = (int) sheet.getRow(i).getCell(2).getNumericCellValue();
			String frequency =  sheet.getRow(i).getCell(3).toString();
			
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(String.valueOf(principle));
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(String.valueOf(rop));
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(String.valueOf(period));
			
			WebElement op = driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
			Select s = new Select(op);
			s.selectByVisibleText("month(s)");
			
			WebElement op2 = driver.findElement(By.xpath("//select[@id='frequency']"));
			Select s2 = new Select(op2);
			s2.selectByVisibleText(frequency);
			
			driver.findElement(By.xpath(".//*[@id='fdMatVal']/div[2]/a[1]/img")).click();
			
			String maturity = driver.findElement(By.xpath("//span[@id='resp_matval']/strong")).getText();
			
			System.out.println("Maturity rate for "+principle+" is "+maturity);
			
			driver.findElement(By.xpath(".//*[@id='fdMatVal']/div[2]/a[2]/img")).click();	
			
			
		}	
		
		driver.quit();
}

}
