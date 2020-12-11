package testcase;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Program {

	public static void main(String[] args) {
		
		//Manual Test Case Steps
		
				//1. Launch Browser --> Chrome//

				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
				
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				WebDriver driver = new ChromeDriver(options);
				
				
				//2. Type "https://www.facebook.com" in chrome browser
				
				driver.get("https://www.facebook.com");
				
				// Verify login page is displayed
				
				String expectedPageTitle = "Facebook - Log In or Sign Up";
				
				//This is actualpage title from automation code
				String actualPageTitle = driver.getTitle();
				
				if(expectedPageTitle == actualPageTitle) {
					System.out.println("Test Steps for Login Page is Passed !! Hurray !!");
				}
				
				else {
					System.out.println("Test Steps for Login Page is Failed !! Sorry");
				}
				WebElement UserName = driver.findElement(By.id("email"));
				UserName.sendKeys("anticbaby@gmail.com");
				
				WebElement password = driver.findElement(By.id("pass"));
				password.sendKeys("qaclass1230");
				
				WebElement loginBottom = driver.findElement(By.name("login"));
				loginBottom.click();
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath(
						"//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div[1]/a/div[1]/div")).click();
				
				
				driver.findElement(By.xpath("//a[text()='Friends']")).click();
	
				
		

	}

	
		
	}


