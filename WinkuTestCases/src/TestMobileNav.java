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

public class TestMobileNav {
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver =  new ChromeDriver();
	    baseUrl = "https://www.google.com/";
	    Dimension dimension = new Dimension(420, 638);
	    driver.manage().window().setSize(dimension);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	  }
	  @Test
	  public void testLogin() throws Exception {
	        JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
/*
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-3\"]/ul/li[1]")).click();
	    
	    
	    
	   
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-3\"]/ul/li[2]/a")).click();
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-3\"]/ul/li[3]/a")).click();
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"topcontrol\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-3\"]/ul/li[4]/a")).click();
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"topcontrol\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-3\"]/ul/li[5]/a")).click();
	    
	   
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-3\"]/ul/li[6]/a")).click();
	    
	    
	 
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-3\"]/ul/li[7]/a")).click();
	    
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-3\"]/ul/li[8]/a")).click();
	    
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-3\"]/ul/li[9]/a")).click();
	    
	    
	    
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-3\"]/ul/li[10]/a")).click();
	    
	    */
	    
	    //===============================Account settings elements test=====================================================//
	    
	   /* driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[4]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-4\"]/ul/li[1]")).click();
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[4]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-4\"]/ul/li[2]")).click();
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[4]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-4\"]/ul/li[3]")).click();
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[4]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-4\"]/ul/li[4]")).click();
	    
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[4]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-4\"]/ul/li[5]")).click();
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[4]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-4\"]/ul/li[6]")).click();
	    
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[4]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-4\"]/ul/li[7]")).click();
	    
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[4]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-4\"]/ul/li[8]")).click();
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]/a/i")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[4]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-4\"]/ul/li[9]")).click();
	    
	    
	    
	    
	    //==============================Account settings test===================================================//*/
		//======================================Form test==================================================//
		/*    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
		    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[4]")).click();
		    driver.findElement(By.xpath("//*[@id=\"mm-5\"]/ul/li[1]")).click();
		    
		    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
		    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[4]")).click();
		    driver.findElement(By.xpath("//*[@id=\"mm-5\"]/ul/li[2]")).click();
		    
		    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
		    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[4]")).click();
		    driver.findElement(By.xpath("//*[@id=\"mm-5\"]/ul/li[3]")).click();
		
		    
		    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
		    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[4]")).click();
		    driver.findElement(By.xpath("//*[@id=\"mm-5\"]/ul/li[4]")).click();*/
		
		//========================================End form test==========================================//
		
		/*
		driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[5]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-6\"]/ul/li[1]")).click();
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[5]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-6\"]/ul/li[2]")).click();
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[5]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-6\"]/ul/li[3]")).click();
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[5]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-6\"]/ul/li[4]")).click();
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[5]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-6\"]/ul/li[5]")).click();
	    
	    */
		//==================================Our Blog============================================//
		
		
		/*driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[6]")).click();
	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[7]/ul/li[1]")).click();
	   driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[6]")).click();
	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[7]/ul/li[2]")).click();
	    
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[6]")).click();
	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[7]/ul/li[3]")).click();
	    
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[6]")).click();
	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[7]/ul/li[4]")).click();
	    
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[6]")).click();
	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[7]/ul/li[5]")).click();
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	  		driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
	  	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[6]")).click();
	  	    driver.findElement(By.xpath("/html/body/nav[2]/div/div[7]/ul/li[6]")).click();
	  	    
	  	    
	  	  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
			driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
		    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[6]")).click();
		    driver.findElement(By.xpath("/html/body/nav[2]/div/div[7]/ul/li[7]")).click();
		    
		    
		    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
			driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/div[1]/div[1]/span[1]")).click();  
		    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[6]")).click();
		    driver.findElement(By.xpath("/html/body/nav[2]/div/div[7]/ul/li[8]")).click();*/
		
		
		//================================Portfolio=====================================================//
		    /*    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
			    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[7]")).click();
			    driver.findElement(By.xpath("/html/body/nav[2]/div/div[8]/ul/li[1]")).click();
		
			    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
			    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[7]")).click();
			    driver.findElement(By.xpath("/html/body/nav[2]/div/div[8]/ul/li[2]")).click();
			    
			    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
			    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[7]")).click();
			    driver.findElement(By.xpath("/html/body/nav[2]/div/div[8]/ul/li[3]")).click();  */
		//==================================portfolio===================================================//
		
		
		//===================================Support and help ==============================================//
		/*   
		driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
		    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[8]")).click();
		    driver.findElement(By.xpath("/html/body/nav[2]/div/div[9]/ul/li[1]")).click();
	
		    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
		    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[8]")).click();
		    driver.findElement(By.xpath("/html/body/nav[2]/div/div[9]/ul/li[2]")).click();

		    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
		    driver.findElement(By.xpath("/html/body/nav[2]/div/div[1]/ul/li[8]")).click();
		    driver.findElement(By.xpath("/html/body/nav[2]/div/div[9]/ul/li[3]")).click();
		    
		    */
		    
		
		//====================================end support and help===========================================//
		
		//=====================================More pages===================================================//
		/*
		driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[9]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-10\"]/ul/li[1]")).click();
	    
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[9]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-10\"]/ul/li[2]")).click();
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[9]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-10\"]/ul/li[3]")).click();
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[9]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-10\"]/ul/li[4]")).click();
	    String ActualTitle41 = driver.findElement(By.xpath("//*[@id="mm-0"]/div[1]/section[1]/div/div/div/div/div/div[2]/p")).getText();
		String ExpectedTitle41 = "this is a google map. you may see our location, or using street view you may the original look of our office.";
	    
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[9]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-10\"]/ul/li[5]")).click();
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[9]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-10\"]/ul/li[6]")).click();
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[9]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mm-10\"]/ul/li[7]")).click();
	    
		*/
		
		//=================================//More Pages=====================================================//
	     
		driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[10]")).click();
	
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[11]")).click();
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[12]")).click();
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[13]")).click();
	    
	    driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/span[1]")).click();  
	    driver.findElement(By.xpath("//*[@id=\"mm-1\"]/ul/li[14]")).click();
	    
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
