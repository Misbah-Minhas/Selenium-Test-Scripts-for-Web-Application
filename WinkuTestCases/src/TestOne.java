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
public class TestOne {
	private WebDriver driver;
	  private StringBuffer verificationErrors = new StringBuffer();
	  @Test	    
	    public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("file:///C:/Users/DELL/Downloads/Model-Base-Try/Model-Base-Try/New/WebPage.html");
		    driver.findElement(By.id("myInput3")).clear();
			driver.findElement(By.id("myInput3")).sendKeys("misbah");
			driver.findElement(By.id("FirstName")).clear();
			driver.findElement(By.id("FirstName")).sendKeys("minhas");
			///driver.findElement(By.id("nicname")).clear();
			//driver.findElement(By.id("nicname")).sendKeys("misi");
			driver.findElement(By.xpath("/html/body/span/button")).click();
	  }
}
