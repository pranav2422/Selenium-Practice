package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiseautomation2 {
	
	// Hard assert

//	@Test
//	public void op() {
//         Assert.assertTrue(true);
//		System.out.println("hey 1");
//		Assert.assertTrue(false);
//		System.out.println("hey 2");
//
//	}
//	
//	@Test
//	public void op2() {
//		System.out.println("hey 3");
//	}
//
			
	// soft assert
	@Test
	public void op19() {
		SoftAssert soft = new SoftAssert();
		System.out.println("hey 1");
		soft.assertTrue(true);
		System.out.println("hey 2");
		soft.assertTrue(5==6);
		System.out.println("hey 3");
	}
	
	@Test
	public void op20() {
		SoftAssert soft2 = new SoftAssert();
		System.out.println("hey 4");
		soft2.assertTrue(true);
		System.out.println("hey 5");
		soft2.assertTrue(false);
		System.out.println("hey 6");
	}
}
