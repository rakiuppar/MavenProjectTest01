package com.harman.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.harman.page.LoginPage;

public class Test101 {
    
    
	public static void main(String[] args) 
	{
		
		String strUserName = "standard_user";
	    String strPassword = "secret_sauce";
	    String strTitle = "";
		
		System.setProperty("webdriver.chrome.driver", "E:\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		
		LoginPage Lp = new LoginPage(driver);
		Lp.login(strUserName,strPassword);
		
	}

}
