import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
// CODE NOT WORKING
public class takesscreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Driver.get("https://www.facebook.com/");
		WebElement loginbtn = Driver.findElement(By.name("login"));
		File source = loginbtn.getScreenshotAs(OutputType.FILE);
		File destination = new File("src\\Screenshots\\loginbtn.png");
		FileHandler.copy(source, destination);

		Thread.sleep(2000);
		Driver.quit();
	}

}
