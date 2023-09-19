package sleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectclass {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	
	EdgeOptions option=new EdgeOptions();
	option.addArguments("--incognito");
	WebDriver driver=new EdgeDriver(option);
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebElement course= driver.findElement(By.cssSelector("select#course"));
	Select s=new Select(course);
	s.selectByValue("python");
	System.out.println("testing is done");
	
	
	
	
}
}