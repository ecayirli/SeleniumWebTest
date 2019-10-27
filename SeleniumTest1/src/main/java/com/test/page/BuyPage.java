package com.test.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.command.BasePageCommand;

public class BuyPage extends BasePageCommand  {

	public BuyPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void Buy() 
	{
		click(By.xpath("//*[@id=\"p-315065224\"]/div[1]/a"));
		Assert.assertTrue("Sepete eklenemedi.", getTitle().contains("Sepetim"));
		System.out.println("Sepete eklendi.");
		
		Assert.assertEquals(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[4]/div/div/span[2]"),By.xpath("//*[@id=\"contentProDetail\"]/div/div[3]/div[2]/div[3]/div[2]/div/div[1]/div/ins"));
		System.out.println("Ürün fiyatları doğru.");
		
		sendKey(By.xpath("//*[@id=\"quantity\"]"), "2");
		Assert.assertEquals(By.xpath("//*[@id=\"quantity\"]"),"2");
		System.out.println("Ürün adedi: 2");
		
		
	}

}
