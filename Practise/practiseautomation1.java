package Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiseautomation1 {
	
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		// for dropdown
		
//	driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
//	
//	WebElement op = driver.findElement(By.xpath("//select[@id='first']"));
//	Select s = new Select(op);
//	s.selectByVisibleText("Iphone");
//	
//	List <WebElement> a = s.getOptions();
//	for(WebElement o: a) {
//		System.out.println(o.getText());
//	}
		
		
		// for checkbox
		
//		driver.get("https://itera-qa.azurewebsites.net/home/automation");
//		
//		List <WebElement> aa = driver.findElements(By.xpath("//input[contains(@id,'day')]"));
//		
//		for(WebElement op : aa) {
//			System.out.println(op.getAttribute("id"));
//			if(op.getAttribute("id").equals("saturday") || op.getAttribute("id").equals("friday")) {
//				op.click();
//			}else {
//				System.out.println("no element found");
//			}
//		}
//	
		
		// for window handle
	//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
//		
//		Set<String> wid = driver.getWindowHandles();
//		
//		List<String> wndid = new ArrayList<String>(wid);
//		
//		String firstid = wndid.get(0);
//		String sndid = wndid.get(1);
//		
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pranav");
//		
//		driver.switchTo().window(sndid);
//		
//		driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("euuuuuuu");
		

		//allow notification
		
		//		ChromeOptions op = new ChromeOptions();
//		op.addArguments("--disable-notifications");
//		driver.get("https://www.redbus.in/");
		
		
//	iframe
		
driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	
		
		
	
		
		
	}

}
