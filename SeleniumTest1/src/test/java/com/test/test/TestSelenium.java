package com.test.test;

import org.junit.Test;
import com.test.base.TestBase;
import com.test.page.HomePage;

public class TestSelenium extends TestBase {
	@Test
	public void successLogin() {
		new HomePage(driver).callLoginPage().login("email@gmail.com", "qwerty123");
	}

	@Test
	public void searching() throws InterruptedException {
		new HomePage(driver).callSearching().search();
	}
	@Test
	public void choosing() throws InterruptedException {
		new HomePage(driver).callChoosing().choosing();
	}

	@Test
	public void buy() throws InterruptedException {
		new HomePage(driver).callBuy().Buy();
	}

	@Test
	public void delete() {
		new HomePage(driver).callDelete().Delete();
	}

}
