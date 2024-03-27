package Page;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBroswer {

	public static void main(String[] args) {
		
    String path = "C:\\Repo\\seleniumPushpendra\\Pushpendra\\Driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	
}
