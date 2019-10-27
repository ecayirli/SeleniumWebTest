package com.test.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import com.test.command.BasePageCommand;

public class SearchPage extends BasePageCommand 
{

	public SearchPage(WebDriver driver) 
	{
		super(driver);
	}
	
	public void search() throws InterruptedException 
	{
		sendKey(By.id("searchData"),"bilgisayar");
		Thread.sleep(1000);
		submit(By.className("searchBtn"));
		((JavascriptExecutor) driver).executeScript("scroll(0,5600)");
		Thread.sleep(1000);
		click(By.xpath("//*[@id=\"contentListing\"]/div/div/div[2]/div[4]/a[2]"));
		Assert.assertTrue("2. Sayfa açılamadı", getTitle().contains("Sayfa 2"));
        System.out.println("2. Sayfa");
	}

}
