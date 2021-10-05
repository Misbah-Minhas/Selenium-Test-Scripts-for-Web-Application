import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.Before;
import org.junit.Test;

public class TestRegistration {
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
		driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/landing.html");
		 assertEquals(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/p")).getText(), "Winku is free to use for as long as you want with two active projects.");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/form/div[4]/button[2]")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[1]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[1]/input")).sendKeys("misbah");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[2]/input")).clear();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[2]/input")).sendKeys("minhas");	
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[3]/input")).clear();
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[3]/input")).sendKeys("misbah123");
	    driver.findElement(By.xpath("//*[@value=\"male\"]")).click();
	   WebElement radioElement = driver.findElement(By.cssSelector("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[4]/div[1]/label/input"));
	  
	    boolean selectState = radioElement.isSelected();
	    //performing click operation only if element is not selected
	    if(selectState == false) {
	     radioElement.click();
	    }
	    		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[5]/input")).clear();
	    	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/form/div[5]/input")).sendKeys("misbah@yahoo.com");
	    	    assertEquals(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/h1")).getText(), "Winku");
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
