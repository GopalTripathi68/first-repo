import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//Find Element by Class Name
		WebElement username = driver.findElement(By.className("inputtext"));
		username.sendKeys("gopaltripathi7838@gmail.com");
		
		//WebElement pass = driver.findElement(By.id("pass"));
		//pass.sendKeys("gopal12345");
		
		// Click on Forget Button
		//WebElement forgot_pass = driver.findElement(By.linkText("Forgotten password?"));
		//forgot_pass.click();
		
		//Click on Create New Button (Code not working)
		//WebElement new_btn = driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy"));
		//new_btn.click();
		
		// FindElements (Code not working)
		//List<WebElement> links = driver.findElements(By.className("pasgeFooterLinkList"));
		//System.out.println(links);
		
		//for(WebElement link : links) {
			//System.out.println(link.getText())}
		
		
		driver.close();

	}

}
