package org.test.day7;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class TaskDay71two {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\eclipse-workspace\\SeleniumDay7\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnclose.click();
		Thread.sleep(2000);
		WebElement txtfashion = driver.findElement(By.xpath("//p[text()='Fashion']"));
		txtfashion.click();
		Thread.sleep(2000);
		WebElement txtkids = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.moveToElement(txtkids).perform();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Dinesh\\Pictures\\Camera Roll\\dineshsample9.png");
		FileHandler.copy(screenshotAs, f);		
 }
}
