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

public class TestEditWorkEducation {
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
		driver.get("http://localhost/MutationTesting/applicationUnderTest/Winku/edit-work-eductation.html");	
		driver.findElement(By.xpath("//*[@type='checkbox']")).click(); 
	    driver.findElement(By.xpath("//*[@id=\"input\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("Fast");
		
		
		driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/form/div[4]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/form/div[4]/input")).sendKeys("2019");	
		
		
		driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/form/div[5]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/form/div[5]/input")).sendKeys("2021");
		
		
	//	driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/form/div[6]/input")).clear();
	//	driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/form/div[6]/input")).sendKeys("Islamabad");
		
		
		driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/form/div[6]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/form/div[6]/input")).sendKeys("Islamabad");
		
		driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/form/div[9]/button[2]")).click();
	
		//new Select(driver.findElement(By.xpath("//SELECT[@name='country']"))).selectByValue("ALB");
		
		
		
	//	driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/form/div[7]/div/div/div/input")).sendKeys("Pakistan");	
		
		driver.get("http://localhost/MutationTesting/applicationUnderTest/Winku/index.html");	
		 driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[1]/aside/div[1]/ul/li[1]/a")).click();
		 String a = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/h5")).getText();
		  String b = "Edit Basic Information";
		  Assert.assertEquals(a, b);
	  }
	  
	  
/*	  @Test
	  public void testEditInfo() throws Exception {
		driver.get("http://localhost/MutationTesting/applicationUnderTest/Winku/edit-work-eductation.html");	
		 driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[1]/aside/div[1]/ul/li[1]/a")).click();
		 String a = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/h5")).getText();
		  String b = "Edit Basic Information";
		  Assert.assertEquals(a, b);
		  
			driver.get("http://localhost/MutationTesting/applicationUnderTest/Winku/edit-work-eductation.html");	
			 driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[1]/aside/div[1]/ul/li[2]/a")).click();
			 String a1 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/h5")).getText();
			  String b1 = "Edit Work & Education";
			  Assert.assertEquals(a1, b1);
			  
			  
				driver.get("http://localhost/MutationTesting/applicationUnderTest/Winku/edit-work-eductation.html");	
				 driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[1]/aside/div[1]/ul/li[3]/a")).click();
				 String a2 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/h5")).getText();
				  String b2 = "My Interests";
				  Assert.assertEquals(a2, b2);

				  
					driver.get("http://localhost/MutationTesting/applicationUnderTest/Winku/edit-work-eductation.html");	
					 driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[1]/aside/div[1]/ul/li[4]/a")).click();
					 String a3 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/h5")).getText();
					  String b3 = "Account Setting";
					  Assert.assertEquals(a3, b3); 
					  
					  
					  driver.get("http://localhost/MutationTesting/applicationUnderTest/Winku/edit-work-eductation.html");	
						 driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[1]/aside/div[1]/ul/li[5]/a")).click();
						 String a4 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div/div/h5")).getText();
						  String b4 = "Change Password";
						  Assert.assertEquals(a4, b4); 
	  }*/
	
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
