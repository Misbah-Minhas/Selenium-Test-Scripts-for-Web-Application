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

public class TestIndex {
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
	

	  
	/*  @Test
	  public void testshortcut() throws Exception {
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[1]/aside/div[1]/ul/li[1]/a")).click();  
		  String ActualTitle21 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[3]/div/div[1]/div[1]/ins/a")).getText();
		  String ExpectedTitle21 = "Sophia";
		  Assert.assertEquals(ExpectedTitle21, ActualTitle21);
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[1]/aside/div[1]/ul/li[2]/a")).click();  
		  String ActualTitle31 = driver.findElement(By.xpath("//*[@id=\\\"page-contents\\\"]/div[2]/div[2]/div[3]/div/div[1]/div[1]/ins/a")).getText();
		  String ExpectedTitle31 = "Sophia";
		  Assert.assertEquals(ExpectedTitle31, ActualTitle31);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[1]/aside/div[1]/ul/li[3]/a")).click();  
		  String ActualTitle41 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle41 = "Amazon Shop";
		  Assert.assertEquals(ExpectedTitle41, ActualTitle41);
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[1]/aside/div[1]/ul/li[4]/a")).click(); 
		  String ActualTitle51 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle51 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle51, ActualTitle51);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[1]/aside/div[1]/ul/li[5]/a")).click(); 
		  String ActualTitle61 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle61 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle61, ActualTitle61);
		  
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[1]/aside/div[1]/ul/li[6]/a")).click(); 
		  String ActualTitle71 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle71 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle71, ActualTitle71);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[1]/aside/div[1]/ul/li[7]/a")).click(); 
		  String ActualTitle81 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle81 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle81, ActualTitle81);
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[1]/aside/div[1]/ul/li[8]/a")).click(); 
		  String ActualTitle91 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div/h2")).getText();
		  String ExpectedTitle91 = "People Nearby";
		  Assert.assertEquals(ExpectedTitle91, ActualTitle91);

		 
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[1]/aside/div[1]/ul/li[9]/a")).click(); 
		  String ActualTitle111 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle111 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle111, ActualTitle111);
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[1]/aside/div[1]/ul/li[10]/a")).click(); 
		  String ActualTitle121 = driver.findElement(By.xpath("//*[@id=\"myTabContent\"]/h1")).getText();
		  String ExpectedTitle121 = "Free HTML Templates and Wordpress Themes";
		  Assert.assertEquals(ExpectedTitle51, ActualTitle51);
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[1]/aside/div[1]/ul/li[11]/a")).click(); 
		  String ActualTitle131 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/h2")).getText();
		  String ExpectedTitle131 = "Login";
		  Assert.assertEquals(ExpectedTitle131, ActualTitle131);
	  } */
	  
	  /*
	  @Test
	  public void testTimeLine() throws Exception {
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[1]/aside/div[3]/ul/li[1]/div/h4/a")).click();  
		  String ActualTitle21 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[1]/aside/div[3]/ul/li[1]/div/h4/a")).getText();
		  String ExpectedTitle21 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle21, ActualTitle21);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[1]/aside/div[3]/ul/li[1]/div/h4/a")).click();  
		  String ActualTitle1 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[1]/aside/div[3]/ul/li[2]/div/h4/a")).getText();
		  String ExpectedTitle1 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle1, ActualTitle1);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[1]/aside/div[3]/ul/li[1]/div/h4/a")).click();  
		  String ActualTitle2 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[1]/aside/div[3]/ul/li[3]/div/h4/a")).getText();
		  String ExpectedTitle2 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle2, ActualTitle2);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[1]/aside/div[3]/ul/li[1]/div/h4/a")).click();  
		  String ActualTitle3 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[1]/aside/div[3]/ul/li[4]/div/h4/a")).getText();
		  String ExpectedTitle3 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle3, ActualTitle3);
	  }
	  */
	  /*
	  @Test
	  public void testAddPost() throws Exception {
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[1]/div/div[1]/div[1]/ins/a")).click();  
		  String ActualTitle4 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle4 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle4, ActualTitle4);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[1]/div/div[2]/ul/li[1]/div[2]/div/h5/a")).click();  
		  String ActualTitle5 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle5 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle5, ActualTitle5);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[1]/div/div[2]/ul/li[1]/ul/li[2]/div[2]/div/h5/a")).click();  
		  String ActualTitle6 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle6 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle5, ActualTitle5);
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[1]/div/div[2]/ul/li[2]/div[2]/div/h5/a")).click();  
		  String ActualTitle7 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle7 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle7, ActualTitle7);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[2]/div/div[1]/div[1]/ins/a")).click();  
		  String ActualTitle8 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle8 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle8, ActualTitle8);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[2]/div/div[2]/ul/li[1]/div[2]/div/h5/a")).click();  
		  String ActualTitle9 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle9 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle9, ActualTitle9);
		  
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[2]/div/div[2]/ul/li[2]/div[2]/div/h5/a")).click();  
		  String ActualTitle10 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle10 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle10, ActualTitle10);

		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[3]/div/div[1]/div[1]/ins/a")).click();  
		  String ActualTitle11 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle11 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle11, ActualTitle11);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[3]/div/div[2]/ul/li[1]/div[2]/div/h5/a")).click();  
		  String ActualTitle12 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle12 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle12, ActualTitle12);
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[3]/div/div[2]/ul/li[2]/div[2]/div/h5/a")).click();  
		  String ActualTitle13 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle13 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle11, ActualTitle11);

		  
	/*	  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[1]/div/div[1]/div[1]/ins/a")).click();  
		  String ActualTitle6 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[1]/aside/div[3]/ul/li[1]/div/h4/a")).getText();
		  String ExpectedTitle6 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle4, ActualTitle4);
		  
	  }
	  
	  @Test
	  public void testYourPage() throws Exception {
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[3]/aside/div[1]/div/div[1]/span[1]/a")).click();  
		  String ActualTitle4x = driver.findElement(By.xpath("/html/body/h1")).getText();
		  String ExpectedTitle4x = "Not Found";
		  Assert.assertEquals(ExpectedTitle4x, ActualTitle4x);
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[3]/aside/div[1]/div/div[1]/span[2]/a")).click();  
		  String ActualTitle5x = driver.findElement(By.xpath("/html/body/h1")).getText();
		  String ExpectedTitle5x = "Not Found";
		  Assert.assertEquals(ExpectedTitle5x, ActualTitle5x);
	  }
	  
	  
	  @Test
	  public void testFriends() throws Exception {
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"people-list\"]/li[1]/div/a")).click();  
		  String ActualTitle18x = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle8x = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle8x, ActualTitle18x);
		  
	
		  
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"people-list\"]/li[2]/div/a")).click();  
		  String ActualTitle19x1 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle9x1 = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle9x1, ActualTitle19x1);
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"people-list\"]/li[2]/div/i/a")).click();  
		  String ActualTitle110x = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle10x = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle10x, ActualTitle110x);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\"people-list\"]/li[3]/div/i/a")).click();  
		  String ActualTitle11ax = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).getText();
		  String ExpectedTitle1ax = "Janice Griffith";
		  Assert.assertEquals(ExpectedTitle1ax, ActualTitle11ax);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\\\"mm-0\\\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).click();  
		  String ActualTitle18xy = driver.findElement(By.xpath("//*[@id=\"people-list\"]/li[4]/div/i/a")).getText();
		  String ExpectedTitle8xy = "Email Protection";
		  Assert.assertEquals(ExpectedTitle8xy, ActualTitle18xy);
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\\\"mm-0\\\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).click();  
		  String a = driver.findElement(By.xpath("//*[@id=\"people-list\"]/li[5]/div/i/a")).getText();
		  String b = "Email Protection";
		  Assert.assertEquals(a, b);
		  
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\\\"mm-0\\\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).click();  
		  String c = driver.findElement(By.xpath("//*[@id=\\\"people-list\\\"]/li[6]/div/i/a")).getText();
		  String d = "Email Protection";
		  Assert.assertEquals(c, d);
		  
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  driver.findElement(By.xpath("//*[@id=\\\"mm-0\\\"]/div[1]/section[1]/div/div[2]/div/div[2]/div/ul/li[1]/h5")).click();  
		  String c1 = driver.findElement(By.xpath("//*[@id=\\\"people-list\\\"]/li[7]/div/i/a")).getText();
		  String d1 = "Email Protection";
		  Assert.assertEquals(c1, d1);
		  
		  
	  }*/
	
	/*  @Test
	  public void testSearchFriend() throws Exception {
		  driver.findElement(By.xpath("//*[@id=\"searchDir\"]/form/input")).clear();
		  driver.findElement(By.xpath("//*[@id=\"searchDir\"]/form/input")).sendKeys("Sarah Loren");
		  String c11 = driver.findElement(By.xpath("//*[@id=\"people-list\"]/li[2]/div/a")).getText();
		  String d11 = "Sarah Loren";
		  Assert.assertEquals(c11, d11);
			
	  } */
	  @Test
	  public void testComments() throws Exception {
		  driver.get("http://localhost/mutationTesting/applicationUnderTest/Winku/index.html");
		  
		  
		  String c = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[2]/p")).getText();
		  String d = "World's most beautiful car in Curabitur #test drive booking ! the most beatuiful car available in america and the saudia arabia, you can book your test drive by our official website";
		  Assert.assertEquals(c, d);
		  
		  
		  String c1 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[1]/div/div[2]/ul/li[1]/div[2]/p")).getText();
		  String d1 = "we are working for the dance and sing songs. this car is very awesome for the youngster. please vote this car and like our post";
		  Assert.assertEquals(c1, d1);
		  
		  String c2 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[1]/div/div[2]/ul/li[1]/ul/li[1]/div[2]/p")).getText();
		  String d2 = "yes, really very awesome car i see the features of this car in the official website of #Mercedes-Benz and really impressed :-)";
		  Assert.assertEquals(c2, d2);
		  
		  String c3 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[1]/div/div[2]/ul/li[1]/ul/li[2]/div[2]/p")).getText();
		  String d3 = "i like lexus cars, lexus cars are most beautiful with the awesome features, but this car is really outstanding than lexus";
		  Assert.assertEquals(c3, d3);
		  
		  String c4 = driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/ul/li[2]/div[2]/p")).getText();
		  String d4 = "we are working for the dance and sing songs. this video is very awesome for the youngster. please vote this video and like our channel ";
		  Assert.assertEquals(c4, d4);  
		  
		  String c5 = driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/ul/li[2]/div[2]/p")).getText();
		  String d5 = "Lonely Cat Enjoying in Summer Curabitur #mypage ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc,";
		  Assert.assertEquals(c5, d5); 
		  
		  
		  String c6 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[2]/div/div[2]/ul/li[1]/div[2]/p")).getText();
		  String d6 = "we are working for the dance and sing songs. this video is very awesome for the youngster. please vote this video and like our channel";
		  Assert.assertEquals(c6, d6); 
		  
		  String c7 = driver.findElement(By.xpath("")).getText();
		  String d7 = "we are working for the dance and sing songs. this video is very awesome for the youngster. please vote this video and like our channel";
		  Assert.assertEquals(c7, d7); 
		  String c8 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[3]/div/div[1]/div[2]/div[3]/p")).getText();
		  String d8 = "Curabitur Lonely Cat Enjoying in Summer #mypage ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. Nam quam nunc";
		  Assert.assertEquals(c8, d8); 
		  
		  
		  String c9 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[3]/div/div[2]/ul/li[1]/div[2]/p")).getText();
		  String d9 = "we are working for the dance and sing songs. this video is very awesome for the youngster. please vote this video and like our channel";
		  Assert.assertEquals(c9, d9); 
		  
		  String c10 = driver.findElement(By.xpath("//*[@id=\"page-contents\"]/div[2]/div[2]/div[3]/div/div[2]/ul/li[2]/div[2]/p")).getText();
		  String d10 = "we are working for the dance and sing songs. this video is very awesome for the youngster. ";
		  Assert.assertEquals(c10, d10); 
		  
		  
		  
		  
		  


		
	  }
	  
}
