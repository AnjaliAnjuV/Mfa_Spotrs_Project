package mfa_sports_project;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Registration_Page {
	WebDriver Driver;
	 String url="https://mfa.noviindus.in/";
	 ChromeOptions options = new ChromeOptions();

	 @BeforeTest
	 public void setup() {
		
	        // Disable pop-ups and notifications
	        options.addArguments("--disable-popup-blocking");
	        options.addArguments("--disable-notifications");

	        // Add preferences to block pop-ups
	        options.addArguments("profile.default_content_setting_values.popups=2");
	        Driver = new ChromeDriver(options);
	 }
	 @BeforeMethod
	 public void url(){
		 Driver.get(url);
		 Driver.manage().window().maximize();
		 Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		 }
	 @Test
	 public void start() throws InterruptedException {
        
		 //click on user account icon
		 
		 Driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[3]/div/div[3]/a")).click();
		
		 //click on create an account
		 
		 Driver.findElement(By.id("registermodalpop")).click();
		 
		 //enter full name
		 Driver.findElement(By.id("name")).sendKeys("anju");
		 
		 //click on country code
		 
		 Driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/select")).click();
		 
		 WebElement Countrycode=Driver.findElement(By.id("country_code"));
		 Select ctrycd=new Select(Countrycode);
		 ctrycd.selectByVisibleText("+213");
		 
		 //enter mobile number
		 
		 Driver.findElement(By.id("usermob")).sendKeys("9605652468");
		 
		 //enter email
		 
		 Driver.findElement(By.id("email")).sendKeys("anjalivanju5@gmail.com");
		 
		 //select date
		
		 Driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div/div[4]/div/span/span")).click();
		 Driver.findElement(By.xpath("(//th[@class='prev'])[1]")).click();
		 Driver.findElement(By.xpath("(//th[@class='prev'])[1]")).click();
		 
	     //enter password
	     
	     Driver.findElement(By.name("password")).sendKeys("123");
	     
	     //enter confirm password
	     
	     Driver.findElement(By.name("c_password")).sendKeys("123");
	     
	     //click on register
	     
	     Driver.findElement(By.id("submitBtnreg")).click();
	 }
	
		@AfterTest
		public void teardown() {
			Driver.close();
		}

	}


