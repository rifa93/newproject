package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
static WebDriver driver;
public static void launchBrowser(String Browser) {
if (Browser.equals("Chrome")) {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	
}
else if (Browser.equals("Firefox")) {
	WebDriverManager.firefoxdriver().setup();
	driver= new FirefoxDriver();
	
}
else {
	WebDriverManager.firefoxdriver().setup();
}
}
public static void launchUrl(String Url) {
	driver.get(Url);
	String title = driver.getTitle();
	System.out.println(title);
	String currentUrl = driver.getCurrentUrl();
    System.out.println(currentUrl);
    driver.manage().window().maximize();
}
public static void clickButton(WebElement e) {
	e.click();
}

public static void enterValue(WebElement e, String value) {
	e.sendKeys(value);

}


}
