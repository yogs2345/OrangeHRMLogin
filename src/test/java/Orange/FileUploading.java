package Orange;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Launch the browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/FileUpload.html");
        try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Actions act=new Actions(driver);
        
        
        WebElement File = driver.findElement(By.xpath("//input[@id='input-4']"));
        act.moveToElement(File).build().perform();
     
       File.sendKeys("C:\\Users\\DELL\\Downloads\\Car).jpg");
        
        
    //  act.moveToElement(File).build().perform();
      WebElement Remove = driver.findElement(By.xpath("//span[text()='Remove']"));
      Remove.click();
      
	}

}
