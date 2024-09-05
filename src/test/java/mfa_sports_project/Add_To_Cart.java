package mfa_sports_project;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Add_To_Cart {
	WebDriver Driver;
	String url = "https://mfa.noviindus.in/";
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
		 
		 //select item - Shop By Category - then add cart
		 
		 //click on shorts
		 
		Driver.findElement(By.xpath("/html/body/section[1]/div/div[2]/div/div/div[5]/div/div/div/a")).click();
	 
		 //click on view  product 
		 
		 Driver.findElement(By.xpath("(//p[@class='pt-1'])[3]")).click();
		 
		  //scroll
		 
		 JavascriptExecutor js = (JavascriptExecutor) Driver;
		 js.executeScript("window.scrollBy(0,500)", "");
			
         //select size
		 
	     Driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/a[1]")).click();
	     
	     JavascriptExecutor jsv = (JavascriptExecutor) Driver;
		 jsv.executeScript("window.scrollBy(0,100)", "");
			
		 //click on add to cart
		 
		 Driver.findElement(By.xpath("//*[@id=\"form34\"]/div[3]/div[1]/a")).click();
		
		//click on add to cart icon
			 
		 Driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[3]/div/div[2]/a/svg")).click();
		 
		 //search item then add cart
		 
		 Driver.findElement(By.id("searchInput")).sendKeys("SUBLIMATION JERSEY");
		 Driver.findElement(By.id("search_btn")).click();
		 
		 //click on view product
		 Driver.findElement(By.xpath("//p[text()='AL-HILAL HOME 2023-24 NEYMAR SUBLIMATION']")).click();
		 
        //scroll
		 
		 JavascriptExecutor jvs=(JavascriptExecutor) Driver;
		 jvs.executeScript("window.ScrollBy(0,500)","");
			
		 //select size
		 Driver.findElement(By.xpath("/html/body/section[1]/div/div/div[2]/div/form[1]/div[1]/nav/a[5]")).click();
		 
         //select quantity
		 
		 Driver.findElement(By.xpath("//div[@class='inc']")).click(); 	
		 
		 //click on add to cart
		 Driver.findElement(By.xpath("/html/body/section[1]/div/div/div[2]/div/form[1]/div[3]/div[1]/a")).click();
		 
         //click on add to cart icon
		 
		 Driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[3]/div/div[2]/a/svg")).click();
		 
		//remove quantity in cart
		 
		 Driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/div/div/div/div[2]/div/div[3]/div[2]/div/div/div[1]")).click();

		 //remove item in cart
		 
		 Driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/div/div/div/div[2]/div/div[1]/a/button")).click();

	 }

		@AfterTest
		public void teardown() {
			Driver.close();
		
	 }
}
