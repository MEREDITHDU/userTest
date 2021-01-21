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
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObject.BannerPage;
import pageObject.LoginPage;
import pageObject.RegisterationPage;

/**
 *
 * @author Qilin
 */
@Listeners({AllureListener.class})
public class Tests extends Base{
        private WebDriver driver;
	BannerPage bannerpage;
        LoginPage loginpage;
        RegisterationPage registrationpage;
        
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
                bannerpage =new BannerPage(driver);
		boolean dispStatus=bannerpage.ifBannerExists();
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
                loginpage=new LoginPage(driver);
		loginpage.findLoginLink();
                loginpage.LoginToPage();
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
                registrationpage = new RegisterationPage(driver);
		registrationpage.findRegisterLink();
                registrationpage.saveAndRegister();
                Thread.sleep(1000);
		Assert.assertEquals(driver.getTitle(), "nopCommerce demo store. Register");
	}
	

	@AfterClass
	public void tearDown()
	{	
		driver.quit();
	}   
}
