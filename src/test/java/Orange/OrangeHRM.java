package Orange;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import junit.framework.Assert;

public class OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Launch the browser
		WebDriver driver=new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// delete all cookies
		driver.manage().deleteAllCookies();
		// open the browser and launch the url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//  wait for 5 sec
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// verify the title
		String actualTitle=driver.getTitle();
		String expectedTitle="OrangeHRM";
		Assert.assertEquals(actualTitle,expectedTitle);
		
		// Enter the valid credential to the username and password textbox
		WebElement Username=driver.findElement(By.xpath("//input[@name='username']"));
		Username.sendKeys("Admin");
		WebElement Password =driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("admin123");
		
	    // click on login button
	//	WebElement Login =driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
	//	Login.click();
		
		// locate hyperlink  OrangeHRM, Inc 
		WebElement hyperlink = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		
		// scroll down the page
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", hyperlink);
		
		hyperlink.click();
		// close the window
		driver.close();
		
		
		

	}

}
