package testngexamples;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestNGDemo {
  @Test
  public void execute() {
	  System.out.println("EXECUTE METHOD");
	  Assert.fail();
  }
  @Test
  public void execute1() {
	  System.out.println("EXECUTE METHOD");
	  Assert.assertEquals(true, true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BEFORE METHOD");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AFTER METHOD");
  }

}
