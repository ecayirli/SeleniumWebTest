package com.test.command;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePageCommand 
{
	protected WebDriver driver;

	public BasePageCommand(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void clickElement(By selector) {
		find(selector).click();
	}

	public void click(By by) {
		driver.findElement(by).click();
	}

	public void sendKey(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}

	public void submit(By by) {
		driver.findElement(by).submit();
	}

	public void thread(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public WebElement find(By by) {
		WebElement elm = driver.findElement(by);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elm);
		return elm;
	}

	public String getTitle() {
		return driver.getTitle();
	}

}
