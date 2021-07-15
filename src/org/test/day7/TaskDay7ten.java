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

public class TaskDay7ten {
		public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\eclipse-workspace\\SeleniumDay7\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement txtsearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtsearch.sendKeys("motorolo ");
		WebElement btnsearch = driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
		btnsearch.click();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Dinesh\\Pictures\\Camera Roll\\dineshsample7.png");
		FileHandler.copy(screenshotAs, f);
 }
}
