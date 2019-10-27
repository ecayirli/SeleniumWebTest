package com.test.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.test.command.BasePageCommand;

public class HomePage extends BasePageCommand 
{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public LoginPage callLoginPage() {
		clickElement(By.className("btnSignIn"));
		Assert.assertTrue("Uye girisi yapilamadi", getTitle().contains("Üye Giriş Sayfası"));
	        System.out.println("Uye girisi basarili.");
		return new LoginPage(driver);
	}
	public SearchPage callSearching() {
	clickElement(By.className("insider-opt-in-notification-button"));
	return new SearchPage(driver);
	}
	public ChoosePage callChoosing() {
		clickElement(By.className("insider-opt-in-notification-button"));
		return new ChoosePage(driver);
	}
	public BuyPage callBuy() {
		clickElement(By.className("insider-opt-in-notification-button"));
		return new BuyPage(driver);
	}
	public DeletePage callDelete() {
		clickElement(By.className("insider-opt-in-notification-button"));
		return new DeletePage(driver);
	
	}

}
