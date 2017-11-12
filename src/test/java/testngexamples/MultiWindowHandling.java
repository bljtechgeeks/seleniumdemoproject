package testngexamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiWindowHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		handleAlert();

		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\saransh.jain\\seleniumworkspace\\testng-demo\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.hdfcbank.com");
		//driver.findElement(By.xpath("//img[@src='/assets/images/close.png']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@id='loginsubmit']")).click();*/
/*		Set<String> totalWindows =driver.getWindowHandles();
		System.out.println(totalWindows);
		totalWindows.remove(driver.getWindowHandle());
		for(String str: totalWindows) {
			driver.switchTo().window(str);
			
		}
		//driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		WebDriverWait wt = new WebDriverWait(driver, 20);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='container']/div[@class='pdtb25 text-center']/a")));*/
		driver.findElement(By.xpath("//div[@class='container']/div[@class='pdtb25 text-center']/a")).click();
		driver.switchTo().defaultContent();
		//(driver.findElements(By.xpath("//div[@class='pdtb25 text-center']/a")))[0];
	}
	
	
	public static void handleAlert() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saransh.jain\\seleniumworkspace\\testng-demo\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.hdfcbank.com");
		WebDriverWait wt = new WebDriverWait(driver, 20);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/assets/images/close.png']")));
		driver.findElement(By.xpath("//img[@src='/assets/images/close.png']")).click();
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='loginsubmit']")));
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//a[@id='loginsubmit']")).click();
		Set<String> handlers = driver.getWindowHandles();
		handlers.remove(driver.getWindowHandle());
		for(String str: handlers) {
			driver.switchTo().window(str);
		}
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println("FUNCTION FINISHED");
		}
	
	

}
