import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablesAndDynamicXpath {
	static WebDriver driver;

	public static void main(String[] args) {
		setup();
		//intercatWithWebTable();
		dynamicXpath();
		//tearDown();
	}

	public static void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\saransh.jain\\seleniumworkspace\\testng-demo\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-table");
	}

	/*Get the value from cell ‘Dubai’ and print it on the console
	Click on the link ‘Detail’ of the first row and last column*/
	public static void intercatWithWebTable() {

		
		WebDriverWait wt = new WebDriverWait(driver, 30);
		//wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/td[2]")));
		//Here we are storing the value from the cell in to the string variable//*[@id="content"]/table/tbody/tr[1]/td[2]
		//String sCellValue = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/td")).getText();
		System.out.println( driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/td[2]")).getText());
		
		
		/*List<WebElement> lb = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/td"));
		int noOfCols = lb.size();//size = 5
		for(int j =1;j<=noOfCols;j++) {
			String dynamicxpath = "//table[@class='tsc_table_s13']/tbody/tr[1]/td[" + j + "]";
			driver.findElement(By.xpath(dynamicxpath)).getText();
		}*/
		
		

		// Here we are clicking on the link of first row and the last column
		driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
		System.out.println("Link has been clicked otherwise an exception would have thrown");
	}

	public static void tearDown() {
		driver.quit();
	}

	/*Get the value from cell ‘Dubai’ with using dynamic xpath
	Print all the column values of row ‘Clock Tower Hotel’*/
	public static void dynamicXpath() {
		String sRow = "1";
		String sCol = "2";

		//Here we are locating the xpath by passing variables in the xpath
	/*	String sCellValue = driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[" + sRow + "]/td[" + sCol + "]")).getText();
		System.out.println(sCellValue);*/
		String sRowValue = "Clock Tower Hotel";

		//First loop will find the 'ClOCK TWER HOTEL' in the first column
		for (int i=1;i<=5;i++){
			String sValue = null;
			sValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/th")).getText();
			if(sValue.equalsIgnoreCase(sRowValue)){
				// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
				for (int j=1;j<=5;j++){
					String sColumnValue= driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/td["+ j +"]")).getText();
					System.out.println(sColumnValue);
				}
				break;
			}
		}
	}
}
