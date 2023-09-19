package sleniumbasic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertclass { 
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 	
         WebElement ab=driver.findElement(By.cssSelector("button#promptBox"));
		ab.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		try {
			wait.until(ExpectedConditions.alertIsPresent());
		Alert a=driver.switchTo().alert();
		a.sendKeys("saurabhsrivastav");
		a.accept();
	String value=a.getText();
System.out.println(value);	
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
