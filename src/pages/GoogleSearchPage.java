/**
 * 
 */
package pages;

import java.util.concurrent.TimeUnit;

import javax.servlet.jsp.tagext.TryCatchFinally;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
/*import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;*/

import com.thoughtworks.selenium.Wait;

/**
 * @author arjray
 *
 */
public class GoogleSearchPage {

	static WebDriver driver = null;

	public static void main(String args[]) {
		System.out.println("Test Pass");
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println("Test Pass");
		try {
			new Wait() {

				@Override
				public boolean until() {
					try {
						return driver.findElement(By.id("a")).isDisplayed();
					} catch (Exception e) {
						// TODO: handle exception
						return false;
					}
					
				}
			}.wait("Test Wait", 10000, 10);
			;
	
		} catch (Exception e) {
			System.out.println(e.getClass());	
		}
/*		try{		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(new Function<WebDriver, Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
					return driver.findElement(By.id("a")).isDisplayed();
			}
		});
		}
		catch(Exception e)
		{
			System.out.println(e.getClass());	
		}*/
/*	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    
	    WebElement element = wait.until(new Function<WebDriver, WebElement>() {
	        public WebElement apply(WebDriver webDriver) {
	            return driver.findElement(By.id("a"));
	        }
	 
	});*/
		System.out.println("Test Pass");	
}
}