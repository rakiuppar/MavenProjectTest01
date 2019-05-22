package com.harman.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * @author RMustoor
 *
 */
public class LoginPage 

{
    WebDriver driver;
    
    
    @FindBy(id="user-name")
    WebElement userName;
    
    @FindBy(id="password")
    WebElement password;
    
    @FindBy(xpath="//*[@id=\"login_button_container\"]/div/form/input[3]")
    WebElement loginButton;
    
    @FindBy(xpath=".//*[@id='item_4_img_link']/img")
    WebElement Notpresent ;
    
    
    public LoginPage(WebDriver driver)
    {

        this.driver = driver;
        PageFactory.initElements(driver, this); 
        //PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30000), this);
    }
    
    
    //Set user name in textbox

    public void setUserName(String strUserName){

        userName.sendKeys(strUserName);

    }
    
    public void Notpresent(String strUserName){

    	Notpresent.sendKeys(strUserName);

    }


    //Set password in password textbox

    public void setPassword(String strPassword){

    	password.sendKeys(strPassword);

    }

    //Click on login button

    public void clickLogin(){

            loginButton.click();

    }

    //Get the title of Login Page

 //   public String getLoginTitle(){

 //    return    driver.findElement(titleText).getText();

//    }

    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */

    public void login(String strUserName,String strPasword){

    	this.Notpresent("test");
        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPasword);

        //Click Login button

        this.clickLogin();     
        
        
    }
}
    
    
    


    
	
	
	
	
	
	
/*	
	public static WebElement getUserName(final WebDriver driver) { 
		    return driver.findElement(By.id("log"));
		  }
		  public static WebElement getPassword(final WebDriver driver) { 
		     return driver.findElement(By.id("pwd"));
		  }
		   public static WebElement getLoginButton(final WebDriver driver) { 
		      return driver.findElement(By.id("login"));
		   }*/

