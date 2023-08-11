package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckReactAnswer {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//Create a new instance of the Chrome Driver
		WebDriver wd = new ChromeDriver();
		
		//Launch the W3schools website
		wd.get("https://www.w3schools.com");
		
		wd.findElement(By.id("navbtn_tutorials")).click();
		
		wd.findElement(By.xpath("//*[@id=\"nav_tutorials\"]/div/div/div[3]/a[3]")).click();
		
		wd.findElement(By.xpath("//*[@id=\"w3-exerciseform\"]/div/div/pre/input")).sendKeys("render");
		
		wd.findElement(By.xpath("//*[@id=\"w3-exerciseform\"]/div/button")).click();

		//Check answer
		wd.findElement(By.xpath("/html/body/table/tbody/tr/td/div[4]/div[5]/button[1]")).click();
		//Print message to the screen
		System.out.println("Berhasil Melihat Jawaban");
		
		Thread.sleep(5000);
		
	}
}
