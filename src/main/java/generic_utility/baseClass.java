package generic_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class baseClass {

	wedriverUtility wlib=new wedriverUtility();
	public WebDriver driver;

     @Parameters(value="browser")
	@BeforeClass(alwaysRun = true)
	public void bc_config(String Browser) 
	{
	   if(Browser.equalsIgnoreCase("chrome"))
	   {
		   WebDriverManager.edgedriver().setup();
		   WebDriver driver=new EdgeDriver();
	   }
	   else
	   {
		   WebDriverManager.firefoxdriver().setup();
		   driver=new FirefoxDriver();
	   }
	}
	
	@AfterClass(alwaysRun = true)
	public void ac_config()
	{
		driver.quit();
		
	}
 
}