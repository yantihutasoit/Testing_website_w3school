package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//Create a new instance of the Chrome Driver
		WebDriver wd = new ChromeDriver();
		
		//Launch the W3schools website
		wd.get("https://www.w3schools.com/");	
		
		wd.findElement(By.xpath("//*[@id=\"w3loginbtn\"]")).click(); 
		
		wd.findElement(By.xpath("//*[@id=\"modalusername\"]")).sendKeys("yantihutasoit020@gmail.com"); 		
		
		wd.findElement(By.xpath("//*[@id=\"current-password\"]")).sendKeys("Yanti123_"); 	

		wd.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button")).click();
		
		System.out.println("Berhasil Melakukan Login");
		
		Thread.sleep(5000);
	}

}
