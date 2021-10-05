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

public class TestSearchFriend {
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
		driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		//=============================Test Account settings===========================================//
		
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[3]/ul/li[1]/a")).click();
	    
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/ul[1]/li[3]")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/ul[1]/li[3]/ul/li[2]/a")).click();
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[3]/ul/li[3]/a")).click();
	    
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[3]/ul/li[4]/a")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[3]/ul/li[5]/a")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[3]/ul/li[6]/a")).click();
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[3]/ul/li[7]/a")).click();
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[3]/ul/li[8]/a")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[3]/ul/li[9]/a")).click();
	    
	    
	    //======================test more pages================================================================//
	 
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[4]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[4]/ul/li[1]/a")).click();
	  
	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[4]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[4]/ul/li[2]/a")).click();
	    
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[4]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[4]/ul/li[3]/a")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[4]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[4]/ul/li[4]/a")).click();
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[4]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[4]/ul/li[4]/a")).click();
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[4]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[4]/ul/li[5]/a")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[4]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[4]/ul/li[6]/a")).click();
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[4]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[1]/li[4]/ul/li[7]/a")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[2]/li[2]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[1]/a")).click();
	  
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
