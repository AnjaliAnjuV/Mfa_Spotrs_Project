package mfa_sports_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wishlist {
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
	 public void start() {
		 
		 //select item - products - then add cart
		 // click on product - shorts
		 
		Driver.findElement(By.xpath("/html/body/header/div[3]/div/div[2]/ul/li[3]/a")).click();
		
		 WebElement product=Driver.findElement(By.id("navbarDropdown"));
		 Select p=new Select(product);
		 p.selectByVisibleText("SHORTS");
		 
		 //click on item
		 
		Driver.findElement(By.xpath("/html/body/section[1]/div/div/div[2]/div/section/div/div[2]/div[1]/div/div[1]/div[1]/div[2]/a/button")).click();
		 
		 //click on product link
		 
		 Driver.findElement(By.xpath("//p[normalize-space()='MANCHESTER UNITED WHITE EMBROIDERY SHORTS']")).click(); 
		 
		 //scroll
		 
		 JavascriptExecutor jsc=(JavascriptExecutor) Driver;
		 jsc.executeScript("window.ScrollBy(0,1000)","");
			
		 //select size 
		 
		 Driver.findElement(By.xpath("/html/body/section[1]/div/div/div[2]/div/form[1]/div[1]/nav/a[5]")).click(); 
		
		 //click on add to cart

		 Driver.findElement(By.xpath("/html/body/section[1]/div/div/div[2]/div/form[1]/div[3]/div[1]/a")).click();
		 
		//click on add to cart icon
		 
		 Driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[3]/div/div[2]/a")).click();

	 
	 //select quantity
	 
	 Driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/form[2]/div/div/div[2]/div/div[4]/div[2]/div[2]")).click();
	 
	 //click on add to cart
	 Driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/form[2]/div/div/div[2]/div/div[4]/div[3]/a")).click();
	 
	 //click on add to cart icon
	 
	 Driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[3]/div/div[2]/a")).click();
	 Driver.navigate().back();

	 //remove product in wish list
	 
	 Driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/form/div/div/div[2]/div/div[1]/div/div/input")).click();
 
	 //click on home link
	 
	 Driver.findElement(By.xpath("/html/body/header/div[3]/div/div[2]/ul/li[1]/a")).click();
     
	 //click on Shop By Category - SHORTS

	 Driver.findElement(By.xpath("/html/body/section[1]/div/div[2]/div/div/div[7]/div/div/div/a")).click();
	 
	 //click on product
	 
	 Driver.findElement(By.xpath("/html/body/section[1]/div/div/div[2]/div/section/div/div[2]/div[3]/div/div[1]/div[1]/div[2]/a")).click();

	 //click on favorite
	 
	 Driver.findElement(By.xpath("/html/body/section[1]/div/div/div[2]/div/div[1]/div/div/div/div/input")).click();

     //click on wish list icon
	 
	 Driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[3]/div/div[1]/a")).click();

	 //click on user account icon
	 
	 Driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[3]/div/div[3]/a")).click();

	 //click on logout link
	 
	 Driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[1]/a[2]")).click();

	 }
	 @AfterTest
		public void teardown() {
			Driver.close();
		
	 }
}
