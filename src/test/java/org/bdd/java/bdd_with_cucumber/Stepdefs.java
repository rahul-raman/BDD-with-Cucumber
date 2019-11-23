package org.bdd.java.bdd_with_cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//@Given("^User has login$")
public class Stepdefs {
	WebDriver driver;

	@Given("^User goes to phptravels loginpage$")
	public void user_goesTo_loginPage()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver");
		driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
	}
	
	@Given("^User clicks on php travels.net$")
	public void clickonTravelsNet()
	{
		WebElement link1 = driver.findElement(By.className("btn btn-primary btn-lg btn-block"));
		link1.click();
	}
	
	@Given("^User switches tab to phptravels.net$")
	public void userSwitchesTab()
	{
		Set<String> allWindows = driver.getWindowHandles();
		Iterator i1 = allWindows.iterator();
		Object childWindow = i1.next();
		driver.switchTo().window(childWindow.toString());
	}
}
