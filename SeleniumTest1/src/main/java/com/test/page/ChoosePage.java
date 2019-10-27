package com.test.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.command.BasePageCommand;

public class ChoosePage extends BasePageCommand {

	public ChoosePage(WebDriver driver) 
	{
		super(driver);
	}
	
	public void choosing() throws InterruptedException
	{
		click(By.xpath("//*[@id=\\\"p-315065224\\\"]/div[1]/a"));
		Assert.assertTrue("Ürün seçilemedi", getTitle().contains("HP 15-BS154NT Intel i3 5005U 4GB 128GB SSD W10 15.6 4UL32EA"));
        System.out.println("HP 15-BS154NT Intel i3 5005U");
	}

}
