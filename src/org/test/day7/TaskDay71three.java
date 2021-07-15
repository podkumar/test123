package org.test.day7;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TaskDay71three {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\eclipse-workspace\\SeleniumDay7\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		WebElement txtsrch = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		txtsrch.sendKeys("HP laptop");
		Thread.sleep(2000);
		WebElement btnsrch = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		btnsrch.click();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Dinesh\\Pictures\\Camera Roll\\dineshsample10.png");
		FileHandler.copy(screenshotAs, f);
	}
}