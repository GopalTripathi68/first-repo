import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wd_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		// 1st method 
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//2nd method
		//String URL = driver.getCurrentUrl();
		//System.out.println(URL);
		
		//3rd method
		//System.out.print(driver.getPageSource());
		
		String id = driver.getWindowHandle();
		System.out.println(id);
		
		Thread.sleep(1000);
		driver.close();
	}

}
