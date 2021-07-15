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

public class TaskDay7nine {
		public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\eclipse-workspace\\SeleniumDay7\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnclose.click();
		Thread.sleep(2000);
		WebElement txtsearch = driver.findElement(By.xpath("//input[@name='q']"));
		txtsearch.sendKeys("Iphone");
		Thread.sleep(2000);
		WebElement btnsumit = driver.findElement(By.xpath("//button[@type='submit']"));
		btnsumit.click();
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenShotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\Dinesh\\Pictures\\Camera Roll\\dineshsample5.png");
		FileHandler.copy(screenShotAs, f);
		
 }
}
