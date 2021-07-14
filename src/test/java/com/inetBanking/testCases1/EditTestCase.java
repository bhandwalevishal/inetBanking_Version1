package com.inetBanking.testCases1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.EditTestCase1;
import com.inetBanking.pageObjects.LoginPage;


public class EditTestCase 

{ 
	
	

	@Test
	public void Launchfirefox(){
	
	System.setProperty("webdriver.chrome.driver","G:\\Selenium Software\\New Java\\JBK Eclipse Configured 32-bit\\JBK Eclipse Configured\\eclipse\\NewJavaWorkplace\\inetBankingV1\\Drivers\\chromedriver.exe");
	 
	 
	  
	  
	 
	WebDriver driver=new ChromeDriver();  

	driver.get("http://demo.guru99.com/test/newtours/register.php");
	 
	EditTestCase1 lp=new EditTestCase1(driver); 
	lp.selectDropDown("country", "AMERICAN SAMOA");
  
	//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div[1]")).click();
 
	 
	}
}
