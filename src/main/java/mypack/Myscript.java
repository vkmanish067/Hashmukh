package mypack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myscript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse\\java-2020-06\\eclipse\\-\\.metadata\\.plugins\\EightPM\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

}
