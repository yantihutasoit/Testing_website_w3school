package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Navigation;

public class CheckNextPreviousButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//Create a new instance of the Chrome Driver
		WebDriver wd = new ChromeDriver();
		
		//Launch the W3schools website
		wd.get("https://www.w3schools.com");
		
		wd.findElement(By.id("navbtn_tutorials")).click();
		
		wd.findElement(By.xpath("//*[@id=\"nav_tutorials\"]/div/div/div[3]/a[9]")).click();
		
		//Next Page
		wd.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[2]")).click();
		
		Thread.sleep(5000);
		//Previous Page
		wd.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[1]")).click();
		
		//Print message to the screen
		System.out.println("Berhasil membuka laman LearnPyhton dan cek tombol next dan previous");
		
		//Wait for 5 secs
		Thread.sleep(5000);
		
	}
}
