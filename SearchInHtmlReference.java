package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchInHtmlReference {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//Create a new instance of the Chrome Driver
		WebDriver wd = new ChromeDriver();
		
		//Launch the W3schools website
		wd.get("https://www.w3schools.com");
		
		wd.findElement(By.id("navbtn_references")).click();
		
		wd.findElement(By.xpath("//*[@id=\"nav_references\"]/div/div/div[2]/a[1]")).click();
		
		wd.findElement(By.id("searchstring")).sendKeys("Ricky Ananda Sitorus");
		
		//Print message to the screen
		System.out.println("Berhasil Melakukan Search di HTML Reference");
		
		Thread.sleep(5000);
		
	}
}
