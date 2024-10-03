package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;
    By username = By.id("user_name");
    By password = By.id("password");
    By loginButton = By.id("login-button");
    public Login(WebDriver driver){
        this.driver = driver;
    }
    public void enterUserName(String userName){
        driver.findElement(By.id(userName)).sendKeys(userName);
    }
    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public void clickLoginButton(){
        driver.findElement(By.id(String.valueOf(loginButton))).click();
    }
}
