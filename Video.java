package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//Create a new instance of the Chrome Driver
		WebDriver wd = new ChromeDriver();
		
		//Launch the W3schools website
		wd.get("https://www.w3schools.com/");	
		
		wd.findElement(By.xpath("/html/body/div[3]/a[5]")).click(); 
		
		wd.findElement(By.xpath("//*[@id=\"my-video\"]/div[2]")).click();
		
		System.out.println("Berhasil Melakukan Start Video");
		
		Thread.sleep(5000);

	}
}
