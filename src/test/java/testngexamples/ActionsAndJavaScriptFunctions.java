package testngexamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.velocity.texen.util.FileUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsAndJavaScriptFunctions {

	static WebDriver driver;

	public static void main(String[] args) throws Exception{
		setup();

		/*WebElement contactUs = driver.findElement(By.xpath("//a[text()='24x7 Customer Care']"));
		ClickActions(driver, contactUs);*/

		/*WebElement searchBox = driver.findElement(By.name("q"));
		SendKeysActions(driver,searchBox,"Perfumes");*/

		/*WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		ClickAndholdActions(driver, electronics);*/

		/*//WebElement sell = driver.findElement(By.cssSelector("a._2k0gmP"));
		WebElement sell = driver.findElement(By.name("q"));
		ContextClickActions(driver, sell);*/
		
		/*WebElement dblClickButton = driver.findElement(By.xpath("//input[@class='Automation']"));
		doubleClickActions(driver, dblClickButton);
		System.out.println("CODE COMPLETE");*/

		/*mousehoverActions(driver, electronics);*/
		
		/*WebElement logo = driver.findElement(By.xpath("//img[@src='//img1a.flixcart.com/www/linchpin/fk-cp-zion/img/fk-logo_9fddff.png']"));
		RightClickAndkeyDownActions(driver, logo);*/
		
	/*WebElement fromElement = driver.findElement(By.xpath("//span[@id='qbi']"));
	WebElement toElement = driver.findElement(By.xpath("//div[@id='targetDiv']"));
	dragAndDropActions(driver, fromElement, toElement);*/
	//dragAndDropActions(driver, fromElement);
		//scrollJavascript(driver);
		takeScreenshot(driver);

	}
	public static void ClickActions(WebDriver driver, WebElement wb) {
		Actions act = new Actions(driver);
		//driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		/*act. click(wb).build().perform();*/
		Actions act1 = act.click(wb);
		Action act2 = act1.build();
		act2.perform();
	}
	public static void SendKeysActions(WebDriver driver, WebElement wb, String text) {
		Actions act = new Actions(driver);
		act.sendKeys(wb,text).build().perform();
	}
	public static void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saransh.jain\\seleniumworkspace\\testng-demo\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.navigate().to("http://artoftesting.com/sampleSiteForSelenium.html");
		driver.get("http://www.flipkart.com");
		/*WebDriverWait wt = new WebDriverWait(driver, 20);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/assets/images/close.png']")));*/
	}
	public static void ClickAndholdActions(WebDriver driver, WebElement wb) {
		Actions act = new  Actions(driver);
		act.clickAndHold(wb).build().perform();
	}
	public static void ContextClickActions(WebDriver driver, WebElement wb) {
		Actions act = new  Actions(driver);
		act.contextClick(wb).build().perform();
	}
	public static void doubleClickActions(WebDriver driver, WebElement wb) {
		Actions act = new  Actions(driver);
		//act.doubleClick(wb).build().perform();
		act.moveToElement(wb).doubleClick().build().perform();
	}
	public static void mousehoverActions(WebDriver driver, WebElement wb) {
		Actions act = new  Actions(driver);
		act.moveToElement(wb).build().perform();
	}
	public static void RightClickAndkeyDownActions(WebDriver driver, WebElement wb) throws AWTException {
		Actions act = new  Actions(driver);
		 act.contextClick(wb).build().perform();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	public static void dragAndDropActions(WebDriver driver, WebElement src, WebElement tgt) throws AWTException, InterruptedException {
		Actions act = new  Actions(driver);
		 act.dragAndDrop(src,tgt).build().perform();
		/*act.dragAndDropBy(src, 500, 100);*/
	}
	
	public static void scrollJavascript(WebDriver driver) throws AWTException, InterruptedException {
		
		
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		jse.executeScript("window.scrollBy(800,5000)", "");
		/* Click using java script
		WebElement element = driver.findElement(By.xpath("//div[@id='targetDiv']"));
		jse.executeScript("arguments[0].click();", element);
		//Send keys using java script
		jse.executeScript("document.getElementById('elementID').setAttribute('value', 'abc')","");*/
	}
	
	public static void takeScreenshot(WebDriver driver) throws IOException {
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File shot = scrShot.getScreenshotAs(OutputType.FILE);
		 File finalfile=new File("FailureScreenshots/target.jpeg");
		 FileUtils.copyFile(shot, finalfile);
	}
}
