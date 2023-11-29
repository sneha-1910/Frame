package generic_utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class wedriverUtility {

	public void maximize_window(WebDriver driver)
	{
		driver.manage().window().maximize();	
	}
	
	public void waitMethos(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
}
