/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userTest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 *
 * @author Qilin
 */
@Listeners({AllureListener.class})
public class Tests extends Base{
    private WebDriver driver;
	
	@BeforeClass 
	public void setUp() {
		Base bs= new Base();
		driver = bs.initialize_driver();
		driver.get("https://demo.nopcommerce.com/");
		
	}
        @Severity(SeverityLevel.MINOR)	
	@Test(priority=1, description="Verify Banner presence on Home Page")
	@Description("Verify Banner presence on Home Page........")
	@Epic("EP001")
	@Feature("Feature1: Banner")
	@Story("Story:Banner Presence")
	@Step("Verify Banner Presence")
	public void bannerPresence() throws InterruptedException
	{
		boolean dispStatus=driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/img")).isDisplayed();
		Assert.assertEquals(dispStatus, true);
	}
	
	@Severity(SeverityLevel.BLOCKER)	
	@Test(priority=2, description="Verify login")
	@Description("Verify login with Valid Credentials........")
	@Epic("EP001")
	@Feature("Feature2: Login")
	@Story("Story:Valid login")
	@Step("Verify login")
	public void loginTest() throws InterruptedException
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("duheimei@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "nopCommerce demo store. Login");

	}
		
	@Severity(SeverityLevel.NORMAL)	
	@Test(priority=3, description="Verify user Registration")
	@Description("Verify user Registration........")
	@Epic("EP001")
	@Feature("Feature3: Registration")
	@Story("Story:User registration")
	
	public void registrationTest() throws InterruptedException
	{
		driver.findElement(By.linkText("Register")).click();
                Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "nopCommerce demo store. Register");
	}
	

	@AfterClass
	public void tearDown()
	{	
		driver.quit();
	}
	
	    
    
}
