package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Login;
import org.openqa.selenium.WebDriver;

public class StepDef {
    WebDriver driver;
    Login login;

@Given("user is on the login page")
public void user_is_on_the_login_page(){
login= new Login(driver);
}

@When("user enters valid username and password")
public void user_enters_valid_username_and_password(){
login.enterUserName("standard_user");
login.enterPassword("secret_sauce");
}

@When("user click on Login Button")
public void user_click_on_Login_Button(){
login.clickLoginButton();
}

@Then("user should be logged in successfully")
public void user_should_be_logged_in_successfully(){
System.out.println("login is successful");
}
}
