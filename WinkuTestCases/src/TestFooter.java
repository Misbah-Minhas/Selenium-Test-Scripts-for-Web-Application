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

public class TestFooter {
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
		/*  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[1]/div/div/div/a")).click();  
		  String ActualTitle = driver.getTitle();
		  String ExpectedTitle = "Winku Social Network Toolkit";
		  Assert.assertEquals(ExpectedTitle, ActualTitle);*/
	  }
	  /*
	  @Test
	  public void testSocailMedia() throws Exception {
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[2]/div/ul/li[1]/a")).click();  
		  String ActualTitle = driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[1]/div/div[1]/h1/a/i/u")).getText();
		  String ExpectedTitle = "Facebook";
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[2]/div/ul/li[2]/a")).click();  
		  String ActualTitle1 = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[1]/h1/span")).getText();
		  String ExpectedTitle1 = "Log in to Twitter";
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[2]/div/ul/li[3]/a")).click();  
		  String ActualTitle2 = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div[4]/div[1]/c-wiz/div/div/div[2]/div[1]/div/div")).getText();
		  String ExpectedTitle2 = "Discover";
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[2]/div/ul/li[4]/a")).click();  
		  String ActualTitle4 = driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/h1")).getText();
		  String ExpectedTitle4 = "Instagram";
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[2]/div/ul/li[5]/a")).click();  
		  String ActualTitle3 = driver.findElement(By.xpath("//*[@id=\"HeaderContent\"]/div/div/div/div[2]/div/div/div/div[2]/a/div/div/span")).getText();
		  String ExpectedTitle3 = "Home";
		  Assert.assertEquals(ExpectedTitle, ActualTitle);
		  
		  
	  }
	  */
	  /*  @Test
	  public void testNavigation() throws Exception {
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[3]/div/ul/li[1]/a")).click();  
		  String ActualTitlex = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitlex = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitlex, ActualTitlex);
	 
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[3]/div/ul/li[2]/a")).click();  
		  String ActualTitle10 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div/div/div/div/div[2]/h1")).getText();
		  String ExpectedTitle10 = "Get In Touch";
		  Assert.assertEquals(ActualTitle10, ExpectedTitle10);
		  
		  
		  
		  driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[3]/div/ul/li[3]/a")).click();  
		  String ActualTitle11 = driver.findElement(By.xpath("/html/body/h1")).getText();
		  String ExpectedTitle11 = "Not Found";
		  Assert.assertEquals(ActualTitle11, ExpectedTitle11);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[3]/div/ul/li[5]/a")).click();  
		  String ActualTitle12 = driver.findElement(By.xpath("/html/body/h1")).getText();
		  String ExpectedTitle12 = "Not Found";
		  Assert.assertEquals(ActualTitle12, ExpectedTitle12);
		 
		  
	  } */
// TEst usefull links
	  /*
	  @Test
	  public void testUSEFULLINKS() throws Exception {
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[5]/div/ul/li[1]/a")).click();  
		  String ActualTitle21 = driver.findElement(By.xpath("//*[@id=\"fcxH9b\"]/div[1]/c-wiz[1]/ul/li/a/span/span[2]")).getText();
		  String ExpectedTitle21 = "Apps";
		  Assert.assertEquals(ExpectedTitle21, ActualTitle21);
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[5]/div/ul/li[2]/a")).click();  
		  String ActualTitle31 = driver.findElement(By.xpath("//*[@id=\"ac-localnav\"]/div/div[2]/div[1]/a")).getText();
		  String ExpectedTitle31 = "App Store";
		  Assert.assertEquals(ExpectedTitle31, ActualTitle31);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[5]/div/ul/li[3]/a")).click();  
		  String ActualTitle41 = driver.findElement(By.className("c-heading")).getText();
		  String ExpectedTitle41 = "Corel Painter Essentials";
		  Assert.assertEquals(ExpectedTitle41, ActualTitle41);
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  driver.findElement(By.xpath("//*[@class=\"copyright\"]/a")).click(); 
		  String ActualTitle51 = driver.findElement(By.xpath("//*[@id=\"myTabContent\"]/h1")).getText();
		  String ExpectedTitle51 = "Free HTML Templates and Wordpress Themes";
		  Assert.assertEquals(ExpectedTitle51, ActualTitle51);

	  }*/
	  
	  @Test
	  public void testContactUs() throws Exception {
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/contact.html");
		  
		  String ActualTitle21 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[1]/div/div/p")).getText();
		  String ExpectedTitle21 = "The trio took this simple idea and built it into the world’s leading carpooling platform.";
		  
		  String ActualTitle31 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[1]/div/ul/li[1]/p")).getText();
		  String ExpectedTitle31 = "33 new montgomery st.750 san francisco, CA USA 94105.";
		  
		  String ActualTitle41 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/footer/div/div/div[1]/div/ul/li[2]/p")).getText();
		  String ExpectedTitle41 = " +1-56-346 345";
	  }
	  
	  
}
