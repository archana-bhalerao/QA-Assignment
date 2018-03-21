package Org.EJ.Investcorp_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class practice_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= null;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				
		driver=new ChromeDriver();

		  driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		  driver.manage().window().maximize();
		  
	Select oselect= new Select(driver.findElement(By.xpath("//*[@id='selenium_commands']")));
		oselect.selectByVisibleText("Navigation Commands");
		
		Select dropselect= new Select(driver.findElement(By.id("continents")));
		dropselect.selectByVisibleText("Australia"); 
		
		
		driver.findElement(By.xpath("//*[@id='tool-1']")).click();
		
		driver.findElement(By.xpath("//*[@id='tool-2']")).click();
		
		driver.findElement(By.linkText("Test File to Download")).click();
		
		driver.findElement(By.linkText("Selenium Automation Hybrid Framework")).click();
		
		driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		
		driver.findElement(By.id("photo")).sendKeys("D:\\special photos\\DSC_0111.jpg");
		
		driver.findElement(By.xpath("//*[@id='profession-0']")).click();
		
		driver.findElement(By.xpath("//*[@id='profession-1']")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("18-08-1985");
		
		driver.findElement(By.id("exp-5")).click();
		
		driver.findElement(By.id("sex-1")).click();
		
		driver.findElement(By.name("lastname")).sendKeys("Bhalerao");
		
		driver.findElement(By.name("firstname")).sendKeys("Archana");
		
		
	}

}
