package com.inetBanking.testCases1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.inetBanking.utilities.ReadConfig;



public class BASE_CLASS {
	
    ReadConfig readconfig=new ReadConfig();
    
	
	/*public String baseUrl="https://demo.guru99.com/v4/";
	public String username="mngr164225";
	public String password="jahetAp";
	public static WebDriver driver;
	public static Logger logger;
	*/
    
    public String baseUrl=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
    
    
    
  @Parameters("browser")  
  @BeforeClass
  public void setUp(String br) 
      {	  

      logger=Logger.getLogger("Banking");
      PropertyConfigurator.configure("log4j.properties");
      
         if(br.equalsIgnoreCase("firefox"))
      			{
    	  		System.setProperty("webdriver.gecko.driver",readconfig.getFireFoxPath());
	  			FirefoxOptions options = new FirefoxOptions(); options.setCapability("marionette", false); 
      			driver = new FirefoxDriver(options);
      			}
         else if (br.equalsIgnoreCase("chrome"))
                {
       			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
       			driver = new ChromeDriver();
                }
         
                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                driver.get(baseUrl);
         
	  }
  
   @AfterClass
   public void tearDown()
   {
	   driver.quit();
   }
   
   public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
}
