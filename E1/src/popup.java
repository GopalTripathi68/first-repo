import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Alert ale = driver.switchTo().alert();
		Thread.sleep(2000);
		ale.accept();
		System.out.println(ale.getText());
		ale.dismiss();
		
		driver.close();

	}

}
