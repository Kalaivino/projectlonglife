package org.adacitinruningthelast;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Local;

public class adacitinrun {
	ChromeOptions op = new ChromeOptions();
	WebDriver driver;
	Select select;
	@When("user enter {string},{string}")
	public void user_enter(String string, String string2) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		List<WebElement> li = driver.findElements(By.xpath("//input[@id='username' or @id='password' or @id='login']"));
		li.get(0).sendKeys(string);
		li.get(1).sendKeys(string2);
		li.get(2).click();
	}

@When("Users eters{string},{string},{string},{string},{string},{string},{string},{string}")
public void users_eters(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
List<WebElement> locationddn  = driver.findElements(By.xpath("//select[@id='location' or @id='hotels' or @id = 'room_type' or @id= 'room_nos' or @id='adult_room']"));
List<WebElement> datddn = driver.findElements(By.xpath("//input[@id='datepick_in' or @id='datepick_out' or @id='Submit']"));
select = new Select (locationddn.get(0));
select.selectByVisibleText(string);
select = new Select (locationddn.get(1));
select.selectByVisibleText(string2);
select =  new Select (locationddn.get(2));
select.selectByVisibleText(string3);
select = new Select (locationddn.get(3));
select.selectByVisibleText(string4);
datddn.get(0).sendKeys(string5);
datddn.get(1).sendKeys(string6);
select = new Select (locationddn.get(4));
select.selectByVisibleText(string7);
select = new Select (locationddn.get(5));
select.selectByVisibleText(string8);
datddn.get(2).click();
}

	@When("Users selects the required Hotel")
	public void users_selects_the_required_Hotel() {
		WebElement rationbtn = driver.findElement(By.xpath("//input[contains(@id,'radio')]"));
rationbtn.click();		
WebElement btnclick = driver.findElement(By.id("continue"));
btnclick.click();
	}
	@When("User Enters {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_Enters(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {
		List<WebElement> firstname = driver.findElements(By.xpath("//input[@id='first_name' or @id='last_name' or @id='cc_num' or @id='cc_cvv']"));
		List<WebElement> findElements = driver.findElements(By.xpath("//select[@id='cc_type' or @id='cc_exp_month' or @id='cc_exp_year']"));
		WebElement findElement = driver.findElement(By.id("address"));
		
		
		
		
		
	}

	@Then("Oder is confirmed and Order id is generated")
	public void oder_is_confirmed_and_Order_id_is_generated() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

}
