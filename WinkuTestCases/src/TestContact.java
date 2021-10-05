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

public class TestContact {
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
		driver.get("http://localhost/Winku/contact.html");
	    driver.findElement(By.xpath("//*[@id=\"input\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("misbah");
		driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[2]/div/div/div/div/div/div[1]/form/div[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[2]/div/div/div/div/div/div[1]/form/div[2]/input")).sendKeys("misbah@yahoo.com");	
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[2]/div/div/div/div/div/div[1]/form/div[3]/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[2]/div/div/div/div/div/div[1]/form/div[3]/input")).sendKeys("051-4443466");
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[2]/div/div/div/div/div/div[1]/form/div[4]/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[2]/div/div/div/div/div/div[1]/form/div[4]/input")).sendKeys("TripleI");
	    driver.findElement(By.xpath("//*[@id=\"textarea\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"textarea\"]")).sendKeys("Plz give your link");
	
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[2]/div/div/div/div/div/div[1]/form/div[6]")).click();
	    assertEquals(driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div/div/div/div/div[2]/h1")).getText(), "Get In Touch");
	  }
	  @Test
	  public void testContactlinks() throws Exception {
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[2]/ul[1]/li[3]/span/a")).click();  
		  String ActualTitle21 = driver.findElement(By.xpath("//*[@id=\"cf-error-details\"]/div[1]/h1")).getText();
		  String ExpectedTitle21 = "Email Protection";
		  Assert.assertEquals(ExpectedTitle21, ActualTitle21);
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
