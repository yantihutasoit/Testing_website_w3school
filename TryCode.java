package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryCode {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//Create a new instance of the Chrome Driver
		WebDriver wd = new ChromeDriver();
		
		//Launch the W3schools
		wd.get("https://www.w3schools.com");
		
		wd.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[2]/div/a")).click();
		
		//Print message to the screen
		System.out.println("Berhasil mencoba halaman text editor");
		
		Thread.sleep(5000);
		
	}
}
