package com.test.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.test.command.BasePageCommand;

public class LoginPage extends BasePageCommand 

{

	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	public void login(String email, String password) {
		sendKey(By.id("email"),"email@gmail.com");
		sendKey(By.id("password"),"qwerty123");
		click(By.id("loginButton"));
		Assert.assertTrue("Login sayfası yüklenemedi.", getTitle().contains("Üye Giriş Sayfası"));
        System.out.println("Login sayfası yüklendi.");
	}
	
	
	

}
