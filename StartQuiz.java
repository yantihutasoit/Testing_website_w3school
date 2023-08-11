package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartQuiz {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//Create a new instance of the Chrome Driver
		WebDriver wd = new ChromeDriver();
		
		//Launch the W3schools website
		wd.get("https://www.w3schools.com/");	
		
		wd.findElement(By.xpath("//*[@id=\"navbtn_exercises\"]")).click(); 
		
		wd.findElement(By.xpath("//*[@id=\"nav_exercises\"]/div/div/div[3]/a[1]")).click();
		
		wd.findElement(By.xpath("//*[@id=\"main\"]/div[3]/p[2]/a")).click();
		
		System.out.println("Berhasil Melakukan Start Quiz");
		
		Thread.sleep(5000);

	}
}
