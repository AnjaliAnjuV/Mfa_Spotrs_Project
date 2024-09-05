package mfa_sports_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Page {
	WebDriver Driver;
	 String url="https://mfa.noviindus.in/";
		
	 @BeforeTest
	 public void setup() {
	   Driver=new ChromeDriver();
	 }
	 @BeforeMethod
	 public void url(){
		 Driver.get(url);
		 Driver.manage().window().maximize();
		 Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		 }
	 @Test
	 public void start() {
		 
		 //click on user account icon
		 
		 Driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[3]/div/div[3]/a")).click();
		 
		 //click on country
		 
		 Driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div[1]/div/div[1]/select")).click();
		 
		 WebElement Countrycode=Driver.findElement(By.id("country_code"));
		 Select ctrycd=new Select(Countrycode);
		 ctrycd.selectByVisibleText("+213");
		 
		 // enter mobile number
		 
		 Driver.findElement(By.id("mobile_number")).sendKeys("9605652468");
		 
		 //enter password
		 
		 Driver.findElement(By.id("login_password")).sendKeys("123");
		 
		 //click on login 
		 
		Driver.findElement(By.id("loginbtn")).click();
	 }
		
		@AfterTest
		public void teardown() {
			Driver.close();
		
	 }
}
