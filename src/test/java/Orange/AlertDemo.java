package Orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Launch the browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement Promptalert=driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
        Promptalert.click();
        WebElement button=driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
        button.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Yogeshwari");
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    //    driver.switchTo().alert().dismiss();
        
        
        
        

	}

}
