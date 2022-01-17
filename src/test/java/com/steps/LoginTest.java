package com.steps;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginTest extends BrowserLunch {

	public static void open_flipkart_page() {
		driver = launchBrowser();
		driver.get("https://www.flipkart.com/");
	}

	public static void enterDetails() {
		WebElement email_txt = driver.findElement(By.xpath("//div[@class=\"_36HLxm col col-3-5\"]//form/div[1]/input"));
		email_txt.sendKeys("9960822624");

		WebElement pass_txt = driver.findElement(By.xpath("//div[@class=\"_36HLxm col col-3-5\"]//form/div[2]/input"));
		pass_txt.sendKeys("Flipkart@12345");

	}

	public static void click_on_login() {
		WebElement login_btn = driver.findElement(By.xpath("//div[@class=\"_1D1L_j\"]/button"));
		login_btn.click();
	}

	public static void check_electronic_product() throws InterruptedException {
		
		System.out.println("Electronic Product check");
		Thread.sleep(2000);
		WebElement elect_btn =driver.findElement(By.xpath("//div[text()=\"Electronics\"]"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.moveToElement(elect_btn).click().build().perform();
		
		

		Thread.sleep(2000);

		
		
		
	}

	public static void home_test() throws InterruptedException {

		Thread.sleep(1000);
		WebElement login_window_Close = driver.findElement(By.xpath("//div[@class=\"_2QfC02\"]/button"));

		login_window_Close.click();
		Thread.sleep(1000);

		WebElement home_btn = driver.findElement(By.xpath("//div[text()=\"Home\"]"));

		Actions act = new Actions(driver);
		act.moveToElement(home_btn).build().perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()=\"All\"]")).click();

	}

	public static void verify_links_on_home_page() {
		List<WebElement> all_links = driver.findElements(By.xpath("//div[@class=\"_36fx1h _6t1WkM _3HqJxg\"]//a"));

		for (WebElement link : all_links) {
			String text = link.getText();
			if (text.equals("Home Furnishing")) 
			{
				assertEquals("Home Furnishing", "Home Furnishing");
			}

		}

	}

	public static void verify_label_on_home_page() {
		String excpeted_text = "Thanks to the fact that we can shop for home furnishings online today, getting our house done is much easier than in the past. Whether it’s a modern look, a traditional look or a vintage look that you want, you can easily buy home furnishing products online without having to spend a day comparing beds, show pieces, coffee tables and other products in stores. Easy, right? However, before you begin to shop for home furnishings online, let’s have a look at a few tips to help you choose items wisely and furnish your house in the best way.";
		
	
		WebElement actual_text_elem=driver.findElement(By.xpath("//h2[text()=\"Home Furnishings Online - Setting Up a New Home\"]//following::div[1]"));
		String actual_text = actual_text_elem.getText();
		
		assertEquals(excpeted_text, actual_text);

	}
	
	public static void close_driver()
	{
		driver.close();
	}
}
