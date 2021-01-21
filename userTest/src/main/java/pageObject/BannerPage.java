/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Qilin
 */
public class BannerPage {
    private WebDriver driver;
    
    private By BannerLocator =By.xpath("//*[@id=\"nivo-slider\"]/img");

    public BannerPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public boolean ifBannerExists(){
        driver.findElement(BannerLocator).isDisplayed();   
        return true;
    }
}
