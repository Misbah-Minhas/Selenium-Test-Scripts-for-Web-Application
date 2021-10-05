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

public class TestNotifications {
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver =  new ChromeDriver();
	    baseUrl = "https://www.google.com/";
	    Dimension dimension = new Dimension(420, 638);
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	  }
	  @Test
	  public void testLogin() throws Exception {
	        

		driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");

		
		driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[2]/li[3]")).click();  
		String numberofNotifications=driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[2]/li[3]/div/span")).getText();
		Assert.assertEquals(numberofNotifications, "4 New Notifications");
		/*===================check notification--------------------------------------------------*/
		 driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[2]/li[3]/div/ul/li[1]/a")).click();  
		 
		 	String tag1=driver.findElement(By.xpath("//*[@class=\"tag green\"]")).getText();
			Assert.assertEquals(tag1, "New");
			
		 driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[2]/li[3]/div/ul/li[2]/a")).click();  
		 String tag2=driver.findElement(By.xpath("//*[@class=\"tag red\"]")).getText();
			Assert.assertEquals(tag2, "Reply");
		 driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[2]/li[3]/div/ul/li[3]/a")).click(); 
		 String tag3=driver.findElement(By.xpath("//*[@class=\"tag blue\"]")).getText();
			Assert.assertEquals(tag3, "Unseen");
		 driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[2]/li[3]/div/ul/li[4]/a")).click();  
		 String tag4=driver.findElement(By.xpath("//*[@class=\"tag\"]")).getText();
			Assert.assertEquals(tag4, "New");
		 driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[2]/li[3]/div/ul/li[5]/a")).click();
		 String tag5=driver.findElement(By.xpath("//*[@class=\"tag\"]")).getText();
			Assert.assertEquals(tag5, "New");
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/ul[2]/li[3]/div/a")).click();  
	    /*--------------------------------chheck msg==================================================*/
		/*
			driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[2]/li[4]/a")).click();  
			String numberofmsg=driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[2]/li[4]/div/span")).getText();
			Assert.assertEquals(numberofmsg, "5 New Messages");

		 
		 /*driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[2]/li[4]/div/ul/li[1]/a")).click();  
		  * String tag1=driver.findElement(By.xpath("//*[@class=\"tag green\"]")).getText();
			Assert.assertEquals(tag1, "New");
		  
		 driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[2]/li[4]/div/ul/li[2]/a")).click();  
		  String tag2=driver.findElement(By.xpath("//*[@class=\"tag red\"]")).getText();
			Assert.assertEquals(tag2, "Reply");
		 driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[2]/li[4]/div/ul/li[3]/a")).click(); 
		  String tag3=driver.findElement(By.xpath("//*[@class=\"tag blue\"]")).getText();
			Assert.assertEquals(tag3, "Unseen"); 
		 driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[2]/li[4]/div/ul/li[4]/a")).click(); 
		  String tag4=driver.findElement(By.xpath("//*[@class=\"tag\"]")).getText();
			Assert.assertEquals(tag4, "New"); 
		 driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[2]/li[4]/div/ul/li[5]/a")).click();  
		 	Assert.assertEquals(tag5, "New");
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/ul[2]/li[3]/div/a")).click(); 
		 driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[2]/div[2]/ul[2]/li[4]/div/a")).click(); */
		 //====================Test Email Protection=======================================================//
		/*
	     driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[2]/div/div/div/div/div/div[2]/ul[1]/li[3]/span/a")).click();
	     String emailmsg=driver.findElement(By.xpath("//*[@id=\"cf-error-details\"]/div[1]/h1")).getText();
		  Assert.assertEquals(numberofNotifications, "Email Protection");
	     
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  
		  driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[1]/div/div/div/a")).click();
		  String mymsg=driver.findElement(By.xpath("//*[@id=\"cf-error-details\"]/div[1]/h1")).getText();
		  Assert.assertEquals(numberofNotifications, "Email Protection");
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  */
		  
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
