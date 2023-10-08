package Practise;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class screenshottake {
	
public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/");
		

		
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
			try {
				FileUtils.copyFile(f, new File(".\\screenshot\\homepage.png"));// add ss here only .// give present directory
				//FileUtils.copyFile(f, new File("E:\\Eclipsworkspace\\basic\\screenshot\\homepage.png"));
				// to give location by foldrwise for same path -- go to folder in file manager copy path
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		
		System.out.println("done");
		
	driver.close();	
		
		
}

}
