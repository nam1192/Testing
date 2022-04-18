package com.selenium.activityJavascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity2 {

	private static WebDriver driver;

		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Testing/chromedriver.exe");
		driver = new ChromeDriver();
		
		// create javascript executor interface
				JavascriptExecutor js =(JavascriptExecutor)driver;
				
				// launch the site
				driver.get(" http://webapps.tekstac.com/Shopify/");
				
				WebElement txt1  = driver.findElement(By.xpath("//input[@id='firstname']"));
				txt1.sendKeys("Rahul");
				WebElement txt2 = driver.findElement(By.xpath("//input[@id='lastname']"));
				txt2.sendKeys("Dravid");
			WebElement txt3 = driver.findElement(By.xpath("//input[@id='username']"));
		txt3.sendKeys("Rahul Dravid");

		
		
//		 select the city from the dropdown
//		WebElement citydropdown = driver.findElement(By.xpath("//select[@id='selectcity']"));
//		Select dropdown = new Select(citydropdown);
//			dropdown.selectByIndex(1);
		// radio button for gender
//				WebElement radiobtn = driver.findElement(By.xpath("//body/form[1]/div[6]/input[1]"));
//				radiobtn.click();

//		password
				WebElement txt4 = driver.findElement(By.xpath("//input[@id='pass']"));
				txt4.sendKeys("pass123");
//		register
				WebElement btnclick = driver.findElement(By.xpath("//button[@id='reg']"));
				btnclick.click();
		
		
	}

}
