package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {


	WebDriver ldriver;
	public AddNewCustomer(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);//constructor
	}
	
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how=How.NAME,using="rad1" )
	@CacheLookup 
	WebElement rdGender;
	
	@FindBy(how=How.NAME,using="dob" )
	@CacheLookup 
	WebElement txtdob;
	
	

	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(how=How.NAME,using="state" )
	@CacheLookup 
	WebElement txtstate;
	
	@FindBy(how=How.NAME,using="pinno" )
	@CacheLookup 
	WebElement txtpin;
	
	
	@FindBy(how=How.NAME,using="telephoneno" )
	@CacheLookup 
	WebElement txtMobileNumber;
	
	@FindBy(how=How.NAME,using="emailid" )
	@CacheLookup 
	WebElement txtemailid;
	 
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")
	@CacheLookup
	WebElement txtpassword;
	
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")
	@CacheLookup
	WebElement butSubmit;
	
	public void clickAddNewCustomer(){
		lnkAddNewCustomer.click();}
	
	public void custName(String cname){
		txtCustomerName.sendKeys(cname);
	}
	
	public void custGender(String cgender)
	{
		rdGender.click();
	}
	
	public void cDateOfBirth(String mm,String dd, String yy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy); 
	}
    public void cAddress(String cAddress){
    	txtaddress.sendKeys(cAddress);
    }

    public void cCity(String cCity){
    	txtcity.sendKeys(cCity);
    }
    
    public void cState(String cState){
    	txtstate.sendKeys(cState);
    }
    
    public void cPin(String cPin){
    	txtpin.sendKeys(String.valueOf(cPin));
    }
    
    public void CMobileNumber(String cMobileNumber){
    	txtMobileNumber.sendKeys(cMobileNumber);
    }
    
    public void cEmailID(String CEMailID){
    	txtemailid.sendKeys(CEMailID);
    }
    
    public void cPassword(String cPassword){
    	txtpassword.sendKeys(cPassword);
    }
    public void cSubmit()
    {
    	butSubmit.click();
    }
}
