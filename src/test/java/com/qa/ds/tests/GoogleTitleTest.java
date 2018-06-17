package com.qa.ds.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleTest {
	
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String t = driver.getTitle();
// 		System.out.println(t);
		if (t.equals("Google")) {
			System.out.println("pass");
			System.out.println(t);
		}else {
			System.out.println("fail");
			System.out.println(t);
		}
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
