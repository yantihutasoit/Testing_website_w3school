package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//Create a new instance of the Chrome Driver
		WebDriver wd = new ChromeDriver();
		
		//Launch the W3schools
		wd.get("https://www.w3schools.com");
		
		wd.findElement(By.id("navbtn_tutorials")).click();
		
		wd.findElement(By.xpath("//*[@id=\"nav_tutorials\"]/div/div/div[3]/a[3]")).click();
		
		wd.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[19]")).click();
	
		wd.findElement(By.xpath("//*[@id=\"gsc-i-id1\"]")).sendKeys("Pakhomios Havel");

		wd.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/form/table/tbody/tr/td[2]/button")).click();
		
		//Print message to the screen
		System.out.println("Berhasil melakukan search");
		
		Thread.sleep(5000);
		
	}
}
