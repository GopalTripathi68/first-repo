import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		// BY XPATH
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tripathigopal68@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gopal@1234");
		//CODE NOT WORKING
		Thread.sleep(500);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//Thread.sleep(2000);
		//driver.close();
		}

}
