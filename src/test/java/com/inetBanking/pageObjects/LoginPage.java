package com.inetBanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);//constructor
	}
 
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
/*	
	WebElement txtUserName= ldriver.findElement(By.name("uid"));
	WebElement txtPassword= ldriver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	WebElement btnLogin= ldriver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
*/	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	
	public void setUserName( String uname)
	{
		txtUserName.sendKeys(uname); 
		System.out.println("The Username is : "+uname);	
	}
	
	public void setPassword( String pwd)
	{
		txtPassword.sendKeys(pwd);
		System.out.println("The Password is : "+pwd);	
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	public void clicklnkLogout()
	{
		lnkLogout.click();
	}
	
	

}
