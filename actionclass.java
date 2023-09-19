package sleniumbasic;

import java.time.Duration;

import javax.swing.BoxLayout;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionclass {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions option=new FirefoxOptions();
		option.addArguments("--incognito");
		WebDriver driver=new FirefoxDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.browserstack.com/?utm_source=google&utm_medium=cpc&utm_platform=paidads&utm_content=668803176719&utm_campaign=Search-Brand-APAC-Navigational&utm_campaigncode=Core+1007765&utm_term=e+browserstack&gclid=Cj0KCQjwmICoBhDxARIsABXkXlLPb8PGrPWaaSIer8enmN9Rswwd1B9AneZwSI-gjLQB9e2hrpI5wJUaAh3HEALw_wcB");
	driver.manage().window().maximize();
	WebElement product=driver.findElement(By.cssSelector("button#product-menu-toggle"));
	Actions a=new Actions(driver);
	a.moveToElement(product).build().perform();
	WebElement search=driver.findElement(By.cssSelector("#primary-menu > li:nth-child(10) > button"));
	search.click();
	WebElement box=driver.findElement(By.cssSelector("input#doc-search-box-input"));
	box.sendKeys("automation");
	a.sendKeys(box, Keys.ENTER).build().perform();
	String title=driver.getTitle();
	System.out.println("title :"+title);
	String url=driver.getCurrentUrl();
	System.out.println("url :"+url);
	String page=driver.getPageSource();
	System.out.println("page"+page);
	}

}
