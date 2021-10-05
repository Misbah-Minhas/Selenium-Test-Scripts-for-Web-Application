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

public class TestMobileMenu {
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver =  new ChromeDriver();
	    baseUrl = "https://www.google.com/";
	    Dimension dimension = new Dimension(320, 638);
	    driver.manage().window().setSize(dimension);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	  }
	
	/*  @Test
	  public void testLogin() throws Exception {
	        JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");

	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-2\"]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"topcontrol\"]")).click();
	  
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-2\"]/ul/li[2]/a")).click();
	     
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-2\"]/ul/li[3]/a")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-2\"]/ul/li[4]/a")).click();
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-2\"]/ul/li[5]/a")).click();
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-2\"]/ul/li[6]/a")).click();

	  }*/
	  @Test
	  public void testNavMenuIcon() throws Exception {
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  driver.findElement(By.xpath("//*[@class=\"mh-btns-left\"]/a")).click();  
		//  driver.findElement(By.xpath("//*[@class=\"mh-btns-left\"]/a")).click();  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  driver.findElement(By.xpath("//*[@class=\"mh-text\"]/a")).click();  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		
		  driver.findElement(By.xpath("//*[@class=\"mh-btns-right\"]/a")).click();
		//  String ActualTitle211 = driver.findElement(By.xpath("//*[@id=\"mm-11\"]/div[1]/a")).getText();
		 // String ExpectedTitle211 = "General Setting";
		 // Assert.assertEquals(ExpectedTitle211, ActualTitle211);
		  
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
