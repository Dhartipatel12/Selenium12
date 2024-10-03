package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.saucedemo.com/");
        Login loginpage = new Login(driver);
        loginpage.enterUserName("standard_user");
        loginpage.enterPassword("secret_sauce");
        driver.quit();
    }
}
