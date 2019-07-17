package OpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class initiate {

	static WebDriver driver;
	/*public static void main(String[] args) {*/
		/*// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "src\\OpenBrowser\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:\\E-Backup\\Workspace\\Browser\\libs\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:\\E-Backup\\Automation\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.get("http://secure.payrollspan.net/");
		driver.manage().window().maximize();*/
	@Test
		public void openbrowser() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "D:\\E-Backup\\Automation\\Drivers\\ChromeDriver\\Updated\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://secure.payrollspan.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div/div/div/div/div[2]/div[1]/input")).sendKeys("arunkumar.dhanasekar+always1@spanllc.com");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div/div/div/div/div[2]/div[2]/div/input")).sendKeys("Arun@123");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div/div/div/div/div[2]/div[4]/button")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/div[2]/nav/div/div/ul/li[9]/a/span[2]")).click();
		Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			
			 
		}
		}

	

