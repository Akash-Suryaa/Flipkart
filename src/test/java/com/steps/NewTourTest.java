package com.steps;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewTourTest extends BrowserLunch {

	public static void open_newtour_page() throws InterruptedException {
		driver = launchBrowser();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		System.out.println("Open link");

	}

	public static void click_sing_on() throws InterruptedException {
		System.out.println("click on sign in");
		driver.findElement(By.xpath("//a[text()=\"SIGN-ON\"]")).click();

		Thread.sleep(5000);
		

	}

	public static void verify_sing_on() {

		String url =driver.getCurrentUrl();
		System.out.println("url : "+url);

	}

	public static void click_registration() throws InterruptedException {
		System.out.println("click_registration");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"REGISTER\"]")).click();

		Thread.sleep(2000);
		String url =driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://demo.guru99.com/test/newtours/register.php");
	}

	public static void click_support() throws InterruptedException {

		System.out.println("click_support");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"SUPPORT\"]")).click();

		Thread.sleep(2000);
		
		String url =driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://demo.guru99.com/test/newtours/support.php");
	
		
		
	}

	public static void click_contact() throws InterruptedException {
		System.out.println("click_contact");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"CONTACT\"]")).click();
		Thread.sleep(2000);
		
		
		
	}

	public static void validlogin() throws InterruptedException {
		System.out.println("Login");
		Thread.sleep(2000);
		WebElement username_txt = driver
				.findElement(By.xpath("//table//table//table//table//table/tbody/tr/td[2]/input[@name=\"userName\"]"));
		username_txt.sendKeys("akash");
		Thread.sleep(2000);
		WebElement pass_txt = driver
				.findElement(By.xpath("//table//table//table//table//table/tbody/tr/td[2]/input[@name=\"password\"]"));
		pass_txt.sendKeys("akash");
		Thread.sleep(2000);

		WebElement login_btn = driver.findElement(By.xpath("//table//table//table//table//table/tbody/tr[4]/td/input"));
		login_btn.click();

	}

	public static void search_flight() throws InterruptedException {

		System.out.println("flight");
		driver.findElement(By.xpath("//a[text()=\"Flights\"]")).click();

		Thread.sleep(2000);
		WebElement select_loctaion = driver.findElement(By.xpath("//select[@name=\"toPort\"]"));
		Select s = new Select(select_loctaion);
		s.selectByIndex(2);
		Thread.sleep(2000);

		WebElement continue_btn = driver.findElement(By.xpath("//input[@name=\"findFlights\"]"));
		continue_btn.click();
	}

	public static void sign_out() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"SIGN-ON\"]")).click();
	}

}
