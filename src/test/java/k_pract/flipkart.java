package k_pract;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {

	public static void main(String[] args) {
		
				//WebDriverManager.firefoxdriver().setup();
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.xpath("//span[@role='button']")).click();
				  WebElement ele = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
				     
			      Actions act=new Actions(driver);
					act.moveToElement(ele);
					  ele.sendKeys("iphone14",Keys.ENTER);
					  
					  String pagenumber="2";
					 WebElement page = driver.findElement(By.xpath("//a[text()='"+pagenumber+"']"));
					  Point loc = page.getLocation();
				       int x=loc.getX();
				       int y=loc.getY();
					    JavascriptExecutor jse=(JavascriptExecutor) driver;
					    jse.executeScript("window.scrollBy("+x+","+y+")");
					     Actions act1=new Actions(driver);
						act1.moveToElement(page).click().perform();
				
					 
	}

}
