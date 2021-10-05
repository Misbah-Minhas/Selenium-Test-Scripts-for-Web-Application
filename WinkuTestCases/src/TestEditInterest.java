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

public class TestEditInterest {
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
		driver.get("file:///C:/xampp/htdocs/MutationTesting/ApplicationUnderTest/Winku/edit-interest.html");
	    driver.findElement(By.xpath("//*[@id=\"interest\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"interest\"]")).sendKeys("my");
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/form/div[2]/input")).clear();
		driver.findElement(By.xpath("//*[@value=\"submit\"]")).click();
		//driver.findElement(By.linkText("News Feed")).click();
	 //   driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/form/div[4]/button[1]")).click();
	    assertEquals(driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[1]/div/div[1]/div[1]/ins/a")).getText(), "Janice Griffith");
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
