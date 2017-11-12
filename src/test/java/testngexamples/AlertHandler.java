package testngexamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandler {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saransh.jain\\seleniumworkspace\\testng-demo\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();

		// Alert Message handling

		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		driver.findElement(By.name("cusid")).click();
		
		//driver.findElement(By.name("submit")).submit();
		enterTextKeyboard();
		//driver.findElement(By.name("submit")).submit();	
		
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
//		alert.dismiss();
		//alert.sendKeys("ABC");
		

		/*driver.findElement(By.name("cusid")).sendKeys("53920");					
		driver.findElement(By.name("submit")).submit();			

		// Switching to Alert
		Alert alert = driver.switchTo().alert();

		// Capturing alert message.    
		String alertMessage= driver.switchTo().alert().getText();		

		// Displaying alert message		
		System.out.println(alertMessage);	
		Thread.sleep(5000);

		// Accepting alert		
		alert.accept();*/		


	}
	
	public static void enterTextKeyboard() throws AWTException {
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		
		rb.keyPress(KeyEvent.VK_B);
		rb.keyRelease(KeyEvent.VK_B);
	}

}
