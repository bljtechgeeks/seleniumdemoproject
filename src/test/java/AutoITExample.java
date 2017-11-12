import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITExample {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		setup();
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		jse.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.id("photo")).click();
		uploadFileUsingAutoIT();

	}
	
	public static void uploadFileUsingAutoIT() throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec("C:\\Users\\saransh.jain\\seleniumworkspace\\BLJT-Demo\\autoIT\\uploadfile.exe");
		
	}
	public static void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saransh.jain\\seleniumworkspace\\testng-demo\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
	}

}
