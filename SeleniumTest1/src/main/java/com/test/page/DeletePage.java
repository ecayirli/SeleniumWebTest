package com.test.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.command.BasePageCommand;

public class DeletePage extends BasePageCommand {

	public DeletePage(WebDriver driver) {
		super(driver);
		
	}
	
	public void Delete() 
	{
		
		click(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[4]/div/a"));
		click(By.className("removeProd svgIcon svgIcon_trash"));
		
		Assert.assertTrue("Ürün silinemedi.", getTitle().contains("Sepetiniz Boş."));
		System.out.println("Sepet şu an boş.");
	}

}
