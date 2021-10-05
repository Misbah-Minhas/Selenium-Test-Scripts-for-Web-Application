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

public class EditProfileBasics {
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
		driver.get("http://localhost/MutationTesting/applicationUnderTest/Winku/edit-profile-basic.html");
	    driver.findElement(By.xpath("//*[@id=\"input\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("misbah");
		
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("minhas");	
		
		
		
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("misbah@yahoo.com");
	    
	    driver.findElement(By.xpath("//*[@id=\"phonenumber\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"phonenumber\"]")).sendKeys("0334-0560357	");
	    
	    driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/form/div[7]/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/form/div[7]/input")).sendKeys("Islamabad");
	  
	    
	 /*   driver.findElement(By.xpath("//*[@id=\"day\"]")).click();
	  
	    Select dropdown1 = new Select(driver.findElement(By.id("day")));
	    dropdown1.selectByVisibleText("4");
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"month\"]")).click();
	    Select dropdown2 = new Select(driver.findElement(By.id("month")));
	    dropdown2.selectByVisibleText("Mar");
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"year\"]")).click();
	    Select dropdown3 = new Select(driver.findElement(By.id("year")));
	    dropdown3.selectByVisibleText("2008"); */

	  //  driver.findElement(By.xpath("//*[@name=\"female\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"textarea\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"textarea\"]")).sendKeys("House no. 466, Street no. 16, i-10/2 islamabad");
	  
	    driver.findElement(By.xpath("//*[@value=\"submit\"]")).click();
	   
	//    assertEquals(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/h1")).getText(), "Winku");
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
