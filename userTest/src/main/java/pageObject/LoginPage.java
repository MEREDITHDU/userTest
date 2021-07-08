/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Qilin
 */
public class LoginPage {
    private WebDriver driver;

    private By LoginLocator = By.linkText("Log in");
    private By loginInputLocator = By.id("user_email");
    private By passInputLocator = By.id("user_password");
    private final By loginButtonLocator = By.xpath("//button[@class=\'button-1 login-button\']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean findLoginLink() {
        driver.findElement(LoginLocator).click();
        return true;
    }

    public WebDriver LoginToPage() {
        driver.findElement(By.id("Email")).sendKeys("duheimei@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Test@123");
        driver.findElement(By.xpath("//button[@class=\'button-1 login-button\']")).click();

        return driver;
    }

}
