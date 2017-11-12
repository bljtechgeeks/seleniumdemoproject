import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

public class DemoLogging{


	public static void main(String[] args) {

		// Log.info("I AM INFO METHOD FROM XML");

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saransh.jain\\seleniumworkspace\\testng-demo\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		/*Logger log = Logger.getLogger("BLJtechGeeksApplicationLogs");*/

		driver.get("http://healthunify.com/bmicalculator/");
		Log.startTestCase("Test CAse1");
		Log.info("I AM INFO METHOD FROM XML");
		/*//log.info("opening webiste");*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Log.info("I AM INFO METHOD FROM XML");
		/*//log.info("entring weight");*/
		driver.findElement(By.name("wg")).sendKeys("87");
		Log.info("I AM INFO METHOD FROM XML");
		//log.info("selecting kilograms");
		driver.findElement(By.name("opt1")).sendKeys("kilograms");
		Log.info("I AM INFO METHOD FROM XML");
		//log.info("selecting height in feet");
		driver.findElement(By.name("opt2")).sendKeys("5");
		Log.info("I AM INFO METHOD FROM XML");
		//log.info("selecting height in inchs");
		driver.findElement(By.name("opt3")).sendKeys("10");
		Log.info("I AM INFO METHOD FROM XML");
		/*log.error("Clicking on calculate");*/
		driver.findElement(By.name("cc")).click();
	}
}
