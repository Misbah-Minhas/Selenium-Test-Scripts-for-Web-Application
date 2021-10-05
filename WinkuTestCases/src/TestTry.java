import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTry {
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver =  new ChromeDriver();
	    baseUrl = "https://www.google.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  @Test
	  public void testLogin() throws Exception {
		driver.get("C:\\Users\\DELL\\Downloads\\Model-Base-Try\\Model-Base-Try\\New\\WebPage.html");
			driver.findElement(By.id("name")).clear();
			driver.findElement(By.id("name")).sendKeys("misbah");
			
			
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys("misbah@yahoo.com");
			
			
			driver.findElement(By.id("contact")).clear();
			driver.findElement(By.id("contact")).sendKeys("9278392749");
		
			driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
			
			
			driver.findElement(By.name("male")).click();
			
			
			 assertEquals(driver.findElement(By.xpath("/html/body/h1")).getText(), "Hello Pakistan");
			
			
		
	  }
	  
	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	     // fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
}
