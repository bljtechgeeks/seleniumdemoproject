/*package com.manu.Selenium;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import org.omg.CORBA.LocalObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class ManuTestNgClass extends DriverFactory 
{
	
	
	@Parameters({ "browser" })
	@BeforeTest
	//(priority=2)
		  public void makeConnections(String browser) {
	//	DriverFactory df = new DriverFactory();  
		DriverFactory.selectBrowser("chrome");
		DriverFactory.selectBrowser("firefox");
	  
		DriverFactory.selectBrowser(browser);
	}
	
	static WebDriverWait chwait ;
	private static Logger log = Logger.getLogger(LocalObject.class);
	
	
	
	@BeforeTest
	public void bt()
	{
		DriverFactory.selectBrowser("chrome");
		chwait = new WebDriverWait(chDriver, 40 timeout in seconds);	
		//MyUtils myutils = new MyUtils();
		
		
	}
	
	@Test
	// (priority=2)
	public void actualcode() throws AWTException {
		chDriver.manage().window().maximize();
		chDriver.get("https://www.hdfcbank.com/");

		// chDriver.get("http://demo.guru99.com/selenium/delete_customer.php");
		// chDriver.findElement(By.name("submit")).click();
		if (MyUtils.isAlertPresent(chDriver)) {
			MyUtils.dismissAlert(chDriver, alert);
		}

		
		// closing the initial popup , which is not an alert
		chwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id = 'cee_closeBtn']/img[@alt = 'Close']")));
		chDriver.findElement(By.xpath("//div[@id = 'cee_closeBtn']/img[@alt = 'Close']")).click();
		
	
		Robot rb = new Robot();
		rb.mouseMove(15, 15);
		
		// click on the login button 
		chwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='homeloginbtn']")));
		chDriver.findElement(By.xpath("//a[@class='homeloginbtn']")).click();
		
		String currHandle = chDriver.getWindowHandle();
		
		Set<String> handlers = chDriver.getWindowHandles();
		handlers.remove(chDriver.getWindowHandle());
		for(String str: handlers) {
			chDriver.switchTo().window(str);
		}
		
		
		//continue to netbanking in 2nd handler
		chwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='container']/div[@class = 'pdtb25 text-center']/a[text()='Continue to NetBanking']")));
		chDriver.findElement(By.xpath("//div[@class='container']/div[@class = 'pdtb25 text-center']/a[text()='Continue to NetBanking']")).click();
		
		// logging in the customer id
		//chwait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@name = 'fldLoginUserId']")));
		chDriver.findElement(By.xpath("//span[@class='pwd_field']//input")).click
		chDriver.findElement(By.xpath("//span[@class='pwd_field']//input")).sendKeys("12345");
		//System.out.println(chDriver.getWindowHandle());
		
	}

	
	
	@Test
	  //(priority=2)
	  public void actualcode2() throws InterruptedException {
		  System.out.println("I AM THE ACTUAL CODE2");
		  ffDriver.get("https://www.google.co.in/");
		  Thread.sleep(10000);
		  ffDriver.navigate().to("https://paytm.com/");
	  }
	
	
}
*/