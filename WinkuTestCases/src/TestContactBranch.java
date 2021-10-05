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
import org.junit.Before;
import org.junit.Test;

public class TestContactBranch {
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
	  /* @Test
	  public void testLogin() throws Exception {
	driver.get("file:///C:/xampp/htdocs/MutationTesting/ApplicationUnderTest/Winku/contact-branches.html");
	
	    driver.findElement(By.xpath("//*[@id=\"input\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("misbah");
		

		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("misah@yahoo.com");
		
		
	    driver.findElement(By.xpath("//*[@id=\"phoneNumber\"]")).clear();
	    driver.findElement(By.xpath("//*[@id=\"phoneNumber\"]")).sendKeys("MicroSofft");
	    
	    driver.findElement(By.xpath("//*[@id=\"textarea\"]")).clear();
	    driver.findElement(By.xpath("//*[@id=\"textarea\"]")).sendKeys("Edit My address");
	   
	    driver.findElement(By.xpath("//*[@name=\"submit\"]")).click();
	    assertEquals(driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText(), "Janice Griffith");
	  } */
	  @Test
	  public void testEmailLinks() throws Exception {
		  driver.get("file:///C:/xampp/htdocs/MutationTesting/ApplicationUnderTest/Winku/contact-branches.html");
	
	     // driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div/div[1]/div/div[1]/ul/li[3]/span/a")).click();
		  assertEquals(driver.findElement(By.xpath("//*[@id=\\\"cf-error-details\\\"]/div[1]/h1")).getText(), "Email Protection");
		  //driver.get("file:///C:/xampp/htdocs/MutationTesting/ApplicationUnderTest/Winku/contact-branches.html");
		  //driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div/div[1]/div/div[2]/ul/li[3]/span/a")).click();
		  //assertEquals(driver.findElement(By.xpath("//*[@id=\\\"cf-error-details\\\"]/div[1]/h1")).getText(), "Email Protection");
		  //driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div/div[1]/div/div[3]/ul/li[3]/span/a")).click();
		  //assertEquals(driver.findElement(By.xpath("//*[@id=\\\"cf-error-details\\\"]/div[1]/h1")).getText(), "Email Protection");
		  
		  
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
