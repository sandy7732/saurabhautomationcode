package sleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class windowhandle {
	public static void main(String[] args) {
		FirefoxOptions option=new FirefoxOptions();
		option.addArguments("--incognito");
		WebDriver driver=new FirefoxDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		WebElement tab=driver.findElement(By.cssSelector("button#newTabBtn"));
	}

}
