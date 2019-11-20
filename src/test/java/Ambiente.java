import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ambiente {
	
	public static void main (String[] args) {
		System.setProperty("WebDriver.Chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
	}
}
