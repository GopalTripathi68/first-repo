import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/");
		
		WebElement createbtn = driver.findElement(By.linkText("Create new account"));
		createbtn.click();
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select selday = new Select(day);
		selday.selectByIndex(3);
		
		Thread.sleep(2000);
		driver.close();
	}

}
